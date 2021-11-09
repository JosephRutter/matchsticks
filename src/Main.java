import java.util.Scanner;

public class Main {

    public static int matchSticks() {
        Scanner input = new Scanner(System.in);
        int houseNumber = input.nextInt();
        if (houseNumber == 0) {
            return 0;
        } else {
            return 5 * houseNumber + 1;
        }
    }

    public static void main(String[] args) {
        System.out.println("how many matchstick houses do you want?");
        System.out.println("you will need " + matchSticks() + " matchsticks");
    }
}
