
package aula11;


public class Bolsista extends Aluno{
    private float bolsa;
    
    public void RenovarBolsa(){
        System.out.println("Renovando bolsa de " + this.nome);
    }
    
    @Override
    public void PagarMensali(){
        System.out.println(this.nome + " é bolsista! Pagamento facilitado!");
    }

    @Override
    public String toString() {
        return "Bolsista{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", bolsa=" + bolsa + '}';
    } 
    
    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

   
    
    
    
}
