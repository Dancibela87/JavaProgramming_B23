package day41_Constractor;

//import utilities.Data;
import static utilities.Data.str3;


public class ImportStatement {
    /*
    regular import statement access all the members of the class, statics and non-statics.
    static access just static members.
    You call it :  import static PackageName.className.staticMember;- it imports specific
    static members. If you want to import all static members, you should put *
    instead of staticMember at the end.
     */
    public static void main(String[] args) {
       /* Data obj = new Data();
        System.out.println(obj.str1);
        System.out.println(obj.str2);

        System.out.println(Data.str3);
        System.out.println(Data.str4);*/

        System.out.println("____________________________________________");

        System.out.println(str3);


    }
}
