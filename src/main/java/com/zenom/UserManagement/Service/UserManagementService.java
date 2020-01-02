package com.zenom.UserManagement.Service;

import com.zenom.UserManagement.DTO.UserDTO;
import com.zenom.UserManagement.Model.RequestModel.UserDetailsRequest;

public interface UserManagementService {

    //for creating a new user
    public UserDTO createUser(UserDTO request);



}
