/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author 0082180
 */
public interface DAOPessoa {
    
    public boolean inserir (Object obj);
    
    public boolean excluir (Object obj);
    
    public Object pesquisar (Object obj);
    
    public boolean editar (Object obj);
}
