package lista1_classes.ex4;

public class Prova {
    private char[] questoes = new char[15];
    private Gabarito gabarito;

    public Prova (Gabarito gabarito) {
        this.gabarito = gabarito;
    }

    private int indiceQuestaoAtual = 0;
    public void respostaAluno(char resposta) {
        if (indiceQuestaoAtual < questoes.length) {
            questoes[indiceQuestaoAtual] = resposta;
            indiceQuestaoAtual++;
        }
    }

    public int acertos() {
        int numDeAcertos = 0;
        for (int i = 0; i < questoes.length; i++) {
            if (questoes[i] == gabarito.respostaQuestao(i+1)) {
                numDeAcertos++;
            }
        }
        return numDeAcertos;
    }

    public double nota() {
        double nota = 0;
        for (int i = 0; i < questoes.length; i++) {
            if (questoes[i] == gabarito.respostaQuestao(i+1)) {
                if (i < 10) {
                    nota += 0.5;
                } else {
                    nota += 1;
                }
            }
        }
        return nota;
    }

    public double maior(Prova p) {
        int thisAcertos = this.acertos();
        int pAcertos = p.acertos();
        double thisNota = this.nota();
        double pNota = p.nota();

        if (thisAcertos > pAcertos) {
            return thisNota;
        } else if (pAcertos > thisAcertos) {
            return pNota;
        } else {
            if (thisNota >= pNota) {
                return thisNota;
            } else {
                return pNota;
            }
        }
    }
}
