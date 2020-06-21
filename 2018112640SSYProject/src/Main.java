import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class Main {
	static int [] users;
	static int [] temp;

	 
	public static void main(String[] args) {
		// 랜덤score을 저장할 배열 생성
		// 하나는 ssysort, 하나는 javasort로 정렬
		Scanner sc = new Scanner(System.in);
		// 배열의 크기인 n을 입력받음
    	 int n = 0;  
    	 try {
    		n = sc.nextInt();
    	 }catch (InputMismatchException e) {
    		 System.out.println("잘못된 값을 입력했습니다. 0보다 큰 정수를 입력하세요");
    		 return;
    	 }
    	 
    	 if(n<0) {
 	    	 System.out.println("0보다 작은 값을 입력했습니다.n0보다 큰 정수를 입력하세요");
 	    	 return;
 	     }
    	 
    	 users = new int [n];
    	 temp = new int [n];
	
    	 generateRandomData(n);
    	 Sort.StartSSYsort(users);
    	 Sort.StartjavaSort(temp);
    	 checkErrors(users, temp);
    	 }


	
	
		//n만큼 random data 생성
    	 public static void generateRandomData(int n) {
    	 Random random = new Random();
    	 for(int i =0 ;i<n; i++){
	            double x =random.nextDouble();
	            users[i] = (int) (1000000 + 9000000 * x * x);
	            temp[i] = (int) (1000000 + 9000000 * x * x);
    	 }
	 }
    	 
    	  public static void checkErrors(int [] data1, int [] data2) {
    		 int check = 0;
    		 for(int i=0; i<(int)(data1.length*0.3-1); i++ ) {
    			 if (data1[i] != data2[data2.length-1-i]) {
    			check++; 
    			 }
    		}
    		 System.out.println("Errors: "+ check);
    	  }
    	  
    	 
}