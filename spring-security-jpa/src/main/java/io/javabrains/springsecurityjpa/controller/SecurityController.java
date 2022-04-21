package io.javabrains.springsecurityjpa.controller;

import io.javabrains.springsecurityjpa.models.MyUserDetails;
import io.javabrains.springsecurityjpa.models.User;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpSession;
import java.security.Principal;

@RestController
public class SecurityController {

    @RequestMapping(value = "/username", method = RequestMethod.GET)
    public Long currentUserName(Authentication authentication) {
        WebAuthenticationDetails webAuthenticationDetails =(WebAuthenticationDetails) authentication.getDetails();
        MyUserDetails userDetails = (MyUserDetails) authentication.getPrincipal();
       return userDetails.getUser().getId();
//        return webAuthenticationDetails.getSessionId();
    }
}
