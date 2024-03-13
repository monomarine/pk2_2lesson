import com.sun.jdi.connect.Transport;
import  templatePackage.*;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Tranport> customs = new PriorityQueue<>(new TransportComparator());
        customs.add( new Track("99 TGD 45"));
        customs.add( new Car("55 JHF 85"));
        customs.add( new Track("74 JGH 93"));
        customs.add( new Car("05 JGH 93"));



        for(int i = 0; i<customs.size(); i++){
            System.out.print("\nтранпорт " +customs.poll().GetGosNomer()
                    +" вышел из очереди");
        }


    }
}