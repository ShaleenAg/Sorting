import  java.util.Arrays;
public class NewSort {
	static void recur_sort(int[] s,int n) {
		
		if(n==1) {
			return ;//base case
			
		}for(int i=0 ; i<n-1;i++) {
			if(s[i]>s[i+1]) {
				int temp= s[i];
				s[i]=s[i+1];
				s[i+1]=temp;
			}
		}recur_sort(s,n-1);}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1232443,34,45,24,6,3,5,35,3245};
		recur_sort(a,9);
		System.out.println(Arrays.toString(a));
		
	}

}
