package inheritance;

import java.util.ArrayList;

public class Employee implements Cloneable{

//    static {
//        System.out.println("static block");
//        nextId=1;
//    }

    private static int nextId;
    private String name;
    private double salary;
    private int id;

//    {
//        System.out.println("block");
//        System.out.println(nextId);
//    }

    public Employee() {

    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        id = nextId;
        nextId++;
    }

    public static int getNextId() {
        return nextId;
    }

//    public static void main(String[] args){
//        Employee e=new Employee("jim",3000);
//        System.out.println(e.getName()+" "+e.getSalary());
//    }
    public ArrayList testArrayList(){return new ArrayList();}

    public Employee clone() throws CloneNotSupportedException{
        Employee cloned=(Employee)super.clone();
        return cloned;
    }
}
