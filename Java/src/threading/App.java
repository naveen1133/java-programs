package threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(2);

        executor.submit(() -> {
            System.out.println("🎵 Playing song...");
            sleep(3000);
            System.out.println("🎵 Song finished");
        });

        executor.submit(() -> {
            System.out.println("🖼 Loading gallery...");
            sleep(2000);
            System.out.println("🖼 Gallery loaded");
        });

        executor.shutdown();
    }

    private static void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
