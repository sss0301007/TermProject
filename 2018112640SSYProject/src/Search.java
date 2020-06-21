
public class Search {
	
		//k��°�� ū �� ã�� �޼ҵ�
		static int nth_element(int[] data, int n, int k) {
		return nth_element(data, 0, n-1, k);
		
	}
	static int nth_element(int[] data, int s, int e, int k) {
		int p = partition(data, s, e);
		if(k<=p-s) return nth_element(data, s, p-1, k);
		if(k==p-s+1) return data[p];
		return nth_element(data, p+1, e, k-p+s-1);
	}
		//k��°�� ū�� ã�� �޼ҵ忡 �ʿ��� partition�޼ҵ�
	 public static int partition(int[] data, int s, int e) {
			int pivot = data[e];
			int i=s, j=e-1;
			while(i<=j) {
				if(pivot > data[i]) {
					int temp = data[i];
					data[i] = data[j];
					data[j] = temp;
					j--;
				}
				else i++;
			}
			data[e]=data[i];
			data[i]=pivot;
			return i;
		}		   


}

