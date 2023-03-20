/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.time.LocalDate;
import java.util.ArrayList;
import model.Livro;
import model.VendaLivro;

/**
 *
 * @author 182120023
 */
public class CVendaLivro {

    ArrayList<VendaLivro> vendaLivros = new ArrayList<>();
    int idVendaLivro = 1;

    /**
     * geraID gerencia a geração dos IDs AutoIncrement para cliente
     *
     * @return
     */
    public int geraID() {
        return this.idVendaLivro++;
    }

    /**
     * addVendaLivro adiciona um cliente na lista de vendaLivros
     *
     * @param c
     */
    public void addVendaLivro(VendaLivro vl) {
        this.vendaLivros.add(vl);
    }

    /**
     * getVendaLivros retorna alista de vendaLivros
     *
     * @return
     */
    public ArrayList<VendaLivro> getVendaLivros() {
        return this.vendaLivros;
    }

    /**
     * removeVendaLivro remove cliente da lista de vendaLivros
     *
     * @param c
     */
    public void removeVendaLivro(VendaLivro vl) {
        this.vendaLivros.remove(vl);
    }

    /**
     * mock vendaLivros inicializa aplicação com vendaLivros.
     */
    public void mockVendaLivros() {
        CCliente ccli = new CCliente();
        CLivro cli = new CLivro();
        VendaLivro vl1 = new VendaLivro();
        vl1.setIdVendaLivro(this.geraID());
        vl1.setIdCliente(ccli.getClienteCPF("123456789"));
        vl1.setDataVenda(LocalDate.parse("2023-03-14"));
        ArrayList<Livro> livros1 = new ArrayList<>();
        livros1.add(cli.getLivroISBN("88887448"));
        vl1.setLivros(livros1);
        vl1.setSubTotal((float) 50.00);
        this.addVendaLivro(vl1);

    }

   

}// fim classe controller
