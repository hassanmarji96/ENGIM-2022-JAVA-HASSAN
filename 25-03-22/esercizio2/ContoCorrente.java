package esercizio2;

public class ContoCorrente 
{
    private String nomeProprietario;
    private double saldo;
    private static Integer numeroContiCreati = 0;
    

    public ContoCorrente() 
    {
        numeroContiCreati++;
    }


    public ContoCorrente(String nomeProprietario)
    {
        numeroContiCreati++;
        this.nomeProprietario = nomeProprietario;
    }


    public String getNomeProprietario() {
        return this.nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public static Integer getNumeroContiCreati()
    {
        return numeroContiCreati;
    }

    /**
     * Funzione che si occupa di depositare una somma nel conto corrente,
     * andando ad aggiornare il valore del saldo
     * @param sommaDepositata, somma da andare ad aggiungere al saldo
     * @return somma depositata. 
     */
    public double deposita(double sommaDepositata)
    {
        this.saldo = this.saldo + sommaDepositata;
        return sommaDepositata;
    }

    /**
     * Funzione che si occupa di depositare una somma nel conto corrente,
     * andando ad aggiornare il valore del saldo
     * @param sommaPrelevata somma da andare a togliere al saldo
     * @return somma prelevata
     */
    public double preleva(double sommaPrelevata)
    {
        if(this.saldo < sommaPrelevata)
        {
            System.out.println("Somma da prelevare indisponibile");
            System.exit(1);
        }
        this.saldo = this.saldo - sommaPrelevata;
        return sommaPrelevata;
    }

    /**
     * Metodo statico che si occupa di stampare il conto. 
     * Come ben sapete i metodi statici non possono lavorare direttamente con i le variabili di istanza (in questo caso saldo).
     * Quindi per aggirare questo problema, passo come parametro l'istanza dell'oggetto di cui voglio sapere il conto corrente
     * @param contoCorrente
     */
    public static void stampaConto(ContoCorrente contoCorrente)
    {
        System.out.println("Il saldo disponibile è: " + contoCorrente.getSaldo());
    }

    @Override
    public String toString() 
    {
        return "{" +
            " nomeProprietario='" + getNomeProprietario() + "'" +
            ", saldo='" + getSaldo() + "'" +
            "}";
    }

    
}
