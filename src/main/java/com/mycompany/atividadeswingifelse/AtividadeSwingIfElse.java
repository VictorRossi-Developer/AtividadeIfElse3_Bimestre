import javax.swing.JOptionPane;

public class AtividadeSwingIfElse {

    public static void main(String[] args) {
        int opcao;

        do {
            String menu = """
                Escolha uma opção:
                1 - Comparar distâncias entre cidades (==)
                2 - Verificar qual cidade é mais distante (>)
                3 - Verificar qual cidade é menos distante (<)
                4 - Verificar se distâncias são diferentes (<>)
                5 - Comparar ano de carros (>=)
                6 - Comparar resolução de computadores (<=)
                0 - Sair
                """;

            String inputMenu = JOptionPane.showInputDialog(menu);
            if (inputMenu == null) break; // se cancelar, sai 

            opcao = Integer.parseInt(inputMenu);

            switch (opcao) {
                case 1 -> compararIgualDistancia();
                case 2 -> compararMaiorDistancia();
                case 3 -> compararMenorDistancia();
                case 4 -> compararDiferenteDistancia();
                case 5 -> compararAnoCarros();
                case 6 -> compararResolucao();
                case 0 -> JOptionPane.showMessageDialog(null, "Encerrando...");
                default -> JOptionPane.showMessageDialog(null, "Opção inválida!");
            }

        } while (true);
    }

    // == Igual
    static void compararIgualDistancia() {
        int d1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a distância da primeira cidade (km):"));
        int d2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a distância da segunda cidade (km):"));

        if (d1 == d2) JOptionPane.showMessageDialog(null, "As distâncias são iguais (==).");
        else JOptionPane.showMessageDialog(null, "As distâncias não são iguais.");
    }

    // > Maior
    static void compararMaiorDistancia() {
        int d1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a distância da primeira cidade (km):"));
        int d2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a distância da segunda cidade (km):"));

        if (d1 > d2) JOptionPane.showMessageDialog(null, "A primeira cidade está mais distante (>).");
        else JOptionPane.showMessageDialog(null, "A primeira cidade não é mais distante que a segunda.");
    }

    // < Menor
    static void compararMenorDistancia() {
        int d1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a distância da primeira cidade (km):"));
        int d2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a distância da segunda cidade (km):"));

        if (d1 < d2) JOptionPane.showMessageDialog(null, "A primeira cidade está mais próxima (<).");
        else JOptionPane.showMessageDialog(null, "A primeira cidade não é mais próxima que a segunda.");
    }

    // <> Diferente
    static void compararDiferenteDistancia() {
        int d1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a distância da primeira cidade (km):"));
        int d2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a distância da segunda cidade (km):"));

        if (d1 != d2) JOptionPane.showMessageDialog(null, "As distâncias são diferentes (<> ou !=).");
        else JOptionPane.showMessageDialog(null, "As distâncias são iguais.");
    }

    // >= Maior igual (ano de carros)
    static void compararAnoCarros() {
        String carro1 = JOptionPane.showInputDialog("Digite a marca do primeiro carro:");
        int ano1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do primeiro carro:"));

        String carro2 = JOptionPane.showInputDialog("Digite a marca do segundo carro:");
        int ano2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do segundo carro:"));

        if (ano1 >= ano2) JOptionPane.showMessageDialog(null, carro1 + " é mais novo ou do mesmo ano que " + carro2 + " (>=).");
        else JOptionPane.showMessageDialog(null, carro1 + " é mais antigo que " + carro2 + ".");
    }

    // <= Menor igual (resolução de computadores)
    static void compararResolucao() {
        int r1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a resolução horizontal do primeiro computador:"));
        int r2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a resolução horizontal do segundo computador:"));

        if (r1 <= r2) JOptionPane.showMessageDialog(null, "O primeiro computador tem resolução menor ou igual que o segundo (<=).");
        else JOptionPane.showMessageDialog(null, "O primeiro computador tem resolução maior que o segundo.");
    }
}
