package lista1_classes.ex1;

public class Aluno {
    private String nome;
    private String matricula;
    private double nota1;
    private double nota2;
    private double notaTr;


    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setNotaTr(double notaTr) {
        this.notaTr = notaTr;
    }

    public double media() {
        return (((this.nota1 + this.nota2)*2.5)+(this.notaTr*2))/7;
    }

    public double provaFinal() {
        double media_atual = media();
        if (media_atual >= 6) {
            return 0;
        }
        return 12 - media_atual;
    }

}
