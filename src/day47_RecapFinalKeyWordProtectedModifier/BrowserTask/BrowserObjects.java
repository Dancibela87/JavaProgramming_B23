package day47_RecapFinalKeyWordProtectedModifier.BrowserTask;

public class BrowserObjects {
    public static void main(String[] args) {

        Chrome chrome = new Chrome();
        chrome.open();
        chrome.closed();

        System.out.println("__________________________");

        Firefox firefox = new Firefox();
        firefox.open();
        firefox.closed();

        System.out.println("___________________________");

        Safari safari = new Safari();
        safari.open();
        safari.closed();

        System.out.println("____________________________");

        Opera opera = new Opera();
        opera.open();
        opera.closed();

        System.out.println("____________________________");

        Edge edge = new Edge();
        edge.open();
        edge.closed();


    }
}
