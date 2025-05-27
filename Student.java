public class Student implements Observer{

    private String name;
    private int salary;
    private String prof;

    public Student(String name){
        this.name = name;
        prof ="jun";
        salary = 5000;
    }




    
    @Override
    public String toString() {
        return "Student [name=" + name + ", salary=" + salary + ", prof=" + prof + "]";
    }
