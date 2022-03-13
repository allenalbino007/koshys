package CopyArray;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [] array1 = {10,20,30,40,50};
        int [] array2 = new int[5];
   
        System.out.println("The elements of the Array 1 :");
   
        for(int x : array1)
        {
            System.out.println("  "+x);

        }     

	//  Copying elements 
	for(int i=0; i<array1.length;i++)
              array2[i]=array1[i];


        System.out.println("The elements of the Array 2 :");
   
        for(int x : array2)
        {
            System.out.println("  "+x);


	}

}
}
