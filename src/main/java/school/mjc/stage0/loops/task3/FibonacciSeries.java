package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int first = 0;
        System.out.println(first);
        int second = 1;
        System.out.println(second);
        for(int i = 2; i < lastFibonacci; i++){
            int temp = second;
            second = first + second;
            first = temp;
            System.out.println(second);
        }
    }
}
