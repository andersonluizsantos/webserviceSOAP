package servico;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import entidade.AtivarRecursoIn;
import entidade.AtivarRecursoOut;

@WebService
@SOAPBinding(style = Style.RPC)
public interface AtivarRecurso {
	
	@WebMethod(operationName = "ativarRecurso")
	public AtivarRecursoOut ativarRecurso(@WebParam(name = "AtivarRecursoIn") AtivarRecursoIn ativarRecursoIn);

}
