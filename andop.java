//Grestest using && operatior
public class andop {
    public static void main(String args[]) {
        int a = 3;
        int b = 2;
        int c = 5;

        if (a > b && a > c) {
            System.out.println(+a+ " is greatest");
        }
        else if (b > a && b > c) {
            System.out.println(+b+ " is greatest");
        }
        else {
                System.out.println(+c+ " is greatest");
            }
        }
    }
