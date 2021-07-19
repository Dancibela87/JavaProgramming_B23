package day11_Swichstatement;

public class NestedIf {
    public static void main(String[] args) {
        String batchType = "US morning";
        boolean isValid=batchType=="US morning" || batchType=="US evening"||batchType=="EU batch";

       String result ="";

       if(isValid) {
           if (batchType == "US morning") {
               result = "10am -5pm";
           } else if (batchType == "US evening") {
               result = " 7pm-10pm";
           } else {
               result = "10am-6pm";
           }
       }else{
           result="Invalid result";
       }
        System.out.println("result = " + result);








    }
}
/*
In Cybertek we have three batch types: US morning, US evening, EU.
        Depending on a batch type (String) print information about the batch.

        First figure out is is a US batch or EU batch

            - for US batches:

                > Figure out is it a morning batch or evening batch
                    > morning - print: Class times are 10-5 EST. M, T, Th, F.
                    > evening - print: Class times are 7-10 EST. M, T, W, Th, S, S

            - for EU batches:

                > print: Class times are  10-5 EST. M, T, W, Th, F.

              If Batch type is not EU or US, print Invalid Batch
                NOTE: MUST APPLY NESTED IF
 */