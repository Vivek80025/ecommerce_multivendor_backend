package com.vivek.service;

import com.vivek.exception.SellerException;
import com.vivek.exception.UserException;
import com.vivek.request.LoginRequest;
import com.vivek.request.SignupRequest;
import com.vivek.response.AuthResponse;
import jakarta.mail.MessagingException;

public interface AuthService {

    void sentLoginOtp(String email) throws UserException, MessagingException;
    String createUser(SignupRequest req) throws SellerException;
    AuthResponse signin(LoginRequest req) throws SellerException;

}
