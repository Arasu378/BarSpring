package com.kyrostechnologies.bar.bar.application.registration.controller;

import com.kyrostechnologies.bar.bar.application.registration.bussinesstier.RegistrationBussinessLogic;
import com.kyrostechnologies.bar.bar.model.User;
import com.kyrostechnologies.bar.bar.response.RegistrationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RegistrationController {
    @Autowired
    private RegistrationBussinessLogic bussinessLogic;
    @RequestMapping(method = RequestMethod.POST ,value = "/registration")
    public @ResponseBody
    RegistrationResponse registration(@RequestBody User model){
        return bussinessLogic.registration(model);
    }
}
