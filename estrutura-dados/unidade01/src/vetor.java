package unidade01.src;

public class vetor {

    public static void main(String[] args) throws Exception{
       
        Double [] vetor = {10.0, 10.0 ,5.0 ,5.0 };
        Double total = 0.0;

        for(int i = 0; i < vetor.length; i++){
            total += vetor[i];
        }

        System.out.println("Média: " + (total/vetor.length));


        int [][] matriz = {{10,10}, {5, 5}};
        Double totalMatriz = 0.0;
        int contador = 0;

        for(int i =0; i < matriz.length; i++ ){
            for(int j =0; j < matriz[i].length; j++ ){
                totalMatriz += matriz[i][j];
                contador ++;
            }
        }

        System.out.println("Média Matriz: " + (totalMatriz/contador));
    }
        
}
