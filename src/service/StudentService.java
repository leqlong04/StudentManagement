package service;

import model.Student;

import java.util.ArrayList;

public class StudentService {
    private static ArrayList<Student> students = new ArrayList<>();

    public static void createStudent(Student student) {
        for(Student s : students) {
            if(s.getId() == student.getId()) {
                System.out.println("Student already exists");
                return;
            }
        }
        students.add(student);
        System.out.println("Student is created " + student);
    }

    public static Student findStudentById(int stuId) {
        for(Student s : students) {
            if(s.getId() == stuId) {
                System.out.println("Student found: " + s.toString());
                return s;
            }
        }

        System.out.println("No student found with id " + stuId);
        return null;
    }
    public static void updateStudent(int id, String uni, int year, double gpa) {

        Student s = findStudentById(id);
        if(s == null) {
            System.out.println("No student found with id " + id);
            return;
        }
        else {
            try {
                s.setUni(uni);
                s.setYear(year);
                s.setGpa(gpa);
                System.out.println("Update student " + s.toString());
            }
            catch (IllegalArgumentException e) {
                System.out.println("Update failed: " + e.getMessage());
            }
        }

    }
    public static void deleteStudent(int id) {
      Student s = findStudentById(id);
      if(s == null) {
          System.out.println("No student found with id " + id);
          return;
      }
      else {
          students.remove(s);
          System.out.println("Delete student " + s.toString());
      }

    }
    public static void listAll() {
        for(Student s : students) {
            System.out.println(s.toString());
        }
    }
}
