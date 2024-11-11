// -------------------------------------------------------------------------------------
//Basic Example

// class Recursion {
//     public void printNum(int n){
//         if(n==0) return;
//         System.out.println(n);
//         printNum(n-1);
//         System.out.println("Completed !!" + n);
//     }
//     public static void main(String[] args) {
//         int n = 5;
//         Recursion r = new Recursion();
//         r.printNum(n);
//     }
// }

// -------------------------------------------------------------------------------------
//sum of n natural numbers

// class Recursion {
//     public void printNNaturalNumbers(int i , int n ,int sum){
//         if (i ==n){
//             sum += i;
//             System.out.println(sum);
//             return;
//         }
//         sum += i;
//         printNNaturalNumbers(i+1, n, sum);
//     }
//     public static void main(String[] args) {
//         Recursion r = new Recursion();
//         r.printNNaturalNumbers(1, 3, 0);
//     }
// }

// -------------------------------------------------------------------------------------
//factorial

// class Recursion {
//     public int printFac(int n){
//         if(n== 0 || n==1){
//             return 1;
//         }
//         int num = printFac(n -1);
//         int result = n * num;
//         return result;
//     }
//     public static void main(String[] args) {
//         int n = 5;
//         Recursion r = new Recursion();
//         int ans = r.printFac(n);
//         System.out.println(ans);
//     }
// }


// -------------------------------------------------------------------------------------
//fibonacci

//Without Loopk9

// class Recursion {
//    public void fibonacci(int a, int b , int n){
//     if(n==0){
//         return;
//     }
//     int c = a+b;
//     System.out.println(c);
//     fibonacci(b, c, n-1);
//    }
//     public static void main(String[] args) {
//         int a = 0 ; int b = 1; int n = 7;
//         System.out.println(a);
//         System.out.println(b);
//         Recursion r = new Recursion();
//         r.fibonacci(a , b, n-2);
                
//     }
// }

//With Loop
// class Recursion{
//     public static void fibonacci(int n){
//         int a = 0;
//         int b = 1;
//         int c = 0;
//       for(int i = 0 ; i< n ; i++){
//        c = a + b;
//        a = b;
//        b = c ;
//        System.out.println(c);
//     }
//     }
//     public static void main(String[] args) {
//         Recursion.fibonacci(5);
//     }
// }



// -------------------------------------------------------------------------------------
//Stack Height(n) , x^n ; 
// Hint :- x^n = x^n-1 * x

// class Recursion {
//     public int stackHeight(int x , int n){
//         if(n == 0){
//             return 1;
//         }
//         if(n == 1){
//             return x;
//         }
//         else return x * stackHeight(x, n-1);
         
//         // OR
//         // int numM1 = stackHeight(x, n-1);
//         // int calculatedPowValue = x * numM1; //numM1 = num - 1
//         // return calculatedPowValue;
//     }
 
//      public static void main(String[] args) { 
//          Recursion r = new Recursion();
//          int res = r.stackHeight(2, 5);
//          System.out.println(res);

//      }
//  }


// -------------------------------------------------------------------------------------
//Stack Height(logn) , x^logn ; 
// Hint :- even- x^logn = x^n/2 * x^n/2 , odd- x^logn = x^n/2 * x^n/2 * x

// class Recursion {
//     public int stackHeight(int x , int n){
//         if(n == 0){
//             return 1;
//         }
//         if(n == 1){
//             return x;
//         }
//         if(n%2 == 0 ){
//            return stackHeight(x , n/2) * stackHeight(x , n/2);
//         }else{
//         return stackHeight(x , n/2) * stackHeight(x , n/2) * x;
// }
// }
 
//      public static void main(String[] args) { 
//          Recursion r = new Recursion();
//          int res = r.stackHeight(2, 5);
//          System.out.println(res);

//      }
//  }

// -------------------------------------------------------------------------------------
//Reversing an array
// class Recursion
// {  
//     public int[] reverseArray(int arr[]) {
//         // code here
//         int n = arr.length;
        
