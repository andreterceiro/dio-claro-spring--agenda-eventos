import java.time.LocalDate;
import java.time.Month;
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

    /**
     * Method to get the next event (based on today)
     *
     * @return Returns the next event or null if the niternal map has
     *         only events in past or do not have events
     */
    public Evento obterProximoEvento() {
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for (Map.Entry<LocalDate, Evento> evento: eventosTreeMap.entrySet()) {
            if (evento.getKey().isEqual(dataAtual) || evento.getKey().isAfter(dataAtual)) {
                return evento.getValue();
            }
        }
        return null;
    }

    /**
     * Method to execute manual tests in this class
     *
     * @param args Arguments to be passed through CLI (ignored)
     */
    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.exibirAgenda();

        agendaEventos.adicionarEvento(
            LocalDate.of(2000, Month.JULY, 10),
            "1. Show do Terra Samba",
            "Terra Samba"
        );

        agendaEventos.adicionarEvento(
            LocalDate.of(2001, Month.JANUARY, 1),
            "2. Show do Molejo - tributo a Bach",
            "Molejão"
        );

        agendaEventos.adicionarEvento(
            LocalDate.of(2040, Month.FEBRUARY, 20),
            "3. Dueto Iron Maiden e Rio Negro & Solimões",
            "Duetos inesquecíveis"
        );

        agendaEventos.adicionarEvento(
            LocalDate.of(2033, Month.MARCH, 15),
            "4. Aulas do Bonde Do Tigrão (hits como só as cachorras)",
            "Bonde do Tigrão"
        );

        agendaEventos.exibirAgenda();

        System.out.println(agendaEventos.obterProximoEvento());
    }
}