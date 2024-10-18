package br.com.catolica.Biblioteca.Main;

import br.com.catolica.Biblioteca.Model.Biblioteca;
import br.com.catolica.Biblioteca.Model.Endereco;
import br.com.catolica.Biblioteca.Model.Livro;
import br.com.catolica.Biblioteca.Model.Usuario;

public class Main {
    public static void main(String[] args) {
        Livro livros = new Livro();

        livros.setAutor("Jose");
        livros.setTitulo("As Desventuras");
        livros.setQntEstoque(2);
        livros.setAnoDePublicacao(2004);
        livros.setIsbn("hifeifhe");

        Usuario usuario = new Usuario();

        usuario.setEmail("jv@gmail.com");
        usuario.setNome("Jotave");
        usuario.setId("987");
        usuario.setLivrosEmPosse(5);

        Endereco endereco = new Endereco(
                "Rua fulano de tal",
                "7898999");


        Biblioteca biblioteca =  new Biblioteca();
        biblioteca.setNome("JolanaLopes");
        biblioteca.setEndereco(endereco);
        biblioteca.setLivros(50);

        biblioteca.cadastrarLivro(livros);
        biblioteca.devolver(
                "As Desventuras",
                usuario
        );
        System.out.println(usuario.getLivrosEmPosse());
        usuario.exibirInfo();

        System.out.println(biblioteca);

    }
}