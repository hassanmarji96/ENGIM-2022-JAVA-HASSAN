import java.util.Scanner;

/**
 * @author Hassan Marji
 * Classe che implementa la calcoltrice con l'ausilio delle funzioni
 */
public class CalcolatriceFunzioni
{
    /**
     * Funzione che si occupa di calcolare la somma tra due numeri passati come parametro.
     * @param primoNumero primo addendo
     * @param secondoNumero secondo addendo
     * @return risultato somma
     */
    public static int somma(int primoNumero, int secondoNumero)
    {
        return primoNumero + secondoNumero;
    }

    /**
     * Funzione che si occupa di calcolare la differenza tra due numeri passati come parametro.
     * @param primoNumero primo numero
     * @param secondoNumero secondo numero
     * @return risultato differenza
     */
    public static int differenza(int primoNumero, int secondoNumero)
    {
        return primoNumero - secondoNumero;
    }

    /**
     * Funzione che si occupa di calcolare il prodotto tra due numeri passati come parametro.
     * @param primoNumero primo numero
     * @param secondoNumero secondo numero
     * @return risultato prodotto
     */
    public static int prodotto(int primoNumero, int secondoNumero)
    {
        return primoNumero * secondoNumero;
    }

    public static int divisione(int primoNumero, int secondoNumero)
    {
        if(secondoNumero != 0)
            return primoNumero/secondoNumero;
        else
        {
            System.out.println("Errore! Divisione per zero impossibile!");
            System.exit(1);
        }
        return 0;
    }

    public static void main(String[] args)
    {
        int primoNumero;
        int secondoNumero;
        int risultato;

        Scanner inputUtente = new Scanner(System.in);
        System.out.println("Inserisci il primo numero:");
        primoNumero = inputUtente.nextInt();
        System.out.println("Inserisci il secondo numero:");
        secondoNumero = inputUtente.nextInt();

        System.out.print("\t****SCEGLI TRA LE SEGUENTI OPERAZIONI:\n" +
                "1) SOMMA\n" +
                "2) DIFFERENZA\n" +
                "3) PRODOTTO\n" +
                "4) DIVISIONE\n");

        System.out.print("Scegli l'operazione da effettuare:\t");
        int operatore = inputUtente.nextInt();

        switch(operatore)
        {
            case 1: // somma
                risultato = somma(primoNumero, secondoNumero);
                System.out.println("Il risultato è: " + risultato);
            break;
            case 2: // differenza
                System.out.println("Il risultato della differenza è: " + differenza(primoNumero, secondoNumero));
                break;
            case 3: // prodotto
                System.out.println("Il risultato del prodotto è: " + prodotto(primoNumero, secondoNumero));
                break;
            case 4: // divisione
                System.out.println("Il risultato della divisione è: " + divisione(primoNumero, secondoNumero));
                break;
            default:
                System.out.println("operazione non presente!");
                break;
        }
    }
}
