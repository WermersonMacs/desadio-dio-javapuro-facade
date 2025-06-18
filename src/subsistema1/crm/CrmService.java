package subsistema1.crm; // Define o pacote do subsistema 1, relacionado ao CRM

public class CrmService { // Declaração da classe CrmService

    // Construtor privado para evitar instanciamento da classe
    private CrmService() {
        super(); // Chama o construtor da superclasse (Object, neste caso)
    }

    // Método estático para gravar os dados do cliente no sistema CRM
    public static void gravarCliente(String nome, String cep, String cidade, String estado) {
        // Imprime mensagens simulando o salvamento dos dados do cliente
        System.out.println("Cliente salvo no sistema CRM.");
        System.out.println(nome);
        System.out.println(cep);
        System.out.println(cidade);
        System.out.println(estado);
    }
}
