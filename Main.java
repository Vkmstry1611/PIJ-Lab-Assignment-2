
import java.util.ArrayList;

// Name : Vidish Ketankumar Mistry
// PRN : 23070126146
// Batch : B-3 


class Main{

    public static void main(String[] args) {
        
        UserInput in = new UserInput();
		ArrayFunctions functions = new ArrayFunctions();

        int[] arr= in.arrayInput();

        ArrayList<Integer> array_list= new ArrayList<Integer>();
        
		functions.display(functions.arrayToList(arr));

		functions.oddEven(arr);
		

		int index =  functions.minConsecutiveDifference(arr);
		System.out.println("Min Difference Index is : "+index);

        array_list=functions.arrayToList(arr);
        System.out.println("Array Converted to ArrayList : " +array_list);


        arr=functions.listToArray(array_list);
        System.out.println("ArrayList converted to Array : ");
;       functions.display(arr);

        


    }


}