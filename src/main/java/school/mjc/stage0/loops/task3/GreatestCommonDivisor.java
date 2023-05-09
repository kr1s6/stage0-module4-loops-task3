package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        for(int i=first; i >= 0; i--){
            if(first == 0) {
                System.out.println(second);
                break;
            }
            else if(second == 0) {
                System.out.println(first);
                break;
            }
            else if(second % i == 0 && first % i ==0){
                System.out.println(i);
                break;
            }

        }
    }
}
