package com.backendfunda.backendfunda.controller;

import com.backendfunda.backendfunda.model.Cursos;
import com.backendfunda.backendfunda.repository.CursosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class CursosController {

   @Autowired
    private CursosRepository cursosRepository;

    @PostMapping("/agregarcurso")
    Cursos newCursos(@RequestBody Cursos newCursos) { return cursosRepository.save(newCursos);}

    @GetMapping("/vercursos")
    List<Cursos> getAllCursos(){return cursosRepository.findAll();}
}
