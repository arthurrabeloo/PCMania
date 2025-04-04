import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matricula = 384; // minha matrícula

        // Promoção 1 apple, inserindo todos os dados da tabela
        HardwareBasico processadorApple = new HardwareBasico("Pentium Core i3", 2200);
        HardwareBasico ramApple = new HardwareBasico("Memória RAM", 8);
        HardwareBasico hdApple = new HardwareBasico("HD", 500);
        HardwareBasico[] hardwareApple = new HardwareBasico[3];
        hardwareApple[0] = processadorApple;
        hardwareApple[1] = ramApple;
        hardwareApple[2] = hdApple;
        SistemaOperacional soApple = new SistemaOperacional("Linux Ubuntu", 32);
        MemoriaUSB usbApple = new MemoriaUSB("Pen-drive", 16);
        Computador promocaoApple = new Computador("Apple", matricula, hardwareApple, soApple, usbApple);

        // Promoção 2 samsung, inserindo todos os dados da tabela
        HardwareBasico processadorSamsung = new HardwareBasico("Pentium Core i5", 3370);
        HardwareBasico ramSamsung = new HardwareBasico("Memória RAM", 16);
        HardwareBasico hdSamsung = new HardwareBasico("HD", 1000);
        HardwareBasico[] hardwareSamsung = new HardwareBasico[3];
        hardwareSamsung[0] = processadorSamsung;
        hardwareSamsung[1] = ramSamsung;
        hardwareSamsung[2] = hdSamsung;
        SistemaOperacional soSamsung = new SistemaOperacional("Windows 8", 64);
        MemoriaUSB usbSamsung = new MemoriaUSB("Pen-drive", 32);
        Computador promocaoSamsung = new Computador("Samsung", matricula + 1234, hardwareSamsung, soSamsung, usbSamsung);

        // Promoção 3 dell inserindo todos os dados da tabela
        HardwareBasico processadorDell = new HardwareBasico("Pentium Core i7", 4500);
        HardwareBasico ramDell = new HardwareBasico("Memória RAM", 32);
        HardwareBasico hdDell = new HardwareBasico("HD", 2000);
        HardwareBasico[] hardwareDell = new HardwareBasico[3];
        hardwareDell[0] = processadorDell;
        hardwareDell[1] = ramDell;
        hardwareDell[2] = hdDell;
        SistemaOperacional soDell = new SistemaOperacional("Windows 10", 64);
        MemoriaUSB usbDell = new MemoriaUSB("HD Externo", 1000);
        Computador promocaoDell = new Computador("Dell", matricula + 5678, hardwareDell, soDell, usbDell);

        // array das promoções apple, samsung e dell
        Computador[] promocoes = new Computador[3];
        promocoes[0] = promocaoApple;
        promocoes[1] = promocaoSamsung;
        promocoes[2] = promocaoDell;

        // coloquei com meu nome fixo, nao sei porque nao consegui adicionar cpf
        Cliente cliente = new Cliente("Arthur", 0, 10);

        // menu na saida
        int opcao;
        do {
            System.out.println("\n--- Promoções PC Mania ---");
            for (int i = 0; i < promocoes.length; i++) {
                System.out.println((i + 1) + " - " + promocoes[i].marca + " (R$" + promocoes[i].preco + ")");
            }
            System.out.println("0 - Finalizar compra");
            System.out.print("Escolha uma promoção: ");
            opcao = scanner.nextInt();

            if (opcao >= 1 && opcao <= promocoes.length) {
                cliente.addComputador(promocoes[opcao - 1]);
                System.out.println(promocoes[opcao - 1].marca + " adicionado ao carrinho.");
            } else if (opcao != 0) {
                System.out.println("Opção inválida.");
            }
        } while (opcao != 0); // menu de compras feito dentro de um while(nao consegui por for)

        // nota fiscal saida
        System.out.println("\n--- NOTA FISCAL ---");
        cliente.mostraNotaFiscal();
        System.out.println("\nTotal da compra: R$" + cliente.calculaTotalCompra());
    }
}

// professor deixei tudo comentado pra saber onde estava cada promoção e informação quando estava procurando
// nao sei onde eu cliquei que meus atributos na main ficaram cinza aqui na main(mas acho que ta certo)
// a saida ficou repetindo duas vezes tambem nao consegui corrigir(total da compra)