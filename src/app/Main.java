package app;

import java.util.Scanner;
import model.Usuario;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Usuario user = new Usuario();

        int opcao;
        do{
            System.out.println("""
                    ======MENU=====
                    1 = Preencher Dados
                    2 = Listar dados
                    0 = Sair""");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Preencher dados: ");
                    user.preencherDados();
                    break;
                case 2:
                    System.out.println("Listar da (Atualizados)");
                    user.listarDados();

            }


        } while(opcao != 0);

    }

}