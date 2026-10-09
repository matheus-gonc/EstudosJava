package academy.devdojo.maratonajava.intruducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;
        // !
        if (isAutorizadoComprarBebida == false) {
            System.out.println("Autorizado a comprar bebida alcolica");
        }else{
            System.out.println("Não Autorizado a comprar bebida alcolica");
        }

        if(!isAutorizadoComprarBebida){ // mesma coisa se utilizar o isAutorizadoComprarBebida == false
            System.out.println("Não Autorizado a comprar bebida alcolica");
        }



    }
}
