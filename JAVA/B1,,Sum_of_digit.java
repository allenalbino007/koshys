package DigitSum;


	
		import java.io.*;
		public class DigitSum
		{
		   public static void main(String args[]) throws IOException
		   {
		       int dig=0, sum=0,num;
		       BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

		       /* To read integer */
		       System.out.println("Enter number:");
		       num=Integer.parseInt(br.readLine());
		    
		       while(num>0)
		       {
		           dig=num%10;
		           sum=sum+dig;
		           num=num/10;


		       }

		     System.out.println("Sum of digits is : " +sum);
		   }    


		


	}


