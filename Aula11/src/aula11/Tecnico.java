
package aula11;


public class Tecnico extends Aluno{
    private String resgistroProfissional;
    
    public void praticar(){
        System.out.println(this.nome + " está em prática profissional!");
    }

    @Override
    public String toString() {
        return "Tecnico{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", resgistroProfissional=" + resgistroProfissional + '}';
    }

    public String getResgistroProfissional() {
        return resgistroProfissional;
    }

    public void setResgistroProfissional(String resgistroProfissional) {
        this.resgistroProfissional = resgistroProfissional;
    }
    
    
}
