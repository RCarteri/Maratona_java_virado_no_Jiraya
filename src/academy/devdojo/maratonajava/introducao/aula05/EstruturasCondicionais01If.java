package academy.devdojo.maratonajava.introducao.aula05;

public class EstruturasCondicionais01If {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;
        // !
        if (isAutorizadoComprarBebida){
            System.out.println("Autorizado a comprar bebida alcólica");
        }else {
            System.out.println("Não autorizado a comprar bebida alcólica");
        }

        if (!isAutorizadoComprarBebida){
            System.out.println("Não autorizado a comprar bebida alcólica");
        }

        boolean c = true;
        if (c == false){
            System.out.println("Dentro de algo que nunca deve ser feito");
        }
    }
}
