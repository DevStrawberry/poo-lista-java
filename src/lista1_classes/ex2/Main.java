package lista1_classes.ex2;

public class Main {
    public static void main(String[] args) {
        try {
            Data d1 = new Data(19,3, 1968);
            Data d2 = new Data(16,4, 1966);

            String d1Formatada = formataData(d1);
            String d2Formatada = formataData(d2);

            int aux = d1.compara(d2);
            if (aux == -1) {
                System.out.println(d1Formatada + " é anterior à " + d2Formatada + ".");
            } else if (aux == 1) {
                System.out.println(d2Formatada + " é anterior à " + d1Formatada + ".");
            } else {
                System.out.println(d1Formatada + " é igual a " + d2Formatada);
            }

            if (d1.isBissexto()) {
                System.out.println(d1Formatada + " é bissexto.");
            } else {
                System.out.println(d1Formatada + " não é bissexto.");
            }

            if (d2.isBissexto()) {
                System.out.println(d2Formatada + " é bissexto.");
            } else {
                System.out.println(d2Formatada + " não é bissexto.");
            }

            Data d3 = d1.clone();
            String d3Formatada = formataData(d3);
            System.out.println("Data 1: " + d1Formatada + " foi corretamente clonada na Data 3: " +d3Formatada);
        } catch (IllegalArgumentException e) {
            System.err.println("Erro ao criar data no Exemplo 1: " + e.getMessage());
        }

        System.out.println("\n--- Teste de Erro ---");

        try {
            Data d3 = new Data(30, 2, 2023);
        } catch (IllegalArgumentException e) {
            System.err.println("Erro detectado com sucesso: " + e.getMessage());
        }
    }

    public static String formataData(Data d) {
        return d.getDia() + "/" + d.getMes() + "/" + d.getAno();
    }
}
