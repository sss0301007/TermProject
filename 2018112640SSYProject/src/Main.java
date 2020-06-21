import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class Main {
	static int [] users;
	static int [] temp;

	 
	public static void main(String[] args) {
		// ����score�� ������ �迭 ����
		// �ϳ��� ssysort, �ϳ��� javasort�� ����
		Scanner sc = new Scanner(System.in);
		// �迭�� ũ���� n�� �Է¹���
    	 int n = 0;  
    	 try {
    		n = sc.nextInt();
    	 }catch (InputMismatchException e) {
    		 System.out.println("�߸��� ���� �Է��߽��ϴ�. 0���� ū ������ �Է��ϼ���");
    		 return;
    	 }
    	 
    	 if(n<0) {
 	    	 System.out.println("0���� ���� ���� �Է��߽��ϴ�.n0���� ū ������ �Է��ϼ���");
 	    	 return;
 	     }
    	 
    	 users = new int [n];
    	 temp = new int [n];
	
    	 generateRandomData(n);
    	 Sort.StartSSYsort(users);
    	 Sort.StartjavaSort(temp);
    	 checkErrors(users, temp);
    	 }


	
	
		//n��ŭ random data ����
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