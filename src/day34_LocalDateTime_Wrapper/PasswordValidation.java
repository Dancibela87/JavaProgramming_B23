package day34_LocalDateTime_Wrapper;

public class PasswordValidation {
    public static void main(String[] args) {

        //interview task

        String password = "Likabigi26@";
        boolean r1 = password.length()>=8 && !password.contains(" ");
        boolean hasUpperCase = false;
        boolean lowerCase = false;
        boolean isDigit = false;
        boolean isSpecial = false;

        for(char each : password.toCharArray()){

            if(Character.isUpperCase(each)){
                hasUpperCase = true;
            }else if(  Character.isLowerCase(each)){
                lowerCase = true;
            }else if( Character.isDigit(each)) {
                isDigit = true;
            }else{
                isSpecial = true;

            }
        }
        boolean isStrong =  r1 && hasUpperCase && lowerCase && isDigit && isSpecial;
        System.out.println(isStrong);
        if(!r1){
            System.out.println("It is not 8 characters long or it has space");
        }
        if(!hasUpperCase){
            System.out.println("It does not contain Upper case letter");
        }
        if(!lowerCase){
            System.out.println("It does not have lower case letter");
        }
        if(!isDigit){
            System.out.println("It does not have digit");
        }
        if(!isSpecial){
            System.out.println("It does not have a special characters");
        }
    }
}
/*
Password Validation:
    Write a program that can verify if a password is a strong password. Characteristics of strong passwords are:
                1. Password MUST be at least have 8 characters long, and should not contain space
                2. PassWord should at least contain one  upper case letter
                3. should contain one lower case letter
                4. Password should at least contain one special characters
                5. Password should at least contain a digit
 */