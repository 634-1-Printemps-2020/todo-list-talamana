import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ToDoList {
    private Tache tache;
    private Map<String,List<Tache>> liste;

    public ToDoList() {
        liste = new HashMap<>();
    }

    public void addTDL(String nom,List<Tache> taches){
        liste.put(nom,taches);
    }
    public List<Tache> getListePersonne(String nom){
        return liste.get(nom);
    }
}
