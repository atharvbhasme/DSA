package java_basic;

class Demo {
   //creating constructor
    static int a;
    String dr = "dr";
   Demo(){
       System.out.println("Calling constructor");
       a = 0;
   }

   public static void staticMethod (){
       System.out.println("This is an Static method");
       System.out.println(a);
       Demo d = new Demo();
       d.publicMethod();
   }

   public void publicMethod(){
       System.out.println("This is public method");
       System.out.println("This is String " + dr);
       System.out.println("This is int "+ a);
   }

}
