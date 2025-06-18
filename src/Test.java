import facade.Facade; // Importa a classe Facade, que é responsável por integrar os subsistemas

public class Test { // Declaração da classe Test, usada para testar a funcionalidade da fachada

    public static void main(String[] args) { // Método principal, ponto de entrada da aplicação

        // Cria uma instância da classe Facade
        Facade facade = new Facade();

        // Chama o método migrarCliente passando nome e CEP, o que vai acionar os subsistemas internos
        facade.migrarCliente("Wermerson", "63200000");
    }
}
