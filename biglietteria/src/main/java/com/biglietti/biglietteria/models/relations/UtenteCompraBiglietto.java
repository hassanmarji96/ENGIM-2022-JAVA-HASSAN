package com.biglietti.biglietteria.models.relations;

import com.biglietti.biglietteria.models.Biglietto;
import com.biglietti.biglietteria.models.Utente;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UtenteCompraBiglietto
{
    private Utente utente;
    private Biglietto biglietto;
    private String dataAcquisto;
    private Integer quantitaBigliettiAcquistati;
}
