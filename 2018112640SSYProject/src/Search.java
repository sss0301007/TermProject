
public class Search {

	static int nth_element(int[] data, int n, int k) {
		return nth_element(data, 0, n-1, k);
	}
	//	data[s..e]에서 k번째로 작은 데이터를 찾는다.
	static int nth_element(int[] data, int s, int e, int k) {
		//	data[s..e]를 피봇값에 의해서 분리한다.
		int p = Sort.partition(data, s, e);
		//	k가 피봇보다 작은 그룹에 속해있는 경우
		if(k<=p-s) return nth_element(data, s, p-1, k);
		//	k가 피봇인 경우
		if(k==p-s+1) return data[p];
		//	k가 피봇보다 큰 그룹에 속해있는 경우
		return nth_element(data, p+1, e, k-p+s-1);
	}
	
}
