
package colecao;


public class Selo {
    private String nome;
    private double valor;
    private int ano;
    
    public Selo(String nome, double valor, int ano){
        this.nome = nome;
        this.valor = valor;
        this.ano = ano;
    }
    public void imprime(){
        System.out.println("Nome Selo: " + nome);
        System.out.println("Valor: R$ " + valor);
    }
}
