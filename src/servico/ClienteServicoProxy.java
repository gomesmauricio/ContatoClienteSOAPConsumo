package servico;

public class ClienteServicoProxy implements servico.ClienteServico {
  private String _endpoint = null;
  private servico.ClienteServico clienteServico = null;
  
  public ClienteServicoProxy() {
    _initClienteServicoProxy();
  }
  
  public ClienteServicoProxy(String endpoint) {
    _endpoint = endpoint;
    _initClienteServicoProxy();
  }
  
  private void _initClienteServicoProxy() {
    try {
      clienteServico = (new servico.ClienteServicoImplServiceLocator()).getClienteServicoImplPort();
      if (clienteServico != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)clienteServico)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)clienteServico)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (clienteServico != null)
      ((javax.xml.rpc.Stub)clienteServico)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public servico.ClienteServico getClienteServico() {
    if (clienteServico == null)
      _initClienteServicoProxy();
    return clienteServico;
  }
  
  public servico.RetornoCadastroCliente pesquisar(java.lang.String arg0) throws java.rmi.RemoteException{
    if (clienteServico == null)
      _initClienteServicoProxy();
    return clienteServico.pesquisar(arg0);
  }
  
  public servico.RetornoCadastroCliente inserir(servico.Cliente arg0) throws java.rmi.RemoteException{
    if (clienteServico == null)
      _initClienteServicoProxy();
    return clienteServico.inserir(arg0);
  }
  
  public servico.RetornoCadastroCliente alterar(servico.Cliente arg0) throws java.rmi.RemoteException{
    if (clienteServico == null)
      _initClienteServicoProxy();
    return clienteServico.alterar(arg0);
  }
  
  public servico.RetornoCadastroCliente remover(java.lang.String arg0) throws java.rmi.RemoteException{
    if (clienteServico == null)
      _initClienteServicoProxy();
    return clienteServico.remover(arg0);
  }
  
  public servico.RetornoCadastroCliente listarTodos() throws java.rmi.RemoteException{
    if (clienteServico == null)
      _initClienteServicoProxy();
    return clienteServico.listarTodos();
  }
  
  
}