package templatePackage;

import java.util.Random;

public class Car implements Tranport{
    static  int type = 0;
    String owner;
    String gosNomer;
    @Override
    public String GetGosNomer() {
        return gosNomer;
    }
    @Override
    public void SetGosNomer(String Value) {
        gosNomer = Value;
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
    public Car(String gosnomer){
        SetGosNomer(gosnomer);
    }
    @Override
    public String toString() {
        return "0";
    }


}
