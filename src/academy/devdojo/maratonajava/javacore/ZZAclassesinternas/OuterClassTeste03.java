package academy.devdojo.maratonajava.javacore.ZZAclassesinternas;

// A classe estática aninhada é como se estivesse fora da classe mãe, mas é feito isso por questão de empacotamento e nela só é possível acessar atributos estticos tbm, por isso teve-se que instanciar para obter o nome
public class OuterClassTeste03 {
    private String name = "Ricardo";

  static class Nested{
      private String lastName = "Carteri";
      void print(){
          System.out.println(new OuterClassTeste03().name + " " + lastName);
      }
  }

    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();
    }
}
