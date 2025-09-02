public class CuentaAhorros extends Cuenta {
    protected boolean activa;

    public CuentaAhorros(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        this.activa = saldo >= 10000;
    }

    @Override
    public void retirar(float cantidad) {
        if (activa) {
            super.retirar(cantidad);

        } else {
            System.out.println("Su cuenta de ahorros esta inactiva, por lo tanto no puede retirar");
        }
    }

    @Override
    public void consignar(float cantidad) {
        if (activa) {
            super.consignar(cantidad);
        } else {
            System.out.println("Su cuenta de ahorros esta inactiva, por lo tanto no podra consignar");
        }
    }

    public void ExtractoMensual() {
        if (numeroRetiros > 4) {
            comisionMensual += 1000 * (numeroRetiros - 4);

        }
        super.ExtractoMensual();
        if (saldo < 1000) {
            activa = false;
        }

    }

}
