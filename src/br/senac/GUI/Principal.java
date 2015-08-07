
package br.senac.GUI;

import br.senac.dao.ClienteDAO;
import br.senac.dao.GerenteDAO;
import br.senac.model.Cliente;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Principal {

        
    ClienteDAO cliDAO = new ClienteDAO();
    GerenteDAO geDAO = new GerenteDAO();
    Cliente cli = new Cliente();
    int opcao;

    String nome;
    int cont = 0;  
    
    public void menu(){
        
        String menu = "\n::BANCO SENAC::\n"
                    + "1- Gerente\n"
                    + "2- Cliente\n"
                    + "0- Sair\n"
                    + "Escolha uma das opções acima:";
        do{
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
            
            switch (opcao){
                case 1:
                    menu2();
                    break;
                 case 2:
                    menu3();
                    break;    
                 case 0:
                     break;
                 default:
                     JOptionPane.showMessageDialog(null,"O numero digitado não é permitido");
            }
            
        }while(opcao != 0);  
}
    
    public void menu2(){
        //Scanner entrada = new Scanner(System.in);
 
        String menu2 = "\n::BANCO SENAC::\n"
                    + "1- Cadastrar clientes\n"
                    + "2- Buscar cliente\n"
                    + "3- Ver todos os clientes\n"
                    + "4- Excluir cliente\n"
                    + "0- Voltar para o menu inicial\n"
                    + "Escolha uma das opções acima:";
        do{
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu2));

            switch (opcao){
                case 1:
                    
                    cli.setNome(JOptionPane.showInputDialog("Insira o nome do Cliente:"));

                    cli.setCpf(JOptionPane.showInputDialog("Insira o CPF:"));

                    cli.setAgencia(Integer.parseInt(JOptionPane.showInputDialog("Digite a agência: ")));
                    
                    cli.setConta(Integer.parseInt(JOptionPane.showInputDialog("Digite a conta: ")));

                    cli.setLogin(JOptionPane.showInputDialog("Digite o login: "));

                    cli.setSenha(JOptionPane.showInputDialog("Digite a senha: "));
                    
                    geDAO.cadastrarCliente(cli);
                    break;
                case 2:
                    JOptionPane.showInputDialog("Digite o cliente a ser encontrado: ");
                    
                    Cliente cliente =  geDAO.buscarCliente(cli); 
                    
                    JOptionPane.showMessageDialog(null, cliente.toString());
                    break;  
                case 3:
                    //atualizar();
                    break;
                case 4:
                  // excluir();
                    break;  
                 case 0:
                     menu();
                     break;
                 default:
                     JOptionPane.showMessageDialog(null, "O numero digitado não é permitido");
                     //System.out.println();
            }
            
        }while(opcao != 0);  
    }     
     public void menu3(){
        //Scanner entrada = new Scanner(System.in);
 
        String menu3 = "\n:: BANCO SENAC::\n"
                    + "1- Sacar\n"
                    + "2- Depositar\n"
                    + "3- Ver Saldo\n"
                    + "4- Transferir\n"
                    + "0- Voltar para o menu inicial\n"
                    + "Escolha uma das opções acima:";
        do{
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu3));
            //System.out.print(menu2);
            //opcao = entrada.nextInt();
            
            switch (opcao){
                case 1:
                   // sacar();
                    break;
                case 2:
                   // depositar();
                    break;  
                case 3:
                   // saldo();
                    break;
                case 4:
                  // transferir();
                    break;  
                 case 0:
                     menu();
                     break;
                 default:
                     JOptionPane.showMessageDialog(null, "O numero digitado não é permitido");
                     //System.out.println();
            }
            
        }while(opcao != 0);  
    }
}
