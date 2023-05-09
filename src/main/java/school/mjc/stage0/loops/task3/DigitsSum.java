package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int sum = 0;
        t = Math.abs(t);
        int x = t;
        for(int i=0; i < String.valueOf(x).length(); i++){
            int temp = t % 10;
            sum += temp;
            t -= temp;
            t /= 10;
        }
        System.out.println(sum);
    }
}
