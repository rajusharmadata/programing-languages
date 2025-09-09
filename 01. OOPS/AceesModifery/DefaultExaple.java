// Accessible within the same package only.
// ager koi java program ke ander koi access modifir nahi laga hai iska matlab hai ki o defalut access modifer default set hai
//---------
// yaha par bhi agar koi access modifir nhi laga hu hai class ke ander     leking vs code attomatic defalut access modifer set kiya huaa hai
 class DefaultExaple {

  int number = 100; // yaha par int ke pahle koi access modifier nhi likha huaa hai iska matlab hai ki defalut access modifier use ho raha hai
   void printNumber(){
    System.out.println("my number =  " + number);
   }

   public static void main(String[] args) {
    DefaultExaple exp = new DefaultExaple();
    exp.printNumber();
   }
}
