import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        int ch;
        Base st = new Base();
        st.details();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the  info you want to display\n 1. Full Info\n 2. Proctor info\n 3. CGPA info");
        ch = s.nextInt();
        switch (ch) {
            case 1:
                st.ireturn();
                break;
            case 2:
                st.proctor();
                break;
            case 3:
                st.CGPA();
                break;
            default:
                System.out.println("Please enter valid choice");
        }
        s.close();

        FileOutputStream fos = null;
        fos = new FileOutputStream("Info.txt", true);
        PrintWriter w = new PrintWriter(fos);
        w.println(st.txtoutput());
        System.out.println("Details saved in Info.txt");
        w.close();
    }
}
