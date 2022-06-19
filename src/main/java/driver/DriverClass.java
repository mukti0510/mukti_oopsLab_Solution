package driver;

import pojo.Employee;
import service.CredentialService;

import java.util.Scanner;

public class DriverClass {
    public static void main(String[] args) {

        Employee employee = new Employee("Mukti", "Bhargava");

        System.out.println("Enter the department number from the below list: ");
        System.out.println("1. Technical");
        System.out.println("2. Admin");
        System.out.println("3. Human Resources");
        System.out.println("4. Legal");

        Scanner s = new Scanner(System.in);
        int option = s.nextInt();
        
        switch(option)
        {
            case 1:
                employee.setDeptName("tech");
            break;
            case 2:
            	employee.setDeptName("admin");
            break;
            case 3:
            	employee.setDeptName("hr");
            break;
            case 4:
            	employee.setDeptName("legal");
            break;
        }

        CredentialService cs = new CredentialService(employee);
            cs.showCredentials(employee.getDeptName());
            System.out.println("Department is "+ employee.getDeptName());
    }
}
