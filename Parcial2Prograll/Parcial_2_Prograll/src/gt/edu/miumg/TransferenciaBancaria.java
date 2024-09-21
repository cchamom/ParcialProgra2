package gt.edu.miumg;

public class TransferenciaBancaria implements EstrategiaDePago{
    private String cuentaBanco;

    public void BancoPago(String bankAccount) {
        this.cuentaBanco = bankAccount;
    }

    @Override
    public void pagar(double cantidad) {
        if (VerificarTransferiencia()) {
            System.out.println("Transferencia de " + cantidad + " esperando verificacion.");
            if (confirmarTarnsferencia()) {
                System.out.println("Transferencia bancaria realizada.");
            } else {
                System.out.println("La transferencia bancaria fue rechazada.");
            }
        } else {
            System.out.println("Verificación de cuenta bancaria fallida.");
        }
    }

    private boolean VerificarTransferiencia() {
        System.out.println("Verificando los detalles de la cuenta bancaria: " + cuentaBanco);
        return true;
    }



    private boolean confirmarTarnsferencia() {

        System.out.println("Esperando confirmación manual de la transferencia bancaria...");
        return true;
    }
}

