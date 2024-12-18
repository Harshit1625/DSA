class Backtracking{

    public static void backTrack(String str , String perm){
        if(str.length() == 0){
            System.out.println(perm);
            return;
        }

        for(int i=0;i < str.length() ; i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0 , i) + str.substring(i+1);
            backTrack(newStr, perm + currChar);
        }
    }
    public static void main(String[] args) {
        Backtracking.backTrack("ABC", "");
    }
}

//Time complexity will be n*n! as n would be the steps to every an answer multiplying it with n! which would be all the ans

// ---------------------------------------------------------------------------------------------------------------------------------