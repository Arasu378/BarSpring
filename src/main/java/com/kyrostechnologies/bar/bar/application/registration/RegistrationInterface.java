package com.kyrostechnologies.bar.bar.application.registration;

import com.kyrostechnologies.bar.bar.model.User;
import com.kyrostechnologies.bar.bar.response.RegistrationResponse;

public interface RegistrationInterface {
    RegistrationResponse registration(User user);
}
