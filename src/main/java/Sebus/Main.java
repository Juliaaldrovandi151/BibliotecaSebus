package Sebus;

public class Main {
    public static void main(String[] args) {
    Pessoa[]p = new Pessoa[2];
    Livro[]l = new Livro[3];

    p[0] = new Pessoa("Julia", 17, "F");
    p[1] = new Pessoa("Bruno", 17, "M");

    l[0] = new Livro("Verity", "Colleen Hoover", 320, p[0]);
    l[1] = new Livro("Diário de Anne Frank", "Anne Frank", 224, p[1]);
    l[2] = new Livro("Os mistérios do Universo", "Iberê Tenório", 224, p[0]);

    l[0].abrir();
    l[0].avancarPag();
    l[0].folhear(319);
    l[0].avancarPag();
    l[0].voltarPag();
    //l[0].fecharLivro();
    System.out.println(l[0].detalhes());

    System.out.println(l[1].detalhes());

    System.out.println(l[2].detalhes());
    }
}