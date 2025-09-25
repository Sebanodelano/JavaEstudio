package C07_OOP.Clases;

public class Student {
    // 5. Crea una clase Student con atributo score y un metodo que diga si aprobó (mayor o igual a 60).

    private int score;
    public Student(int score){
        this.score = score;
    }
    public void ShowResult(){
        if(score>=60){
            System.out.println("El estudiante aprobó");
        }else{
            System.out.println("El estudiante desaprobó");
        }
    }
    public int getScore(){
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
