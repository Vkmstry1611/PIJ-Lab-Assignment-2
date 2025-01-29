import java.util.*;

class ArrayFunctions{

    // Function to print the array
    public void display(ArrayList<Integer> array){

            System.out.println("Array is : "+array);

        }


    // Fucntion to add elements to odd even array
    public void oddEven(int[] array){
		
		// declare array
		ArrayList<Integer> even = new ArrayList<Integer>();
		ArrayList<Integer> odd = new ArrayList<Integer>();	


        //seperate odd and even elements
		for (int i = 0; i < array.length; i++){
		

			if (array[i] % 2 == 0 ){
				
				even.add(array[i]);

			}
			else{

				odd.add(array[i]);


			}

		

		
		}

	display(odd);
	display(even);
	}



        
}