package com.laksh.ThymeLeafDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.laksh.ThymeLeafDemo.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>{

}
