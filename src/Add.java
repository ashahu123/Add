import java.util.Scanner;

public class Add{

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter 2 numbers");
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = x+y;
            System.out.println("Total of "+ x +" + "+y +" is " + z);


        }
    }
