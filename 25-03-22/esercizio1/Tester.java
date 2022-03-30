package esercizio1;
public class Tester 
{
    public static void main(String[] args) 
    {
        Persona primaPersona = new Persona();
        primaPersona.setNome("Ciccio");
        primaPersona.setCognome("Pasticcio");
        primaPersona.setEta(26);

        System.out.println(primaPersona);

        Persona secondaPersona = new Persona("Ciccio", "Pasticcio", 62);
        System.out.println(secondaPersona);
    }
}
