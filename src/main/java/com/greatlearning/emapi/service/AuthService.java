package com.greatlearning.emapi.service;

import com.greatlearning.emapi.payload.LoginDto;
import com.greatlearning.emapi.payload.RegisterDto;

public interface AuthService {
	
    String login(LoginDto loginDto);

    String register(RegisterDto registerDto);
}
