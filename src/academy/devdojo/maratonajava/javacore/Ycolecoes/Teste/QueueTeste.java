package academy.devdojo.maratonajava.javacore.Ycolecoes.Teste;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTeste {
    public static void main(String[] args) {
        //A classe que adicionar a Queue precisa ter o método comparable
        Queue<String> fila = new PriorityQueue<>();
        fila.add("C");
        fila.add("A");
        fila.add("B");
         //Retorna o primeiro elemento
        System.out.println(fila.peek());
        // Remove o primeiro elemento
        while (!fila.isEmpty()){
            System.out.println(fila.poll());
        }

        System.out.println(fila);
    }
}
