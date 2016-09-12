package day3;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray;
		intArray = new int[5]; 
		intArray[0] = 3;
		intArray[1] = 6;
		intArray[2] = 9;

		int result = 0;
		int result1 = 0;
		for ( int i =0; i < intArray.length; i++ ){
		     result = result + intArray[i];
		}

		System.out.println("resultÀÇ °ª " + result);
		

		

	}

}
