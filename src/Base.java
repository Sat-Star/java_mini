
import java.util.Scanner;

public class Base {
    String name;
    String usn;
    String proctor;
    int semester, a;
    double sgpa[] = new double[8];
    double cgpa;

    void details() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name : ");
        name = sc.nextLine();
        System.out.println();
        System.out.print("Enter USN : ");
        usn = sc.nextLine();
        if (usn.substring(0, 7).compareTo("1DS21CS") == -1 || usn.substring(0, 7).compareTo("1ds21cs") == -1) {
            while (usn.substring(0, 7).compareTo("1DS21CS") == -1 || usn.substring(0, 7).compareTo("1ds21cs") == -1) {
                System.out.println("Invalid USN, please type again(2021 batch only)");
                usn = sc.nextLine();
            }
        }
        a = Integer.parseInt(usn.substring(7));
        System.out.println();
        System.out.print("Enter Current Semester : ");
        semester = sc.nextInt();

        for (int i = 1; i < semester; i++) {
            System.out.println("Enter your Semester " + i + " SGPA");
            // while(sc.hasNext())
            try {
                sgpa[i] = sc.nextDouble();
            } catch (Exception e) {
                System.out.println("Semester can't be more than 8 " + e);
            }
        }
    }

    void proctor() {
        if (a < 26)
            proctor = "Dr. Kavitha";
        else if (a < 51)
            proctor = "Dr. Arbind Kumar Gupta";
        else if (a < 76)
            proctor = "Dr. Roopa M.S";
        else if (a < 101)
            proctor = "Dr. Amutha S";
        else if (a < 126)
            proctor = "Dr. Mohammed Tajuddin";
        else if (a < 151)
            proctor = "Dr. Rohini T V";
        else if (a < 176)
            proctor = "Prof. Prasad A M";
        else if (a < 201)
            proctor = "Dr. D Sathya";
        else if (a < 226)
            proctor = "Prof. Sarala D V";
        else if (a < 251)
            proctor = "Dr. Nagaraja J";
        else if (a < 276)
            proctor = "Prof. Muqhita Almas";
        else
            proctor = "Proctor name NA ,Invalid usn";
        System.out.println("Proctor name : " + proctor);
    }

    void CGPA() {
        double sum = 0;
        for (int i = 1; i < semester; i++) {
            sum += sgpa[i];
        }
        cgpa = sum / (semester - 1);
        System.out.println("CGPA is : " + String.format("%.2f", cgpa));
    }

    void ireturn() {
        System.out.println("Name : " + name);
        System.out.println("USN : " + usn);
        System.out.println("Semester : " + semester);
        proctor();
        CGPA();
    }

    String txtoutput() {
        String op = "Name : " + name + "\nUSN : " + usn + "\nSemester : " + semester + "\nProctor : " + proctor
                + "\nCGPA : " + String.format("%.2f", cgpa) + "\n";
        return op;
    }
}
