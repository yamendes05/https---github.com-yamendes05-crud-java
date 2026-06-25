package Bibli.View;

import java.util.Scanner;

public class LivroView {
        Scanner scanner = new Scanner(System.in);
    public int LerQuantidade(){
        System.out.println("Quantos livros deseja cadastrar: ");
        int quant = scanner.nextInt();
        return quant ;

    }
    public String TituloLivro(){

        System.out.println("Digite o nome do livro que deseja cadastrar: ");
        String titulo = scanner.nextLine();
        return titulo;

    }
    public String AutorLivro(){

        System.out.println("Digite o nome do autor: ");
        String autor = scanner.nextLine();
        return autor;

    }
}
