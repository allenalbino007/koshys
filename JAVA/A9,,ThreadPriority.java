package ThreadPriority;
class A extends Thread
{
   public void run()
   {
     System.out.println(" Thread A started");
     for(int i=1;i<5;i++)
        System.out.println(" Thread A : i = "+i);
     System.out.println("Exit from Thread A");
   }
}

class B extends Thread
{
   public void run()
   {
     System.out.println(" Thread B started");
     for(int i=1;i<5;i++)
        System.out.println(" Thread B : i = "+i);
     System.out.println("Exit from Thread B");
   }
}

class C extends Thread
{
   public void run()
   {
     System.out.println(" Thread C started");
     for(int i=1;i<5;i++)
        System.out.println(" Thread C : i = "+i);
     System.out.println("Exit from Thread C");

   }

}

public class ThreadPriority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A threadA = new A();
	       B threadB = new B();
	       C threadC = new C();
	       
	       threadA.setPriority(Thread.NORM_PRIORITY);
	       threadB.setPriority(Thread.MAX_PRIORITY);
	       threadC.setPriority(Thread.MIN_PRIORITY);

	      
	       System.out.println("Start Thread A");
	       threadA.start();

	       System.out.println("Start Thread B");
	       threadB.start();

	       System.out.println("Start Thread C");
	       threadC.start();

	       System.out.println("End of main Thread");
	 

	}

}
