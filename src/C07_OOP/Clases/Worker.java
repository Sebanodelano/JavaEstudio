package C07_OOP.Clases;

public class Worker {
    // 8. Crea una clase Worker que reciba nombre y salario, y un metodo para mostrar su salario.
    private String name;
    private double salario;
    public Worker(String name,double salario){
        this.name=name;
        this.salario=salario;
    }
    public void Showsalario(){
        System.out.println("El nombre del usario es: " + name);
        System.out.println("El salario del usario " + name + " es: "+salario);
    }

    public double getSalario() {
        return salario;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
