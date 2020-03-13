package servico;

import javax.jws.WebParam;
import javax.jws.WebService;

import entidade.AtivarRecursoIn;
import entidade.AtivarRecursoOut;
import entidade.DefaultOut;

@WebService (endpointInterface = "servico.AtivarRecurso")
public class AtivarRecursoImpl  implements AtivarRecurso{
	
	@Override
	public AtivarRecursoOut ativarRecurso(@WebParam(name = "AtivarRecursoIn") AtivarRecursoIn ativarRecursoIn) {
		AtivarRecursoOut ativarRecursoOut = new AtivarRecursoOut();
		DefaultOut defaultOut = new DefaultOut();
		defaultOut.setPOutCode(0);
		defaultOut.setPOutMessage("SUCESSO");
		ativarRecursoOut.setDefaultOut(defaultOut);
		return ativarRecursoOut;		
	}
	
}