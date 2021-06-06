
package biblioteca;

import java.util.ArrayList;


public class Biblioteca {
    private String nome;
    private final ArrayList<Livro> livros;
    
    public Biblioteca(String nome){
        this.nome = nome;
        this.livros = new ArrayList<Livro>();
    }
    
    public static void main(String[] args) {
        Biblioteca bib = new Biblioteca ("Minha Estante");
        bib.livros.add(new Livro("1984", "Geoge Orwell", 1949));
        bib.livros.add(new Livro("Hamlet", "Shakespeare", 1603));
        bib.livros.add(new Livro("Anna karenina", "Tolstói", 1877));
        bib.livros.remove(2);
        System.out.println("--" + bib.nome);
        for (Livro x : bib.livros)
            x.imprime();
        System.out.println(bib.livros.size());
        bib.livros.clear();
        System.out.println(bib.livros.size());
    }
    
}
