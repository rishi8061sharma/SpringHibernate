package com.example.deloitte.config;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import java.util.Date;

@Component
public class JwtUtil {

    // 32 characters liong
    private String secretKey = "anfksalfnksdlfndsfmldsnfksgnodskfgmksgmnokl";

    private SecretKey getSigningKey() {
        return Keys.hmacShaKeyFor(secretKey.getBytes());
    }

    public String generateToken(String username) {
        return Jwts.builder()
                .subject(username)                    // changed from setSubject
                .issuedAt(new Date())                 // changed from setIssuedAt
                .expiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60))  // changed from setExpiration
                .signWith(getSigningKey())             // changed from signWith(algo, key)
                .compact();
    }

    public String extractUsername(String token) {
        return Jwts.parser()
                .verifyWith(getSigningKey())           // changed from setSigningKey
                .build()
                .parseSignedClaims(token)             // changed from parseClaimsJws
                .getPayload()
                .getSubject();
    }

    private boolean isTokenExpired(String token) {
        return Jwts.parser()
                .verifyWith(getSigningKey())
                .build()
                .parseSignedClaims(token)
                .getPayload()
                .getExpiration()
                .before(new Date());
    }

    public boolean validateToken(String token, String username) {
        return extractUsername(token).equals(username) && !isTokenExpired(token);
    }
}