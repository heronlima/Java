public class CreditCardPayment implements Payment{
    @Override
    public void processPayment(double valor) {
        double tax = 0.05;
        System.out.println("Voce usou o método PayPal");
        System.out.println("Voce pagou: "+valor +" e gerou taxa de: "+ tax+"%");
        System.out.println("No total ficou: "+(valor+valor*tax));
    }
}
