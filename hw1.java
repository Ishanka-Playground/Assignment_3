import java.util.Scanner;



public class hw1 {

    private static final Scanner scanner = new Scanner (System.in);

    public static void main(String[] args) {
        final String red ="\033[31m";
        final String yellow ="\033[33m";
        final String green ="\033[32m";
        final String boldBlue ="\033[1;34m"; // with bold
        final String boldGreen ="\033[1;32m"; // with bold
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
        scanner.nextLine();
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
        scanner.nextLine();

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
        System.out.print("Enter your Marks 2:");
        double marks2 = scanner.nextDouble();        
        scanner.nextLine();
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
        System.out.print("Enter your Marks 3:");
        double marks3 = scanner.nextDouble();
        scanner.nextLine();
        if (marks3 < 0 || marks3 > 100) {
            System.out.println(red+"Invalid Marks" + colourReset);
            return;
            //System.out.println(marks3);
        }
        String s1 = "SE-001";
        String s2 = "SE-002";
        String s3 = "SE-003";
        double m1 = 0;
        double m2 = 0;
        double m3 = 0;



        if (subject1.compareTo("SE-1")==0) m1 = marks1;
        else if (subject1.compareTo("SE-2")==0) m2 = marks1;
        else m3 = marks1;
        

        if (subject2.compareTo("SE-1")==0) m1 = marks2;
        else if (subject2.compareTo("SE-2")==0) m2 = marks2;
        else m3 = marks2;

        if (subject3.compareTo("SE-1")==0) m3 = marks3;
        else if (subject3.compareTo("SE-2")==0) m2 = marks3;
        else m3 = marks3;    
        




        // Clculations
        double total = m1 + m2 + m3;
        double average = total/3;
        String status;
        String status1;
        String status2;
        String status3;

        if (average > 75) status = green+"Credit pass"+colourReset;
        else if (average >= 65) status = yellow+"Pass"+ colourReset ;
        else status = red + "Fail" + colourReset ;  
        
        if (m1 > 75) status1 = green+"Credit pass"+colourReset;
        else if (m1 >= 65) status1 = yellow + "Pass"+ colourReset ;
        else status1 = red + "Fail" + colourReset ;  
        
        if (m2 > 75) status2 = green+"Credit pass"+colourReset;
        else if (m2 >= 65) status2 =  yellow+"Pass"+ colourReset ;
        else status2 = red + "Fail" + colourReset  ;      

        if (m3 > 75) status3 = green+"Credit pass"+colourReset;
        else if (m3 >= 65) status3 = yellow+"Pass"+ colourReset  ;
        else status3 = red + "Fail" + colourReset  ;  
    

        // OUTPUT display
    
        System.out.println("+"+"-".repeat(37)+"+");


        System.out.printf("| Name   : %s%-26s%s |\n", boldBlue, name.toUpperCase(), colourReset);
        System.out.printf("| Age    : %-26s |\n", age +" years old");
        System.out.printf("| Status : %s%-35s%s |\n", boldGreen,status,colourReset);
        System.out.printf("| Total  : %-6.2f    Avg : %6.2f%-4s |\n", total,average, "%");

        System.out.println("+"+"-".repeat(10)+"+"+"-".repeat(8)+"+" + "-".repeat(17)+"+");


        System.out.printf("| %-8s | %-6s | %-15s |\n","Subject", "Marks", "Status");

        System.out.println("+"+"-".repeat(10)+"+"+"-".repeat(8)+"+" + "-".repeat(17)+"+");

        System.out.printf("| %-8s | %-6s | %-24s |\n",s1, m1, status1);
        System.out.printf("| %-8s | %-6s | %-24s |\n",s2, m2, status2);
        System.out.printf("| %-8s | %-6s | %-24s |\n",s3, m3, status3);

        System.out.println("+"+"-".repeat(10)+"+"+"-".repeat(8)+"+" + "-".repeat(17)+"+");



    }
}