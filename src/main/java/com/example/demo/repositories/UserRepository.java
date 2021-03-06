package com.example.demo.repositories;

import com.example.demo.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
//@Transactional(readOnly = true)
public interface UserRepository extends CrudRepository<User, Long> {

    User findByEmail(String email);
}
