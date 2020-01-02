package com.zenom.UserManagement.Respository;

import com.zenom.UserManagement.Entity.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<UserDetails,Long> {

}
