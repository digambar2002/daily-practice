public class ReverseNo {
    public static void main(String[] args) {

        int num = 132;

        /*
         * Achive this by converting integer to string then reverse the string then
         * again convert string to integer
         * 
         * StringBuilder = Class
         * reverse() = method inside StringBuilder Class to reverse string
         * Integer.parseInt() = To Convert String to Integer
         */

        String str = String.valueOf(num);
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();

        num = Integer.parseInt(sb.toString());
        System.out.println(num);
    }
}
