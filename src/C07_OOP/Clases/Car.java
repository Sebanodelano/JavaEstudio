package C07_OOP.Clases;

public class Car {
    String brand;
    String model;

    public Car(String brand, String model){
        this.brand = brand;
        this.model = model;

    }
    public void showdata(){
        System.out.println("La marca del carro es: " + brand +
                " El modelo del carro es: " + model);
    }



}
