package theory;

import theory.IntegerPrint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        ArrayList<String> arrayList=new ArrayList();
//        arrayList.add("fvd");
//        arrayList.add("sdv");
//        arrayList.add("new Date()");
//
//        print("jhg");
//        print("sdvs",10);
//        print('d',5);
//        System.out.println(print1(4));


//        IntegerPrint integerPrint=new IntegerPrint();
//        integerPrint.print(23);
//
//        StringPrint stringPrint=new StringPrint();
//        stringPrint.print("everf");
//
//
//        Print<Integer> print=new Print<>();
//        print.print(32);
//
//        Print<Double> print1=new Print<>();
//        print1.print(6.5);


//        method(List.of(1,1.5,4.5f));
//        method(List.of("rer","vfrd"));

//        Print<Animal>print=new Print<>();
//        print.print(new Animal());
//
//        Print<DomasticAnimal> print1=new Print<>();
//        print1.print(new Cat());
//
//        Print<Cat>print2=new Print<>();
//        print2.print(new Cat());

        method(List.of(new Cat()));
    }




//    public static <T,E> void getInfo(T t){
//        E e;
//        System.out.println(t);
//    }


    public static void method(List<? super DomasticAnimal >arrayList){
        System.out.println(arrayList);
    }

//    public static void print(int a){
//        System.out.println(a);
//    }
//    public static void print(double a){
//        System.out.println(a);
//    }
//    public static void print(theory.Person a){
//        System.out.println(a);
//    }
//    public static <T> void print (T t){
//        System.out.println(t);
//    }
//    public static <T,E> void print(T t,E e){
//        System.out.println(t+" "+e);
//    }
//    public static <T> T print1(T t){
//        return t;
//    }
//    public static int print(int a){
//        return a;
//    }


}