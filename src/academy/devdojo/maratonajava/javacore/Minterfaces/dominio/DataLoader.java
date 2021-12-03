package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {
    void load();
    int MAX_DATA_SIZE = 10;
    default void checkPermission(){
        System.out.println("Fazendo a checagem de permissões");
    }

    static void retriveMaxDataSize(){
        System.out.println("Dentro da retriveMaxDataSize na interface");
    }
}
