import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class Main {

	// 랜덤score을 저장할 배열 생성
	 public static int [] users;
	 public static int [] temp;
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 배열의 크기인 n을 입력받음
		 Scanner sc = new Scanner(System.in);
    	 int n = 0;  	
    	 n = sc.nextInt();
    	 users = new int [n];
    	 temp = new int [n];
    	 
    	 
    	 //n만큼 random data 생성
    	 generateScores(n);

    	 //n의 상위 30프로 값인 k search
    	int k = Search.nth_element(users, n, (int) (users.length*0.3));
    	
    	 
     
    	//quick sort,java sort 실행
    	Sort.quicksort(users, k); 
    	Sort.javaSort(temp);
    	
    	//정렬된 배열 print
    	printArray("My",users);
    	printArray("Java", temp);
    	 
	}
	 //random data생성
			static void generateScores(int num){

	        Random random = new Random();

	        for(int i =0 ;i<num ; i++){
	            double x =random.nextDouble();
	            users[i] = (int) (1000000 + 9000000 * x * x);
	            temp[i] = (int) (1000000 + 9000000 * x * x);
	        }
	   }
	 //정렬된 배열 print
	 private static void printArray(String arrayName, int[] array){
	        for(int i =0 ; i<array.length ; i++){
	            System.out.println(arrayName + " Array["+i+"] : " + array[i]);
	        }
	 	}
}


