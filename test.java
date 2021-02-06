class MyClass
{
   public static void print()
   {
       System.out.println("Hello");
   }

   public static boolean check(String n)
   {
       if(n.equals("MyClass"))
           return true;
       else
           return false;
   }
  
   public static void test()
   {
       System.out.println("Testing...");
   }
}
class Main4
{
   public static void main(String args[])
   {
       MyClass o = new MyClass();

       if(args[0].equals("MyClass"))
       {
           System.out.println("OK: testX succeeded");
           o.print();
           o.check(args[0]);
           o.test();
       }
       else
       {
           System.out.println("FAILED: testX failed");
       }
   }
}