
package colecao;

import java.util.ArrayList;


public class Colecao {
    private String nomeColecao;
    private ArrayList<Selo> meusSelos;
    
    public Colecao(String nomeColecao){
        this.nomeColecao = nomeColecao;
        meusSelos =  new ArrayList<Selo>();
       
    }
    private void imprime(){
        System.out.println("--Coleção: " + this.nomeColecao + " --"); 
        for (Selo s : this.meusSelos){
            s.imprime();
        }
    }
    public static void main(String[] args) {
        Colecao minhaColecao = new Colecao("Selos do Brasil");
        Selo selo1 = new Selo ("Carnaval", 0.5f, 1998);
        Selo selo2 = new Selo("Independência", 0.25f, 2010);
        Selo selo3 = new Selo("Finados", 0.15f, 1980);
        minhaColecao.meusSelos.add(selo3);
        minhaColecao.meusSelos.add(selo2);
        minhaColecao.imprime();
        System.out.println("Total = " + minhaColecao.meusSelos.size());
    }
    
}
