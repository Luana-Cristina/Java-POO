
package p2;


public class A {
    public int a;
    protected int b;
    private int c;
    
    protected void calcular(){
        c = a + b;
    }
    public void imprime(){
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
