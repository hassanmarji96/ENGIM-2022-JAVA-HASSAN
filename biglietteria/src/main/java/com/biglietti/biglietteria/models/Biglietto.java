package com.biglietti.biglietteria.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Biglietto
{
    private Long idBiglietto;
    private Double costo;
    private String dataEvento;
    private String categoria;
}
