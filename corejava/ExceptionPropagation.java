package exceptionpack;

public class ExceptionPropagation{

    void m(){
        int data = 50/0;
    }
    void n(){
        m();
    }
    void p(){
        try{
            n();
        }catch(Excception ex){
             ex.printStackTrace();
        }
    }
    public static void main(String[] args)[
        ExceptionPropagation obj=new ExceptionPropagation();
           
        System.out.println(".....rest of the code");

    

}
