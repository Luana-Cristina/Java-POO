package projetoyoutube;


public class ProjetoYouTube {


    public static void main(String[] args) {
        Video v[] = new Video[3];
        
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 5 de HTML");
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Maria", 17, "F", "mariazinha");
        g[1] = new Gafanhoto("Jubileu", 22, "M", "juba");
        
        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[2]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        vis[0] = new Visualizacao(g[0], v[0]);
        vis[0].avaliar(87.0f);
        System.out.println(vis[0].toString());
        
        /*System.out.println("Videos\n-------------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        
        System.out.println("Gafanhoto\n-------------------");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());*/
    }
    
}
