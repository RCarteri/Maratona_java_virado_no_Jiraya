package academy.devdojo.maratonajava.javacore.Oexception.exception.teste;

import academy.devdojo.maratonajava.javacore.Oexception.exception.dominio.LoginInvalidoException;

public class LoginInvalidoExceptionTeste extends Exception{
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }
    private static void logar() throws LoginInvalidoException {
        String userNameDB = "Goku";
        String senhaDB = "ssj";
        String userNameDigitado = "Goku";
        String senhaDigitada = "ssj";
        if (!userNameDB.equals(userNameDigitado) || !senhaDB.equals(senhaDigitada)){
            throw new LoginInvalidoException("Usuario ou senha inválido");
        }
        System.out.println("Usuário logado com sucesso");
    }
}
