import java.util.Scanner;

/**
 * @author Hassan Marji
 *
 */
public class Calcolatrice
{

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
        if(operatore == 1)
        {
            risultato = primoNumero + secondoNumero;
            System.out.println("Il risultato è: " + risultato);
        }
        else if(operatore == 2)
        {
            risultato = primoNumero - secondoNumero;
            System.out.println("Il risultato è: " + risultato);
        }
        else if(operatore == 3)
        {
            risultato = primoNumero * secondoNumero;
            System.out.println("Il risultato è: " + risultato);
        }
        else if(operatore == 4)
        {
            if(secondoNumero != 0)
            {
                risultato = primoNumero / secondoNumero;
                System.out.println("Il risultato è: " + risultato);
            }
            else
                System.out.println("ERRORE! SVEGLIA, DIVISIONE PER ZERO IMPOSSIBILE!");
        }
    }
}
