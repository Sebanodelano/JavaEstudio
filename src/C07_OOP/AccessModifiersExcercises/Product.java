package C07_OOP.AccessModifiersExcercises;

public class Product {
    /*2. Crea una clase Product con el atributo privado price.
    Añade el metodo setPrice(double price) que solo permita precios mayores a 0.
     */
    private int price;
    public Product(int price){
        this.setPrice(price);
    }

    public void showPrice(){
        System.out.println("El precio del producto es: " + price);
    }
    public void setPrice(int price){
        if(price<=0){
            System.out.println("El precio debe ser mayor que 0");
        }else{
            this.price = price;
        }
    }

}

