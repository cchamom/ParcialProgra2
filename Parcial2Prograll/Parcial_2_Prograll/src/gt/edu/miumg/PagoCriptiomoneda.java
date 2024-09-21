package gt.edu.miumg;

public class PagoCriptiomoneda implements EstrategiaDePago{
    private String walletAddress;

    public void CriptomonedaPago(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public void pagar(double amount) {
        if (VerificarLaTarsaccion()) {
            System.out.println("Pago de " + amount + " confirmado usando criptomonedas.");
        } else {
            System.out.println("Transacción fallida en la red blockchain.");
        }
    }

    private boolean VerificarLaTarsaccion() {
        System.out.println("Verificando transacción en la red blockchain para la dirección: " + walletAddress);
        return true;
    }
}

