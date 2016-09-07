package lab1.my.solution;

import java.util.Scanner;

/**
 * In this lab your challenge is to fix the code in both classes to use
 * proper encapsulation and the other best practices as explained by 
 * your instructor.
 *
 * @author      Jim Lombardo, WCTC Instructor
 * @version     1.01
 */
public class Startup {
    public static void main(String[] args) {
        /*
            Are we violating SRP (Single Responsibility Principle)?
        
            HINT: think about what we are trying to do ... hire an employee.
            Whose job is it to do this? The current class? Or, a new class?
            Should we do the work here or delegate to the new class? You
            may need to create a new class that talks to Employee. This does
            not have to be a GUI class.
        */
//        Employee employee = new Employee();
//        employee.firstName = "Peter";
//        employee.lastName = "Piper";
//        employee.ssn = "333-1234";
//
//        employee.meetDepartmentStaff();
//        employee.meetWithHrForBenefitAndSalryInfo();
//        employee.reviewDeptPolicies();
//
//        System.out.println("The employee's status is: " + employee.getStatus());
            Scanner sc = new Scanner(System.in);
            HRManager hr = new HRManager();
            Employee e = new Employee();
            System.out.println("What is the employee's first name?");
            e.setFirstName(sc.nextLine());
            System.out.println("What is the employee's last name?");
            e.setLastName(sc.nextLine());
            System.out.println("What is the employee's SSN?");
            e.setSsn(sc.nextLine());
            System.out.println("What is the employee's birthdate?");
            e.setBirthDate(sc.nextLine());
            
            hr.orientEmployee(e);
    }
    
    
}
