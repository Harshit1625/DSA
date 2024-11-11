
// -------------------------------------------------------------------------------------------
//BubbleSort

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
//SelectionSort

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

//InsertionSort

class Sorting{
    public static void main(String[] args) {
        int arr[] = {7, 8 , 3, 1 ,2};
        for(int i = 0 ; i < arr.length ; i++){
            int current = arr[i];
            int j = i -1;
            while(j>=0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }    
 }
}

// Explanation --------------------------------------

// Consider the array {7, 8, 3, 1, 2} at some point in the sorting process.
// Assume you are inserting current = 3 into the sorted portion {7, 8}:
// First, 8 is shifted one position to the right: the array becomes {7, 8, 8, 1, 2}.
// Then, 7 is shifted one position to the right: the array becomes {7, 7, 8, 1, 2}.
// At this point, j = -1 (just before the start of the array).
// The correct position for current = 3 is at arr[j + 1], which is arr[0]. The array becomes {3, 7, 8, 1, 2}.

// -------------------------------------------------------------------------------------------