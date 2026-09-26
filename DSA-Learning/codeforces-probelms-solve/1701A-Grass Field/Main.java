import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        while(t-->0){
            int[][] arr=new int[2][2];
            int countone=0;
            for(int i=0;i<2;i++){
                for(int j=0;j<2;j++){
                    arr[i][j]=scan.nextInt();
                    if(arr[i][j]==1){
                        countone++;
                    }
                }
            }
            if(countone==0){
                System.out.println(0);
            }else if(countone==4){
                System.out.println(2);
            }else{
                System.out.println(1);
            }
        }
    }
}