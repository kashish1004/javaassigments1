package Mypackage;

public class PrimeNumberCount {
    static int flag,i,k=2;
    public static void primeCount(int count){
        System.out.print(2+" ");
        count--;
        while(count != 0){
            for(i = k+1;i<Integer.MAX_VALUE;i++){
                flag = 0;
                for(int j = 2;j<=Math.sqrt(i);j++){
                    if(i%j == 0){
                        flag = 1;
                        break;
                    }
                }
                if(flag == 0){
                    System.out.print(i + " ");
                    count--;
                    break;
                }
            }
            k = i;
        }
    }
    public static void main(String[] args)
    {
        PrimeNumberCount obj = new PrimeNumberCount();
        obj.primeCount(10);
    }
    
}
