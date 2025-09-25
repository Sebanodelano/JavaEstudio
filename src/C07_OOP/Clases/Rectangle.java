package C07_OOP.Clases;

public class Rectangle {
    // 7. Crea una clase Rectangle con métodos para calcular el área y el perímetro.
    private double length;
    private double width;
    public Rectangle(double length, double width){
        this.length=length;
        this.width=width;
    }
    public void AreaPerim(){
        double area = length * width;
        double perim = 2*(length + width);
        System.out.println("El area del rectangulo es: " + area);
        System.out.println("EL perimetro del rectangulo es: "+ perim);

    }
    /*// Métodos para calcular
    public double calculateArea(){
        return length * width;
    }METODO MAS CLEAN

    public double calculatePerimeter(){
        return 2 * (length + width);
    }*/

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}



