import java.util.Scanner;

class Employee {
    int id;
    int age;
    
    Employee(int id, int age) {
        this.id = id;
        this.age = age;
    }
}

public class ques1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int z = scanner.nextInt();
        
        if (z < 1 || z > 10) {
            System.out.println("Invalid input");
        } else {
            Employee[] employees = new Employee[z];
            for (int i = 0; i < z; i++) {
                int id = scanner.nextInt();
                int age = scanner.nextInt();
                if (id < 10 || id > 1000 || age < 18 || age > 50) {
                    System.out.println("Invalid data");
                    return;
                }
                employees[i] = new Employee(id, age);
            }
            
            for (Employee emp : employees) {
                if (emp.age < 30) {
                    System.out.println(emp.id + " " + emp.age);
                }
            }
        }
    }
}
