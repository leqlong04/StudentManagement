import model.Person;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        Person p = new Person(1,"le Quang Long", LocalDate.of(2004,12,1),"Hanoi",51,20);
        System.out.println(p.toString());


    }
}
