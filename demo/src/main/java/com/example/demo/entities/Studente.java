package com.example.demo.entities;

public class Studente
{
    private Long id;
    private String nome;
    private String cognome;
    private String indirizzoStudio;

    public Studente() {
    }

    public Studente(Long id, String nome, String cognome, String indirizzoStudio) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.indirizzoStudio = indirizzoStudio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getIndirizzoStudio() {
        return indirizzoStudio;
    }

    public void setIndirizzoStudio(String indirizzoStudio) {
        this.indirizzoStudio = indirizzoStudio;
    }
}
