package academy.devdojo.maratonajava.javacore.Ycolecoes.Dominio;

public class Smartphone {
    private String serialNumber;
    private String marca;

    public Smartphone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    /*
    HashCode é um número que vai ser gerado, de preferência unico. Quando implementa o hashcode tem que dar match no equals
        Regras para sobrescrever o hashCode tem que ser:
        se x.equals(y) == true, y.hashCode() == x.hashCode()
        y.hashCode() == x.hashCode() não necessariamente y.equals(x) == true
        x.equals(y) == false o hashCode() tem que ser diferente
        y.hashCode() != x.hashCode() x.hashCode(y) deverá ser false
      */
    @Override
    public int hashCode() {
        return serialNumber == null ? 0 : this.serialNumber.hashCode();
    }

    /*
        Regras para sobrescrever o equals tem que ser:
        Reflexivo: x.equals(x) tem que ser true pra tudo que for diferente de null
        Simétrico: para x e y diferentes de null, se x.equals(y) == true logo, y.equals(x) == true
        Transitividade: para x, y, z diferentes de null, se x.equals(y) == true, e x.equals(z) == true logo, y.equals(z) == true
        Consistente: x.equals(x) sempre retorna true se x diferente de null
        para x difrente de null, x.equals(null) tem que retornar false
         */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;
        Smartphone smartphone = (Smartphone) obj;
        return serialNumber != null && serialNumber.equals(smartphone.serialNumber);
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "serialNumber='" + serialNumber + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
