package academy.devdojo.maratonajava.javacore.ZZBcomportamento.interfaces;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;

@FunctionalInterface
public interface CarPredicate {
    //lambdas são funções, anônimas e concisas. A interface que ela usa precisa ser funcional ou seja, ter somente um método
    boolean test(Car car);
    // (parâmetro) -> expressão
    //(Car car) -> car.getColor().equals("green);
}
