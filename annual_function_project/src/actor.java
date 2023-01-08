import java.util.Scanner;

public class actor extends participant{
    private String playName;
    private int playRank;

    public actor() {
    }

    public actor(int participantID, String participantName, String playName, int playRank) {
        super(participantID, participantName);
        this.playName = playName;
        this.playRank = playRank;
    }

    public String getPlayName() {
        return playName;
    }

    public void setPlayName(String playName) {
        this.playName = playName;
    }

    public int getPlayRank() {
        return playRank;
    }

    public void setPlayRank(int playRank) {
        this.playRank = playRank;
    }

    @Override
    public String toString() {
        return super.toString()+"actor{" +
                "playName='" + playName + '\'' +
                ", playRank=" + playRank +
                '}';
    }

    @Override
    public void read() {
        super.read();
        System.out.println("enter the name of the play");
        Scanner sc=new Scanner(System.in);
        setPlayName(sc.next());
        System.out.println("enter the position of that play");
        setPlayRank(sc.nextInt());
    }
}
