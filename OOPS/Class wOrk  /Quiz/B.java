class A {
   static int a = 10;

   void add() {

       this.a = a + 3;

       System.out.println("Inside the method: a = " + a);

   }
   public void increment() {

       a++;

   }
}
public class B {
   public static void main (String[] args) {
   System.out.println("Before calling a method: a = " + A.a);
   A obj = new A();
   obj.add();

   System.out.println("After calling the method: a = " + A.a);
   obj.increment();

   obj.increment();

   

   System.out.println("Value of A in the end : a = " + A.a);    

   }
}