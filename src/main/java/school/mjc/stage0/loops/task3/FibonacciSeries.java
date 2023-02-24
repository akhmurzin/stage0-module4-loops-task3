package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int f0 = 0;
        int f1 = 1;
        if (lastFibonacci == 1) {
            System.out.println(f0);
        } else if (lastFibonacci > 1) {
            System.out.println(f0);
            System.out.println(f1);
            int fi;
            for (int i = 2; i < lastFibonacci; i++) {
                fi = f0 + f1;
                System.out.println(fi);
                f0 = f1;
                f1 = fi;
            }
        }
    }
}
