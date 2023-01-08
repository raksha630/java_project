import java.util.Scanner;

public class annual_function {
    private String name;
    private int year;
    participant[] p;
    private int pCount;

    public annual_function() {
        p=new participant[5];
        pCount=0;

    }

    public annual_function(String name, int year, participant[] p, int pCount) {
        this.name = name;
        this.year = year;
        this.p = p;
        this.pCount = pCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public participant[] getP() {
        return p;
    }

    public void setP(participant[] p) {
        this.p = p;
    }

    public int getpCount() {
        return pCount;
    }

    public void setpCount(int pCount) {
        this.pCount = pCount;
    }

    public void addParticipant(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. of participant you want to add");
        int nop=sc.nextInt();
        for (int i=0;i<nop;i++){
            System.out.println("enter 1 for adding dancer\n2 for singer\n3 for actor");
            int choice=sc.nextInt();
            switch (choice){
                case 1:
                    p[i]=new dancer();
                    p[i].read();
                    break;
                case 2:
                    p[i]=new singer();
                    p[i].read();
                    break;
                case 3:
                    p[i]=new actor();
                    p[i].read();
                    break;

            }
            pCount++;
        }
    }
    public void display(){
        System.out.println("name"+name+"year"+year);
        for (int i=0;i<pCount;i++){
            System.out.println(p[i]);
        }
    }
}