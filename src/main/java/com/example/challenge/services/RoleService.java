package com.example.challenge.services;

import com.example.challenge.entites.Role;
import com.example.challenge.reponses.MessageResponse;
import com.example.challenge.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Service
public class RoleService {
    @Autowired
    RoleRepository roleRepository;
    public List<Role> roleList=new CopyOnWriteArrayList<>();
    private int roleIdCount=1;
    public List<Role> getAllRoles(){
        return roleRepository.findAll();
    }

    public Role getRoleById(int id){

        return roleRepository.findById(id).get();
    }

    public Role addNewRole(Role role){

        return roleRepository.save(role);
    }

    public Role updateRoleByID(int id, Role role){

        role.setId(id);
        return roleRepository.save(role);

    }
    public MessageResponse deleteRoleById(int id ){

        roleRepository.deleteById(id);
        return new MessageResponse("Role deleted with success!");


    }
}
