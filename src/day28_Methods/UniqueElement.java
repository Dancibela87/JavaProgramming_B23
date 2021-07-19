package day28_Methods;

public class UniqueElement {
    public static void main(String[] args) {

        uniqueElement(new String[]{"J","Ja","C#","k","k","a","a"});

    }

    public static void uniqueElement(String[] array){
        String unique ="";
        for (String element : array) {
            int count = 0;
            for (String elements : array) {
                if( element.equals(elements)){
                    count++;
                }
            }
            if (count ==1){
                unique = unique + element+ " ";
            }
        }
        System.out.println(unique);

    }
    }

