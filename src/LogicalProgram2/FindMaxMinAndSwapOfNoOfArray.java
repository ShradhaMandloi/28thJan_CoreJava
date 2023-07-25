package LogicalProgram2;

public class FindMaxMinAndSwapOfNoOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {60,10,80,90,20,15};
		int max=0;
		int min=a[0];
		
		int swap=0;
		for(int i=0;i<=a.length-1;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println("Maximum : "+max);
		for(int i=0;i<=a.length-1;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		System.out.println("Minimum : "+min);
		
		System.out.println("Before Swapping : "+ max+" "+min);
		swap=max;
		max=min;
		min=swap;
		System.out.println("After Swapping : "+ max+" "+min);
	}

}
