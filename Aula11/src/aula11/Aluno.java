
package aula11;


public class Aluno extends Pessoa {
    private int matricula;
    private String curso;
    
    public void PagarMensali(){
        System.out.println("Pagando mensalidade do aluno " + this.nome + "!");
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", matricula=" + matricula + ", curso=" + curso + '}';
    }
    
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

   
    
}
