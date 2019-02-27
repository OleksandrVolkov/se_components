package java_8;

import java.util.OptionalDouble;

public class StreamsMethods extends Streams{
    private CalcAvg avg;
    private CalcMin min;
    private CountZero zero;
    private CountPositive positive;
    protected Multiply mult;

    private OptionalDouble aDouble;

    StreamsMethods(final int[] array){
        super(array);
        avg=()-> (intStream.average().getAsDouble());
        min=()-> (intStream.min().getAsInt());
        zero = ()-> ((int)intStream.filter((num)->num==0).count());
        positive = ()-> ((int)intStream.filter((num)->num>0).count());
        mult = ()->intStream.forEach((num)-> System.out.print(num*5+" "));

    }
    public Streams CalcAvg(){
        avg.calcAverage();
        return this;
    }
    public Streams CalcMin(){
        min.getMin();
        return this;
    }
    public Streams CalcZero(){
        zero.countZero();
        return this;
    }
    public Streams CalcPositive(){
        positive.countPositive();
        return this;
    }
}
