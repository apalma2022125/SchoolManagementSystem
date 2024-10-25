package com.angelopalma.financialManagementAPI.config.service.auth;

import com.angelopalma.financialManagementAPI.config.model.User;
import com.angelopalma.financialManagementAPI.config.repository.usuario.UserRepository;
import com.angelopalma.financialManagementAPI.config.security.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
@Service
public class AuthService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    private BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
    public String login(String email, String password) {

        // Validar credenciales nulas
        if (email == null || password == null) {
            throw new IllegalArgumentException("Email and password cannot be null");
        }

        User user = userRepository.findByEmail(email);

        if (user == null) {
            throw new RuntimeException("Invalid credentials");
        }



        System.out.println(password + "  /   "+ user.getPassword());
        if (user != null && passwordEncoder.matches(password, user.getPassword())) {
            System.out.println(user);
            return jwtTokenUtil.generateToken(user.getId());
        } else {
            throw new RuntimeException("Invalid credentials");
        }
    }
}
