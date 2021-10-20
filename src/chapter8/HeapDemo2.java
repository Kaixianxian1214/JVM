package chapter8;

import java.util.ArrayList;
import java.util.Random;

public class HeapDemo2 {
    byte[] buffer = new byte[new Random().nextInt(1024*200)];
    public static void main(String[] args) {
        ArrayList<HeapDemo2> list = new ArrayList<>();
        while(true){
            list.add(new HeapDemo2());
            try{
                Thread.sleep(3);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
