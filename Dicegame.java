import java.util.Random;
import java.util.Scanner;

class Dicegame{
    public static void main(String args[]){
	System.out.println("What is your name?");
	System.out.print("> ");
	Scanner sc = new  Scanner(System.in);
	String s = sc.next();
	System.out.println("Hello, "+s+"!");
	
	Random ran = new Random();
	int num1 = ran.nextInt(7);
	int num2 = ran.nextInt(7);
	
	System.out.println("Rolling the dice...");
	System.out.println("Die 1: "+num1);
	System.out.println("Die 2: "+num2);

	int sum = num1+num2;
	
	System.out.println("Total value: "+sum);

	if(sum>7){
	    System.out.println(s+" won!");
	}else{
	    System.out.println(s+" lost");
	}
    }
}
