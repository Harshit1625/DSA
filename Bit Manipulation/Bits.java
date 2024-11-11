
//Get Bit
// class Bits{
//     public static void main(String[] args) {
//         int n = 5;
//         int pos = 3;
//         int bitMask = 1<<pos;

//         if((bitMask & n) == 0){
//             System.out.println("Bit is Zero");
//         }else{
//             System.out.println("Bit is Non-zero");
//         }

//     }

// }

// --------------------------------------------------------------------------

//Set Bit
// class Bits{
//     public static void main(String[] args) {
//         int n = 5; //0101
//         int pos = 1;
//         int bitMask = 1<<pos;

//       int newNumber = bitMask | n; // 0010 | 0101
//       System.out.println(newNumber); //7 

//     }

// }

// --------------------------------------------------------------------------

//Clear Bit
// class Bits{
//     public static void main(String[] args) {
//         int n = 5; //0101
//         int pos = 2;
//         int bitMask = 1<<pos;
//         int notMask = ~(bitMask);

//       int newNumber = notMask & n; 
//       System.out.println(newNumber); 

//     }

// }

// --------------------------------------------------------------------------

//Update Bit
// class Bits{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int operation = sc.nextInt(); //it decides which operation we have to perform to update the value
//         int n = 5; //0101
//         int pos = 1;
//         int bitMask = 1 << pos;

//         if(operation ==1){

//          //SET bit
//          int newNumber = bitMask | n;
//          System.out.println(newNumber);
//         }else {

//          // CLEAR bit
//          int notMask = ~(bitMask);
//          int newNumber = notMask & n;
//          System.out.println(newNumber);
//         }
//          sc.close();
//     }

// }


// --------------------------------------------------------------------------

// Q- Write a program to find if a number is a power of 2 or not.
// class Bits{
//     public static void main(String[] args) {
//        int num = 4;
//        int prevNum = num - 1;
//        if((num & prevNum) == 0){ //comparing the binary of the given number with the binary of previous number =
//         System.out.println("Yes");
//        }
//     }

// }

// --------------------------------------------------------------------------

//Q :  Write a program to count the number of 1’s in a binary representation of the number.
// class Bits{
//     public static void main(String[] args) {
//        int num = 7;
//        String binaryString = Integer.toBinaryString(num);
//        int count = 0;
//        for(int i = 0; i < binaryString.length() ; i++){
//          if(binaryString.charAt(i) == '1'){
//            count = count + 1;
//          }
//         }
//         System.out.println(count);
//     }
// }


// --------------------------------------------------------------------------

//Q :  Write 2 functions => decimalToBinary() & binaryToDecimal() to convert a number from one number system to another.

// class Binary {

//   public String decimalToBinary(int decimalNumber) {
//     return Integer.toBinaryString(decimalNumber);  
//    }

//    public int binaryToDecimal(String binaryNumber){
//     return Integer.parseInt( binaryNumber, 2); // 2 is telling the function that binaryNumber is in base2 format
//    }

// }

// class Bits{  
//   public static void main(String[] args) {
//      int num = 7;
//      String binarySeven = "111";
//      Binary b = new Binary();
//      System.out.println(b.decimalToBinary(num));  
//      System.out.println(b.binaryToDecimal(binarySeven));
//   }
// }



