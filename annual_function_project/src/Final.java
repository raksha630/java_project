import java.util.Scanner;

public class Final {
    public static void main(String[] args) {
        annual_function a=new annual_function();
        System.out.println("enter name of the function");
        Scanner sc=new Scanner(System.in);
        a.setName(sc.next());
        System.out.println("enter the year");
        a.setYear(sc.nextInt());
        a.addParticipant();
        a.display();
    }
}
