package ExOne
public class Ex1_1_15{
	public static int[] histogram(int a[],int M) {
		int[] b=new int[M];int T=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>0&&a[i]<M) {
				b[a[i]]++;
			}	
		}
		
		return b;
	}
	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		int[] a=new int[args.length];
		for(int i=0;i<args.length;i++){
			a[i]=Integer.parseInt(args[i]);
		}
		int[] b=histogram(a,10);
		int sum=0;
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
			sum+=b[i];
		}
		System.out.println(a.length==sum);
		}
	}
