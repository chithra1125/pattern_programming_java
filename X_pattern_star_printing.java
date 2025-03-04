import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j || j==n-i-1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.println(" ");
                }
            }
            for(int j=n;j>0;j--)
            {
                
            }
            System.out.println();
        }
        
    }
}
