package day11_Swichstatement;

public class StatusCode {
    public static void main(String[] args) {

        int code =201;

        switch (code){

            case 201:
                System.out.println("Created");
                break;
            case 202:
                System.out.println("Accepted");
                break;
            case 301:
                System.out.println("Moved permanently");
                break;
            case 303:
                System.out.println("See other");
                break;
            case 304:
                System.out.println("Not modified");
                break;
            case 307:
                System.out.println("Temporary redirect");
                break;
            case 400:
                System.out.println("Bad request");
                break;
            case 401:
                System.out.println("Unauthorised");
                break;
            case 403:
                System.out.println("Forbidden");
                break;
            case 404:
                System.out.println("Not found");
                break;
            case 410:
                System.out.println("Gone");
                break;
            case 500:
                System.out.println("Internal server error");
                break;
            case 503:
                System.out.println("Service unavailable");
                break;
            default:
                System.out.println("input not valid");
                break;


        }











    }
}
/*
200, OK
                201, Created
                202, Accepted
                301, Moved Permanently
                303, See Other
                304, Not Modified
                307, Temporary Redirect
                400, Bad Request
                401, Unauthorized
                403, Forbidden
                404, Not Found
                410, Gone
                500, Internal Server Error
                503, Service Unavailable
 */