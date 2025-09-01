package C07_OOP.Clases;

public class Book {
    // 1. Crea una clase Book con atributos title y author. Crea un objeto y muestra sus datos.
    String tittle;
    String author;
    //Constructor
    public Book(String tittle, String author){
        this.tittle = tittle;
        this.author= author;
    }
    public void llamado(){
        System.out.println("El nombre del autor es " + author + " y su libro mas famoso es" + " " +tittle);
    }

}
