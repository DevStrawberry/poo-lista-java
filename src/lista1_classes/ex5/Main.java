package lista1_classes.ex5;

public class Main {
    public static void main(String[] args) {
        Vetor v1 = new Vetor(3);

        System.out.println("--- Teste de Inserção e Tamanho ---");

        v1.insert("Hello");
        v1.insert("World");

        System.out.println("Tamanho atual do vetor (size()): " + v1.size());

        System.out.println("Elemento na posição 1 (get(1)): " + v1.get(1));

        System.out.println("Elemento na posição 3 (get(3)): " + v1.get(3));

        System.out.println("\n--- Teste de Redimensionamento ---");
        v1.insert("Java");
        v1.insert("Dynamic");

        System.out.println("Novo tamanho após redimensionamento (size()): " + v1.size());
        System.out.println("Capacidade atual (length): " + v1.getLength());
    }
}