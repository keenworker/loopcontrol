package Pattern;

public class FilledBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("enter value of n");
		int n=sc.nextInt();
		for(int i=1;i<n ;i++)
		{
		for (int j=0;j<n ;j++ )
		{
		System.out.print("*");
		}
		System.out.println();
		}

	}

}
