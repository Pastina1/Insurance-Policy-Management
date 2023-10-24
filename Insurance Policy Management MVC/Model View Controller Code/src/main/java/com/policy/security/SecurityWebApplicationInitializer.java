package com.policy.security;

import org.springframework.security.web.context.*;
//Class for the security intializer that processes the information passed from the login screen
public class SecurityWebApplicationInitializer
        extends AbstractSecurityWebApplicationInitializer {
    public SecurityWebApplicationInitializer()
    {
        super(WebSecurityConfig.class);
    }
}
