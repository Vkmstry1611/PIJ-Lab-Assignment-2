*Name :*`Vidish Ketankumar Mistry`

*PRN :*`23070126146`

*Batch :*`B-3`

## Overview
This consists of three Java files: `ArrayFunctions.java`, `Main.java`, and `UserInput.java`. The program provides various utility functions to manipulate arrays and ArrayLists, including displaying, converting, and performing operations like finding minimum consecutive differences and separating odd/even numbers.

## Files and Their Functions

### `ArrayFunctions.java`
This file contains various utility methods to manipulate arrays and ArrayLists.

- **`display(ArrayList<Integer> array)`**
  - Displays the contents of an `ArrayList`.
  
- **`display(int[] array)`**
  - Displays the contents of an integer array.

- **`oddEven(int[] array)`**
  - Separates the elements of an integer array into two lists: odd and even numbers.
  - Displays both the odd and even lists.

- **`minConsecutiveDifference(int[] array) -> int`**
  - Finds the index of the first occurrence where the difference between two consecutive elements is the smallest.
  - Returns the index of that element.

- **`arrayToList(int[] array) -> ArrayList<Integer>`**
  - Converts an integer array into an `ArrayList<Integer>`.

- **`listToArray(ArrayList<Integer> list) -> int[]`**
  - Converts an `ArrayList<Integer>` back into an integer array.

### `UserInput.java`
This file handles user input operations.

- **`arrayInput() -> int[]`**
  - Takes input for an integer array of size 5 from the user.
  - Returns the array.

### `Main.java`
This file contains the main method and serves as the entry point of the program.

- Initializes `UserInput` and `ArrayFunctions` objects.
- Calls `arrayInput()` to get user input.
- Calls various functions from `ArrayFunctions.java`, including:
  - `display()` to print arrays and ArrayLists.
  - `oddEven()` to separate odd and even numbers.
  - `minConsecutiveDifference()` to find the minimum difference index.
  - `arrayToList()` and `listToArray()` to convert between arrays and ArrayLists.

