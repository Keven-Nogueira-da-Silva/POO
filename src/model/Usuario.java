package model;
import java.util.Scanner;

public class Usuario extends Pessoa {
    Scanner sc = new Scanner(System.in);

    String id = "";
    public Usuario() {
        this.id = "";
    }

    Usuario( String id, String nome, String corDePele, String cpf, String numeroDeTelefone, String dataDeNascimento,
            int idade, String genero ) {
        super(nome, corDePele, cpf, numeroDeTelefone, dataDeNascimento, idade, genero);
    }

    @Override
    public void listarDados(){
        super.listarDados();
        System.out.println("ID: "+ id);
    }

    @Override
    public void preencherDados() {
        System.out.println("Nome: ");
        setNome(sc.nextLine());
        System.out.println("Cor de pele: ");
        setNome(sc.nextLine());
        System.out.println("CPF: ");
        setCpf(sc.nextLine());
        System.out.println("Numero de telefone: ");
        setNumeroDeTelefone(sc.nextLine());
        System.out.println("Data de nascimento: ");
        setDataDeNascimento(sc.nextLine());
        System.out.println("Idade: ");
        setIdade(sc.nextInt());
        sc.nextLine();
        System.out.println("Genero: ");
        setGenero(sc.nextLine());
        System.out.println("ID: ");
        setId(sc.nextLine());

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }



}
