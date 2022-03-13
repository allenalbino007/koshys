package ThisDemo;


		class ThisDemo
		{
		    /* Declare two instance variables*/
		    int i,j;

		   /* Constructor with no arguments */
		   ThisDemo()
		   {
		     this(100);

		   } 

		   ThisDemo(int a)
		   {
		       this(a,200);
		     
		   }

		   ThisDemo(int i, int j)
		   {
		      this.i=i;
		      this.j=j;   

		   }

		   void display()
		   {
		      System.out.println(" i = "+i);
		      System.out.println(" j = "+j);  

		   }

		   public static void main(String args[])
		   {
		        ThisDemo a1 = new ThisDemo();
		         a1.display(); 

		   } 


		



	}


