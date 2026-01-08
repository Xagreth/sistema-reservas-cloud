package com.alkemy.reservas.inventory.repository;

import com.alkemy.reservas.inventory.model.Space;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpaceRepository extends JpaRepository<Space, Long> {
}
