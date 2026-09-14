package com.scaler.bookmyshowsept26.repositories;

import com.scaler.bookmyshowsept26.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    //Select * from user where id=xyz
    // SQL queries for CRUD operations on User Table.

    // select * from users where id = xyz
    @Override
    Optional<User> findById(Long userId);

    List<User> findByName(String name);

    Optional<User> findByEmail(String email);

    @Override
    void deleteById(Long userId);

    // select * from users where name = ? and email = ?
    List<User> findByNameAndEmail(String name, String email);

    @Override
    User save(User user);

//    @Query("select * from ..........")
//    List<Object> customQuery();
}
