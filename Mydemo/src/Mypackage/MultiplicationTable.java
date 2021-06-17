package Mypackage;
public class MultiplicationTable {
    public static void mulTable(int n){
        for(int i = 1; i <= 10;i++){
            System.out.println(n + " * " + i + " = " + n*i);
        }
    }
    public static void main(String[] args) {
        MultiplicationTable obj = new MultiplicationTable();
        obj.mulTable(2);
    }
    
}
