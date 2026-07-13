package com.cognizant.spring_learn.controller;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class AuthenticationController {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(AuthenticationController.class);

    private final String secretKey =
            "mysecretkeymysecretkeymysecretkey123456";

    @GetMapping("/authenticate")
    public Map<String, String> authenticate(
            @RequestHeader("Authorization") String authHeader) {

        LOGGER.info("Start");

        String user = getUser(authHeader);

        LOGGER.debug("User: {}", user);

        Map<String, String> map = new HashMap<>();
        map.put("token", generateJwt(user));

        LOGGER.info("End");

        return map;
    }


    private String getUser(String authHeader) {

        String encodedCredentials =
                authHeader.substring("Basic ".length());

        byte[] decodedBytes =
                Base64.getDecoder().decode(encodedCredentials);

        String decodedCredentials =
                new String(decodedBytes);

        LOGGER.debug("Decoded Credentials: {}", decodedCredentials);

        return decodedCredentials.split(":")[0];
    }


    private String generateJwt(String user) {

        SecretKey key = Keys.hmacShaKeyFor(
                secretKey.getBytes(StandardCharsets.UTF_8)
        );

        return Jwts.builder()
                .subject(user)
                .issuedAt(new Date())
                .expiration(
                        new Date(System.currentTimeMillis() + 1200000)
                )
                .signWith(key)
                .compact();
    }
}