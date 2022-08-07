import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Số hàng");
        int row=scanner.nextInt();
        System.out.println("Số cột");
        int col=scanner.nextInt();
        int[][] arr=new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("Hàng %d cột %d \n",i+1,j+1);
                arr[i][j]=scanner.nextInt();
            }

        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j]+"\t");

            }
            System.out.println("");
        }
        int max,rowMax,colMax;
        max=arr[0][0];
        rowMax=0;
        colMax=0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (max<arr[i][j]){
                    max=arr[i][j];
                    rowMax=i;
                    colMax=j;
                }
            }
        }
        System.out.println("Gía trị lớn nhất là "+max+" tại hàng "+(rowMax+1)+" và cột "+(colMax+1));
    }
}
