import model.Person;
import model.Student;
import service.StudentService;

import java.time.LocalDate;
import java.util.Scanner;

public class StudentManagement {

    public static void main(String[] args) {
        Student s1 = new Student(1,"Long",LocalDate.of(2004,12,20),
                "Hanoi",165.0,60,1,"UTC",2021,3.0
                );
        Student s2 = new Student(2,"Quang Long 2",LocalDate.of(2000,12,20),
                "Hanoi",165.0,60,2,"UTC",2020,3.0
        );
        Student s3 = new Student(3,"Quang Long 3 ",LocalDate.of(2000,12,20),
                "Hanoi",165.0,60,3,"UTC",2020,3.0
        );
        Student s4 = new Student(4,"Quang Long 4",LocalDate.of(2000,12,20),
                "Hanoi",165.0,60,4,"UTC",2020,3.0
        );
        Student s5 = new Student(1,"Quang Long",LocalDate.of(2000,12,20),
                "Hanoi",165.0,60,1,"new UTC",2020,3.0
        );
        StudentService.createStudent(s1);
        StudentService.createStudent(s2);
        StudentService.createStudent(s3);
        StudentService.createStudent(s4);
        StudentService.findStudentById(1);
        StudentService.updateStudent(1,"newUni",2024,11);
        StudentService.deleteStudent(1);
        StudentService.listAll();
    }

}
