class MergeSort {
  // 1st subarr arr[l..m], 2nd subarr arr[m+1..r]
  public static void merge(int arr[], int l, int m, int r){
      int n1 = m - l + 1;
      int n2 = r - m;
      int L[] = new int[n1];  // Create temp arrays
      int R[] = new int[n2];

      for (int i = 0; i < n1; ++i)   // Copy data to temp arrays
          L[i] = arr[l + i];
      for (int j = 0; j < n2; ++j)
          R[j] = arr[m + 1 + j];

      // Initial indices of 1st, 2nd and merged subarr
      int i = 0, j = 0;
      int k = l;

      while (i < n1 && j < n2) {   //merge
          if (L[i] <= R[j]) {
              arr[k] = L[i];
              i++;
          }
          else {
              arr[k] = R[j];
              j++;
          }
          k++;
      }
      while (i < n1) {
          arr[k] = L[i];    // Copy remaining elements of L[] if any
          i++;
          k++;
      }
      while (j < n2) {
          arr[k] = R[j];   // Copy remaining elements of R[] if any
          j++;
          k++;
      }
  }
  void sort(int arr[], int l, int r){
      if (l < r) {
          int m = l + (r - l) / 2;
          sort(arr, l, m);      // Sort first and second halves
          sort(arr, m + 1, r);
          merge(arr, l, m, r);  // Merge the sorted halves
      }
  }
  static void printArray(int arr[]){
      int n = arr.length;
      for (int i = 0; i < n; ++i)
          System.out.print(arr[i] + " ");
      System.out.println();
  }
  public static void main(String args[]){
      int arr[] = { 12, 11, 13, 5, 6, 7 };

      System.out.println("Given array is");
      printArray(arr);

      MergeSort ob = new MergeSort();
      ob.sort(arr, 0, arr.length - 1);

      System.out.println("\nSorted array is");
      printArray(arr);
  }
}


//Bestcase- O(nlogn) arr already sorted| avg case O(nlogn)| worst- O(nlogn)
//Follows the divide-and-conquer approach. 
//It works by recursively dividing the input array into smaller subarrays 
//and sorting those subarrays then merging them to get sorted array.
/** 
 [38, 27, 43, 10]
 [38,27]   [43,10]
 [38][27]   [43][10] each sorted
  [27,38]    [10,43] merge
  [10, 27, 38, 43] merge
 **/