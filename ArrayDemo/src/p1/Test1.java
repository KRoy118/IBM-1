package p1;

public class Test1 {

	public static void main(String[] args) {
	
		int[] arr = new int[3];// valid index 0,1,2
		arr[0] = 13;
		arr[1] = 99;
		arr[2] = 16;

		System.out.println(arr.length); //3
		
		System.out.println(arr[1]); //99
		System.out.println(arr[-1]); // AIOBE
	}

}
