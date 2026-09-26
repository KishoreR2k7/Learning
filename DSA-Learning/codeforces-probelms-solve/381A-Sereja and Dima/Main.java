import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
            int n=scan.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=scan.nextInt();
            }
            int left=0,rigth=n-1,sereja=0,dima=0;
            while(left<=rigth){
                if(arr[left]>arr[rigth]){
                    sereja+=arr[left];
                    left++;
                }else{
                    sereja+=arr[rigth];
                    rigth--;
                }
                if(left>rigth){
                    break;
                }
                if(arr[left]>arr[rigth]){
                    dima+=arr[left];
                    left++;
                }else{
                    dima+=arr[rigth];
                    rigth--;
                }
            }
                System.out.println(sereja +" "+dima);
    }
}