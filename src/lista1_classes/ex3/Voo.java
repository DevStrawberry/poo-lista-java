package lista1_classes.ex3;

import lista1_classes.ex2.Data;
import java.time.LocalTime;

public class Voo {
    private int numeroDoVoo;
    private Data dataVoo;
    private LocalTime horaVoo;
    private int[] ocupacaoVoo = new int[100];

    public Voo(int numeroDoVoo, Data dataVoo, LocalTime horaVoo) {
        this.numeroDoVoo = numeroDoVoo;
        this.dataVoo = dataVoo;
        this.horaVoo = horaVoo;
    }

    public int proximoLivre() {
        for (int i = 0; i < 100; i++) {
            if (ocupacaoVoo[i] == 0) {
                return i+1;
            }
        }
        return 0;
    }

    public boolean verifica(int numAssento) {
        if (numAssento < 1 || numAssento > 100) {
            throw new IllegalArgumentException("Número de assento inválido: " + numAssento);
        }

        return ocupacaoVoo[numAssento - 1] == 1;
    }

    public boolean ocupa(int numAssento) {
        if (numAssento < 1 || numAssento > 100) {
            return false;
        }

        int indice = numAssento - 1;

        if (ocupacaoVoo[indice] == 0) {
            ocupacaoVoo[indice] = 1;
            return true;
        } else {
            return false;
        }
    }

    public int vagas() {
        int numDeCadeirasVagas = 0;
        for (int status : ocupacaoVoo) {
            if (status == 0) {
                numDeCadeirasVagas++;
            }
        }
        return numDeCadeirasVagas;
    }

    public int getNumeroDoVoo() {
        return numeroDoVoo;
    }

    public Data getData() {
        return dataVoo;
    }

    public Voo clonarVoo() {
        Voo cloneVoo = new Voo(this.numeroDoVoo, this.dataVoo.clone(), this.horaVoo);
        cloneVoo.ocupacaoVoo = this.ocupacaoVoo.clone();
        return cloneVoo;
    }
}
