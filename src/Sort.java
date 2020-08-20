import java.util.Arrays;

public class Sort {

    public static Thread doSort (Integer[] c, Integer[] d, int i) {
        return new Thread(() -> {
            int myNumber = c[i];
            int count = 0;

            for (int j = 0; j < 10; j++) {
                if (c[j] < myNumber) {
                    count++;
                }
            }

            if (d[count] == null) {
                d[count] = myNumber;
            } else {
                int index = Arrays.asList(d).lastIndexOf(myNumber);
                d[index+1] = myNumber;
            }
        });
    }
}
