package sg1;

public class square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[5];
		 a[0]=1;
		 int sum=0;
		for(int i=1;i<a.length;i++)
		{
			a[i]=2*a[i-1];
			System.out.println(a[i]+" ");
			
		
		}
		System.out.println("enter the sum");
		sum=sum+a[];
		System.out.println(sum);

	}

}
