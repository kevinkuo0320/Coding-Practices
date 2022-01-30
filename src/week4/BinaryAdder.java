public class BinaryAdder {
    public String addBinary(String a, String b) {

        StringBuilder res = new StringBuilder();
        int lenA = a.length() - 1;
        int lenB = b.length() - 1;

        int carry = 0;

        while(lenA >= 0 || lenB >= 0){

            int sum = carry;

            if(lenA >= 0){
                sum = sum + a.charAt(lenA) - '0';
            }
            if(lenB >= 0){
                sum = sum + b.charAt(lenB) - '0';
            }

            /*
            sum = 0 -> carry = 0  res = 0
            sum = 1 -> carry = 0  res = 1
            sum = 2 -> carry = 1  res = 0
            sum = 3 -> carry = 1  res = 1
            */

            if(sum > 1) {
                carry = 1;
            } else {
                carry = 0;
            }

            res.append(sum % 2);

            lenA--;
            lenB--;

        }

        if(carry != 0) res.append(carry);
        return res.reverse().toString();


    }
}
