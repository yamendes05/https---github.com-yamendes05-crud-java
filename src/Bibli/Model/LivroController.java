package Bibli.Model;
import java.io.Console;
import java.util.HashSet;
import java.util.Set;

import Bibli.Controller.Emprestimo;
import Bibli.Controller.Livro;
import Bibli.Controller.Usuario;
import Bibli.View.LivroView;

public class LivroController {
    Set<Livro> Livros = new HashSet<Livro>();
    LivroView view = new LivroView();

    int quantidade = view.LerQuantidade();

    for(i =0 ; i<quantidade ; i++){
        Livro livro = new Livro();

            System.out.println("\nCadastro do Livro {i + 1}");

            livro.Nome = view.TituloLivro();
            livro.autor = view.AutorLivro();
            
         
    }
}
