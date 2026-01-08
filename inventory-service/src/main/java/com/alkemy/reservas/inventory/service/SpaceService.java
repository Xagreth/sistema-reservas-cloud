package com.alkemy.reservas.inventory.service;

import com.alkemy.reservas.inventory.model.Space;
import com.alkemy.reservas.inventory.repository.SpaceRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SpaceService {
    private final SpaceRepository spaceRepository;

    public SpaceService(SpaceRepository spaceRepository) {
        this.spaceRepository = spaceRepository;
    }

    public Space saveSpace(Space space) {
        return spaceRepository.save(space);
    }

    public List<Space> getAllSpaces() {
        return spaceRepository.findAll();
    }
    
    public Space getSpaceById(Long id) {
        return spaceRepository.findById(id).orElse(null);
    }
}
