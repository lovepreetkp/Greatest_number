//Greatest number using ternary operator
 public class Greatest {
    public static void main(String args[]){
        int a=1;
        int b=5;
        int c=2;
        int result;

        result=(a>b)?(a>c?a:c):(b>c?b:c);

        //print greatest number
        System.out.println("Greatest number between " +a+ "," +b+ " and " +c+ " is " +result);
    }
}



