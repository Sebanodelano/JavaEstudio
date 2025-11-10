package C07_OOP.HerenciaEjercicios;

public class CP31_Circle extends CP3_Shape {
    protected double radio;
    

    public CP31_Circle(double radio){
        if(radio < 0){
            System.out.println("error en el radio");
            this.radio = 0;
        }else{
            this.radio = radio;
        }
        
    }
    public double getRadio(){

        return radio;
    }
    
    
    @Override
    public void calculateArea(){
        double result = Math.PI*radio*radio;
        System.out.println("El area del circulo es: " + result);
        
    }

    
}
