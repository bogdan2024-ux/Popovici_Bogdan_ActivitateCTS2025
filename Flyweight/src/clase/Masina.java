package clase;

import interfete.IMasina;

public class Masina implements IMasina {

    private String marca;
    private String model;
    private String culoare;

    public Masina(String marca, String model, String culoare) {
        this.marca = marca;
        this.model = model;
        this.culoare = culoare;
    }

    @Override
    public void afiseaza(String nrInmatriculare, int nrLoc) {
        System.out.println("Mașină: " + marca + " " + model + " (" + culoare + "), "
                + "Număr: " + nrInmatriculare + ", Parcată la locul: " + nrLoc);
    }

}
