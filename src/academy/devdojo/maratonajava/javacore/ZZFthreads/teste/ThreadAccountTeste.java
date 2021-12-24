package academy.devdojo.maratonajava.javacore.ZZFthreads.teste;

import academy.devdojo.maratonajava.javacore.ZZFthreads.dominio.Account;

public class ThreadAccountTeste implements Runnable{
    private Account account = new Account();

    public static void main(String[] args) {
        ThreadAccountTeste threadAccountTeste = new ThreadAccountTeste();
        Thread t1 = new Thread(threadAccountTeste, "Hestia");
        Thread t2 = new Thread(threadAccountTeste, "Bell Cranel");
        t1.start();
        t2.start();
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withdrawal(10);
            if (account.getBalance() < 0){
                System.out.println("Fodeo");
            }
        }
    }
    private void withdrawal(int amount){
        System.out.println(getThreadName() + " ### fora do synchronized");
        // A partir daqui somente uma thread pode por vez pode rodar esse bloco, pois só uma vai poder acessar o objeto account
        synchronized (account) {
            System.out.println(getThreadName() + " *** dentro do synchronized");
            if (account.getBalance() >= amount) {
                System.out.println(getThreadName() + " está indo sacar dinheiro");
                account.withdrawal(amount);
                System.out.println(getThreadName() + " completou o saque, valor atual da conta " + account.getBalance());
            } else {
                System.out.println("Sem dinheiro para " + getThreadName() + " efetuar o saque " + account.getBalance());
            }
        }
    }
    private String getThreadName(){
        return Thread.currentThread().getName();
    }

}
