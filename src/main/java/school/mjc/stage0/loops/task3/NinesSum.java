package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        if(lengthOfLastNumber <= 0)
            System.out.println(0);
        else {
            int sum = 0;
            int x = 10;
            for (int i = 1; i <= lengthOfLastNumber; i++) {
                sum += x-1;
                x *= 10;
            }
            System.out.println(sum);
        }
    }
}
