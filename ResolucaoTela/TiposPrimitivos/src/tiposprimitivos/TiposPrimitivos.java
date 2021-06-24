
package tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivos {

    public static void main(String[] args) {
        //float nota = 8.5f;
        //String nome = "Luana";
        //System.out.printf("A nota de %s é %.2f \n", nome, nota);
        //System.out.format("A nota de %s é %.2f \n", nome, nota);
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do Aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota do Aluno: ");
        float nota = teclado.nextFloat();
        
        System.out.format("A nota de %s é %.1f \n", nome, nota);
    }
    
}
