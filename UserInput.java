import java.util.*;

class UserInput{


    // function to take user input for array of 5 elements
    int[] arrayInput(){

		Scanner scan = new Scanner(System.in);
		int[] array = new int[5];
		System.out.println("Enter 5 Numbers : ");

		for(int i=0 ; i < array.length ; i++){
		
			array[i] = scan.nextInt();

		}
		
		return array;

	}


}