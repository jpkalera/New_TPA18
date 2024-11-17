package edu.a10.td03.tpa18.controller;

import edu.a10.td03.tpa18.model.Eleves;
import edu.a10.td03.tpa18.repository.ElevesRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ElevesController {

    private final ElevesRepository elevesRepository;

    public ElevesController(ElevesRepository elevesRepository) {
        this.elevesRepository = elevesRepository;
    }

    @GetMapping("/eleves")
    public List<Eleves> getAllEleves() {
        return elevesRepository.findAll();
    }
}
