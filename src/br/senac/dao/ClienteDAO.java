
package br.senac.dao;

import br.senac.model.Cliente;
import java.util.ArrayList;

public class ClienteDAO {
    
    ArrayList<Cliente> clientes = new ArrayList<>();
    
   public void adicionar(Cliente cliente){
       clientes.add(cliente);
   }
    
    public ArrayList<Cliente> buscarTudo(){
        return clientes;
    }
    
    
    public void sacar(float valor){
        
    }
    
    public void depositar(float valor){
        
    }
    
    public void transferir(float valor, Cliente cliente){
        
    }
    
    public void verSaldo(){
        
    }
    
    public Cliente buscarCliente(String cpf){
     return null;   
    }
    
}
