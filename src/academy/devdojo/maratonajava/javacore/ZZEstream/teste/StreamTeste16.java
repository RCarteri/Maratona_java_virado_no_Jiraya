package academy.devdojo.maratonajava.javacore.ZZEstream.teste;

import java.util.stream.LongStream;
import java.util.stream.Stream;
/*
Como avaliar se vale a pena fazer paralelo
- Benchmark
- Unboxin, boxing
- (limit, findFirst não tem como) (findAny tem)
- Custo total da computação N, P
- Quantidade de dados
- Tipo de coleções
- Tamanho do Stream (tamanho definido)
- Processamento merge

if(tarefa for pequena e não pode ser dividida)
faz sequencialmente
else{
divide me duas tarefas
chama o metodo recursivamente
espera todas as tarefas serem completadas
Combina o resultado
 */
public class StreamTeste16 {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        long num = 100_000_000;
        sumFor(num);
        sumStreamIterate(num);
        sumParallelStreamIterate(num);
        sumLongStreamIterate(num);
        sumParallelLongStreamIterate(num);
    }

    private static void sumFor(long num){
        System.out.println("Sum for");
        long result = 0;
        long init = System.currentTimeMillis();
        for(long i = 1; i <= num; i++){
            result += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumStreamIterate(long num){
        System.out.println("sumStreamIterate");
        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L, i -> i + 1).limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumParallelStreamIterate(long num){
        System.out.println("sumParallelStreamIterate");
        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L, i -> i + 1).limit(num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumLongStreamIterate(long num){
        System.out.println("sumLongStreamIterate");
        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L, num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumParallelLongStreamIterate(long num){
        System.out.println("sumLongStreamIterate");
        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L, num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }
}
