package java_8;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;


public class Streams{
    protected IntStream intStream;
    protected final int[] array;
    protected Object result;
    protected StreamsMethods methods;


    public Runnable calcAvg;



    Streams(final int[] array){
        this.array = array;
        intStream = Arrays.stream(array);
        methods = new StreamsMethods(array);
        calcAvg = ()-> intStream.average();
    }


    public static void main(String[] args){
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        Streams stream = new Streams(array);
    }


    private OptionalInt getMinimum(int[] array){
        return intStream.min();
    }

    private void print(){
        System.out.println(result.toString());
    }

}
