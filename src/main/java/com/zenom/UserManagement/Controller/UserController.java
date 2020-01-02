package com.zenom.UserManagement.Controller;

import com.zenom.UserManagement.DTO.UserDTO;
import com.zenom.UserManagement.Model.RequestModel.UserDetailsRequest;
import com.zenom.UserManagement.Model.ResponseModel.UserDetailsResponse;
import com.zenom.UserManagement.Service.UserManagementService;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/User")
public class UserController {


    @Autowired
    UserManagementService service;

    @PostMapping
    public ResponseEntity<UserDetailsResponse> createUser(@Valid @RequestBody UserDetailsRequest request){


        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        UserDTO userDTO  = mapper.map(request,UserDTO.class);
        userDTO = service.createUser(userDTO);

        UserDetailsResponse response = mapper.map(userDTO,UserDetailsResponse.class);

        return new ResponseEntity<UserDetailsResponse>(HttpStatus.CREATED);
    }


}
