class Quick {
  static void swap(int[] arr, int i, int j){
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
  }
  static int partition(int[] arr, int low, int high){
      
      int pivot = arr[high];
      // Index of smaller element and indicates
      // the right position of pivot found so far
      int i = (low - 1);

      for (int j = low; j <= high - 1; j++) {

          // If current element is smaller than the pivot
          if (arr[j] < pivot) {
              // Increment index of smaller element
              i++;
              swap(arr, i, j);
          }
      }
      swap(arr, i + 1, high);
      return (i + 1);
  }
  // low --> Starting index, high --> Ending index
  static void quickSort(int[] arr, int low, int high){
      if (low < high) {

          // pi is partitioning index, arr[p] is now at right place
          int pi = partition(arr, low, high);

          // Separately sort elems before partition and after partition
          quickSort(arr, low, pi - 1);
          quickSort(arr, pi + 1, high);
      }
  }
  public static void printArr(int[] arr){
      for (int i = 0; i < arr.length; i++) {
          System.out.print(arr[i] + " ");
      }
  }
  public static void main(String[] args){
      int[] arr = { 10, 7, 8, 9, 1, 5 };
      int N = arr.length;
      quickSort(arr, 0, N - 1);
      System.out.println("Sorted array:");
      printArr(arr);
  }
}



/**
 BestCase- omega(nlogn) pivot choosen at each step divide arr into 2 equal halves
 avg - theta(nlogn) | worst case- unbalanced partitions at each step|O(1)

 QuickSort is based on the Divide and Conquer algorithm that 
 picks an elem as a pivot and partitions array around pivot 
 by placing the pivot in its correct position in the sorted array.
 
 {8,7,6,1,0,9,2}
 pivot = 2

step1- take a pointer at pivot 
step2- traverse elem from beg if elem> pivot, take a 2nd pointer to elem(8)
1<pivot swap 1 with greater elem found(8)  , 1 7 6 8 0 9 2
Now repeat process.set next greater(7) elem as 2nd pointer
traverse arr 0<pivot swap , 1 0 6 8 7 9 2
2nd pointer=6, finally ,swap pivot with 2nd pointer
1 0 2 8 7 9 6
Divide subarray 8 7 9 6,  choose pivot again as 6
REpeat step2
swap 6 and 8, 6 7 9 8
Divide subarr 9 8 , pivot=8
swap 9 and 8 , 8, 9
0 1 2 6 7 8 9 sorted
 
 **/
