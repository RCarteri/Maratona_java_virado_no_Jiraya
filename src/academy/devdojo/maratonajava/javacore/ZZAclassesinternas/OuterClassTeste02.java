package academy.devdojo.maratonajava.javacore.ZZAclassesinternas;

public class OuterClassTeste02 {
    private String name = "Midoriya";

    //Os atributos criados aqui (param e lastName) só podem ser do tipo final, não podem receber alterações
    //O método só pode ser final ou abstract
    void print(String param){
        String lastName = "Izuko";
        class LocalClass{
            public void printLocal(){
                System.out.println(param);
                System.out.println(name + " " + lastName);
            }
        }
        // Para chamar uma classe local que foi criada dentro de um metodo, ela precisa ser chamada dentro od método, é o único jeito de usar a classe
        new LocalClass().printLocal();
    }

    public static void main(String[] args) {
        OuterClassTeste02 outer = new OuterClassTeste02();
        outer.print("oi");
    }
}
