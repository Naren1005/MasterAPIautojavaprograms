import java.util.Locale;

public class vindhiya {
    public static void main(String[] args) {
        System.out.println("my little princes vindhya");
        System.out.println("my little princes: latitha varshini");

        /*int num1=1;
        int num2=20 , max;

        System.out.println("num1 value is " + num1);
        System.out.println("num2 value is " + num2);

        if(num1>num2){
            System.out.println("if condition is true");


        }else {
            System.out.println("if condition is false");
        }
        max=(num1>num2)? num1 : num2;
        System.out.println("biggest number among numb1 and num2 is :" + max);
        System.out.println("happy");*/

       /* for(int i=0;i<=10;i++){

            System.out.println(i);
            if(i==5) {
                break;
            }
            System.out.println("still in the for loop");

        }
        System.out.println("exited for loop");*/
/*double i=0;

        for(;i<=10.6;i++){

            System.out.println(i);
            if(i==5) {
                continue;
            }
           // System.out.println("still in the for loop");

        }
        System.out.println("exited for loop");*/

        String s="naren";

       String name= s.concat(" akurathi");
        System.out.println(s);
        System.out.println(name);
        System.out.println(name.toUpperCase(Locale.ROOT));
        System.out.println(name.indexOf('r'));

    }
}
