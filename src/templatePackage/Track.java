package templatePackage;

import java.util.Random;

public class Track implements Tranport{
    static  int type = 1;
    String owner;
    String gosNomer;
    @Override
    public String GetGosNomer() {
        return gosNomer;
    }

    @Override
    public void SetGosNomer(String value) {
        gosNomer = value;
    }

    @Override
    public String changeOwner(String value) {
        owner = value;
        return  owner;
    }

    @Override
    public boolean technicalService() {
        Random ran = new Random();
        int t = ran.nextInt(0,2);
        if(t==0) return  false;
        else return  true;
    }

    public  void sendOnAFlight(){
        System.out.println("автомобиль в рейсе");
    }

    public Track(String gosnomer){
        SetGosNomer(gosnomer);
    }

    @Override
    public String toString() {
        return "1";
    }
}
