import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class Main {

	
	public static void main(String[] args) {
		// 랜덤score을 저장할 배열 생성
		// 하나는 ssysort, 하나는 javasort로 정렬
		int [] users;
		int [] temp;
		
		// 배열의 크기인 n을 입력받음
		 Scanner sc = new Scanner(System.in);
    	 int n = 0;  	
    	 n = sc.nextInt();
    	 users = new int [n];
    	 temp = new int [n];
    	 
    	 //n만큼 random data 생성
    	 Random random = new Random();
    	 for(int i =0 ;i<n; i++){
	            double x =random.nextDouble();
	            users[i] = (int) (1000000 + 9000000 * x * x);
	            temp[i] = (int) (1000000 + 9000000 * x * x);
	        }
	  
    	 
    	//상위 30%의 k값을 찾을 수 있는지 실험
    	 int k = Search.nth_element(users, n, (int) (users.length*0.3));
    	 System.out.println(k);
    	 System.out.println("usersArray");
    	 for(int i=0; i<n; i++) {
    		 System.out.println( "usersArray["+i+"]:" + users[i]);
    	 }
	}
}