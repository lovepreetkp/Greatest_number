//Greateast number using nested if else
public class nestedie {
    public static void main(String args[]) {
        int a = 10;
        int b = 5;
        int c = 2;

        if (a > b) {
            if (a > c) {
                System.out.println(+a + " is greatest number");
            } else {
                System.out.println(+c + " is greatest number");
            }
        }
        else{
            if (b > c) {
                System.out.println(+b + " is greatest number");
            }
            else{
                System.out.println(+c + " is greatest number");
            }
        }

    }
}
