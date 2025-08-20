import model.Person;
import model.Student;
import service.StudentService;

import java.time.LocalDate;
import java.util.Scanner;

public class StudentManagement {
    private static final Scanner sc = new Scanner(System.in);
    private static final StudentService stuService = new StudentService();
    public static void main(String[] args) {

       while (true) {
           System.out.print("\n===== STUDENT MANAGEMENT ===== ");
           System.out.print("\n1.Add Student\n2.Search Student\n3.Update Student\n4.Delete Student\n5.Exit: ");
           System.out.println("\nChoose option: ");
           int choice;
           try {
                choice = Integer.parseInt(sc.nextLine());
           } catch (NumberFormatException e) {
               System.out.println("\nPlease enter a number(1-5)");
               continue;
           }
           switch (choice) {
               case 1 -> addStudent();
               case 2 -> searchStudent();
               case 3 -> updateStudent();
               case 4-> deleteStudent();
               case 5 -> {
              System.out.print("See ya");
              return;
          }
               default -> System.out.println("Invalid choice");
           }
       }


        }


    private static void addStudent() {
        while (true) {
            try {
                System.out.println("Name: ");
                String name = sc.nextLine();
                System.out.println("Birth date (yyyy-MM-dd): ");
                LocalDate date = LocalDate.parse(sc.nextLine());
                System.out.println("Address: ");
                String address = sc.nextLine();
                System.out.println("Height (cm): ");
                Double height = Double.parseDouble(sc.nextLine());
                System.out.println("Weight (kg): ");
                Double weight = Double.parseDouble(sc.nextLine());
                System.out.println("University: ");
                String uni = sc.nextLine();
                System.out.println("Start year: ");
                int year = Integer.parseInt(sc.nextLine());
                System.out.println("GPA: ");
                Double gpa = Double.parseDouble(sc.nextLine());
                Student stu = new Student(name, date, address, height, weight, uni, year, gpa);
                System.out.println("Add successfull: " + stu.toString());
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage() + " try again.\n");
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage() + ". try again.\n");
            }
        }
    }
    private static void searchStudent() {
        System.out.println("Id: ");
        int id = Integer.parseInt(sc.nextLine());
        stuService.findStudentById(id);

    }
    private static void updateStudent() {

    }
    private static void deleteStudent() {

    }
}
