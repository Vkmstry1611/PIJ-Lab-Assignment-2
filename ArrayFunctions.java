import java.util.*;

class ArrayFunctions{


    public void display(ArrayList<Integer> array){

            System.out.println("Array is : "+array);



        }



    public void oddEven(int[] array){
		
		
		ArrayList<Integer> even = new ArrayList<Integer>();
		ArrayList<Integer> odd = new ArrayList<Integer>();	
	


		//int[] odd = new int[5];
		//int[] even = new int [5];
	
	
		//int ODD_INDEX=0;
		//int EVEN_INDEX=0;
	


		for (int i = 0; i < array.length; i++){
		

			if (array[i] % 2 == 0 ){

				//even[EVEN_INDEX] = array[i];
				//EVEN_INDEX++;
				
				even.add(array[i]);

			}
			else{

				//odd[ODD_INDEX] = array[i];
				//ODD_INDEX++;

				odd.add(array[i]);


			}

		

		
		}

	display(odd);
	display(even);
	}



        
}