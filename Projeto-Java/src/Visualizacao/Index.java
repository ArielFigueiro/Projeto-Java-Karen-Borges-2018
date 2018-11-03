package Visualizacao;

import Controle.PessoaDAO;
import Modelo.Pessoa;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ariél
 */
public class Index {
    public static void main(String[] args) {
        
        PessoaDAO cadastro = new PessoaDAO();
        int opcao;
                
        do {
            String input = JOptionPane.showInputDialog(null,
                    "Escolha opção: \n"
                    + "1 - Inserir\n"
                    + "2 - Excluir\n"
                    + "3 - Pesquisar por CPF\n"
                    + "4 - Pesquisar por idade\n"
                    + "5 - Sair");

                    opcao = new Integer(input);
                    
                    String nome;
                    String i;
                    int idade;
                    String cpf;

                    switch(opcao) {
                        case 1:
                            nome = JOptionPane.showInputDialog(null, "Informe o nome");
                            i = JOptionPane.showInputDialog(null, "Informe a idade");
                            idade = Integer.parseInt(i);
                            cpf = JOptionPane.showInputDialog(null, "Informe o CPF");
                            Pessoa p = new Pessoa(nome, cpf, idade);
                            cadastro.inserir(p);
                            break;
                        case 2:
                            cpf = JOptionPane.showInputDialog(null, "Informe o cpf");
                            p = (Pessoa) cadastro.pesquisar(cpf);
                            cadastro.excluir(p);
                            break;
                        case 3:
                            cpf = JOptionPane.showInputDialog(null, "Informe o CPF");
                            p = (Pessoa) cadastro.pesquisar(cpf);
                            JOptionPane.showMessageDialog(null, "Dados encontrados: " + p);
                            break;
                        case 4:
                            i = JOptionPane.showInputDialog(null, "Informe a idade");
                            idade = Integer.parseInt(i);
                          /*  ArrayList lista = cadastro.pesquisar(idade);
                            for (int j = 0; j < lista.size(); j++) {
                                p = (Pessoa) lista.get(j);
                                JOptionPane.showMessageDialog(null, "Dados encontrados: " + p);
                           } */
                            break;
                        case 5:
                            System.exit(0);
                        default:
                            JOptionPane.showMessageDialog(null, "Opção inválida");
                    }
        } while (opcao != 5);
        
    }
    
 }