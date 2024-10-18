package br.com.catolica.Biblioteca.Model;

public class Usuario {

    private String nome;
    private String id;
    private String email;
    private int livrosEmPosse;

    public void setNome(String nome) {
        if(nome.length() > 3){
            this.nome = nome;
        } else {
            System.out.println("Nome muito pequeno!");
        }

    }

    public String getNome(){
        return this.nome;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getId(){
        return this.id;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }

    public void setLivrosEmPosse(int qnt){
        if(qnt > 0 && qnt <= 5){
            this.livrosEmPosse = qnt;
        }else{
            System.out.println("Mucha cosita!");
        }

    }

    public int getLivrosEmPosse(){
        return  livrosEmPosse;
    }

    public void exibirInfo(){
        System.out.printf("Nome: %s\nID: %s\nEmail: %s\n",nome,id,email);
    }
}
