import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

	
	 static int [] users;
	 static int [] temp;
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
	
		 Scanner sc = new Scanner(System.in);
    	 int n = 0;  	
    	 n = sc.nextInt();
    	 users = new int [n];
    	 temp = new int [n];
    	 
    	 
    	 
    	 generateScores(n);
    	 
    	 for(int i=0; i<users.length; i++) {
    		 System.out.println(users[i]);
    	 }
 
    	 selection(users, n);
    	 javaSort(temp);
    	 
	}
	//Selection정렬 
	public static void selection(int[] v, int n) {
		long ckTime = System.currentTimeMillis();
		for(int i=0; i<n-1;i++) {
			int select = i;
			for(int j=i+1;j<n;j++) {
				if(v[select]>v[j]) select=j;
			}
			//	swap
			int t = v[i];
			v[i] = v[select];
			v[select] = t;
			
		}
		System.out.println("Selection:" + (System.currentTimeMillis() - ckTime));
	}
	
	//	Insertion 정렬
	public static void insertion(int[] v, int n) {
		long ckTime = System.currentTimeMillis();
		for(int i=1; i<n; i++) {
			int s = v[i];
			int last = i-1;
			while(last >=0 && v[last] > s) {
				v[last+1]=v[last];
				last--;
			}
			v[last+1] = s;

		}
		System.out.println("Insertion:" + (System.currentTimeMillis() - ckTime));
	}
	//	Merge 정렬
	static void merge(int v[], int s, int m, int e, int[] t) {
		
		int i=s, j = m+1, k = 0;
		while(i<=m && j<=e) {
			if(v[i]<v[j]) t[k++] = v[i++];
			else t[k++] = v[j++];
		}
		while(i<=m) t[k++] = v[i++];
		while(j<=e) t[k++] = v[j++];
		for(i=0;i<k;i++) v[s+i] = t[i];
	}
	static void mergeSortInt(int[] v, int s, int e, int[] t) {
		if(s==e) return;
		int m = (s+e)/2;
		mergeSortInt(v, s, m, t);
		mergeSortInt(v, m+1, e, t);
		merge(v, s, m, e, t);
	}
	public static void mergeSort(int[] v, int n) {
		long ckTime = System.currentTimeMillis();
		int[] t = new int[n];
		mergeSortInt(v, 0, n-1, t);
		System.out.println("mergeSort:" + (System.currentTimeMillis() - ckTime));
		
	
	}
	
	
	 private static void javaSort(int[] array){

	        long ckTime = System.currentTimeMillis();

	        Arrays.sort(array);

	        System.out.println("JavaSort: " + (System.currentTimeMillis() - ckTime));
	 }
	
	 private static void generateScores(int num){

	        Random random = new Random();

	        for(int i =0 ;i<num ; i++){
	            double x =random.nextDouble();
	            users[i] = (int) (1000000 + 9000000 * x * x);
	            temp[i] = (int) (1000000 + 9000000 * x * x);
	            
	           
	        }
	    }
	
}


