
//30.06.2025

import java.util.HashSet;
import java.util.Set;

public class _202 {
    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }

    static public boolean isHappy(int n) {
        if (n < 0){
            return false;
        }
        Set<Integer> set = new HashSet<>();

        int result = sumOfNumbers(n);
        while (result != 1){
            if(set.contains(result)){
                return false;
            } else {
                set.add(result);
                result = sumOfNumbers(result);

            }

        }
        return true;
    }

    static public int sumOfNumbers(int n){
        int sum = 0;

        while(n>0){
            sum += Math.pow(n%10, 2);
            n/=10;
        }
        return sum;
    }

//    Runtime
//1
//    ms
//            Beats
//66.56%
//    Analyze Complexity
//    Memory
//40.78
//    MB
//            Beats
//64.78%

}
