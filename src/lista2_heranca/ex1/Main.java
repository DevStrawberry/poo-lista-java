package lista2_heranca.ex1;

import lista1_classes.ex2.Data;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Data data = new Data(20, 05, 2025);
        LocalTime hora = LocalTime.of(11, 00);
        VooModificado v1 = new VooModificado(001, data, hora, 50, 10);

        System.out.println("Número máximo de vagas: " + v1.maxVagas());
        System.out.println("Número de cadeiras de fumantes: " + v1.cadeirasFumantes());

        if (v1.tipo(41) == 'F') {
            System.out.println("O assento é de fumante.");
        } else {
            System.out.println("O assento não é de fumante.");
        }

        System.out.println("Próximo assento livre: " + v1.proximoLivre());

        if (v1.ocupa(6)) {
            System.out.println("Assento foi ocupado com sucesso!");
        } else  {
            System.out.println("Assento não foi ocupado!");
        }

        if (v1.verifica(7)) {
            System.out.println("Assento ocupado!");
        } else {
            System.out.println("Assento disponível!");
        }
    }
}
