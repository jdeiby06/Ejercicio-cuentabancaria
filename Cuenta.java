
public class Cuenta {

    protected float saldo;
    protected int numeroConsignaciones = 0;
    protected int numeroRetiros = 0;
    protected Float tasaAnual;
    protected float comisionMensual = 0;

    public Cuenta(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }

    public void consignar(float cantidad) {
        saldo = saldo + cantidad;
        numeroConsignaciones = numeroConsignaciones + 1;
    }

    public void retirar(float cantidad) {
        float nuevoSaldo = saldo - cantidad;
        if (nuevoSaldo >= 0) {
            saldo = nuevoSaldo;
            numeroRetiros = numeroRetiros + 1;
        } else {
            System.out.println("La cantidad a retirar excede su saldo actual");
        }
    }

    public void CalcularInteres() {
        float interesMensual = saldo * (tasaAnual / 12);
        saldo += interesMensual;

    }

    public void ExtractoMensual() {
        saldo -= comisionMensual;
        CalcularInteres();

    }

    public void imprimirMensajes() {
        System.out.println("Saldo: " + saldo);
        System.out.println("Numero de consignaciones hechas: " + numeroConsignaciones);
        System.out.println("Numero de retiros hechos: " + numeroRetiros);
        System.out.println("Tasa de anual de interes: " + tasaAnual);
        System.out.println("Comision Mensual: " + comisionMensual);
    }

}
