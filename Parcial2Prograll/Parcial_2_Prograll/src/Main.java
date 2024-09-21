import gt.edu.miumg.PaymentContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        PaymentContext paymentContext = new PaymentContext();

        paymentContext.setPaymentStrategy(new CreditCardPayment("1234567890123456", "Cristian Chamo", "17/10", "0606005"));
        paymentContext.processPayment(100.0);

        // Pago con PayPal
        paymentContext.setPaymentStrategy(new PayPalPayment("cristianchamo.com"));
        paymentContext.processPayment(250.0);

        // Pago con criptomonedas
        paymentContext.setPaymentStrategy(new CryptoPayment("993990e34dhe"));
        paymentContext.processPayment(500.0);

        // Pago por transferencia bancaria
        paymentContext.setPaymentStrategy(new BankTransferPayment("9939093eus3q34"));
        paymentContext.processPayment(1000.0);
    }
}