package ClaseUlima;

public class examenPOO2 {
    public static void main(String[] args) {
        problema2Sucursal prom = new problema2Sucursal();
        prom.mostrarMatriz();
        prom.totalSucursal();
        prom.totalImpresora();

        problema3exam prom2 = new problema3exam(76055104,"Sebastian","GerentedeGieshas",20000);
        prom2.ImprimirRecibo();
        problema3exam prom3 = new problema3exam(8888888, "sebas" , "sebanodelano",323233);
        prom3.ImprimirRecibo();



    }
}
