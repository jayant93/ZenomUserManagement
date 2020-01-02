package com.zenom.UserManagement.Service;


import com.zenom.UserManagement.DTO.UserDTO;
import com.zenom.UserManagement.Entity.UserDetails;
import com.zenom.UserManagement.Model.RequestModel.UserDetailsRequest;
import com.zenom.UserManagement.Respository.UsersRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserManagement implements UserManagementService {


    @Autowired
    UsersRepository userRepo;

    //creating a new user
    @Override
    public UserDTO createUser(UserDTO request) {

        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        UserDetails userDetails  = mapper.map(request,UserDetails.class);

        userDetails.setUserId(UUID.randomUUID());
        userDetails = userRepo.save(userDetails);

        UserDTO userDTO = mapper.map(userDetails,UserDTO.class);

        return userDTO;
    }
}
