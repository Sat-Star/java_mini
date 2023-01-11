
import java.util.Scanner;

public class Base {
    String name;
    String usn;
    int semester;
    double sgpa[] = new double[8];

    void details() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name : ");
        name = sc.nextLine();
        System.out.println();
        System.out.print("Enter USN : ");
        usn = sc.nextLine();
        System.out.println();
        System.out.print("Enter Current Semester : ");
        semester = sc.nextInt();

        for (int i = 1; i < semester; i++) {
            System.out.println("Enter your Semester " + i + " SGPA");
            // while(sc.hasNext())
            sgpa[i] = sc.nextDouble();
        }

    }

    void proctor() {
        if (usn.substring(7).compareTo("026") == -1)
            System.out.println("Proctor name : Dr. Kavitha");
        else if (usn.substring(7).compareTo("051") == -1)
            System.out.println("Proctor name : Dr. Arbind Kumar Gupta");
        else if (usn.substring(7).compareTo("076") == -1)
            System.out.println("Proctor name : Dr. Roopa M.S");
        else if (usn.substring(7).compareTo("101") == -1)
            System.out.println("Proctor name : Dr. Amutha S");
        else if (usn.substring(7).compareTo("126") == -1)
            System.out.println("Proctor name : Dr. Mohammed Tajuddin");
        else if (usn.substring(7).compareTo("151") == -1)
            System.out.println("Proctor name : Dr. Rohini T V");
        else if (usn.substring(7).compareTo("176") == -1)
            System.out.println("Proctor name : Prof. Prasad A M");
        else if (usn.substring(7).compareTo("201") == -1)
            System.out.println("Proctor name : Dr. D Sathya");
        else if (usn.substring(7).compareTo("226") == -1)
            System.out.println("Proctor name : Prof. Sarala D V");
        else if (usn.substring(7).compareTo("251") == -1)
            System.out.println("Proctor name : Dr. Nagaraja J");
        else if (usn.substring(7).compareTo("264") == -1)
            System.out.println("Proctor name : Prof. Muqhita Almas");
    }

    void CGPA() {
        double sum = 0;
        for (int i = 1; i < semester; i++) {
            sum += sgpa[i];
        }
        double cgpa = sum / (semester - 1);
        System.out.println("CGPA is : " + String.format("%.2f", cgpa));
    }

    void ireturn() {
        System.out.println("Name : " + name);
        System.out.println("USN : " + usn);
        System.out.println("Semester : " + semester);
        proctor();
        CGPA();
    }

}
