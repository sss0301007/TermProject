import java.util.Arrays;
import java.util.Random;

public class Sort {

	//Selection���� 
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
			System.out.println("Selection:" + (System.currentTimeMillis() - ckTime)+"ms");
		}
		
		//	Insertion ����
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
			System.out.println("Insertion:" + (System.currentTimeMillis() - ckTime+"ms"));
		}
		//	Merge ����
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
			System.out.println("mergeSort:" + (System.currentTimeMillis() - ckTime+"ms"));
			
		
		}
		
		//Javasort
		public static void javaSort(int[] array){

		        long ckTime = System.currentTimeMillis();

		        Arrays.sort(array);

		        System.out.println("JavaSort: " + (System.currentTimeMillis() - ckTime+"ms"));
		 }
		
		
		//Quicksort
			public static void quicksort(int[] data, int n) {
				 	long ckTime = System.currentTimeMillis();
					quicksort(data, 0, n-1);
					 System.out.println("QuickSort: " + (System.currentTimeMillis() - ckTime)+"ms");
					
				}
			public static void quicksort(int[] data, int f, int t) {
					//	������ �ʿ䰡 ���� ��� (�����Ͱ� 1�� ������ ���)
					if(t <= f) return;
					int s = partition(data, f, t);
					quicksort(data, f, s-1);
					quicksort(data, s+1, t);
				}
			public static int partition(int[] data, int f, int t) {
					//	�� ������ ���Ҹ� �������� ��´�.
					int pivot = data[t];
					int i=f, j=t-1;
					while(i<=j) {
						//	�������� �����Ͱ� ū ��� ���� ���ҿ� ��ȯ�Ѵ�.
						//  ������������ ������ Quicksort
						if(pivot > data[i]) {
							int temp = data[i];
							data[i] = data[j];
							data[j] = temp;
							j--;
						}
						else i++;
					}
					//	�Ǻ��� i�� �ִ� ���� ��ȯ�Ѵ�.
					data[t]=data[i];
					data[i]=pivot;
					return i;
				}		   



}
		
	



	

