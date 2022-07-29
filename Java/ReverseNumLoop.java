// *Program 2*

public class ReverseNumLoop {

    public static void main(String[] args) {

        int num = 8765;
        int remainder, reverse = 0;

        while (num != 0) {

            remainder = num % 10;

            reverse = reverse * 10 + remainder;

            num = num / 10;

        }

        System.out.println(reverse);

    }

}
