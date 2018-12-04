package inheritance;

public class EmployeeTest {
    public static void main(String[] args) throws CloneNotSupportedException{
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("aa", 1000);
        staff[1] = new Employee("bb", 2000);
        staff[2] = new Employee("cc", 3000);

        for (Employee e : staff) {
            e.setId();
            System.out.println("id:" + e.getId() + " name:" + e.getName() + " salary:" + e.getSalary());
        }
        int n = Employee.getNextId();
        System.out.println("nextId:" + n);

        Employee cloneTest=staff[0].clone();
    }
}
