package com.alkemy.reservas.inventory.controller;

import com.alkemy.reservas.inventory.model.Space;
import com.alkemy.reservas.inventory.service.SpaceService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/inventory")
public class SpaceController {
    private final SpaceService spaceService;

    public SpaceController(SpaceService spaceService) {
        this.spaceService = spaceService;
    }

    @PostMapping
    public Space createSpace(@RequestBody Space space) {
        return spaceService.saveSpace(space);
    }

    @GetMapping
    public List<Space> getAllSpaces() {
        return spaceService.getAllSpaces();
    }
    
    @GetMapping("/{id}")
    public Space getSpace(@PathVariable Long id) {
        return spaceService.getSpaceById(id);
    }
}
