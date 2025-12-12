package Sebus;

public class Livro implements Publicacao{
    //ATRIBUTOS
    private String titulo;
    private String autor;
    private int totPag;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    //PERSONALIZADOS
    public String detalhes() {
        return "Livro " + "Titulo:'" + titulo + '\'' + "\n Autor:'"
                + autor + '\'' + "\n Total de páginas: " + totPag +
                "\n Página atual: " + pagAtual + "\n Aberto: " + aberto +
                "\n Leitor:'" + leitor.getNome() + '\'' +  "\n idade: " + leitor.getIdade() + "\n sexo: " + leitor.getSexo();
    }

   //CONSTRUTOR
    public Livro(String titulo, String autor, int totPag, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPag = totPag;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }

    //ESPECIAIS
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getTotPag() {
        return totPag;
    }
    public void setTotPag(int totPag) {
        this.totPag = totPag;
    }
    public int getPagAtual() {
        return pagAtual;
    }
    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }
    public boolean getAberto() {
        return aberto;
    }
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
    public Pessoa getLeitor() {
        return leitor;
    }
    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.setAberto(true);

    }

    @Override
    public void fecharLivro() {
        this.setAberto(false);

    }

    @Override
    public void folhear(int p) {
        this.pagAtual = p;
        if(this.totPag < p){
            System.out.println("Voce não pode folhear mais do que " + totPag + " páginas");
        }else if(this.totPag == p){
            System.out.println("Ultima página do livro");
        }else{
            System.out.println("Folheando...");
        }
    }

    @Override
    public void avancarPag() {
        this.pagAtual ++;
    }

    @Override
    public void voltarPag() {
        this.pagAtual --;
    }
}
