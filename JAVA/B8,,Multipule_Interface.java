package InterfaceMulti;
interface XYZ
{
   public void functionX();

}

interface MSD
{
   public void functionM();

}

interface PQR extends XYZ,MSD
{

   public void functionP();

}

class ABC implements PQR
{
    public void functionX()
    {
       System.out.println("Implemeting functionx ");

    }

    public void functionM()
    {
       System.out.println("Implemeting functionM ");

    }

    public void functionP()
    {
       System.out.println("Implemeting function P ");

    }

}


public class InterfaceMulti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ABC a1 = new ABC();
	     a1.functionX();
	     a1.functionM();
	     a1.functionP();


	}

}
