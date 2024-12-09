package app;

public class L4PR {
    public static void main(String[] args) {

        System.out.println(findSymbolOccurance("Hello World" ,  'o'));
        System.out.println(findWordPosition("Hotel" , "tel"));
        System.out.println(findWordPosition("Noir" , "pineapple"));

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
}