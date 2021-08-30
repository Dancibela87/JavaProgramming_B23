package day43_OOP_Encapsulation;

public class EncapsulationIntro {
    /*  OOP - it stands for object oriented programing. We make objects reusable,
              and than we would have less code and it would be easier to maintain.
              It is important for our automation later.

       Encapsulation - cover with something. In Java it means hiding the data, hiding the fields(instance variables).
                     - you hide them by using private access modifier.( it impacts its usability ).
                     So to make it usable outside the class, there are methods in encapsulation:
                              - getter
                              - setter

       Getter() - method that only reads the private data. They are not used outside the package.
                  it is access modifier is public.it is PUBLIC INSTANCE METHOD. It has to return the same
                  data that private variable has, so its return type has to be same as data's.So, return type is not void.
                  It has not parameter.

       Setter() - method that change private data. Setter changes variable.It is also PUBLIC INSTANCE METHOD.
                  We need argument of what we wont to set. Return type is void, it does not return any data, it just changes it

       * If instance can not be changed( constant such as date of birth).
         That is why final key word is used( methods, variables, class). Final can not be
         reassigned. That final variable can not be reassigned, it becomes constant.


     */

    private String userName =" Cybertek",
                   password = "Batch23student";

    public String getUserName(){
        return userName;
    }
    public String getPassword(){
        return password;
    }  // allows us to read private data outside the class.
    //  getter has to be public, because if it is private, we wont be able to use it outside the class.
    //  it has to be reusable everywhere, that is why we can not give any other access modifier but public.

    public void setUserName(String userName){

        if(userName.length() <5){
            System.out.println("User name needs to be at least 8 characters long.");
            return;
        }
          this.userName = userName;

          //parameter must mach with filed
    }
    public void setPassword(String password){

        if(password.length()<8){

            System.out.println("password do not mach requirements");
            return;
        }
        this.password = password;

    }











}
