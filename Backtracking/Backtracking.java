//Permutation of a string ; Here "ABC"
// class Backtracking{

//     public static void backTrack(String str , String perm){
//         if(str.length() == 0){
//             System.out.println(perm);
//             return;
//         }

//         for(int i=0;i < str.length() ; i++){
//             char currChar = str.charAt(i);
//             String newStr = str.substring(0 , i) + str.substring(i+1);
//             backTrack(newStr, perm + currChar);
//         }
//     }
//     public static void main(String[] args) {
//         Backtracking.backTrack("ABC", "");
//     }
// }

//Time complexity will be n*n! as n would be the steps to every an answer multiplying it with n! which would be all the ans....
// ---------------------------------------------------------------------------------------------------------------------------------
//N_Queen Problem

// import java.util.*;

// class Backtracking {

//     //3rd Step
//     public boolean isSafe(int row, int col, char[][] board) {
//         //horizontal
//         for(int j=0; j<board.length; j++) {
//             if(board[row][j] == 'Q') {
//                 return false;
//             }
//         }
       
//         //vertical
//         for(int i=0; i<board.length; i++) {
//             if(board[i][col] == 'Q') {
//                 return false;
//             }
//         }
       
//         //upper left
//         int r = row;
//         for(int c=col; c>=0 && r>=0; c--, r--) {
//             if(board[r][c] == 'Q') {
//                 return false;
//             }
//         }
       
//         //upper right
//         r = row;
//         for(int c=col; c<board.length && r>=0; r--, c++) {
//             if(board[r][c] == 'Q') {
//                 return false;
//             }
//         }
       
//         //lower left
//         r = row;
//         for(int c=col; c>=0 && r<board.length; r++, c--) {
//             if(board[r][c] == 'Q') {
//                 return false;
//             }
//         }
       
//         //lower right
//         r = row;
//         for(int c=col; c<board.length && r<board.length; c++, r++) {
//             if(board[r][c] == 'Q') {
//                 return false;
//             }
//         }
//         return true;
//     }
   
//     //4th Step
//     public void saveBoard(char[][] board, List<List<String>> allBoards) {
//         String row = "";
//         List<String> newBoard = new ArrayList<>();
//         for(int i=0; i<board.length; i++) {
//             row = "";
//             for(int j=0; j<board[0].length; j++) {
//                 if(board[i][j] == 'Q')
//                     row += 'Q';
//                 else
//                     row += '.';
//             }
//             newBoard.add(row);
//         }
       
//         allBoards.add(newBoard);
        
//     }
   
//     //2nd Step
//     public void helper(char[][] board, List<List<String>> allBoards, int col) {
//         if(col == board.length) {
//             saveBoard(board, allBoards);
//             return;
//         }
       
//         for(int row=0; row<board.length; row++) {
//             if(isSafe(row, col, board)) {
//                 board[row][col] = 'Q';
//                 helper(board, allBoards, col+1);
//                 board[row][col] = '.';
//             }
//         }
//     }
  
//     //1st Step
//     public List<List<String>> solveNQueens(int n) {
//         List<List<String>> allBoards = new ArrayList<>();
//         char[][] board = new char[n][n];
//         helper(board, allBoards, 0);
//         return allBoards;
//     }

//     public static void main(String[] args) {
//         Backtracking bc = new Backtracking();
//         List<List<String>> allBoards = new ArrayList<>();
//         allBoards = bc.solveNQueens(4);
//         System.out.println(allBoards);    }
//  }
   

// ---------------------------------------------------------------------------------------------------------------------------------
//  Given an array nums of distinct integers, return all the possible permutations.You can return the answer in any order.

// import java.util.ArrayList;
// import java.util.List;

// class Solution {

//     public List<List<Integer>> permute(int[] nums) {
//         List<List<Integer>> result = new ArrayList<>();
//         List<Integer> currentPermutation = new ArrayList<>();
//         boolean[] used = new boolean[nums.length]; // To track whether a number is already in the current permutation
//         backtrack(nums, currentPermutation, result, used);
//         return result;
//     }

//     private void backtrack(int[] nums, List<Integer> currentPermutation, List<List<Integer>> result, boolean[] used) {
//         // Base case: if the current permutation has all numbers
//         if (currentPermutation.size() == nums.length) {
//             result.add(new ArrayList<>(currentPermutation)); // Add a copy of the current permutation
//             return;
//         }

//         // Iterate over all numbers
//         for (int i = 0; i < nums.length; i++) {
//             if (!used[i]) { // If the number is not used
//                 currentPermutation.add(nums[i]); // Add the number to the current permutation
//                 used[i] = true; // Mark it as used
//                 backtrack(nums, currentPermutation, result, used); // Recursive call
//                 // Backtrack: remove the number and mark it as unused
//                 currentPermutation.remove(currentPermutation.size() - 1);
//                 used[i] = false;
//             }
//         }
//     }

//     public static void main(String[] args) {
//         Solution solution = new Solution();
//         int[] nums = {1, 2, 3};
//         List<List<Integer>> permutations = solution.permute(nums);
//         System.out.println(permutations);
//     }
// }


// ---------------------------------------------------------------------------------------------------------------------------------
//Sudoku Solver
class Backtracking{
   public boolean isSafe(char[][]board ,  int row , int col , int number){
    //row & column
    for(int i=0;i <board.length ; i++ ){
        if(board[i][col] == (char)(number + '0')){
            return false;
        }
        if(board[row][i] == (char)(number + '0')){
            return false;
        }
    }

    //grid
    int sr = (row/3) *3;
    int sc = (col/3) * 3;
    
    for(int i= sr ; i < sr + 3; i++){
        for(int j = sc; i<sc +3; j++){
           if(board[i][j] == (char)(number + '0')){
            return false;
           }
        }
    }
    return true;
   }

    public boolean helper(char[][] board , int row , int col){
        if(row == board.length){
            System.out.println(board);
            return true;
        }

        int newRow = 0;
        int newCol = 0;
        //we will increase the column and row untill it reaches the board length
        if(col != board.length -1){
            newRow = row;
            newCol = col + 1;
        }else{
            newRow = row + 1;
            newCol = col;
        }

        //checking if the number is present there or not
        if(board[row][col] != '.'){
            //calling this helper function recursively to check if the board is filled or not if the board is filled it will return true according to the base case 
          if(helper(board, newRow, newCol)){
            return true;
          }
          else{
            for(int i = 0;i<=9 ; i++){
             if(isSafe(board , row , col , i)){
               board[row][col] = (char)(i + '0'); //typecasting into character
               if(helper(board, newRow, newCol)){
                return true;
               }else {
                board[row][col] = '.';
               }
             }
            }
          }
        }
        return false;
    }

    public void sudokuSolver(char[][] board){
      helper(board, 0, 0);
    }
    public static void main(String[] args) {
        char [][] board = new char[9][9];
        Backtracking bc = new Backtracking();
        bc.sudokuSolver(board);
    }
}

// ---------------------------------------------------------------------------------------------------------------------------------
//KnightL not done ??????




 
