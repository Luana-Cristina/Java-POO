
package aula11;


public class Aula11 {

    
    public static void main(String[] args) {
        //Programa Principal
        //Pessoa p1 = new Pessoa();
        Visitante v1 = new Visitante();
        v1.setNome("Pedro");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());
        
        Aluno a1 = new Aluno();
        a1.setNome("Cláudio");
        a1.setMatricula(11111);
        a1.setCurso("Informática");
        a1.setIdade(16);
        a1.setSexo("M");
        System.out.println(a1.toString());
        a1.PagarMensali();
        
        Bolsista b1 = new Bolsista();
        b1.setMatricula(2222);
        b1.setNome("Maria");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        System.out.println(b1.toString());
        b1.PagarMensali();
        
    }
    
}
