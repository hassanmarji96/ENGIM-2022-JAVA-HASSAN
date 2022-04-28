package com.biglietti.biglietteria.controller;

import com.biglietti.biglietteria.models.Utente;
import com.biglietti.biglietteria.models.repository.UtenteRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/utente")
public class UtenteController
{
    @GetMapping(value = "/selezionaTuttiUtenti")
    public List<Utente> selezionaTuttiUtenti()
    {
        return UtenteRepository.selezionaUtenti();
    }
}
