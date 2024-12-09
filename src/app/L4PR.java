package app;

public class L4PR {
    public static void main(String[] args) {

        System.out.println(findSymbolOccurance("Hello World" ,  'o'));

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
}