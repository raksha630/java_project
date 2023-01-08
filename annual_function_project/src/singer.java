import java.util.Scanner;

public class singer extends participant {
    private String song;
    private int singerRank;

    public singer() {
    }

    public singer(String song, int singerRank) {
        this.song = song;
        this.singerRank = singerRank;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public int getSingerRank() {
        return singerRank;
    }

    public void setSingerRank(int singerRank) {
        this.singerRank = singerRank;
    }

    @Override
    public String toString() {
        return super.toString()+"singer{" +
                "song='" + song + '\'' +
                ", singerRank=" + singerRank +
                '}';
    }

    @Override
    public void read() {
        super.read();
        System.out.println("enter the song he\she has sung");
        Scanner sc=new Scanner(System.in);
        setSong(sc.next());
        System.out.println("enter the rank");
        setSingerRank(sc.nextInt());
    }
}
