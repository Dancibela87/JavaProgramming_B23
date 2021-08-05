package day41_CustomClassStatics;

public class Address {
    public String buildingNumber,stret, city, state;
    public int zipCode;

    public static String country = "USA";

     /*public void setInfo(){
        System.out.println(country);
        System.out.println(buildingNumber);//instance method accept statics and nonstatic
        //wile static accept just statics
    }
    public static  void setInf2o(){
        System.out.println(country);
        System.out.println(buildingNumber);//instance method accept statics and nonstatic
        //wile static accept just statics
    }*/

    public void setInfo(String buildingNumber, String stret, String  city, String stat, int zipCode){
        this.buildingNumber= buildingNumber;
        this.stret = stret;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;

    }
    public String toString(){
        return buildingNumber + " " + stret + "\n" + city + " " + state+", "+zipCode;
    }




    
}
/*
 Attributes:
        instance:  buildingNumber .street, city, state, zipCode;[multiple copies are needed
        static: country (we need just one copy for the city)
    Actions
            setInfo: sets all the instances
            toString: returns the address
                        EX:
                            7925 Jones Branch Dr
                            McLean Va, 22012
 */