import java.util.Scanner;

/**
 * @author Hassan Marji
 * Implementazione esercizio divisibilità
 */

 public class Divisibile
 {
     /**
      * Funzione che serve a controllare se un numero è divisibile per un'altro numero. 
      * @param numeroDivisibile numero passato in input, di cui verificare la divisibilità
      * @param criterioDivisibilita numero che controlla il criterio di divisibilità
      * @return TRUE se è divisibile, FALSE altrimenti
      */
     public static boolean isDivisibile(int numeroDivisibile, int criterioDivisibilita)
     {
        return numeroDivisibile % criterioDivisibilita == 0;
     }
     public static void main(String[] args) 
     {
        int numeroDivisibile; // numero di cui verificare la divisibilità
        int criterioDivisibilita; // numero divisibile (per 2, 3, 4 etc...)

        Scanner inputUtente = new Scanner(System.in);

        System.out.println("Inserisci il numero di cui verificare la divisibilità: ");
        numeroDivisibile = inputUtente.nextInt();

        System.out.println("Inserisci il criterio di divisibilità: ");
        criterioDivisibilita = inputUtente.nextInt();

        if(isDivisibile(numeroDivisibile, criterioDivisibilita))
            System.out.println("Il numero: " + numeroDivisibile + " passato in input è divisibile per " + criterioDivisibilita);

        else
            System.out.println("Il numero " + numeroDivisibile + " passato in input NON è divisibile per " + criterioDivisibilita);
     }
 }