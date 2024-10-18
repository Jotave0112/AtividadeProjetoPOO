package br.com.catolica.Biblioteca.Model;

public class Livro {

    private String titulo;
    private String autor;
    private String isbn;
    private int anoDePublicacao;
    private int qntEstoque;


    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public String getAutor(){
        return this.autor;
    }

    public void setIsbn(String isbn){
        this.isbn = isbn;
    }

    public String getIsbn(){
        return this.isbn;
    }

    public void setAnoDePublicacao(int ano){
        this.anoDePublicacao = ano;
    }

    public int getAnoDePublicacao(){
        return this.anoDePublicacao;
    }

    public void setQntEstoque(int estoque){
        this.qntEstoque = estoque;
    }

    public int getQntEstoque(){
        return this.qntEstoque;
    }

    public void exibirInfo(){
        System.out.printf("Titulos: %s\nAutor: %s\nIsbn: %s\nAno de Publcacao: %s\nQnt no Estoque: %s\n", titulo,
                autor,isbn,anoDePublicacao,qntEstoque);
    }
}
