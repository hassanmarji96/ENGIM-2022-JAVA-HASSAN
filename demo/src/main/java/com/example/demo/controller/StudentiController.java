package com.example.demo.controller;

import com.example.demo.entities.Studente;
import com.example.demo.entities.repository.StudenteRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/studente")
public class StudentiController
{
    @GetMapping(value = "/selezionaStudenti")
    public List<Studente> selezionaStudenti()
    {
        return StudenteRepository.selezionaTutti();
    }
}
