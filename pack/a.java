package mounika;
public class a{
 public void m1(){  
    System.out.println("m1 is public method we can access anywhere" );
    }
 void m2(){
    System.out.println("m2 is default method we can acees within package");
 }
 private void m3(){
    System.out.println("m3 is private method we can acees within class");
 }
 protected void m4(){
    System.out.println("m4 is protected method we can acees within package/outside package with the help of child");
 }
 }
    

