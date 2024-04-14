
class Bubble {
    static void bubbleSort(int arr[], int n){   //Optimized Bubble Sort
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) { 
                    temp = arr[j];          // Swap arr[j] and arr[j+1]
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false)
                break;
        }
    }
    static void printArray(int arr[], int size){
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        int n = arr.length;
        bubbleSort(arr, n);
        System.out.println("Sorted array: ");
        printArray(arr, n);
    }
}


// Repeatedly swapping the adjacent elements if they are in wrong order
// O(n^2) | O(1)
// -2 45 0 11 -9
// place 1st largest at correct position in 1st pass and so on.....
// 1st pass - -2 45 0 11 -9, -2 0 45 11 -9, -2 0 11 45 -9, -2 0 11 -9 45
// 2nd pass - -2 0 11 -9 45, -2 0 11 -9 45, -2 0 -9 11 45, -2 0 -9 11 45
// 3rd pass- -2 0 -9 11 45, -2 -9 0, 11 45..
// 4th pass- -2 -9 0 11 45 Sorted
// number of passess = n-1 , total comparision - n*(n-1)/2