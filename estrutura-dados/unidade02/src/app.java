package unidade02.src;

public class app {
    public static void main(String[] args) throws Exception{
        
        Pilha p = new Pilha();
        p.empilhar(10);
        p.empilhar(20);
        p.empilhar(30);
        p.empilhar(40);
            while(p.pilhaVazia() == false){
                System.out.println(p.desempilhar());
            }
    }
}

