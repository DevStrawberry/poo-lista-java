package lista2_heranca.ex1;

import lista1_classes.ex2.Data;
import lista1_classes.ex3.Voo;

import java.time.LocalTime;

public class VooModificado extends Voo {
    private int numeroDeVagas;
    private int qntDeCadeirasFumantes;

    int[] vagas;

    public VooModificado(int numeroDoVoo, Data dataVoo, LocalTime horaVoo, int numeroDeVagas, int qntDeCadeirasFumantes) {
        super(numeroDoVoo, dataVoo, horaVoo);
        this.numeroDeVagas = numeroDeVagas;
        this.qntDeCadeirasFumantes = qntDeCadeirasFumantes;
        this.vagas = new int[numeroDeVagas];
    }

    public int maxVagas() { return numeroDeVagas; }

    public int cadeirasFumantes() { return qntDeCadeirasFumantes; }

    public char tipo(int n) {
        int total = numeroDeVagas;
        int inicioAreaDeFumantes = total - this.qntDeCadeirasFumantes + 1;

        if (n >= inicioAreaDeFumantes) {
            return 'F';
        } else {
            return 'N';
        }
    }

    @Override
    public int proximoLivre() {
        for (int i = 0; i < numeroDeVagas; i++) {
            if (vagas[i] == 0) {
                return i+1;
            }
        }
        return 0;
    }

    @Override
    public boolean verifica(int numAssento) {
        if (numAssento < 1 || numAssento > numeroDeVagas) {
            throw new IllegalArgumentException("Número de assento inválido: " + numAssento);
        }

        return vagas[numAssento - 1] == 1;
    }

    @Override
    public boolean ocupa(int numAssento) {
        if (numAssento < 1 || numAssento > numeroDeVagas) {
            return false;
        }

        int indice = numAssento - 1;

        if (vagas[indice] == 0) {
            vagas[indice] = 1;
            return true;
        } else {
            return false;
        }
    }
}
