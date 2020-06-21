import java.util.Arrays;
import java.util.Random;

public class Sort {
	
	//Start Javasort
			public static void StartjavaSort(int[] data){
			        long ckTime = System.currentTimeMillis();
			        Arrays.sort(data);
			        System.out.println("JavaSort: " + (System.currentTimeMillis() - ckTime+"ms"));
			 }
			
			
	//Start SSYsort
			public static void StartSSYsort(int[] data) {
					 long ckTime = System.currentTimeMillis();
					 SSYsort(data);
					 System.out.println("SSYsort �ҿ�ð�: " + (System.currentTimeMillis() - ckTime)+"ms");
						
					}
	
	//���� 30���α����� �����ϴ� SSYsort
		 public static void SSYsort(int[]data) {
			//���� 30%�� ��ġ�� index�� ���ϱ� ex) lenght�� 10�� �迭�� ���� 30%�ε����� 2
			int pivotIndex = (int) (data.length*0.3-1);
			//���� 30%�� K�� ã��, K���� ū ���� ���� �� �и�  ex)lenght�� 10�� �迭���� 3��°�� ū �� ã��, �װ��� �������� ���� ���� ū �� �и�
			int pivotValue = Search.nth_element(data, data.length, pivotIndex+1);
			//K���� ū ���� quicksort����
			System.out.println("����  30% Index: " + pivotIndex +", " + "���� 30% k��: " + pivotValue);
			quickSort(data, 0, pivotIndex);
			
		}
			
		//quicksort	- ��ó ���ͳ�
		 public static void quickSort(int[] a, int left, int right) {
			        int pl=left;
			        int pr = right;
			        int x = a[(pl+pr)/2];

			        do {
			            while(a[pl] > x) pl++;
			            while(a[pr] < x) pr--;
			            if(pl <= pr)
			                swap(a,pl++,pr--);
			        }while(pl <= pr);

			        if(left<pr) quickSort(a,left,pr);
			        if(pl<right) quickSort(a,pl,right);

			    }

			    public static void swap(int[] a, int idx1,int idx2) {
			        int t= a[idx1];
			        a[idx1] = a[idx2];
			        a[idx2] = t;
			    }
			
			    //���ĵ� �迭�� Ȯ���ϴ� �޼ҵ�
			    public static void printArray(String arrayName, int[] array){
			        System.out.println("print Array");
			        for(int i =0 ; i<array.length ; i++){
			            System.out.println(arrayName + " Array["+i+"] : " + array[i]);
			        }
			    }



}