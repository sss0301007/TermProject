import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class Main {

	
	public static void main(String[] args) {
		// ����score�� ������ �迭 ����
		// �ϳ��� ssysort, �ϳ��� javasort�� ����
		int [] users;
		int [] temp;
		
		// �迭�� ũ���� n�� �Է¹���
		 Scanner sc = new Scanner(System.in);
    	 int n = 0;  	
    	 n = sc.nextInt();
    	 users = new int [n];
    	 temp = new int [n];
    	 
    	 //n��ŭ random data ����
    	 Random random = new Random();
    	 for(int i =0 ;i<n; i++){
	            double x =random.nextDouble();
	            users[i] = (int) (1000000 + 9000000 * x * x);
	            temp[i] = (int) (1000000 + 9000000 * x * x);
	        }
	  
    	 
    	//���� 30%�� k���� ã�� �� �ִ��� ����
    	 int k = Search.nth_element(users, n, (int) (users.length*0.3));
    	 System.out.println(k);
    	 System.out.println("usersArray");
    	 for(int i=0; i<n; i++) {
    		 System.out.println( "usersArray["+i+"]:" + users[i]);
    	 }
	}
}