/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lk.neva.InventoryManagement.service;

import lk.neva.InventoryManagement.repo.UserRepo;
import lk.neva.InventoryManagement.modal.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Neva
 */
@Service
public class LoginService {

    @Autowired
    UserRepo UserRepo;

    public User checkLogin(String username, String password) {
        return UserRepo.findByUsernamePassword(username, password).orElse(null);
    }

    public User Logout(String username, String password) {
        return UserRepo.findByUsernamePassword(username, password).orElse(null);
    }
}
