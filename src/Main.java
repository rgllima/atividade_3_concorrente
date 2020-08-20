import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    static Integer[] c = new Integer[]{0, 3, 7, 2, 3, 9, 3, 20, 0, 20};
//    static Integer[] c = new Integer[]{0, 3, 8, 2, 8, 0, 15, 20, 3, 20};
    static Integer[] d = new Integer[10];

    public static void main(String[] args) {
        List<Thread> threads = new ArrayList<>();

        // Start processes
        for (int i = 0; i < 10; i++) {
            Thread a = Sort.doSort(c, d, i);
            threads.add(a);
            a.start();
        }

        // Join Threads
        try {
            for (Thread thread: threads) {
                thread.join();
            }
            System.out.println(Arrays.toString(d));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}