package unidade03.src;

public class Fila{

    int [] fila;
    int inicio;
    int fim;
    int tamanho;
    int qtdElementos;

    public Fila(){
        inicio = fim = -1;
        tamanho = 100;
        fila = new int[tamanho];
        qtdElementos = 0;
    }

    public boolean estaVazia(){
        if(qtdElementos == 0){
            return true;
        }
        return false;
    }

    public boolean estaCheia(){
        if(qtdElementos == tamanho -1){
            return true;
        }
        return false;
    }

    public void adicionar(int e){

        if(! estaCheia()){
            if(inicio == -1){
                inicio = 0;
            }
            fim++;
            fila[fim] = e;
            qtdElementos++;
        }
    }

    public void remover(){
        if(!estaVazia()){
            inicio++;
            qtdElementos--;
        }
    }
    
    public void mostrarFila(){
        String elementos = "";
        for(int i = 0; i <= fim; i++){
            elementos += fila[i] + ',';
        }
        System.out.print(elementos);
    }
}
