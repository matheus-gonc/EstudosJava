package academy.devdojo.maratonajava.intruducao;
/*
    Prática
    Crie variéveis para os campos descritos abaixo entre e imprima a seguinte mensagem:
    "Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salário>, na data <data>"
 */

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Kuririn";
        String endereco = "Rua das Esferas Estreladas";
        double salario = 5432.45;
        String dataRecebimentoSalario = "20/12/2026";

        String relatorio = "Eu "+nome+", morando no endereço "+endereco+", confirmo que recebi o salário de R$"+salario+", na data "+dataRecebimentoSalario;
        System.out.println(relatorio);
    }
}
