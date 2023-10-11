abstract class a{
    public abstract void age();
    protected void add(){
    }
    void add1(){
    }
}
class b extends a{
    public void age(){
        System.out.println("age=14");
    }
    protected void add(){
        System.out.println("a+b=14");
    }
    void add1(){
        System.out.println("assghgtf");
    }
}
class test{
    public void main(String[] args){
   b B=new b();
     B.age();
     B.add();
     B.add1();
    }
}