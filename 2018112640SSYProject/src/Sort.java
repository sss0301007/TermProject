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
					 System.out.println("SSYsort 소요시간: " + (System.currentTimeMillis() - ckTime)+"ms");
						
					}
	
	//상위 30프로까지만 정렬하는 SSYsort
		 public static void SSYsort(int[]data) {
			//상위 30%에 위치한 index값 구하기 ex) lenght가 10인 배열의 상위 30%인덱스는 2
			int pivotIndex = (int) (data.length*0.3-1);
			//상위 30%인 K값 찾고, K보다 큰 값과 작은 값 분리  ex)lenght가 10인 배열에서 3번째로 큰 값 찾고, 그것을 기준으로 작은 값과 큰 값 분리
			int pivotValue = Search.nth_element(data, data.length, pivotIndex+1);
			//K보다 큰 값만 quicksort진행
			System.out.println("상위  30% Index: " + pivotIndex +", " + "상위 30% k값: " + pivotValue);
			quickSort(data, 0, pivotIndex);
			
		}
			
		//quicksort	- 출처 인터넷
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
			
			    //정렬된 배열을 확인하는 메소드
			    public static void printArray(String arrayName, int[] array){
			        System.out.println("print Array");
			        for(int i =0 ; i<array.length ; i++){
			            System.out.println(arrayName + " Array["+i+"] : " + array[i]);
			        }
			    }



}