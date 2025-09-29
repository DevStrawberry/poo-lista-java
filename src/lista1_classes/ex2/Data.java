package lista1_classes.ex2;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    private static void validaData(int dia, int mes, int ano) {
        if (mes < 1 || mes > 12) {
            throw new IllegalArgumentException("Mês inválido: " + mes + ". O mês deve estar entre 1 e 12.");
        }

        boolean bissexto = (ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0));

        int diasNoMes;

        switch (mes) {
            case 4:
            case 6:
            case 9:
            case 11:
                diasNoMes = 30;
                break;
            case 2:
                diasNoMes = bissexto ? 29 : 28;
                break;
            default:
                diasNoMes = 31;
        }

        if (dia < 1 || dia > diasNoMes) {
            throw new IllegalArgumentException("Dia inválido: " + dia + ". O dia deve estar entre 1 e " + diasNoMes + " para o mês " + mes + " de " + ano + ".");
        }

        if (ano < 1) {
            throw new IllegalArgumentException("Ano inválido: O ano deve ser positivo.");
        }
    }

    public Data(int dia, int mes, int ano) {
        validaData(dia, mes, ano);
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int compara(Data d) {
        if  (d.dia == this.dia && d.mes == this.mes && d.ano == this.ano) {
            return 0;
        } else if (this.ano > d.ano) {
            return 1;
        } else if (this.ano == d.ano && this.mes > d.mes) {
            return 1;
        } else if (this.ano == d.ano && this.mes == d.mes && this.dia > d.dia) {
            return 1;
        } else {
            return -1;
        }
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public String getMesExtenso() {
        switch (mes) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "Invalid value";
        }
    }

    public int getAno() {
        return ano;
    }

    public boolean isBissexto() {
        if (ano % 400 == 0 || (ano % 4 == 0) && (ano % 100 != 0)) {
            return true;
        }  else {
            return false;
        }
    }

    public Data clone() {
        return new Data(dia, mes, ano);
    }
}
