package inheritance;

import java.util.ArrayList;

public class ManagerTest {
    public static void main(String[] args) {
        Manager boss = new Manager("z", 9000);
        boss.setBonus(80000);

        Employee s=new Manager("s",20);
        ((Manager)s).setBonus(30);


        String[] a=new String[3];
        System.out.println(a.toString());

        ArrayList<Employee> ae=new ArrayList<>();
        ArrayList arraye=new Employee().testArrayList();
        arraye=ae;

        Manager[] managers = new Manager[10];
        Employee[] staff = managers;
        staff[0] = new Manager("Harry Hacker",80);

//        Employee[] staff = new Employee[3];
//        staff[0] = boss;
//        staff[1] = new Employee("a", 3000);
//        staff[2] = new Employee("b", 4000);

//        for (Employee e : staff) {
//            System.out.println("salary:" + e.getSalary());
//        }

        double i=Double.parseDouble("15.99");
        System.out.println(i);
    }
}
