package Mypackage;

public class ArmstrongNumberCount {
    public static void armstrongCount(int count){
            for(int i = 0;i < Integer.MAX_VALUE;i++){
                if(count == 0)break;
                int temp = i,sum = 0,l = String.valueOf(i).length();
                while(temp>0){
                    sum += Math.pow(temp % 10,l);
                    temp = temp/10;
                }
                if(sum == i && count != 0){
                    System.out.print(i + " ");
                    count--;
                }
                if(count == 0){
                    break;
                }
            }

        }
    
    public static void main(String[] args)
    {
        ArmstrongNumberCount obj = new ArmstrongNumberCount();
        obj.armstrongCount(20);
    }

}
