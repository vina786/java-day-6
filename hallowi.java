import java.util.*;
public class hallowi {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0 || j==n/2 || i==n-1)
                System.out.print("*"+" ");
                else
                {
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
                }
            
        }
    }