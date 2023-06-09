// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video ("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML5");

        /*
        System.out.println(v[0].toString());
        System.out.println("-----------------");
        System.out.println(v[1].toString());
        System.out.println("-----------------");
        System.out.println(v[2].toString());
        System.out.println("-----------------");
        */

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu", 22, "M", "Juba");
        g[1] = new Gafanhoto("Creuza", 12, "F", "creuzita");


        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[2]); // jubileu assiste html
        vis[0].avaliar();
        System.out.println(vis[0].toString());

        vis[1] = new Visualizacao(g[0], v[1]); // jubileu assite php
        vis[0].avaliar(87f);
        System.out.println(vis[1].toString());

        /*
        System.out.println(g[0].toString());
        System.out.println("-----------------");
        System.out.println(g[1].toString());
        System.out.println("-----------------");
        */

    }
}