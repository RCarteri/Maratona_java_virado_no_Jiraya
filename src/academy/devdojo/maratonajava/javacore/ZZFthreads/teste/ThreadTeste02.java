package academy.devdojo.maratonajava.javacore.ZZFthreads.teste;

class ThreadExampleRunnable02 implements Runnable{
    private final String c;

    public ThreadExampleRunnable02(String c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 500; i++) {
            System.out.print(c);
            if (i % 100 == 0){
                System.out.println();
            }
            //Yeld da uma pausa mas não é garantido
            Thread.yield();
        }
    }
}

public class ThreadTeste02 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new ThreadExampleRunnable02("KA"));
        Thread t2 = new Thread(new ThreadExampleRunnable02("ME"));
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        //Faz com que o t2 não seja startado até o t1 não terminar
        t1.join();
        t2.start();


    }
}
