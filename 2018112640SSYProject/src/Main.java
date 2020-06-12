import java.util.Random;
import java.util.Scanner;

public class Main {

	
	 static int [] users;
   

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
	
		 Scanner sc = new Scanner(System.in);
    	 int n = 0;  	 
    	 users = new int [n];
    	 
    	 generateScores(n);
    	 for(int i=0; i<users.length; i++) {
    		 System.out.println(users[i]);
    	 }
 
	}

	 private static void generateScores(int num){

	        Random random = new Random();

	        for(int i =0 ;i<num ; i++){
	            double x =random.nextDouble();
	            users[i] = (int) (1000000 + 9000000 * x * x);
	           
	        }
	    }
	
}


