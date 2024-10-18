package br.com.catolica.Biblioteca.Model;

import java.util.Arrays;

public class Biblioteca{

    private String nome;
    private Endereco endereco;
    private Livro[] livros;
    private Usuario usuario;

    public void verificarDisponibilidade() {
        for (int x = 0; x < livros.length; x++) {
            if (livros[x] != null) {
                System.out.printf("Livro: %s", this.livros[x]);
            } else {
                System.out.println("----------");
            }
        }
    }
    public void cadastrarLivro(Livro livro) {
        boolean status = false;
        for (int x = 0; x < livros.length; x++) {
            if (this.livros[x] == null) {
                this.livros[x] = livro;
                System.out.println("Livro adicionado!");
                status = true;
                break;
            }
        }
        if (!status) {
            System.out.println("Livro nao existe!");
        }
    }

    public void localizarLivroPorTitulo(String livro) {
        boolean status = false;
        for (int x = 0; x < livros.length; x++) {
            if (this.livros[x].getTitulo().equals(livro) && this.livros[x] != null) {
                System.out.printf("Livro Encontrado: %s", this.livros[x].getTitulo());
                status = true;
                break;
            }
        }
        if (!status) {
            System.out.println("Livro nao existe!");
        }
    }

    public void localizarLivroPorAutor(String livro) {
        boolean status = false;
        for (int x = 0; x < livros.length; x++) {
            if (this.livros[x].getAutor().equals(livro) && this.livros[x] != null) {
                System.out.printf("Livro Encontrado: %s", this.livros[x].getAutor());
                status = true;
                break;
            }
        }
        if (!status) {
            System.out.println("Livro nao existe!");
        }
    }

    public void devolver(String titulo,Usuario usuario) {
        for (int x = 0; x < livros.length; x++) {
            if (this.livros[x].getTitulo().equals(titulo) && this.livros[x] != null && usuario.getLivrosEmPosse() <= 5) {
                livros[x].setQntEstoque(livros[x].getQntEstoque()+1);
                usuario.setLivrosEmPosse(usuario.getLivrosEmPosse()-1);
                break;
            } else{
                System.out.println("Carregando muito Livro! ou o Livro nao existe!");
            }
        }
    }

    public void emprestar(String titulo, Usuario usuario) {
        for (int x = 0; x < livros.length; x++) {
            if (this.livros[x].getTitulo().equals(titulo) && this.livros[x] != null && livros[x].getQntEstoque() <= 5) {
                livros[x].setQntEstoque(livros[x].getQntEstoque()-1);
                usuario.setLivrosEmPosse(usuario.getLivrosEmPosse()+2);
                this.livros[x] = null;
                break;
            } else{
                System.out.println("Carregando muito Livro! ou o Livro nao existe!");
            }
        }
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }

    public Endereco getEndereco(){
        return endereco;
    }

    public void setLivros(int livro){
        if (livro <= 100 && livro > 0) {
            livros = new Livro[livro];
        } else {
            System.out.println("Valor incorreto!");
        }
    }

    public Livro[] getLivros(){
        return livros;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s\nEndereco: %s\nBiblioteca: %s\n",this.nome,
                this.endereco, livros);
    }
}