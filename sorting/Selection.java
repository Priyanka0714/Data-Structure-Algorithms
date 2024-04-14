public class Selection{ 
    void sort(int arr[]) { 
        int n = arr.length; 

        for (int i = 0; i < n-1; i++) { 
            int min_idx = i;   // Find min elem in unsorted array 
            for (int j = i+1; j < n; j++) 
                if (arr[j] < arr[min_idx]) 
                    min_idx = j; 
            int temp = arr[min_idx];  //swap
            arr[min_idx] = arr[i]; 
            arr[i] = temp; 
        } 
    } 
    void printArray(int arr[]) { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 
    public static void main(String args[]) { 
        Selection ob = new Selection(); 
        int arr[] = {64,25,12,22,11}; 
        ob.sort(arr); 
        System.out.println("Sorted array"); 
        ob.printArray(arr); 
    } 
} 

/** 
 Repeatedly selecting smallest (or largest) element from  unsorted portion 
 of list and moving it to the sorted portion of the list. O(n^2)
 {64, 25, 12, 22, 11}
1st pass:at idx1 traverse arr 11 is smallest swap 11 25 12 22 64
2nd pass:at idx2 swap 25 12 - 11 12 25 22 64
3rd pass:at idx3 again swap 25 and 22 - 11 12 22 25 64
4th pass:at idx4 25 64  no swap
5th pass:at idx5 sorted 
**/