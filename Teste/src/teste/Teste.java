
package teste;

public class Teste {
    private int exp1;
    private int exp2;
    
    protected void calcular1(int x){
        this.exp1 = x + 8 * 3 +2 -18 / 3 + 3 * 2;
    }
    protected void calcular2(int x){
        this.exp2 = x + 8 * (3+2) - 18 / (3+3) * 2;
    }
    
    public static void main(String[] args) {
      Teste t = new Teste();
      t.calcular1(0);
      t.calcular2(4);
      System.out.println(t.exp1);
      System.out.println(t.exp2);
    }
    
}
