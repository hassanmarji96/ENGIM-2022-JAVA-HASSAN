package esercizio1;

/**
 * @author Hassan Marji
 * Classe che si occupa di creare un oggetto Persona,
 * con tutte le caratteristiche relative ad una Persona
 */
public class Persona
{
    private String nome;
    private String cognome;
    private Integer eta;
    

    public Persona() {
    }

    public Persona(String nome, String cognome, Integer eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return this.cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Integer getEta() {
        return this.eta;
    }

    public void setEta(Integer eta) {
        this.eta = eta;
    }


    @Override
    public String toString() 
    {
        return "{" +
            " nome='" + getNome() + "'" +
            ", cognome='" + getCognome() + "'" +
            ", eta='" + getEta() + "'" +
            "}";
    }
    
}