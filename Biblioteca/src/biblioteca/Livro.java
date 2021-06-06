
package biblioteca;

    public class Livro {
        private String nome;
        private String autor;
        private int ano;

        public Livro(String nome, String autor, int ano) {
            this.nome = nome;
            this.autor = autor;
            this.ano = ano;
        }

        public void imprime(){
            System.out.println("Nome: " + nome);
            System.out.println("Autor: " + autor);
            System.out.println("Ano: " + ano);
        }
    }
