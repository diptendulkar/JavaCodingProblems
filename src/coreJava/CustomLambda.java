package coreJava;

public class CustomLambda {

    public static void main(String[] args) {
        ThreeIntSum sumLambda = (a,b,c)-> {

           if(a == null)
               a=100;
            if(b == null)
                b=100;
            if(c == null)
                a=100;

         return a+b+c;
        };


        Integer a=null;
        Integer b=20;
        Integer c=30;

        int result = sumLambda.sum(a,b,c);
        System.out.println(result);


    }
}

@FunctionalInterface
interface ThreeIntSum{
    int sum(Integer a, Integer b, Integer c);
}
