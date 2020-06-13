
public class Search {

	static int nth_element(int[] data, int n, int k) {
		return nth_element(data, 0, n-1, k);
	}
	//	data[s..e]���� k��°�� ���� �����͸� ã�´�.
	static int nth_element(int[] data, int s, int e, int k) {
		//	data[s..e]�� �Ǻ����� ���ؼ� �и��Ѵ�.
		int p = Sort.partition(data, s, e);
		//	k�� �Ǻ����� ���� �׷쿡 �����ִ� ���
		if(k<=p-s) return nth_element(data, s, p-1, k);
		//	k�� �Ǻ��� ���
		if(k==p-s+1) return data[p];
		//	k�� �Ǻ����� ū �׷쿡 �����ִ� ���
		return nth_element(data, p+1, e, k-p+s-1);
	}
	
}
