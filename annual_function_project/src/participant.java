import java.util.Scanner;

public abstract class participant {
    private int participantID;
    private String participantName;

    public participant() {
    }

    public participant(int participantID, String participantName) {
        this.participantID = participantID;
        this.participantName = participantName;
    }

    public int getParticipantID() {
        return participantID;
    }

    public void setParticipantID(int participantID) {
        this.participantID = participantID;
    }

    public String getParticipantName() {
        return participantName;
    }

    public void setParticipantName(String participantName) {
        this.participantName = participantName;
    }

    @Override
    public String toString() {
        return "participant{" +
                "participantID=" + participantID +
                ", participantName='" + participantName + '\'' +
                '}';
    }
    public void read(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the ID of the participant");
        setParticipantID(sc.nextInt());
        System.out.println("enter the name of the participant");
        setParticipantName(sc.next());
    }
}
