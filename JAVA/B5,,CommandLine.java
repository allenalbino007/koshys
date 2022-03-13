package CommandLine;

public class CommandLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length>=2)
	       {
	          int num1=Integer.parseInt(args[0]);
	          int num2=Integer.parseInt(args[1]);
	          int sum=num1+num2;
	          System.out.println("Sum="+sum);

	      }
	      else
	      {
	          System.out.println("Insufficient number of command line arguments");

	}

}
}
