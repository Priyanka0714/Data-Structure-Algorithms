public class Insertion {
  public void sort(int arr[]){
      int n = arr.length;
      for (int i = 1; i < n; ++i) {
          int key = arr[i];
          int j = i - 1;
          while (j >= 0 && arr[j] > key) {
              arr[j + 1] = arr[j];
              j = j - 1;
          }
          arr[j + 1] = key;
      }
  }

  static void printArray(int arr[]){
      int n = arr.length;
      for (int i = 0; i < n; ++i)
          System.out.print(arr[i] + " ");
      System.out.println();
  }
  public static void main(String args[]){
      int arr[] = { 12, 11, 13, 5, 6 };
      Insertion ob = new Insertion();
      ob.sort(arr);
      printArray(arr);
  }
}

//Inserting each elem of an unsorted list into its correct position in a 
//sorted portion of the list.
//O(n^2) | O(1) |Best case - array sorted O(n) | avg-O(n^2) random array
// worst case array in reverse order O(n^2)

/**  arr = {23, 1, 10, 5, 2}
start with 1st elem assume Sorted 
compare 2nd with 1st if 2nd small then swap
move to 3rd compare it with 2nd then 1st swap as needed
place at correct position so on...

1st pass: 23 1 10 5 2 => 23 1 10 5 2
2nd pass: 23 1 10 5 2 => 1 23 10 5 2
3rd pass: 1 23 10 5 2 => 1 10 23 5 2
4th pass: 1 5 10 23 2
5th pass: 1 2 5 10 23
**/
