/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lk.neva.InventoryManagement.controller;

import lk.neva.InventoryManagement.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Neva
 */
@RestController
@RequestMapping("/project")
public class ProjectController {

    @Autowired
    private ProjectService ser;

    @ExceptionHandler(Exception.class)
    public ResponseEntity<CommonResponse> handleException(Exception e) {
        e.printStackTrace();
        CommonResponse response = new CommonResponse(e.getMessage(), 2000);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
