package coreJava.exception;

public class Example {
    public static void divide(int num) throws MyException {
        if(num <=0)
            throw  new MyException("number is less tha 1");
    }

    public static void main(String[] args) {
        try{
            divide(0);
        }catch (MyException e){
            System.out.println(e.getMessage());
        }
    }
}
