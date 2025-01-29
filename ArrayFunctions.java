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


    // function to calculate consecutive elements difference
    public int minConsecutiveDifference(int[] array){


		int index = 0;
		for (int i = 0; i < array.length-1 ;i++ ){
		

			if(array[i]-array[i+1] < array[index]-array[index+1]){
			
				index=i;
			}

		}

    //return the first index 
	return index;

	}

        
}