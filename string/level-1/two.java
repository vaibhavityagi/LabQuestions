import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = sc.next();
        System.out.print("Enter your middle name: ");
        String middleName = sc.next();
        System.out.print("Enter your last name: ");
        String lastName = sc.next();
        System.out.println("Full name: " + firstName + " " + middleName + " " + lastName);
        System.out.print(firstName.toUpperCase().charAt(0) + " ");
        System.out.print(middleName.toUpperCase().charAt(0) + " ");
        System.out.print(lastName.toUpperCase().charAt(0));
        sc.close();
    }
}
