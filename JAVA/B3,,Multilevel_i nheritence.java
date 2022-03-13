package ThirdextendsSecond;
class First

{
   First()
   {
      System.out.println("Called zero argument constructor of First ");

   }

   First( int a)
   {
      System.out.println("Called parameterized constructor of        First ");

   }


}
class Second extends First
{
   Second()
   {
      System.out.println("Called zero argument constructor of Second ");

   }

   Second( int a)
   {
      System.out.println("Called parameterized constructor of        Second ");

   }


}
class Third extends Second
{
   Third()
   {
      System.out.println("Called zero argument constructor of Third ");

   }

   Third( int a)
   {
      System.out.println("Called parameterized constructor of        Third ");

   }

   public static void main(String args[])
   {
     Third t1 = new Third();
     Third t2 = new Third();   

   }


} 


