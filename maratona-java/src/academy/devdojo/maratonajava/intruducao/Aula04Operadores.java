package academy.devdojo.maratonajava.intruducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - * /
        int numero01 = 10;
        double numero02 = 20;
        double resultado = numero01 + numero02;
        System.out.println("Valor " + numero02 + numero01);
        System.out.println(numero02 + numero01 + " Valor " + numero02 + numero01);//concatenação depois de string não faz soma, mas ela junta os valores (30) (valor 2010)
        System.out.println(resultado);

        double resultado2 = numero01 / numero02;
        System.out.println(resultado2);

        // % Resto da divisão
        int resto = 21 % 2;
        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualQueVinte = 10 == 20;
        boolean isDezDiferenteQueVinte = 10 != 20;
        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualQueVinte " + isDezIgualQueVinte);
        System.out.println("isDezDiferenteQueVinte " + isDezDiferenteQueVinte);

        // operadores lógicos && (AND), || (OR), ! (NOT)
        // && (and)
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println(isDentroDaLeiMaiorQueTrinta);
        System.out.println(isDentroDaLeiMenorQueTrinta);

        // || (or)
        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystation5Compravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystation5Compravel "+isPlaystation5Compravel);

        // = += -= *= /= %= (++, --
        double bonus = 1800;
        bonus += 1000;
        System.out.println(bonus);
    }
}
