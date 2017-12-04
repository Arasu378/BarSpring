package com.kyrostechnologies.bar.bar.application.registration.bussinesstier;

import com.kyrostechnologies.bar.bar.application.EmailServiceImpl;
import com.kyrostechnologies.bar.bar.application.registration.RegistrationInterface;
import com.kyrostechnologies.bar.bar.model.User;
import com.kyrostechnologies.bar.bar.response.RegistrationResponse;
import com.kyrostechnologies.bar.bar.utils.DatabaseKey;
import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.CallableStatementCallback;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.StatementCallback;
import org.springframework.stereotype.Repository;

import java.security.SecureRandom;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Repository
public class RegistrationBussinessLogic  implements RegistrationInterface{
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Autowired
    EmailServiceImpl emailService;

    @Override
    public RegistrationResponse registration(User model) {
        int userProfileId=getLastUserProfileId();
        userProfileId=userProfileId+1;
        String firstname=model.getUserFirstName();
        firstname="'" + firstname + "'";
        String lastname=model.getUserLastName();
        lastname="'"+lastname+"'";
        String mobile_number=model.getUserMobileNumber();
        mobile_number="'"+mobile_number+"'";
        String email=model.getUserEmail();
        email="'"+email+"'";
        String venue_name=model.getUserVenueName();
        venue_name="'"+venue_name+"'";
        String country=model.getUserCountry();
        country="'"+country+"'";
        String Often_inventory=model.getUserOftenInventory();
        Often_inventory="'"+Often_inventory+"'";
        int inventorytime=model.getUserInventoryTime();

        String createdon=model.getCreatedOn();
        createdon="'"+createdon+"'";
        String modifiedon=model.getModifiedOn();
        modifiedon="'"+modifiedon+"'";
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String datetime=dateFormat.format(new Date());
        String password=getRandomPassword();

        String role=model.getUserRole();
        role="'"+role+"'";
        byte[] encodedBytes = Base64.encodeBase64(password.getBytes());
        String encrypted_password=new String (encodedBytes);
        String auth=getAuthorizationKey(model.getUserEmail(),model.getPassword());
        boolean isExist=ifEmailIsExist(model.getUserEmail());
        if(isExist){
          return   getRegistrationResponse(false,"Email is already registered please try again with new email!");
        }
        String query="CALL insert_user("+userProfileId+","+firstname+","+lastname+","+mobile_number+","+email+","+venue_name+","+
                country+","+Often_inventory+","+inventorytime+","+datetime+","+datetime+","+encrypted_password+","+auth+","+role+","+null+");";
        System.out.println("query insert: "+query);

        String isInserted=jdbcTemplate.execute((StatementCallback<String>)statementCallback->{
            String proid=null;
            ResultSet rs=statementCallback.executeQuery(query);
            while (rs.next()){
                proid=rs.getString("LAST_INSERT_ID()");
            }
            return proid;
        });
        if(isInserted!=null){
            try {
                emailService.sendEmail(model.getUserEmail(),"Your Password for login is : "+password,"Welcome to BarApp by Kyros");
            } catch (Exception e) {
                e.printStackTrace();
                return getRegistrationResponse(false,"Email is not sent successfully");

            }

            return getRegistrationResponse(true,"Password is sent to registered email");
        }
        return getRegistrationResponse(false,"User Profile Id is not inserted");
    }
    private RegistrationResponse getRegistrationResponse(boolean value,String message){
        RegistrationResponse response=new RegistrationResponse();
        response.setIsSuccess(value);
        response.setMessage(message);
        return response;
    }
    private int getLastUserProfileId(){
        String query="CALL get_userprofile_lastrow();";
        System.out.println("Query : "+query);
       return  jdbcTemplate.execute((StatementCallback<Integer>)statementCallback->{
            ResultSet rs=statementCallback.executeQuery(query);
            int profileid=0;
            while (rs.next()){
                profileid=rs.getInt("Id");
            }
            return profileid;
        });
    }
    private String getRandomPassword(){
        final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        SecureRandom rnd = new SecureRandom();

        String ranpass=null;
        StringBuilder sb = new StringBuilder( 5 );
        for( int i = 0; i < 5; i++ )
            sb.append( AB.charAt( rnd.nextInt(AB.length()) ) );
        ranpass= sb.toString();
        return ranpass;
    }
    private String getAuthorizationKey(String email,String password){
        String key=null;
        try{
            String tobeconvert=email+":"+password;
            byte[] encodedBytes = Base64.encodeBase64(tobeconvert.getBytes());
            System.out.println("encodedBytes " + new String(encodedBytes));
            key=new String (encodedBytes);
        }catch(Exception e){
            e.printStackTrace();
        }
        return key;
    }
    private boolean ifEmailIsExist(String email){
        String query="CALL get_allUsers();";
        System.out.println("Query : "+query);
        return  jdbcTemplate.execute((StatementCallback<Boolean>)statementCallback->{
            ResultSet rs= statementCallback.executeQuery(query);
            boolean value=false;
            while (rs.next()){
                String userEmail=rs.getString(DatabaseKey.useremail);
                if(userEmail.equals(email)){
                    value= true;
                }
            }
            return   value;
        });
    }
}
