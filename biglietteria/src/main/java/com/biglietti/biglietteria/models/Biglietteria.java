package com.biglietti.biglietteria.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Biglietteria
{
    private Long idBiglietteria;
    private String nomeBiglietteria;
    private String indirizzo;

    Long idBiglietto;
    Integer quantita;
    String dataEvento;
    String categoria;
    Double costo;

    public Biglietteria(Long idBiglietteria, String nomeBiglietteria, String indirizzo)
    {
        this.idBiglietteria = idBiglietteria;
        this.nomeBiglietteria = nomeBiglietteria;
        this.indirizzo = indirizzo;
    }
}
