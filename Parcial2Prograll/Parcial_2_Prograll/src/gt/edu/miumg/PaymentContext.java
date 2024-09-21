package gt.edu.miumg;


    public class PaymentContext {
        private EstrategiaDePago estrategiaDePago;

        public void setPaymentStrategy(EstrategiaDePago estrategiaDePago) {
            this.estrategiaDePago = estrategiaDePago;
        }

        public void processPayment(double cantidad) {
            if (estrategiaDePago != null) {
                estrategiaDePago.pagar(cantidad);
            } else {
                System.out.println("Seleccione un método de pago.");
            }
        }
    }

}
