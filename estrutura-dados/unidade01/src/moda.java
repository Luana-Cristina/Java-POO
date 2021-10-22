package unidade01.src;

public class moda {

    public static void main(String[] args) throws Exception{
        int numeroVezes;
        int numeroVezesAntes = 0;
        int moda = 0;
        int[] vetor = {1, 5, 2, 3, 1, 3, 1};

        for(int i = 0; i < vetor.length; i++ ){
            numeroVezes = 1;
            for(int j = 0; j < vetor.length; j++){
                if(vetor[i] == vetor[j]){
                    numeroVezes++;
                }
            }
            if(numeroVezes > numeroVezesAntes){
                moda = vetor[i];
                numeroVezesAntes = numeroVezes;
            }
        }
        System.out.println("Moda: " + moda);

    }
}

