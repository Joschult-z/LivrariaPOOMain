/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Livro;

/**
 *
 * @author 182120023
 */
public class CLivro {

    ArrayList<Livro> livros = new ArrayList<>();
    int idLivro = 1;

    /**
     * geraID gerencia a geração dos IDs AutoIncrement para Livros
     *
     * @return
     */
    public int geraID() {
        return this.idLivro++;
    }

    /**
     * addLivro adiciona um cliente na lista de livros
     *
     * @param c
     */
    public void addLivro(Livro LI) {
        this.livros.add(LI);
    }

    /**
     * getLivros retorna alista de livros
     *
     * @return
     */
    public ArrayList<Livro> getLivros() {
        return this.livros;
    }

    /**
     * removeLivro remove cliente da lista de livros
     *
     * @param c
     */
    public void removeLivro(Livro LI) {
        this.livros.remove(LI);
    }

    /**
     * mock livros inicializa aplicação com livros.
     */
    public void mockLivros() {
        CEditora ed = new CEditora();
        Livro LI1 = new Livro();
        LI1.setIdLivro(this.geraID());
        LI1.setTitulo("Pequeno Principe");
        LI1.setAutor("Antoine de Saint");
        LI1.setAssunto("Ludico");
        LI1.setIsbn("88887448");
        LI1.setEstoque(10);
        LI1.setPreco((float) 16.47);
        LI1.setIdEditora(ed.getEditoraCnpj("842617846"));
        this.addLivro(LI1);

        Livro LI2 = new Livro();
        LI2.setIdLivro(this.geraID());
        LI2.setTitulo("Harry Potter e a preda Filosofau");
        LI2.setAutor("J.K Rowling");
        LI2.setAssunto("Ficção");
        LI2.setIsbn("24124142");
        LI2.setEstoque(15);
        LI2.setPreco((float) 33.99);
        LI2.setIdEditora(ed.getEditoraCnpj("141241141"));
        this.addLivro(LI2);

    }

    /**
     * Pesquisa cliente pelo CPF e retorna o cliente. e caso nao encontre,
     * retorna nulo podendo cadastrar.
     *
     * @param isbn
     * @return
     */
    public Livro getLivroISBN(String isbn) {
        Livro LI = null;
        for (Livro livro : livros) {
            if (livro.getIsbn().equals(isbn)) {
                LI = livro;
                break;
            }
        }
        return LI;
    }
     public boolean AtualizaEstoqueLivro(String isbn) {
        for (Livro livro : livros) {
            if (livro.getIsbn().equals(isbn)) {
                if (livro.getEstoque() > 0) {
                    livro.setEstoque(livro.getEstoque() - 1);
                    return true;
                }
                break;
            }

        }
        return false;
    }

}// fim classe controller
