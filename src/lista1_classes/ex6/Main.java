package lista1_classes.ex6;

public class Main {
    public static void main(String[] args) {
        VetorOrdenado v1 = new VetorOrdenado(3);
        VetorOrdenado v2 = new VetorOrdenado(3);

        v1.insert("Ecuador");
        v1.insert("Brasil");
        v1.insert("Argentina");

        System.out.println("Primeiro vetor: ");
        for (int i = 0; i < v1.size(); i++) {
            System.out.println(v1.get(i));
        }

        v2.insert("Russia");
        v2.insert("França");
        v2.insert("Italia");

        System.out.println("\nSegundo vetor: ");
        for (int i = 0; i < v2.size(); i++) {
            System.out.println(v2.get(i));
        }

        VetorOrdenado v3 = v1.merge(v2);
        System.out.println("\nTerceiro vetor: ");
        for (int i = 0; i < v3.size(); i++) {
            System.out.println(v3.get(i));
        }

    }
}
