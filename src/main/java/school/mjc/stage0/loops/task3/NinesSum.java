package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        long sum = 0;
        for (int i = 1; i <= lengthOfLastNumber; i++) {
            String nineNumber = "";
            for (int j = 1; j <= i; j++) {
                nineNumber = nineNumber + "9";
            }
            sum = sum + Integer.parseInt(nineNumber);
        }
        System.out.println(sum);
    }
}
