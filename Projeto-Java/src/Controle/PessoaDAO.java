package Controle;


import DAO.DAOPessoa;
import Modelo.Pessoa;
import java.util.ArrayList;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ariél
 */

   public class PessoaDAO implements DAOPessoa {

    private ArrayList lista = new ArrayList();
    
    @Override
    public boolean inserir(Object obj) {
        if (obj instanceof Pessoa) {
            lista.add(obj);
            return true;
        }
        return false;
    }

    @Override
    public boolean excluir(Object obj) {
        boolean resposta = lista.remove(obj);
        return resposta;
    }

    @Override
    public Object pesquisar(Object obj) {
        String cpf;
        if (obj != null && obj instanceof String) {
            cpf = (String) obj;
            for (int i = 0; i < lista.size(); i++) {
                Pessoa p = (Pessoa) lista.get(i);
                if (p.getCpf().equals(cpf)) {
                    return p;
                }
            }
        }
        return null;
    }
   /* //Não consegui converter o Caledar para inteiroentão implementeção não fora atualizada
    public ArrayList pesquisar(int idade) {
         Calendar cal = GregorianCalendar.getInstance();  
      cal.get(Calendar.YEAR);
     ArrayList grupo = new ArrayList();
        Iterator it = lista.iterator();
        while (it.hasNext()) {
            Pessoa p = (Pessoa) it.next();
            
            if (p.getDtNascimento() - Integer.parseInt cal == idade) {
                grupo.add(p);
            }
        }
        return grupo;
    }
*/

    @Override
    public boolean editar(Object obj) {
        return false;
    }
    
} 