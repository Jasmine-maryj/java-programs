package Strings;

public class AddBinary {
    public static void main(String[] args) {
        String a = "1101";
        String b = "1011";

        String sum = calculateSum(a, b);
        System.out.println(sum + "sum");
    }

    public static String calculateSum(String a, String b){
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while(i >= 0 || j >= 0 || carry != 0){
            int sum = carry;

            if(i >= 0){
                sum += a.charAt(i) - '0';
                i--;
            }

            if(j >= 0){
                sum += b.charAt(j) - '0';
                j--;
            }

            sb.append(sum % 2);

            carry = sum / 2;
        }

        return sb.reverse().toString();
    }
}