//         for(int i=0 ; i< n/2 ; i++){
//             int temp = arr[i];
//             arr[i] = arr[n-i-1];
//             arr[n-i-1] = temp;   
//         }    
//         return arr;
//     }
//      public static void main(String[] args) {
//         Recursion r = new Recursion();
//         int arr[] = { 1,2 ,3 ,4};
//         int res[] = r.reverseArray(arr);
//         for(int a = 0 ; a < res.length ; a++){
//             System.out.println(res[a]);
//         }
//     }
// }

//OR

// class Solution {

//     public int[] reverseArray(int arr[]) {
//         // Start the recursive reversal
//         return reverseArrayHelper(arr, 0, arr.length - 1);
//     }

//     // Recursive helper method
//     private int[] reverseArrayHelper(int arr[], int start, int end) {
//         // Base case: If the start index is greater than or equal to the end index, stop recursion
//         if (start >= end) {
//             return arr;
//         }
        
//         // Swap elements at the start and end
//         int temp = arr[start];
//         arr[start] = arr[end];
//         arr[end] = temp;
        
//         // Recur for the next pair of elements
//         return reverseArrayHelper(arr, start + 1, end - 1);
//     }

//     public static void main(String[] args) {
//         Solution solution = new Solution();
//         int[] arr = {1, 2, 3, 4, 5};
        
//         // Call the reverse method and print the reversed array
//         int[] reversedArr = solution.reverseArray(arr);
//         for (int num : reversedArr) {
//             System.out.print(num + " ");
//         }
//     }
// }

// -------------------------------------------------------------------------------------
//Tower Of Hanoi

// class Recursion{
//     public static void towerOfHanoi(int n , String src , String helper , String dest){
//         if(n ==1 ){
//         System.out.println("Transfer disk" + n + "from" + src + "to" + dest);
//         return;
//         }
//      towerOfHanoi(n-1, src, dest , helper); //1 , S , D , H
//      System.out.println("Transfer disk" + n + "from" + src + "to" + dest);
//      towerOfHanoi(n-1, helper, src, dest);
//     }
//     public static void main(String args[]){
//         Recursion.towerOfHanoi(2, "S", "H", "D");
//     }
// }

// -------------------------------------------------------------------------------------
//String Reverse 

// class Recursion{
//     public static void strReverse(String str , int idx){
//         if( idx < 0){
//             return;
//         }
//     System.out.print(str.charAt(idx));
//     strReverse(str, idx - 1);
//     }
    
//     public static void main(String args[]){
//         String v = "abcd";
//         Recursion.strReverse(v , v.length() -1);
//     }
// }

// -------------------------------------------------------------------------------------
//First and Last Occcurences of a character in a string

// class Recursion{
//     public static int first = -1; // initializing it with -1 so that if we dont find the chracter we can print -1 ; so that no confusion would arise
//     public static int last = -1;

//     public static void findOccurences(String str, int idx , char element){
//      if(idx == str.length()){
//       System.out.println(first);
//       System.out.println(last);
//       return;
//      }   
//     char currChar = str.charAt(idx);
//     if(currChar == element){
//         if(first == -1){
//             first = idx;
//         }else{
//             last = idx;
//         }
//     }

//     findOccurences(str, idx + 1, element);
//     }
    
//     public static void main(String args[]){
//         String v = "bvgbh";
//         Recursion.findOccurences(v , 0 , 'a');
//     }
// }

// -------------------------------------------------------------------------------------
//Check if array is sorted

// class Recursion{
//     public static boolean isSorted(int arr[] , int idx){
//         if(idx == arr.length -1){
//             return true;
//         }
//         if(arr[idx] < arr[idx + 1]){
//             return isSorted(arr, idx+1);
//         }else {
//             return false;
//         }
//     }
//     public static void main(String[] args) {
//         int arr[] = {1, 2, 3, 4, 3};
//         boolean value =  Recursion.isSorted(arr, 0);
//         System.out.println(value);
//     }
// }

// -------------------------------------------------------------------------------------
// checking if string is palindrome or not

