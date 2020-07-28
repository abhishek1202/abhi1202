package com.User.Info.Dao;

import com.User.Info.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface UserRepository extends JpaRepository<Users, Integer>
{

}
