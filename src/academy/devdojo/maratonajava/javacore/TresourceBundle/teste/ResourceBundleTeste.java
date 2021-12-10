package academy.devdojo.maratonajava.javacore.TresourceBundle.teste;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTeste {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("en", "US"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));
        ResourceBundle bundle2 = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
        System.out.println(bundle2.getString("hello"));
        System.out.println(bundle2.getString("good.morning"));
        /*
        Ordem para buscar os arquivos bundle
        Locale("fr","CA");   neste caso não existe
        messages_fr_CA.properties
        messages_fr.properties
        messages_en_US.properties
        messages_en.properties
        messages.properties
         */
        System.out.println(bundle.getString("hi"));
    }
}
