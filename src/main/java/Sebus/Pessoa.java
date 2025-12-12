package Sebus;

public class Pessoa {
    //ATRIBUTOS
    private String Nome;
    private int idade;
    private String sexo;

    //PERSONALIZADO

    public void fazerNiver(){
        this.idade ++;

    }
   // CONSTRUTORES
    public Pessoa(String nome, int idade, String sexo) {
        Nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
   //ESPECIAIS
    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
