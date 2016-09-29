public class Ex1_1_19 {
	public static long F(int N) {
		
		int[] a=new int[N+1];
		if (N==0) return 0;
		if(N==1) return 1;
		a[0]=0;a[1]=1;
		for(int i=2;i<=N;i++)  {
			a[i]=a[i-1]+a[i-2];
		}
		return a[N];
	}
	public static void main(String[] args) {
		for(int i=0;i<100;i++)
		System.out.println(F(i));
	}
}
