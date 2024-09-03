import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * A class that represents a group of events
 */
public class AgendaEventos {
    private Map<LocalDate, Evento> eventosMap;

    /**
     * Constructor
     */
    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    /**
     * Method to add an event to the map
     *
     * @param data    Date of the event
     * @param nome    Name of the event
     * @param atracao Attraction of the event
     */
    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        Evento evento = new Evento(nome, atracao);
        this.eventosMap.put(data, evento);
    }

    /**
     * Prints the events registered in this.eventosMap
     * It method uses internally a TreeMap to order the events
     */
    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(this.eventosMap);
        System.out.println(eventosTreeMap);
    }
}