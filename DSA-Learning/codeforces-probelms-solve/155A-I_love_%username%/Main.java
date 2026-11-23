import java.util.Scanner;
public class Main{
    public static boolean incr(int[] arr, int index , int num){
        for(int i=0;i<index;i++){
            if(arr[i]>=num){
                return false;
            }
        }
        return true;
    }
    public static boolean decs(int[] arr,int index,int num){
        for(int i=0;i<index;i++){
            if(arr[i]<=num){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        int count=0;
        for(int i=1;i<n;i++){
            if(incr(arr,i,arr[i])){
                count++;
            }if(decs(arr,i,arr[i])){
                count++;
            }
        }
        System.out.println(count);
    }
}