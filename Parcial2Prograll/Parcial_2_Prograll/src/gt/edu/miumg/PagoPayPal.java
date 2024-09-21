package gt.edu.miumg;

public class PagoPayPal implements EstrategiaDePago{
    private String email;


    @Override
    public void pagar(double cantidad) {
        if (autenticar()) {
            if (aprobarPago()) {
                System.out.println("Pago de " + cantidad + " aprobado usando PayPal.");
            } else {
                System.out.println("Pago con PayPal rechazado.");
            }
        } else {
            System.out.println("Autenticación de PayPal negada.");
        }
    }

    private boolean autenticar() {
        System.out.println("Autenticación de PayPal para la cuenta: " + email);
        return true;
    }

    private boolean aprobarPago() {
        System.out.println("Aprobación de pago por PayPal en proceso...");
        return true;
    }
}

