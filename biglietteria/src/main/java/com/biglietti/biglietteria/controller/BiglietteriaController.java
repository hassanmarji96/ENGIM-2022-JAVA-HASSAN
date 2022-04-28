package com.biglietti.biglietteria.controller;

import com.biglietti.biglietteria.models.Biglietteria;
import com.biglietti.biglietteria.models.relations.BiglietteriaVendeBiglietto;
import com.biglietti.biglietteria.models.repository.BiglietteriaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/biglietteria")
public class BiglietteriaController
{
    @GetMapping(value = "/selezionaTutteBiglietterie")
    public List<Biglietteria> selezionaBiglietterie()
    {
        return BiglietteriaRepository.selezionaBiglietterie();
    }

    @GetMapping(value = "/selezionaBigliettiByBiglietteria/{idBiglietteria}")
    public List<Biglietteria> selezionaBigliettiyByBiglietteria(@PathVariable("idBiglietteria") Long idBiglietteria)
    {
        return BiglietteriaRepository.selezionaBigliettiVendutiByBiglietteria(idBiglietteria);
    }
}
