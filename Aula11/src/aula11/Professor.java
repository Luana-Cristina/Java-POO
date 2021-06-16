
package aula11;


public class Professor extends Pessoa{
    private String especialidade;
    private float salario;
    
    public void ReceberAumen(){
        System.out.println("Recebe o aumente de 5%!");
    }

    @Override
    public String toString() {
        return "Professor{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", especialidade=" + especialidade + ", salario=" + salario + '}';
    }
    
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
}
