package esercizio3;

public class Animale 
{
    private String nomeLatino;
    private String nomeComune;
    private String habitat;


    public Animale() {
    }


    public Animale(String nomeLatino, String nomeComune, String habitat) 
    {
        this.nomeLatino = nomeLatino;
        this.nomeComune = nomeComune;
        this.habitat = habitat;
    }


    public String getNomeLatino() {
        return this.nomeLatino;
    }

    public void setNomeLatino(String nomeLatino) {
        this.nomeLatino = nomeLatino;
    }

    public String getNomeComune() {
        return this.nomeComune;
    }

    public void setNomeComune(String nomeComune) {
        this.nomeComune = nomeComune;
    }

    public String getHabitat() {
        return this.habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() 
    {
        return "{" +
            " nomeLatino='" + getNomeLatino() + "'" +
            ", nomeComune='" + getNomeComune() + "'" +
            ", habitat='" + getHabitat() + "'" +
            "}";
    }
}
