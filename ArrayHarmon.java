import java.util.Arrays;

public class ArrayHarmon {
    public static void main(String[] args) {

        int[] list={1,2,3,4,5,6,7};
        System.out.println(average(list));
        System.out.println(harmon(list));

        
    }

    static int average(int[] arr){
        int average=1,sum=0,num1=0,num2=0;
        num1=arr.length;
        for (int i = 0; i < arr.length; i++) {
            sum=arr[i];
            num2+=sum;
        }

        average=num2/num1;
        return average;
    }
    static float harmon(int[] arr){
        float sum=0f,fzero=0f,num,harmon;
        for (int i = 0; i < arr.length; i++) {
            
            sum=arr[i];
            sum=1/sum;
            fzero+=sum;
            System.err.println(">>"+sum);
            System.out.println("<<"+fzero);
            sum=0;
        }
        
        num=arr.length;
        harmon=num/fzero;
        return harmon;

    }
    
}
