public class Main {
    public static void main(String[] args) {
        CreditCardPayment card = new CreditCardPayment();
        PayPalPayment pay = new PayPalPayment();
        CashPayment cash = new CashPayment();
        double valor = 100;
        card.processPayment(valor);
        pay.processPayment(valor);
        cash.processPayment(valor);
    }
}