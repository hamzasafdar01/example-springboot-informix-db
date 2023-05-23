package com.example.demo.Modals.Repository;

import com.example.demo.Modals.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer> {
}
