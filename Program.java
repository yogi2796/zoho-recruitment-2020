import java.util.Scanner;

class Program{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String str = in.next();
        
        int middle = (str.length() / 2);
        String s2  = str.substring(middle, str.length());
        String s1  = str.substring(0, middle);

        String s3 = s2.concat(s1);

        int i, j;         
        for (i = 0; i < s3.length(); i++)   
        {  
       
            for (j=s3.length()-i; j>=0; j--)         
            {        
                System.out.print(" ");   
            }    
            for (j=0; j<=i; j++ )   
            {        
                System.out.print(s3.charAt(j));   
            }
        System.out.println();   
        }   
    }
}
