public class CashPayment implements Payment{
    @Override
    public void processPayment(double valor) {
        System.out.println("Voce usou o método PayPal");
        System.out.println("No total ficou: "+valor+" Não há taxas para dinheiro físico.");
    }
}
