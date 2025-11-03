package model;

public abstract class Pessoa {
    private String nome;
    private String corDePele;
    private String cpf;
    private String numeroDeTelefone;
    private String dataDeNascimento;
    private int idade;
    private String genero;


    Pessoa() {
        this.nome = "";
        this.corDePele = "";
        this.cpf = "";
        this.numeroDeTelefone = "";
        this.dataDeNascimento = "";
        this.idade = 0;
        this.genero = "";
    }

    Pessoa(String nome, String corDePele, String cpf, String numeroDeTelefone, String dataDeNascimento,
           int idade, String genero) {
        this.nome = nome;
        this.corDePele = corDePele;
        this.cpf = cpf;
        this.numeroDeTelefone = numeroDeTelefone;
        this.dataDeNascimento = dataDeNascimento;
        this.idade = idade;
        this.genero = genero;
    }

    public void listarDados() {
        System.out.println("Nome : "+ nome);
        System.out.println("Cor da pele: "+ corDePele);
        System.out.println("CPF: "+ cpf);
        System.out.println("Numero de telefone: "+ numeroDeTelefone);
        System.out.println("Data de naicimento: "+ dataDeNascimento);
        System.out.println("Idade: "+ idade);
        System.out.println("Genero: "+ genero);
    }
    public abstract void preencherDados();


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCorDePele() {
        return corDePele;
    }

    public void setCorDePele(String corDePele) {
        this.corDePele = corDePele;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNumeroDeTelefone() {
        return numeroDeTelefone;
    }

    public void setNumeroDeTelefone(String numeroDeTelefone) {
        this.numeroDeTelefone = numeroDeTelefone;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}