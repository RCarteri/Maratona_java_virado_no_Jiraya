package academy.devdojo.maratonajava.javacore.ZZFthreads.teste;

// DeadLock é quando as threads ficam travadas pois estão syncronizadas e uma depende do bloco que a outra está executando pra terminar a sua
public class DeadLockTeste {
    public static void main(String[] args) {
        Object lock1 = new Object();
        Object lock2 = new Object();
        Runnable r1 = () -> {
          synchronized (lock1){
              System.out.println("Thread 1: Segurando lock 1");
              System.out.println("Thread 1: Segurando lock 2");
              synchronized (lock2){
                  System.out.println("Thread 1: Segurando lock 2");
              }
          }
        };
        Runnable r2 = () -> {
            //Para resolver este exemplo, basta inverter os locks desde bloco
            synchronized (lock2){
                System.out.println("Thread 2: Segurando lock 2");
                System.out.println("Thread 2: Segurando lock 1");
                synchronized (lock1){
                    System.out.println("Thread 2: Segurando lock 1");
                }
            }
        };
        new Thread(r1).start();
        new Thread(r2).start();
    }
}
