import java.rmi.RemoteException;

import servico.Cliente;
import servico.ClienteServico;
import servico.ClienteServicoProxy;
import servico.Contato;
import servico.RetornoCadastroCliente;


public class Teste {

	public static void main(String[] args) {
		
ClienteServico clienteServico = new ClienteServicoProxy();
		
		Cliente cliente = new Cliente();

//		cliente.setCpf("555589");
//		cliente.setNome("Outra Pessoa3");
//		cliente.setIdade(26);
//		cliente.setSexo("M");
		Contato contato = new Contato();
//		contato.setEmail("cliente@gmail.com");
//		contato.setFone("81 9 8888-9999");
//		cliente.setContato(contato);
		
		
		try {
			RetornoCadastroCliente retorno = clienteServico.inserir(cliente);
			System.out.println("======================================");
			System.out.println(retorno.getMsgRetorno());
			System.out.println("======================================");
			
			retorno = clienteServico.listarTodos();
			System.out.println("======================================");
			
			for (Cliente c : retorno.getRetornoListaCliente()) {
				System.out.println("CPF: "+c.getCpf() + "- Nome: "+ c.getNome());
			}
			
			System.out.println("======================================");
			
		} catch(RemoteException e){
			e.printStackTrace();
		}

	}

	}

