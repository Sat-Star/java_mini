
import java.util.Scanner;

public class Base {
    String name;
    String usn;
    int semester,a;
    double sgpa[] = new double[8];

    void details() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name : ");
        name = sc.nextLine();
        System.out.println();
        System.out.print("Enter USN : ");
        usn = sc.nextLine();
        a =Integer.parseInt(usn.substring(7));
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
		if(a<26)
			System.out.println("Proctor name : Dr. Kavitha");
		else if(a<51)
			System.out.println("Proctor name : Dr. Arbind Kumar Gupta");
		else if(a<76)
			System.out.println("Proctor name : Dr. Roopa M.S");
		else if(a<101)
			System.out.println("Proctor name : Dr. Amutha S");
		else if(a<126)
			System.out.println("Proctor name : Dr. Mohammed Tajuddin");
		else if(a<151)
			System.out.println("Proctor name : Dr. Rohini T V");
		else if(a<176)
			System.out.println("Proctor name : Prof. Prasad A M");
		else if(a<201)
			System.out.println("Proctor name : Dr. D Sathya");
		else if(a<226)
			System.out.println("Proctor name : Prof. Sarala D V");
		else if(a<251)
			System.out.println("Proctor name : Dr. Nagaraja J");
		else if(a<276)
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
