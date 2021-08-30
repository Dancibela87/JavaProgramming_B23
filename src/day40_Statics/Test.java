package day40_Statics;

public class Test {
    public static void main(String[] args) {

        System.out.println( StaticBlocks.list );
        StaticBlocks.list.set(0, "Z");

        System.out.println( StaticBlocks.list );

        System.out.println("---------------------------------------");

        ExecutionOfstaticBlock.method1();
        ExecutionOfstaticBlock.method1();
       ExecutionOfstaticBlock.method1();



    }

}
