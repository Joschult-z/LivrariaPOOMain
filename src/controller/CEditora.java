/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Editora;

/**
 *
 * @author 182120023
 */
public class CEditora {

    ArrayList<Editora> editoras = new ArrayList<>();
    int idEditora = 1;

    /**
     * geraID gerencia a geração dos IDs AutoIncrement para cliente
     *
     * @return
     */
    public int geraID() {
        return this.idEditora++;
    }

    /**
     * addEditora adiciona um cliente na lista de editoras
     *
     * @param c
     */
    public void addEditora(Editora c) {
        this.editoras.add(c);
    }

    /**
     * getEditoras retorna alista de editoras
     *
     * @return
     */
    public ArrayList<Editora> getEditoras() {
        return this.editoras;
    }

    /**
     * removeEditora remove cliente da lista de editoras
     *
     * @param c
     */
    public void removeEditora(Editora c) {
        this.editoras.remove(c);
    }

    /**
     * mock editoras inicializa aplicação com editoras.
     */
    public void mockEditoras() {
        Editora e1 = new Editora();
        e1.setIdEditora(this.geraID());
        e1.setNmEditora("Senac");
        e1.setCnpj("842617846");
        e1.setEndereco("Rua do diluvio");
        e1.setTelefone("51234144");
        e1.setGerente("Juventino");
        this.addEditora(e1);

        Editora e2 = new Editora();
        e2.setIdEditora(this.geraID());
        e2.setNmEditora("Tech");
        e2.setCnpj("745698547");
        e2.setEndereco("Rua da Praia");
        e2.setTelefone("141241141");
        e2.setGerente("Adroaldo");
        this.addEditora(e2);
    }

    /**
     * Pesquisa Editora pelo CNPJ e retorna a editora. e caso nao encontre,
     * retorna nulo podendo cadastrar.
     *
     * @param cnpj
     * @return
     */
    public Editora getEditoraCnpj(String cnpj) {
        Editora e = null;
        for (Editora editora : editoras) {
            if (editora.getCnpj().equals(cnpj)) {
                e = editora;
                break;
            }
        }
        return e;
    }

}// fim classe controller
