package javaRevision.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
    public static void main(String[] args) {
        PrintJob[] jobs = new PrintJob[]{
                new PrintJob("Ashwini"),
                new PrintJob("Puja"),
                new PrintJob("Ankita"),
                new PrintJob("Nitu"),
                new PrintJob("AshwiniK"),
                new PrintJob("PujaK"),
                new PrintJob("AnkitaP"),
                new PrintJob("NituK")
        };
        ExecutorService service = Executors.newFixedThreadPool(3);
        for(PrintJob job:jobs){
            service.submit(job);
        }
        service.shutdown();
    }

}

class PrintJob implements Runnable {
    private String name;
    PrintJob(String name){
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("job started: "+name);
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
