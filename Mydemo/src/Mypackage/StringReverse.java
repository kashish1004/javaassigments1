package Mypackage;
public class StringReverse {
    public static String reverse(String str){
        StringBuffer s = new StringBuffer();
        for(int i = str.length()-1;i >=0;i--){
            s.append(str.charAt(i));
        }
        return s.toString();
    }
    public static void main(String[] args) {
        StringReverse obj = new StringReverse();
        System.out.print(obj.reverse("Hello"));
    }
    
}
