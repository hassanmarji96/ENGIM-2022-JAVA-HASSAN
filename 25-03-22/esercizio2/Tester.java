package esercizio2;

public class Tester 
{
    public static void main(String[] args) 
    {
        ContoCorrente mioContoCorrente = new ContoCorrente(); 
        mioContoCorrente.deposita(25);
        
        ContoCorrente.stampaConto(mioContoCorrente);
    }    
}
