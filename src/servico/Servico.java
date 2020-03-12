package servico;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import entidade.ResponseSoap;

@WebService
@SOAPBinding(style = Style.RPC)
public interface Servico {	
	
	@WebMethod
	public ResponseSoap somar(double valor1, double valor2);
	
	@WebMethod
	public ResponseSoap subtrair(double valor1, double valor2);
	
	@WebMethod
	public ResponseSoap multiplicar(double valor1, double valor2);
	
	@WebMethod
	public ResponseSoap dividir(double valor1, double valor2);
	
}
