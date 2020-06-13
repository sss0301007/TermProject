import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class Main {

	// ����score�� ������ �迭 ����
	 public static int [] users;
	 public static int [] temp;
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// �迭�� ũ���� n�� �Է¹���
		 Scanner sc = new Scanner(System.in);
    	 int n = 0;  	
    	 n = sc.nextInt();
    	 users = new int [n];
    	 temp = new int [n];
    	 
    	 
    	 //n��ŭ random data ����
    	 generateScores(n);

    	 //n�� ���� 30���� ���� k search
    	int k = Search.nth_element(users, n, (int) (users.length*0.3));
    	
    	 
     
    	//quick sort,java sort ����
    	Sort.quicksort(users, k); 
    	Sort.javaSort(temp);
    	
    	//���ĵ� �迭 print
    	printArray("My",users);
    	printArray("Java", temp);
    	 
	}
	 //random data����
			static void generateScores(int num){

	        Random random = new Random();

	        for(int i =0 ;i<num ; i++){
	            double x =random.nextDouble();
	            users[i] = (int) (1000000 + 9000000 * x * x);
	            temp[i] = (int) (1000000 + 9000000 * x * x);
	        }
	   }
	 //���ĵ� �迭 print
	 private static void printArray(String arrayName, int[] array){
	        for(int i =0 ; i<array.length ; i++){
	            System.out.println(arrayName + " Array["+i+"] : " + array[i]);
	        }
	 	}
}


