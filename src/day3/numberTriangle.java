package day3;


public class numberTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length!=1)
		{
			System.out.println("error!");
		}
		
		
		
		int count= Integer.parseInt(args[0]);
		for(int i=1;i<=count;i++)
		{
			for(int j=1;j<=i ;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		
		

	}

}
