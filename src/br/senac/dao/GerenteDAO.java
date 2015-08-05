
package br.senac.dao;

import br.senac.model.Cliente;
import java.util.ArrayList;

public class GerenteDAO {
    
    ClienteDAO cDAO = new ClienteDAO();
    
    public void cadastrarCliente(Cliente cliente){
     cDAO.clientes.add(cliente);
    }
    
    public void excluirCliente(Cliente cliente){
        boolean encontrado = false;
        for(Cliente c : cDAO.clientes){
            if(cliente.equals(c)){
                cDAO.clientes.remove(cliente);
                encontrado = true;
                break;
            }
        }
        if (!encontrado)
            System.out.println("Usuário não encontrado!!");
    }
    
    public Cliente buscarCliente(Cliente cliente){
        return null;
    }
    
    public ArrayList<Cliente> buscarTodos(){
        return null;
    }
}
