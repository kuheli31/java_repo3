import java.util.Scanner;

public class j3 
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int i,max,min;
        System.out.println("Enter numbers=");
        int m[]=new int[5];
        for(i=0;i<5;i++)
        {
            m[i]=sc.nextInt();
        }
        max=m[0];
        min=m[0];
        for(i=0;i<5;i++)
        {
            if(max<m[i])
            {
                max=m[i];
            }
            else if(min>m[i])
            {
                min=m[i];
            }
        }
        System.out.println("Maximum="+max);
        System.out.println("Minimum="+min);
        }
    }

