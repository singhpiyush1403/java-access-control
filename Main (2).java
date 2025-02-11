package mypackage;

public class A {
    public int publicVar = 10;      
    protected int protectedVar = 20; 
    int defaultVar = 30;             
    private int privateVar = 40;     

    public void show() {
        System.out.println("Public: " + publicVar);
        System.out.println("Protected: " + protectedVar);
        System.out.println("Default: " + defaultVar);
        System.out.println("Private: " + privateVar);
    }
}
