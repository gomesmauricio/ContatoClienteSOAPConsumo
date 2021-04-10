/**
 * ClienteServico.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package servico;

public interface ClienteServico extends java.rmi.Remote {
    public servico.RetornoCadastroCliente pesquisar(java.lang.String arg0) throws java.rmi.RemoteException;
    public servico.RetornoCadastroCliente inserir(servico.Cliente arg0) throws java.rmi.RemoteException;
    public servico.RetornoCadastroCliente alterar(servico.Cliente arg0) throws java.rmi.RemoteException;
    public servico.RetornoCadastroCliente remover(java.lang.String arg0) throws java.rmi.RemoteException;
    public servico.RetornoCadastroCliente listarTodos() throws java.rmi.RemoteException;
}
