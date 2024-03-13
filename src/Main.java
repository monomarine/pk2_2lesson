import com.sun.jdi.connect.Transport;
import  templatePackage.*;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Tranport> customs = new PriorityQueue<>(new TransportComparator());
        customs.add( new Track("99 TGD 45"));
        customs.add( new Car("55 JHF 85"));
        customs.add( new Track("74 JGH 93"));
        customs.add( new Car("05 JGH 93"));


        ArrayList<Tranport> transports = new ArrayList<Tranport>();

        for(int i = 0; i<customs.size(); i++){
            Tranport temp = customs.poll();
            System.out.print("\nтранпорт " +temp.GetGosNomer()
                    +" вышел из очереди");
            transports.add(temp);
        }

        for (int i = 0; i < transports.size(); i++) {
            System.out.println("\n"+transports.get(i));
        }


    }
}