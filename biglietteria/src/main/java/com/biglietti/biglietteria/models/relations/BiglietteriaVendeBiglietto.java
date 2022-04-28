package com.biglietti.biglietteria.models.relations;

import com.biglietti.biglietteria.models.Biglietteria;
import com.biglietti.biglietteria.models.Biglietto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

public class BiglietteriaVendeBiglietto implements Serializable
{
    Long idBiglietteria;
    Long idBiglietto;
    Integer quantita;
    String nomeBiglietteria;
    String indirizzoBiglietteria;
    String dataEvento;
    String categoria;
    Double costo;

    public BiglietteriaVendeBiglietto(Long idBiglietteria, Long idBiglietto, Integer quantita, String nomeBiglietteria,
                                        String indirizzoBiglietteria, String dataEvento, String categoria, Double costo)

    {
        this.idBiglietteria = idBiglietteria;
        this.nomeBiglietteria = (nomeBiglietteria);
        this.indirizzoBiglietteria = (indirizzoBiglietteria);
        this.idBiglietto = (idBiglietto);
        this.costo = (costo);
        this.dataEvento = (dataEvento);
        this.categoria = (categoria);
        this.quantita = quantita;
    }
}
