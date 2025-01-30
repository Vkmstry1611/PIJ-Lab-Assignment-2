// Name : Vidish Ketankumar Mistry
// PRN : 23070126146
// Batch : B-3 


class Main{

    public static void main(String[] args) {
        
        UserInput in = new UserInput();
		ArrayFunctions functions = new ArrayFunctions();

        int[] arr= in.arrayInput();

        
		functions.display(functions.arrayToList(arr));

		functions.oddEven(arr);
		


		int index =  functions.minConsecutiveDifference(arr);
		System.out.println("Min Difference Index is : "+index);
        


    }


}