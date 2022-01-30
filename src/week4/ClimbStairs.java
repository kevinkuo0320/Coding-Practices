import java.util.HashMap;

public class ClimbStairs {
    //use hashmap for memeorization
    HashMap<Integer, Integer> hm = new HashMap<>();
    int temp;

    public int climbStairs(int n) {
        if(hm.containsKey(n)){
            return hm.get(n);
        }

        if(n == 1) {
            return 1;
        }
        if(n == 2) {
            return 2;
        }

        temp = climbStairs(n - 1) + climbStairs(n - 2);
        hm.put(n, temp);
        return temp;

    }
}