// class Recursion{
//     public static boolean palinDrome(int startIndex , int endIndex , String str){
//      if(startIndex >= endIndex){
//         return true;
//      }if(str.charAt(startIndex) != str.charAt(endIndex)){
//         return false; 
//      }
//      return palinDrome(startIndex+ 1, endIndex- 1, str);
//     }
//     public static void main(String[] args) {
//         String str = "NAMAN";
//         boolean result = palinDrome(0, str.length()-1, str);
//         System.out.println(result);
//     }
// }

// -------------------------------------------------------------------------------------
//"axbcxxxd" moveAll the X's to the end of the string like 'abcdxxxx' 

// class Recursion{
//     public static void moveAll(String str , int idx , int count , String newStr){
//         if(idx == str.length()){
//             for (int i = 0; i < count; i++) {
//                 newStr += 'x';
//             }
//             System.out.println(newStr);
//             return;
//         }
//         char currentChar = str.charAt(idx);
//         if(currentChar == 'x'){
//             count++;
//             moveAll(str, idx+1, count, newStr);
//         }else{
//             newStr +=currentChar;
//             moveAll(str, idx+1, count, newStr);
//         }
//     }
//     public static void main(String[] args) {
//         Recursion.moveAll("axbcxxd", 0, 0, "");
//     }
// }

// -------------------------------------------------------------------------------------
//remove duplicates from a string

// class Recursion{
//     public static boolean [] map = new boolean[26];
//     public static void removeDuplicates(int idx , String str , String newStr){
//     if(idx == str.length()){
//         System.out.println(newStr);
//         return;
//     }
//      char currChar = str.charAt(idx);
//      if(map[currChar - 'a']){
//         removeDuplicates( idx + 1, str, newStr);
//      }else{
//         newStr += currChar;
//         map[currChar - 'a'] = true;
//         removeDuplicates( idx + 1, str, newStr);
//      }
    
//     }
//     public static void main(String[] args) {
//     Recursion.removeDuplicates(0, "abxxcddefff", "");
//     }
// }

// -------------------------------------------------------------------------------------
//get THE SUBSEQUENCES in a str , understand it with the help of tree 

// class Recursion{
//     public static void subsequences(int idx , String str ,String newStr){
//         if(idx == str.length()){
//             System.out.println(newStr);
//             return;
//         }
//      char currChar = str.charAt(idx);
//     //to be
//     subsequences(idx + 1, str, newStr + currChar);

//     //not to be 
//     subsequences(idx + 1, str, newStr);
//     }

//     public static void main(String[] args) {
//         Recursion.subsequences(0, "abc", "");
//     }
// }

// -------------------------------------------------------------------------------------
//get THE UNIQUE SUBSEQUENCES in a str , understand it with the help of tree 

// import java.util.HashSet;

// class Recursion{
//     public static void subsequences(int idx , String str ,String newStr , HashSet<String> set){
//         if(idx == str.length()){
//             if(set.contains(newStr)){
//              return;
//             }else{
//              System.out.println(newStr);
//              set.add(newStr);
//              return;
//             }
//         }
//      char currChar = str.charAt(idx);
//     //to be
//     subsequences(idx + 1, str, newStr + currChar , set);

//     //not to be 
//     subsequences(idx + 1, str, newStr ,set);
//     }

//     public static void main(String[] args) {
//         HashSet<String> set = new HashSet<>();
//         Recursion.subsequences(0, "aaa", "" , set);
//     }
// }

// -------------------------------------------------------------------------------------
// print keypad combination

// class Recursion{
//     public static String[] keypad = {"." , "abc" , "def" , "ghi" , "jkl" , "mno" , "pqrs" , "tu" , "wx" , "yz"};

//     public static void printCombination(String str , int idx , String combination){
//         if(idx == str.length()){
//             System.out.println(combination);
//             return;
//         }
//         char currChar = str.charAt(idx);
//         String mapping = keypad[currChar - '0']; //currChar = 6 (initially)
//         for(int i=0; i < mapping.length() ; i++){
//           printCombination(str, idx + 1, combination + mapping.charAt(i));
//         }
//     }

//     public static void main(String[] args) {
//         Recursion.printCombination("63", 0, "");
//     }
// }

// -------------------------------------------------------------------------------------
//print all permutations to a string 
