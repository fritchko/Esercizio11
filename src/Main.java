import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Creo una lista immutabile utiliando Arrays.asList.

        List<String> cityNames = Arrays.asList("Naro","Favara","Agrigento");

        // Il programma da errore perché la lista niente può essere aggiunto o rimosso alla lista.

        //Usando il metodo "set", rimpiazzo "Favara" con "Tegucigalpa".

        cityNames.set(1,"Tegucigalpa");

        //Printo il contenuto di cityNames.

        System.out.println(cityNames);

        //Creo una lista MUTABILE, chiamata kingsOfRome.

        List<String> kingsOfRome = new ArrayList<>();

        //Aggiungo i nomi dei 7 Re di Roma.

        kingsOfRome.add("Romulus");
        kingsOfRome.add("Numa Pompilius");
        kingsOfRome.add("Tullus Hostilius");
        kingsOfRome.add("Ancus Marcius");
        kingsOfRome.add("Lucius Tarquinius Priscus");
        kingsOfRome.add("Servius Tullius");
        kingsOfRome.add("Lucius Tarquinius Superbus");

        //Printo il contenuto della lista.

        System.out.println(kingsOfRome);

        //Converto la Lista in Array utilizzando toArray.

        String[] kingsOfRomeArray = kingsOfRome.toArray(new String[0]);

        //Sostituisco Lucius Tarquinius Superbus con Supercar

        kingsOfRomeArray[6] = "Lucius Tarquinius Supercar";

        //Printo il contenuto dell'Array.

        System.out.println(Arrays.toString(kingsOfRomeArray));




    }
}