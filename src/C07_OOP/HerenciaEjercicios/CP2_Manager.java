package C07_OOP.HerenciaEjercicios;

public class CP2_Manager extends CP2_Employee {
    private String department;
    public CP2_Manager(String name , int salary , String department){
        super(name, salary);
        this.department = department;
    }
    public String getDepartment(){
        return department;
    }
    public void llamada(){
        System.out.println("El " + getName() + "vive en "+ department + " y gana " + getSalary());
    }

    
}
