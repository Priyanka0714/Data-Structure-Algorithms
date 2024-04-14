
class BinarySearch {
  // int binarySearch(int arr[], int x){
  //   int l = 0, r = arr.length - 1;
  //     while (l <= r) {
  //         int m = l + (r - l) / 2;
  //         if (arr[m] == x) return m;
  //         if (arr[m] < x)
  //           l = m + 1;
  //         else
  //           r = m - 1;
  //     }
  //     return -1;
  // }
  int binarySearch(int arr[], int l, int r, int x){  //RECURSION
    if (r >= l) {
      int mid = l + (r - l) / 2;

      if (arr[mid] == x)
          return mid;
      if (arr[mid] > x)
          return binarySearch(arr, l, mid - 1, x);
      return binarySearch(arr, mid + 1, r, x);
    }
    return -1;
  }
  public static void main(String args[]){
      BinarySearch ob = new BinarySearch();
      int arr[] = { 2, 3, 4, 10, 40 };
      int n = arr.length;
      int x = 10;
      int result = ob.binarySearch(arr, 0, n - 1, x);
      //int result = ob.binarySearch(arr, x);
      if (result == -1)
          System.out.println("Element is not present in array");
      else
          System.out.println("Element is present at "+ "index " + result);
  }
}


/** 
Best Case: O(1) | Avg Case: O(log N) | Worst Case: O(log N) | O(1)
Sorted array |Target | Return Index
Repeatedly dividing the search interval in half, array must be sorted 
3 6 8 12 15 20 25 30 45 50   key = 20
mid=15 , search in right part 20 25 30 45 50
mid=30 , search in left part 20 25
Mid = 20 , return mid
**/
