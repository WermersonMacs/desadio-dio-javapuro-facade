package subsistema2.cep; // Define o pacote do subsistema 2, relacionado à API de CEP

public class CepApi { // Declaração da classe CepApi

    // Cria uma instância única da própria classe (implementação de singleton)
    private static CepApi instancia = new CepApi();

    // Construtor privado para impedir a criação de múltiplas instâncias
    private CepApi() {
        super(); // Chama o construtor da superclasse (Object)
    }

    // Método público para acessar a instância única da classe
    public static CepApi getInstancia() {
        return instancia;
    }

    // Método que simula a recuperação da cidade com base no CEP informado
    public String recuperarCidade(String cep) {
        return "Missão Velha";
    }

    // Método que simula a recuperação do estado com base no CEP informado
    public String recuperarEstado(String cep) {
        return "CE";
    }
}
