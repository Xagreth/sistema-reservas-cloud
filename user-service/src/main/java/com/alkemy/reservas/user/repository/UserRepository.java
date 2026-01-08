package com.alkemy.reservas.user.repository;

import com.alkemy.reservas.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Aquí podríamos buscar por email: User findByEmail(String email);
}
