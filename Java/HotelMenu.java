
/* 
Program No: 2
Tittle: Write a program to display hotel menu, menu items: pav-bhaji, paneer-butter-masala, chhole-bhature, palak-paneer, misal-pav. Note:All this menu items are display on separate line one by one.
Author: Digambar Chaudhari 
*/

public class HotelMenu {
    public static void main(String[] args) {

        System.out.println("\u001B[37m");
        System.out.println("\u001B[33m" + "---------------------------------");
        System.out.println("\u001B[33m" + "|" + "\t \t \t \t|");
        System.out
                .println("\u001B[33m" + "|" + "\033[0;1m" + "\u001B[32m" + "\t Hotel 5 Star" + "\u001B[33m" + "\t \t|");
        System.out.println("\u001B[33m" + "|" + "\t \t \t \t|");
        System.out.println("\u001B[33m" + "---------------------------------");
        System.out.println("\u001B[33m" + "|" + "\t \t \t \t|");
        System.out.println("\u001B[33m" + "|" + " \u001B[36m " + " 1] Pav-Bhaji" + "\u001B[33m" + "\t \t|");
        System.out.println("\u001B[33m" + "|" + "\t \t \t \t|");
        System.out.println("\u001B[33m" + "|" + " \u001B[36m " + " 2] Paneer-Butter-Masala" + "\u001B[33m" + "\t|");
        System.out.println("\u001B[33m" + "|" + "\t \t \t \t|");
        System.out.println("\u001B[33m" + "|" + " \u001B[36m " + " 3] Chhole-Bhature" + "\u001B[33m" + "\t \t|");
        System.out.println("\u001B[33m" + "|" + "\t \t \t \t|");
        System.out.println("\u001B[33m" + "|" + " \u001B[36m " + " 4] Palak-Paneer" + "\u001B[33m" + "\t \t|");
        System.out.println("\u001B[33m" + "|" + "\t \t \t \t|");
        System.out.println("\u001B[33m" + "|" + " \u001B[36m " + " 5] Misal-Pav" + "\u001B[33m" + "\t \t|");
        System.out.println("\u001B[33m" + "|" + "\t \t \t \t|");
        System.out.println("\u001B[33m" + "---------------------------------");
        System.out.println("\u001B[37m");
    }
}

/*
 * In this program i used ANSI Escape code which performs various task like
 * change color, bold text etc
 * 
 * ---------------------- Some ANSI Code And Mening -----------------------
 * 1] \u001B[37m ==> WHITE COLOR PRINTS
 * 2] \u001B[33m ==> YELLOW COLOR
 * 3] \u001B[32m ==> GREEN COLOR
 * 4] \u001B[36m ==> Cyan COLOR
 * 5] \033[0;1m ==> BOLD Text
 * 
 * For More Information About ANSI Codes Open Link 👇
 * https://www.geeksforgeeks.org/how-to-print-colored-text-in-java-console
 * 
 * \t => For Tab Space
 * \n => For New Line
 */