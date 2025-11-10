package C07_OOP.HerenciaEjercicios;

public class CP2_Employee {
// 4. La clase Employee tiene los atributos name y salary. Manager hereda de Employee y agrega el atributo department.
    private String name;
    private int salary;
    public CP2_Employee(String name , int salary){
        this.name = name;
        if(salary <0){
            System.out.println("El salario tiene error");
            this.salary = 0;
        }else{
            this.salary = salary;
        }
    }
    public String getName(){
        return name;
    }
    public int getSalary(){
        return salary;
    }
    
}
