import java.util.*;

class ArrayFunctions{

    // Function to print the array
    public void display(ArrayList<Integer> array){

            System.out.println(array);

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

	System.out.println("The Odd array is  :");
	display(odd);
	System.out.println("The Even array is  :");
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



	// Method to convert an array to an ArrayList
    public ArrayList<Integer> arrayToList(int[] array) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : array) {
            list.add(num);
        }
        return list;
    }

	// Method to convert an ArrayList to an array
    public int[] listToArray(ArrayList<Integer> list) {
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }
        
}