public class Carro {
    // Atributos da classe carro
    private String nome;
    private String fabricante;
    private double preco;
    private int ano;

    // Construtor - Método para inicializar a classe
    public Carro(String nome, String fabricante, double preco, int ano){
        this.nome = nome;
        this.fabricante = fabricante;
        this.preco = preco;
        this.ano = ano;
    }

    // Get/Set
    public String getNome(){
       return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getFabricante(){
        return this.fabricante;
    }

    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }

    public double getPreco(){
        return this.preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public int getAno(){
        return this.ano;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public String toString(){
        return "Nome: " + getNome() + " - Fabricante: " + getFabricante() + " - Preço: " + getPreco() + " - Ano: " + getAno();
    }

}
