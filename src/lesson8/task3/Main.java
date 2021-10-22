package lesson8.task3;

public class Main {
    public static void main(String[] args) {
       Employee employee = new Employee();
       employee.setName("Mark Brandon");
       employee.setAge(25);
       employee.setAddress("1 Gold street, London");
       employee.setPhoneNumber(1234567);
       employee.setSalary(1200);
       employee.setSpecialization("IT");

       Manager manager = new Manager();
        manager.setName("Lucy Pavensy");
        manager.setAge(20);
        manager.setAddress("Grace Hill 5, Boston, USA");
        manager.setPhoneNumber(251423355);
        manager.setDepartment("Sales");
        manager.setSalary(1500);

        employee.printSalary();
        manager.printSalary();


    }
}
