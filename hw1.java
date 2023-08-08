import java.util.Scanner;



public class hw1 {

    private static final Scanner scanner = new Scanner (System.in);

    public static void main(String[] args) {
        final String red ="\033[31m";
        final String colourReset ="\033[0m";

        //name
        System.out.print("Enter your name:");
        String name = scanner.nextLine().strip();
        if (name.length() == 0){
            System.out.println(red + "Invalid Name" + colourReset);
            return;
            // System.out.println(name);
        }


        // age
        System.out.print("Enter your Age:");
        int age = scanner.nextInt();
        
        if (age <= 10 || age >= 18) {
            System.out.println(red+"Invalid Age" + colourReset);
            return;
            //System.out.println(age);
        }

        // subject 1
        System.out.print("Enter your Subject 1:");
        String subject1 = scanner.nextLine().strip();
        if (!subject1.startsWith("SE-") || subject1.length()!= 4) {
            System.out.println(red+"Invalid Subject" + colourReset);
            return;  
            //System.out.println(subject1);
        }
           

        // marks 1
        System.out.print("Enter your Marks 1:");
        double marks1 = scanner.nextDouble();
        if (marks1 < 0 || marks1 > 100) {
            System.out.println(red+"Invalid Marks" + colourReset);
            return;
            //System.out.println(marks1);
        }

        // subject 2
        System.out.print("Enter your Subject 2:");
        String subject2 = scanner.nextLine().strip();
        if (!subject2.startsWith("SE-") || subject2.length()!= 4 || subject2.compareTo(subject1)==0 ) {
            System.out.println(red+"Invalid Subject" + colourReset);
            return;
            //System.out.println(subject1);
        }
    
        // marks 2
        System.out.print("Enter your Marks 1:");
        double marks2 = scanner.nextDouble();
        if (marks2 < 0 || marks2 > 100) {
            System.out.println(red+"Invalid Marks" + colourReset);
            return;
            //System.out.println(marks2);
        }

        // subject 3
        System.out.print("Enter your Subject 2:");
        String subject3 = scanner.nextLine().strip();
        if (!subject3.startsWith("SE-") || subject3.length()!= 4 || subject3.compareTo(subject1)==0 || subject3.compareTo(subject2)==0  ) {
            System.out.println(red+"Invalid Subject" + colourReset);
            return;
            //System.out.println(subject3);
        }
    
        // marks 3
        System.out.print("Enter your Marks 1:");
        double marks3 = scanner.nextDouble();
        if (marks3 < 0 || marks3 > 100) {
            System.out.println(red+"Invalid Marks" + colourReset);
            return;
            //System.out.println(marks3);
        }



    }
}