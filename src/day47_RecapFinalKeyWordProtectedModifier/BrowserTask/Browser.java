package day47_RecapFinalKeyWordProtectedModifier.BrowserTask;

public class Browser {
    public void open(){
        System.out.println("Opening Chrome Browser");
    }
    public void closed(){
        System.out.println("Closing Chrome Browser");
    }
    public final void navigate(String url){//can not have any different implementations, so all the child classes will have same implementation
        System.out.println("Type "+url);
        System.out.println("Press enter");
    }
    public final void refresh(){
        System.out.println("F5");
    }
    public final void backward(){
        System.out.println("backward");
    }
    public final void forward(){
        System.out.println("forward");
    }


}
