package Clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerSalvari {

    private List<Salvare> salvari = new ArrayList<Salvare>();

    public void salveaza(Salvare salvare) {
        salvari.add(salvare);
    }

    public Salvare getSalvare(int index) {
        return salvari.get(index);
    }

    public Salvare getLastSalvare() throws Exception {
        if(salvari.size()!=0) {
            Salvare salvare = salvari.get(salvari.size()-1);
            salvari.remove(salvari.size()-1);
            return salvare;
        } else {
            throw new Exception("Nu exista salvari");
        }
    }

}
