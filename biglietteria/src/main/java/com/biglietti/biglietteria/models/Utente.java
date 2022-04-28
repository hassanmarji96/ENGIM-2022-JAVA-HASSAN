package com.biglietti.biglietteria.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Utente
{
    private Long idUtente;
    private String nomeUtente;
    private String cognomeUtente;
}
