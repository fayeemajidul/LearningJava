import java.util.Random;
public class Day0Pt2{
    //Instance Field
    public Day0Pt2(){} // Constructor class
    public static void escapeSequences(){
        System.out.println("This is a literal statement");
        System.out.println(); // This statement won't print out anything
        System.out.println("What \" characters\" does this \\ print?");
        System.out.println("Getting used this \"escape sequence feature\" wow it's cool");
       }
    public static void PrimitiveTypes(){
        /** prim Data Types: Used for [Data Manipulation] -- Each Used for Storage in the RAM
         * int
         * boolean
         * String
         * short
         * long
         * byte
         * float
         * double
         */
        int myMinValue = Integer.MIN_VALUE;
        int myMaxValue = Integer.MAX_VALUE;
        System.out.println("myMaxValue : "  + myMaxValue + "\nmyMinValue : " + myMinValue);
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("My Max Byte Value: " + myMaxByteValue + "\nMy Min Byte Value: " + myMinByteValue);
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("My Max Short Value: " + myMaxShortValue + "\nMy Min Short Value: " + myMinShortValue);
    }

    public static void floatingPoint(){
        //FloatingPointNumbers & Doubles Lesson:
        int myIntValue = 5/2;
        float myFloatValue = 5f/2f;
        double myDoubleValue = 5d/2d; //It only gets rounded bc it thinks it's an integer. [Cast It]
        System.out.println("Integer: " + myIntValue + "\nFloat: " + myFloatValue + "\nDouble: " + myDoubleValue);

    }
    public static void KiloChallenge(int pounds){
        double Kilograms = (double)(pounds*.45359237);
        System.out.println(Kilograms + " KG");
    }
    public static void farmerMarket(){
        Random rand  = new Random();
        boolean orangesSatisified = false;
        int numberOfOranges = rand.nextInt(0,100);
        System.out.println(numberOfOranges);
        if(numberOfOranges >= 25){
            orangesSatisified = true;
        }
        String incomeRaised = orangesSatisified? "You've reached the quota for this Month.":"You have not reached the Quota for this month.";
        System.out.println(incomeRaised);
    }
    public static void challengeOperator(){
        double valueOne = 20.00d;
        double valueTwo = 80.00d;
        double productValues = (double)((valueOne + valueTwo) * 100);
        double remainder = (productValues % 40.00d);
        boolean isZero = (remainder == 0)? true:false;
        System.out.println(isZero);
        if(remainder != 0){
            System.out.println("got some remainder");
        }
    }
    public static void main(String[] arg){
        //PrimitiveTypes();
        //escapeSequences();
        //floatingPoint();
        //KiloChallenge(200);
        //farmerMarket();
        challengeOperator();
    }
}