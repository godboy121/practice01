package day3;

public class arrayequal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1={100,200,300};
		int[] b1={100,200,300};
		int i=0;
		
		boolean result =equal(a1,b1);
		System.out.println(result);

	}
	
	public static boolean equal(int[] a, int[] b)
	{
		if(a==null)
		{
			return false;
		}
		if(b==null)
		{
			return false;
		}
		if(a.length!=b.length)
		{
			return false;
		}
		for(int i=0;i<a.length;i++ )
		{
			if(a[i]!=b[i])
			{
				return false;
			}
		}
		return true;
	}

}
