import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        inputAllBaseTypes();
    }
    static void inputAllBaseTypes(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a boolean value");
        //boolean
        while(!s.hasNextBoolean()){
            System.out.println("Please enter a valid boolean");
            s.next();
        }
        System.out.println(s.nextBoolean());
        //byte
        while(!s.hasNextByte()){
            System.out.println("Enter valid byte");
            s.next();
        }
        System.out.println(s.nextByte());
        //char
        System.out.println("Enter a character");
        System.out.println(s.next().charAt(0));
        //double
        System.out.println("Enter a double");
        while(!s.hasNextDouble()){
            System.out.println("Please enter valid double");
            s.next();
        }
        System.out.println(s.nextDouble());
        //float
        System.out.println("Enter a float");
        while(!s.hasNextFloat()){
            System.out.println("Please enter valid double");
            s.next();
        }
        System.out.println(s.nextFloat());
        //int
        System.out.println("Enter an integer");
        while(!s.hasNextInt()){
            System.out.println("Please enter valid double");
            s.next();
        }
        System.out.println(s.nextInt());
        //long
        while(!s.hasNextLong()){
            System.out.println("Please enter valid double");
            s.next();
        }
        System.out.println("Enter a long");
        System.out.println(s.nextLong());
        while(!s.hasNextShort()){
            System.out.println("Please enter valid double");
            s.next();
        }
        System.out.println(s.nextShort());
    }

}