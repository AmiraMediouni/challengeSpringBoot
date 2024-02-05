package com.example.challenge.controllers;

import com.example.challenge.entites.Role;
import com.example.challenge.reponses.MessageResponse;
import com.example.challenge.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value ="/roles" )
public class RoleController {
    @Autowired
    RoleService roleService;

    @GetMapping
    public List<Role> getAllRoles() {
        return this.roleService.getAllRoles();
    }

    @GetMapping(value = "/{id}")
    public Role getRoleByID(@PathVariable("id") int id) {
        return this.roleService.getRoleById(id);
    }

    @PostMapping
    public Role addNewRole(@RequestBody Role role) {
        return this.roleService.addNewRole(role);
    }

    @PutMapping(value = "/{id}")
    public Role updateRole(@PathVariable("id") int id, @RequestBody Role role) {
        return roleService.updateRoleByID(id, role);
    }

    @DeleteMapping(value = "/{id}")
    public MessageResponse deleteRole(@PathVariable("id") int id) {

        return this.roleService.deleteRoleById(id);
    }
}
