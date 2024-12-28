package com.adriancode.smarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adriancode.smarket.models.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
