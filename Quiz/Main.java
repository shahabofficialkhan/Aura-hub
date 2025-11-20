
class Test1{

   int number;

   

   public Test1 (int no) {

       System.out.println("No : " + no);

   }

}

 

class Test2 extends Test1 {

   

   public Test2(int no, int number) {

       super(no);

       

       this.number = number;

   }

   

   

}

class Main {

   public static void main(String[] args) {

       Test1 obj = new Test2(3, 4);

   }

}