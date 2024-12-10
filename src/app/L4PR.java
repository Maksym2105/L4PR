package app;

public class L4PR {
    public static void main(String[] args) {

        String occuranceStr = "Hello World";
        char ch = 'o';
        System.out.println(findSymbolOccurance(occuranceStr , ch));

        String source = "Hotel" ,  target = "tel";
        System.out.println(findWordPosition(source, target));

        String reverseStr = "Room tour";
        System.out.println(reverseString(reverseStr));

        String palindromeStr = "ini" , palindromeStr2 = "Work";
        System.out.println(isPalindrome(palindromeStr));
        System.out.println(isPalindrome(palindromeStr2));


    }
    public static int findSymbolOccurance(String str , char ch){
        int count = 0;
        for(char c : str.toCharArray()){
            if(ch == c){
                count++;
            }
        }
        return count;
    }

    public static int findWordPosition(String source , String target){
        return source.indexOf(target);
    }

    public static String reverseString(String reverseStr){
        return new StringBuilder(reverseStr).reverse().toString();
    }

    public static boolean isPalindrome(String str){
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        if(sb.toString().equals(str)){
            return true;
        }else{
            return false;
        }
    }
}