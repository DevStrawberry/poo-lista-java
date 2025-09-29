package lista1_classes.ex1;

public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.setNota1(5.9);
        a1.setNota2(6);
        a1.setNotaTr(6);

        double situacao = a1.provaFinal();
        if (situacao == 0) {
            System.out.println("Não precisa fazer prova final.");
        } else {
            String situacaoFormatada = String.format("%.2f", situacao);
            System.out.println("Média foi de " + String.format("%.2f", a1.media()) + ". " +
                    "Então precisa fazer prova final e tirar no mínimo: " + situacaoFormatada + " de 10");
        }

    }
}
