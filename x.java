import java.io.* ;
class x {
  int a , b , c ;
  void myget ()throws IOException {
    BufferedReader nums = new BufferedReader(new InputStreamReader(System.in));
    a = Integer.parseInt(nums.readLine());
    b = Integer.parseInt(nums.readLine());
    c = Integer.parseInt(nums.readLine());
  }
  void az ()throws IOException {
    for (int i = 65; i<= 90; i++){
      System.out.println((char)i);
      System.out.println("-----------------------------------");
    }
  }
  public static void main(String args[])throws IOException {
    x num = new x();
    num.myget();
    
    for (int i = num.b;i <= num.c; i++) {
      if (i < 10) {
	System.out.println(num.a + " * " + " "  + i + " = " + num.a * i ); 
      }      
      else {
        System.out.println(num.a + " * " + i + " = " + num.a * i );
      }
    }
    System.out.println("-----------------------------------");
  }
}

  