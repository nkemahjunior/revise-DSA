

public class IsStringPalindrome {

    /*public static boolean isStringPalindrome(String text){

        boolean isPalindrome = false;

        String reversedString = "";

        for(int i = text.length() - 1; i >= 0 ; i--){
           reversedString = reversedString + text.charAt(i);
        }

        //the good life
       int result = text.compareTo(reversedString);
        if(result == 0) isPalindrome = true;

        // the hard way
      /*  for( int i = 0; i < text.length(); i++){

            if(text.charAt(i) != reversedString.charAt(i)){
                System.out.println("entered at "+ text.charAt(i)  +" "+ reversedString.charAt(i));
                isPalindrome = false;
                break;
            }

        }*/

       /* return isPalindrome;
    }*/

    // the teacher's method
    public static boolean isStringPalindrome(String text){

        char[] arr = text.toCharArray();
        int start = 0;
        int end = arr.length - 1;

        while( start < end){

            if(arr[start] != arr[end]) return false;

            start++;
            end--;
        }

        return true;
    }


    public static  void main(String[] args){
        boolean isPalindrome = isStringPalindrome("madam");
        System.out.println(isPalindrome);
    }
}
