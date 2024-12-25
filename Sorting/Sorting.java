
// -------------------------------------------------------------------------------------------
// Bubble Sort: Repeatedly compares adjacent elements and swaps them if they are in the wrong order, "bubbling" the largest element to the end in each pass.

// class Sorting{
//     public static void main(String[] args) {
//         int arr[] = {7, 8 , 3, 1 ,2};
//       for(int i = 0; i <arr.length -1 ; i++){
//         for(int j = 0 ; j <arr.length - i -1 ; j++){
//         //Swaping values
//            if(arr[j] > arr[j+1]){
//             int temp = arr[j];
//             arr[j] = arr[j+1];
//             arr[j+1] = temp;
//            }
//         }
//     }
//     for(int a = 0 ; a < arr.length ; a++){
//         System.out.println(arr[a]);
//     }
//     }
// }

// -------------------------------------------------------------------------------------------
// Selection Sort: Finds the smallest (or largest) element from the unsorted portion of the array and swaps it with the first unsorted element.

// class Sorting{
//     public static void main(String[] args) {
//         int arr[] = {7, 8 , 3, 1 ,2};
//       for(int i = 0; i <arr.length -1 ; i++){
//         int smallest = i;
//         //loop2
//          for(int j = i + 1 ; j < arr.length; j++){
//             if(arr[smallest] > arr[j]){
//                 smallest = j;
//             }
//          }
//          int temp = arr[smallest];
//          arr[smallest] = arr[i];
//          arr[i] = temp;
//     }
//     for(int a = 0 ; a < arr.length ; a++){
//         System.out.println(arr[a]);
//     }
//     }
// }

// -------------------------------------------------------------------------------------------
// Insertion Sort: Builds the sorted portion of the array one element at a time by picking the next element and inserting it into its correct position.

// class Sorting{
//     public static void main(String[] args) {
//         int arr[] = {7, 8 , 3, 1 ,2};
//         for(int i = 0 ; i < arr.length ; i++){
//             int current = arr[i];
//             int j = i -1;
//             while(j>=0 && current < arr[j]){
//                 arr[j+1] = arr[j];
//                 j--;
//             }
//             arr[j+1] = current;
//         }    
//  }
// }

// Explanation --------------------------------------

// Consider the array {7, 8, 3, 1, 2} at some point in the sorting process.
// Assume you are inserting current = 3 into the sorted portion {7, 8}.
// First, 8 is shifted one position to the right: the array becomes {7, 8, 8, 1, 2}.
// Then, 7 is shifted one position to the right: the array becomes {7, 7, 8, 1, 2}.
// At this point, j = -1 (just before the start of the array).
// The correct position for current = 3 is at arr[j + 1], which is arr[0]. The array becomes {3, 7, 8, 1, 2}.

// -------------------------------------------------------------------------------------------
//Merge Sort : Divides the array into halves, recursively sorts each half, and then merges the sorted halves back together.
// Done by Divide And Conquer technique

// class Sorting{
//     public static void conquer(int arr[] , int startIdx , int endIdx , int mid){
//      int merged[] = new int[endIdx - startIdx + 1];  // we aint putting arr.length as size because we have to merge subarray not an entire array 
//      int idx1 = startIdx;
//      int idx2 = mid + 1;
//      int x = 0;

//      while(idx1 <= mid && idx2 <= endIdx){
//         if(arr[idx1] <= arr[idx2]){
//             merged[x++] = arr[idx1++];
//         }else{
//             merged[x++] = arr[idx2++];
//         }
//      }

//      //suppose we ran out of elements in any one array then we can directly copy the elements present in another array coz they are sorted already
//      while(idx1 <= mid){
//         merged[x++] = arr[idx1++];
//      }
//      while(idx2 <= endIdx){
//         merged[x++] = arr[idx2++];
//      }

//      //as conquering is not done in one step , it is done in multiple steps so at every step we must copy the element to the og array , and for correct positioning we must 
//      //start arr with startIdx; 
//      for(int i = 0 , j = startIdx; i < merged.length ; i++ , j++ ){
//         arr[j] = merged[i];
//      }
//     }

//     public static void divide(int arr[] , int startIdx , int endIdx){
//         if(startIdx >= endIdx){
//             return;
//         }
//         int mid = startIdx + (endIdx - startIdx)/2;
//         divide(arr, startIdx, mid);
//         divide(arr, mid + 1, endIdx);
//         conquer(arr, startIdx, endIdx, mid);
//     }
//     public static void main(String[] args) {
//         int arr[] = {12 , 15 , 7 , 8 , 2 , 9};
//         divide(arr, 0, arr.length-1);

          
//      for(int i = 0 ; i < arr.length ; i++){
//         System.out.print(arr[i] + " ");
//      }
//     }
// }

// -------------------------------------------------------------------------------------------
//Quick Sort : Selects a "pivot" element (mostly last element), partitions the array into elements less than and greater than the pivot, and recursively sorts the partitions.

class Sorting{

    public int partition(int arr[] , int lowIdx , int highIdx){
      int pivot = arr[highIdx];
      int i = lowIdx - 1; //i is the index we will use to traverse through array

      for(int j=lowIdx ; j <highIdx ; j++){
        if(arr[j] < pivot){
            i++;
            int temp = arr[i];
            arr[i] =  arr[j];
            arr[j] = temp;
        }
      }
      //now we have to swap pivot
      i++;
      int temp = arr[highIdx];
      arr[highIdx] = arr[i];
      arr[i] = temp;
      return i;
    }

    public void quickSort(int arr[] , int lowIdx , int highIdx){
      if(lowIdx < highIdx){
        int pivotIdx = partition(arr, lowIdx , highIdx);
        quickSort(arr, lowIdx, pivotIdx - 1);
        quickSort(arr, pivotIdx + 1, highIdx);
      }
    }
    public static void main(String[] args) {
        Sorting sc = new Sorting();
        int arr[] = {6 , 3, 9 ,10 ,  5 , 2 ,8};
        sc.quickSort(arr, 0, arr.length - 1);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}


