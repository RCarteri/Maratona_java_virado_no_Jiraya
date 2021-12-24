package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.teste;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//Atomico serve para poder usar varias threads ao mesmo tempo mas só uma para realizar a contagem, de forma atômica. Deste modo não precisa do sincronismo
class Counter{
    private int count;
    private AtomicInteger atomicInteger = new AtomicInteger();
    //Lock é gerenciado pela JVM, com o argumento true ele passa a responsabilidade pra thread que está esperando a mais tempo
    // você pode tentar obter o lock com o lock.tryLock(),
    // tem a possibilidade de interromper a thread que esta esperando pelo lock mas o código fica feio como abaixo
    private Lock lock = new ReentrantLock(true);

    void increment(){
        lock.lock();
        try{
            count++;
            atomicInteger.incrementAndGet();
        }finally {
            lock.unlock();
        }
    }

    public int getCount() {
        return count;
    }

    public AtomicInteger getAtomicInteger() {
        return atomicInteger;
    }
}
public class AtomicIntegerTeste {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Runnable r = () -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        };
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(counter.getCount());
        System.out.println(counter.getAtomicInteger());
    }
}
