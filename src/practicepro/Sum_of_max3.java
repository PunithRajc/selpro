package practicepro;

public class Sum_of_max3 {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		//int sum=0;
		for(int i=0;i<3;i++)
		{
			System.out.println(a[i]);
		}

	}

}
