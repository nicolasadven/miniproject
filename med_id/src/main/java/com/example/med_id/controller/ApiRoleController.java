package com.example.med_id.controller;

import com.example.med_id.model.Role;
import com.example.med_id.repositories.RoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1")
public class ApiRoleController {

    @Autowired
    private RoleRepo roleRepo;

    @GetMapping("/roles")
    public ResponseEntity<List<Role>> GetAllRole()
    {
        try
        {
            List<Role> role = this.roleRepo.findAll();
            return new ResponseEntity<>(role, HttpStatus.OK);
        }

        catch (Exception e)
        {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }
}
