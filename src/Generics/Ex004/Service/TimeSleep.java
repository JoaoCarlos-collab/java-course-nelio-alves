package Generics.Ex004.Service;

public class TimeSleep {

    public static void esperar (int ms){
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
