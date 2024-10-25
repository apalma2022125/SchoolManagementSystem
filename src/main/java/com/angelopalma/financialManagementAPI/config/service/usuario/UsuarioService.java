package com.angelopalma.financialManagementAPI.config.service.usuario;

import com.angelopalma.financialManagementAPI.config.model.User;

import java.util.List;

public interface UsuarioService {

    List<User> findAll();
    User findById(String id);
    User save(User user);
    User update(String id, User user);
    void deleteById(String id);
}
