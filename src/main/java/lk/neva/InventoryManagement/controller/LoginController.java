/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lk.neva.InventoryManagement.controller;

import jakarta.servlet.http.HttpSession;
import lk.neva.InventoryManagement.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import lk.neva.InventoryManagement.modal.User;

/**
 *
 * @author Neva
 */
@RestController
public class LoginController {

    @Autowired
    LoginService LoginService;

    @PostMapping("/login")
    public String checkLogin(@RequestParam String username, @RequestParam String password, HttpSession session) {

        User user = LoginService.checkLogin(username, password);
        if (user == null) {
            return "error";
        } else {
            session.setAttribute("uid", user.getId());
            session.setAttribute("username", username);
            return "ok";
        }

    }

    @GetMapping("/logout")
    public String Logout(HttpSession session) {

        session.removeAttribute("uid");
        session.removeAttribute("username");

        return "ok";
    }

}
