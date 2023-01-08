import java.util.Scanner;

public class dancer extends participant {
    private int position;
    private int marks;

    public dancer() {
    }

    public dancer(int participantID, String participantName, int position, int marks) {
        super(participantID, participantName);
        this.position = position;
        this.marks = marks;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return super.toString()+"dancer{" +
                "position=" + position +
                ", marks=" + marks +
                '}';
    }

    @Override
    public void read() {
        super.read();
        System.out.println("enter marks of the dancer");
        Scanner sc=new Scanner(System.in);
        setMarks(sc.nextInt());
        System.out.println("enter position of the dancer");
        setMarks(sc.nextInt());
    }
}
