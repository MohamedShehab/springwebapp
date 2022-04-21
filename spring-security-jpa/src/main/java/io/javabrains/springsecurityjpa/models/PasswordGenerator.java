package io.javabrains.springsecurityjpa.models;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordGenerator {
    public static void main(String[] args) {

        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String password = "P@ssw0rd";
        String encodedPass = passwordEncoder.encode(password);
        System.out.println("Encoded Password : "+ encodedPass);
    }
}
