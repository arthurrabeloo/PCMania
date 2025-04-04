public class Computador {
    String marca;
    float preco;
    HardwareBasico[] hardware;
    SistemaOperacional sistema;
    MemoriaUSB memoriaUSB;

    public Computador(String marca, float preco, HardwareBasico[] hardware, SistemaOperacional sistema, MemoriaUSB memoriaUSB) {
        this.marca = marca;
        this.preco = preco;
        this.hardware = hardware;
        this.sistema = sistema;
        this.memoriaUSB = memoriaUSB; // função das informações do pc
    }

    public void mostraPCConfigs() { //
        System.out.println("Marca: " + marca);
        System.out.println("Preço: R$" + preco);
        System.out.println("Hardware Básico:");
        for (HardwareBasico h : hardware) {
            System.out.println("- " + h.nome + " (" + h.capacidade +
                    (h.nome.contains("RAM") ? "GB" : "MHz") + ")");
        }
        System.out.println("Sistema Operacional: " + sistema.nome + " (" + sistema.tipo + " bits)");
        System.out.println("Acompanha: " + memoriaUSB.nome + " (" + memoriaUSB.capacidade + "GB)");
    } // função que mostra as informações do pc
}