import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CreditCard[ ] wallet = new CreditCard[3];
        wallet[0] = new CreditCard("John Bowman", "California Savings",
                "5391 0375 9387 5309", 5000);
        wallet[1] = new CreditCard("John Bowman", "California Federal",
                "3485 0399 3395 1954", 3500);
        wallet[2] = new CreditCard("John Bowman", "California Finance",
                "5391 0375 9387 5309", 2500, 300);

        for (int val = 1; val <= 16; val++) {
            wallet[0].charge(3*val);
            wallet[1].charge(2*val);
            wallet[2].charge(val);
        }


        for (CreditCard card : wallet) {
            CreditCard.printSummary(card); // calling static method
            while (card.getBalance() > 200.0) {
                card.makePayment(200);
                System.out.println("New balance = " + card.getBalance());
            }
        }

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
        System.out.println("Enter a long");
        while(!s.hasNextLong()){
            System.out.println("Please enter valid double");
            s.next();
        }
        System.out.println(s.nextLong());
        System.out.println("Enter a short");
        while(!s.hasNextShort()){
            System.out.println("Please enter valid short");
            s.next();
        }
        System.out.println(s.nextShort());
    }

    static boolean isMultiple(long n, long m){
        return (n%m==0);
    }

    static boolean isEven(int i){
        boolean flag = false;
        for(int j=i; j>=0; j-=2){
            if(j==0 || j==2 || j==4){
                flag = true;
                break;
            }
            if(j==1 || j==3 ||j==5){
                flag = false;
                break;
            }
        }
        return flag;
    }
    static int sum(int n){
        int sum = 0;
        for(int i=n; i>=0; i--){
            sum+=i;
        }
        return sum;
    }

    static int sumOdd(int n){
        int sum = 0;
        for(int i=n; i>=0; i--){
            if(n%2!=0) sum+=i;
        }
        return sum;
    }

    static int sumSquares(int n){
        int sum = 0;
        for(int i=n; i>=0; i--){
            if(n%2!=0) sum+=i*i;
        }
        return sum;
    }

    static int numVowels(String s){
        int count = 0;
        for(int i=0; i<s.length();i++){
            switch(s.charAt(i)){
                case 'A':
                case 'a':
                case 'E':
                case 'e':
                case 'I':
                case 'i':
                case 'O':
                case 'o':
                case 'U':
                case 'u':
                    count++;
                    break;
                default:
                    break;

            }
        }
        return count;
    }

    static String removePunc(String s){
        //StringBuilder a = new StringBuilder(s);
        s=s.replaceAll("[!'.,]", "");
        return s;
    }



}