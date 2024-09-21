package gt.edu.miumg;

public class PagoTarjeta implements EstrategiaDePago {

    private String NuemroTarjeta;
    private String NobrePropietario;
    private String vencimiento;
    private String CVV;

    public void PagoTarjeta(String nuemroTarjeta, String nobrePropietario, String vencimiento, String cvv) {
        this.NuemroTarjeta = nuemroTarjeta;
        this.NobrePropietario = nobrePropietario;
        this.vencimiento = vencimiento;
        this.CVV = cvv;
    }

    @Override
    public void pagar(double cantidad) {
        if (ValidarDetalles()) {
            if (AutorizarPago()) {
                System.out.println("Pago de " + cantidad + " realizado con tarjeta.");
            } else {
                System.out.println("Pago con tarjeta de crédito negado.");
            }
        } else {
            System.out.println("Datos de tarjeta inválidos.");
        }
    }

    private boolean ValidarDetalles() {
        if (NuemroTarjeta.length() == 12 && CVV.length() == 5) {
            System.out.println("La tarjeta es validada.");
            return true;
        }
        return false;
    }

    private boolean AutorizarPago() {
        System.out.println("Autorización bancaria en proceso...");
        return true;
    }

}


