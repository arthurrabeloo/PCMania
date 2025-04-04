public class Cliente {
    String nome;
    long cpf;
    Computador[] computadoresComprados;
    int numComputadores = 0;

    public Cliente(String nome, long cpf, int maxComputadores) {
        this.nome = nome;
        this.cpf = cpf;
        this.computadoresComprados = new Computador[maxComputadores];
    } // função do cliente

    public void addComputador(Computador pc) {
        computadoresComprados[numComputadores++] = pc;
    } // função pra adicionar um pc

    public float calculaTotalCompra() {
        float total = 0;
        for (int i = 0; i < numComputadores; i++) {
            total += computadoresComprados[i].preco;
        }
        return total; // função pra calcular o total da compra
    }

    public void mostraNotaFiscal() {
        System.out.println("PCs comprados:");
        for (int i = 0; i < numComputadores; i++) {
            computadoresComprados[i].mostraPCConfigs();
            System.out.println("-------------------");
        }
        System.out.println("Total da compra: R$" + calculaTotalCompra()); // função para a nota fiscal
    }
}