public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {

        if(n == 1) {
            return true;
        } else {

            while(n % 2 == 0 && n!=0) {
                n = n/2;
                if(n == 1) {
                    return true;
                }

            }

            return false;


        }

    }
}
