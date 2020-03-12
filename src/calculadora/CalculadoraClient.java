package calculadora;
 
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import entidade.ResponseSoap;
import servico.Servico;

import java.net.URL;
 
class CalculadoraClient {
 
  public static void main(String args[]) throws Exception {
    URL url = new URL("http://localhost:8086/CalculadoraServico/servico?WSDL");
    QName qname = new QName("http://servico/","ServicoImplService");
    Service ws = Service.create(url, qname);
    Servico calculadora = ws.getPort(Servico.class);
    
    ResponseSoap responseSomar = new ResponseSoap();
    responseSomar = calculadora.somar(5,1);
    
    ResponseSoap responseSubstrair = new ResponseSoap();
    responseSubstrair = calculadora.subtrair(5,	3);
    
    ResponseSoap responseMultiplicar = new ResponseSoap();
    responseMultiplicar = calculadora.multiplicar(5,2);
    
    ResponseSoap responseDividir = new ResponseSoap();
    responseDividir = calculadora.dividir(6,3);
 
    System.out.println("Soma (5+1): " + responseSomar.getValorResponse());
    System.out.println("Subtracao (5-3): " + responseSubstrair.getValorResponse());
    System.out.println("Multiplicacao (5*2): " + responseMultiplicar.getValorResponse());
    System.out.println("Divisao (6/3): " + responseDividir.getValorResponse());
 
  }
}
