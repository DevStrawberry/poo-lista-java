package lista1_classes.ex5;

public class Vetor {
    private int length;
    private String[] vetor;
    private int indiceVetor = 0;


    public Vetor(int initialLenght) {
        if (initialLenght < 1) {
            initialLenght = 1;
        }
        this.length = initialLenght;
        this.vetor = new String[this.length];
    }

    public void insert(String s) {
        if (indiceVetor < length) {
            vetor[indiceVetor] = s;
            indiceVetor++;
        } else {
            int newlength = length * 2;
            String[] novoVetor = new String[newlength];
            int i = 0;
            for (i = 0; i < length; i++) {
                novoVetor[i] = vetor[i];
            }
            novoVetor[i] = s;
            this.vetor = novoVetor;
            this.length = newlength;
            this.indiceVetor++;
            System.out.println("Vetor redimensionado para capacidade: " + newlength);
        }
    }

    public String get(int posicao) {
        if (posicao >= 0 && posicao < indiceVetor) {
            return vetor[posicao];
        } else {
            return null;
        }
    }

    public int size() {
        return indiceVetor;
    }

    public int getLength() {
        return length;
    }
}
