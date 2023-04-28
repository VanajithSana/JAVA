import java.util.*;


public class quesn2 {

    public static void main(String[] args) {
       
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();  int t=0;
        int[][] arr=new int[n][7];
        for(int i=0;i<n;i++){
            for(int j=0;j<7;j++){
                arr[i][j]=obj.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<7;j++){
                t=t+arr[i][j];
            }

            if(t==56){
                System.out.println("1");
            }
            else{
                System.out.println("0");
            }
        }
    }
}
