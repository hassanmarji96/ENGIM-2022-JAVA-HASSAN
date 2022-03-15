import java.util.Scanner;

/**
 * @author Hassan Marji
 * Classe che implementa calcolatrice con funzioni trigonometriche
 */
public class CalcolatriceTrig
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
        double angolo;
        char prosegui;

        do
        {
            System.out.print("\t****SCEGLI TRA LE SEGUENTI OPERAZIONI:\n" +
                    "1) SOMMA\n" +
                    "2) DIFFERENZA\n" +
                    "3) PRODOTTO\n" +
                    "4) DIVISIONE\n" +
                    "5) SENO\n" +
                    "6) COSENO\n"+
                    "7) TANGENTE\n");

            Scanner inputUtente = new Scanner(System.in);

            System.out.print("Scegli l'operazione da effettuare:\t");
            int operatore = inputUtente.nextInt();

       
            switch(operatore)
            {
                case 1: // somma
                    System.out.println("Inserisci il primo numero:");
                    primoNumero = inputUtente.nextInt();
                    System.out.println("Inserisci il secondo numero:");
                    secondoNumero = inputUtente.nextInt();
                    System.out.println("Il risultato è: " + somma(primoNumero, secondoNumero));
                    break;
                case 2: // differenza
                    System.out.println("Inserisci il primo numero:");
                    primoNumero = inputUtente.nextInt();
                    System.out.println("Inserisci il secondo numero:");
                    secondoNumero = inputUtente.nextInt();
                    System.out.println("Il risultato della differenza è: " + differenza(primoNumero, secondoNumero));
                    break;
                case 3: // prodotto
                    System.out.println("Inserisci il primo numero:");
                    primoNumero = inputUtente.nextInt();
                    System.out.println("Inserisci il secondo numero:");
                    secondoNumero = inputUtente.nextInt();
                    System.out.println("Il risultato del prodotto è: " + prodotto(primoNumero, secondoNumero));
                    break;
                case 4: // divisione
                    System.out.println("Inserisci il primo numero:");
                    primoNumero = inputUtente.nextInt();
                    System.out.println("Inserisci il secondo numero:");
                    secondoNumero = inputUtente.nextInt();
                    System.out.println("Il risultato della divisione è: " + divisione(primoNumero, secondoNumero));
                    break;
                case 5: // seno
                    System.out.println("Inserisci il valore dell'angolo:");
                    angolo = inputUtente.nextDouble();
                    double risultatoSeno = Math.sin(Math.toRadians(angolo));
                    System.out.println("Il risultato del seno è: " + risultatoSeno);
                    break;
                case 6: // coseno
                    System.out.println("Inserisci il valore dell'angolo:");
                    angolo = inputUtente.nextDouble();
                    double risultatoCoseno = Math.cos(Math.toRadians(angolo));
                    System.out.println("Il risultato del coseno è: " + risultatoCoseno);
                    break;
                case 7: // tangente
                    System.out.println("Inserisci il valore dell'angolo:");
                    angolo = inputUtente.nextDouble();
                    double risultatoTangente = Math.tan(Math.toRadians(angolo));
                    System.out.println("Il risultato del tangente è: " + risultatoTangente);
                    break;
                default:
                    System.out.println("operazione non presente!");
                    break;
            }//end-switch
            System.out.print("Desideri effettuare una nuovaa operazione? [y/n] ");
            prosegui = inputUtente.next().charAt(0);
            //con i due comandi seguenti "pulisco" la console
            System.out.print("\033[H\033[2J");  
            System.out.flush();  
        }while(prosegui == 'y');
    }
}
