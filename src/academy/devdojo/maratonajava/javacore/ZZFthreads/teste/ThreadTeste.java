package academy.devdojo.maratonajava.javacore.ZZFthreads.teste;

class ThreadExample extends Thread{
    private char c;

    public ThreadExample(char c) {
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
        }
    }
}

class ThreadExampleRunnable implements Runnable{
    private final String c;

    public ThreadExampleRunnable(String c) {
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
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Há dois tipos de threads: Daemon e User
public class ThreadTeste {
    public static void main(String[] args) {
//        ThreadExample t1 = new ThreadExample('A');
//        ThreadExample t2 = new ThreadExample('B');
//        ThreadExample t3 = new ThreadExample('C');
//        ThreadExample t4 = new ThreadExample('D');
        Thread t1 = new Thread(new ThreadExampleRunnable02("A"));
        Thread t2 = new Thread(new ThreadExampleRunnable02("B"));
        Thread t3 = new Thread(new ThreadExampleRunnable02("C"));
        Thread t4 = new Thread(new ThreadExampleRunnable02("D"));
        t4.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        System.out.println("#################" + Thread.currentThread().getName()) ;
    }
}
