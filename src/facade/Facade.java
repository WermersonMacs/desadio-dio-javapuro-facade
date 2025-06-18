package facade; // Define o pacote onde a classe está localizada

// Importa classes de subsistemas externos (CRM e CEP)
import subsistema1.crm.CrmService;
import subsistema2.cep.CepApi;

public class Facade { // Declaração da classe Facade, que age como fachada para simplificar interações

    // Método público que recebe o nome de um cliente e um CEP para migrar o cliente
    public void migrarCliente(String nome, String cep) {
        // Recupera a cidade a partir do CEP usando o subsistema CepApi
        String cidade = CepApi.getInstancia().recuperarCidade(cep);

        // Recupera o estado a partir do CEP usando o subsistema CepApi
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        // Grava os dados do cliente (nome, cep, cidade, estado) usando o serviço do CRM
        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
