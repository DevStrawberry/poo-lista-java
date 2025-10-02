package lista1_classes.ex6;

import java.util.Arrays;
import java.util.Comparator;

public class VetorOrdenado {
    private int length;
    private String[] vetor;
    private int size = 0;

    private static final Comparator<String> COMPARATOR = String.CASE_INSENSITIVE_ORDER;

    public VetorOrdenado(int initialLenght) {
        if (initialLenght < 1) {
            initialLenght = 1;
        }
        this.length = initialLenght;
        this.vetor = new String[this.length];
    }

    public void insert(String s) {
        if (size < length) {
            vetor[size] = s;
            size++;
            Arrays.sort(vetor, 0, size, COMPARATOR);
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
            this.size++;
            Arrays.sort(vetor, 0, size, COMPARATOR);
            System.out.println("Vetor redimensionado para capacidade: " + newlength);
        }
    }

    public VetorOrdenado merge(VetorOrdenado v) {
        int newSize = this.size + v.size;
        VetorOrdenado aux = new VetorOrdenado(newSize);
        for (int i = 0; i < this.size; i++) {
            aux.vetor[i] = this.vetor[i];
        }
        for (int i = 0; i < v.size; i++) {
            aux.vetor[this.size + i] = v.vetor[i];
        }
        aux.size = newSize;
        Arrays.sort(aux.vetor, 0, aux.size, COMPARATOR);
        return aux;
    }

    public String get(int posicao) {
        if (posicao >= 0 && posicao < size) {
            return vetor[posicao];
        } else {
            return null;
        }
    }

    public int size() {
        return size;
    }

    public int getLength() {
        return length;
    }
}
