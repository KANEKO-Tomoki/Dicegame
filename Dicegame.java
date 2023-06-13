import java.util.Random;

class Dicegame{
    public static void main(String args[]){
	Random ran = new Random();
	int num1 = ran.nextInt(7);
	int num2 = ran.nextInt(7);
	
	System.out.println("Rolling dice...");
	System.out.println("Die 1: "+num1);
	System.out.println("Die 2: "+num2);

	int sum = num1+num2;
	
	System.out.println("Total value: "+sum);

	
    }
}
