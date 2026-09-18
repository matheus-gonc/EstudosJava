package academy.devdojo.maratonajava.intruducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int idade = 10;
        long numeroGrande = 100000L; // mesma coisa que em baixo
        double salarioDouble = 2000.0D; // não é necessário colocar D para numeros double
        float salarioFloat = 2500.0F; // é necessário colocar depois de todo numero decimal (float) a letra F, caso contrário o compilador da erro
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'M'; // char só pode ser uma letra, e não uma palavra
        char carac = 65;
        String nome = "Matheus";
        System.out.println("A idade é "+idade+" anos");
        System.out.println(falso);
        System.out.println("char "+carac);

        System.out.println("Oi meu nome é "+nome);
    }
}