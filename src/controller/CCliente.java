/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Cliente;

/**
 *
 * @author 182120023
 */
public class CCliente {

    ArrayList<Cliente> clientes = new ArrayList<>();
    int idCliente = 1;

    /**
     * geraID gerencia a geração dos IDs AutoIncrement para cliente
     *
     * @return
     */
    public int geraID() {
        return this.idCliente++;
    }

    /**
     * addCliente adiciona um cliente na lista de clientes
     *
     * @param c
     */
    public void addCliente(Cliente c) {
        this.clientes.add(c);
    }

    /**
     * getClientes retorna alista de clientes
     *
     * @return
     */
    public ArrayList<Cliente> getClientes() {
        return this.clientes;
    }

    /**
     * removeCliente remove cliente da lista de clientes
     *
     * @param c
     */
    public void removeCliente(Cliente c) {
        this.clientes.remove(c);
    }

    /**
     * mock clientes inicializa aplicação com clientes.
     */
    public void mockClientes() {
        Cliente c1 = new Cliente();
        c1.setIdCliente(this.geraID());
        c1.setNomeCliente("Juvenal das Candongas");
        c1.setCpf("123456789");
        c1.setEndereco("Rua das Oliveiras");
        c1.setTelefone("51987456321");
        this.addCliente(c1);

        Cliente c2 = new Cliente();
        c2.setIdCliente(this.geraID());
        c2.setNomeCliente("Barba Negra");
        c2.setCpf("745698547");
        c2.setEndereco("Rua das Floris");
        c2.setTelefone("5100000000");
        this.addCliente(c2);
    }

    /**
     * Pesquisa cliente pelo CPF e retorna o cliente. e caso nao encontre,
     * retorna nulo podendo cadastrar.
     *
     * @param cpf
     * @return
     */
    public Cliente getClienteCPF(String cpf) {
        Cliente c = null;
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                c = cliente;
                break;
            }
        }
        return c;
    }

}// fim classe controller
