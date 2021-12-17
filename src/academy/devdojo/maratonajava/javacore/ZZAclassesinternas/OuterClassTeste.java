package academy.devdojo.maratonajava.javacore.ZZAclassesinternas;

public class OuterClassTeste {
    private String name = "Monkey";

    class Inner{
        public void printOuterClassAttribute(){
            System.out.println(name);
            System.out.println(this);
            System.out.println(OuterClassTeste.this);
        }
    }

    public static void main(String[] args) {
        OuterClassTeste outerClass = new OuterClassTeste();
        Inner inner = outerClass.new Inner();
        Inner inner2 = new OuterClassTeste().new Inner();
        inner.printOuterClassAttribute();
        inner2.printOuterClassAttribute();
    }
}
