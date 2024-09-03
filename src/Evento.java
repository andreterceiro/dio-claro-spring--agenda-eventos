/**
 * A class that represents an event
 */
public class Evento {
    /**
     * Name of the event
     */
    private String nome;

    /**
     * Attraction of the event
     */
    private String atracao;

    /**
     * Constructor
     * 
     * @param nome    Name of the event
     * @param atracao Attraction of the event
     */
    public Evento(String nome, String atracao) {
        this.nome = nome;
        this.atracao = atracao;
    }

    /**
     * Getter of this.nome
     * 
     * @return this.nome
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * Getter of this.atracao
     *  
     * @return this.atracao
     */
    public String getAtracao() {
        return this.atracao;
    }

    /**
     * Method that help in the task of transform an object of this class in a string
     * 
     * @return A string representation of an object of this class
     */
    public String toString() {
        return "{Evento: nome='" + this.getNome() + "   , atracao='" + this.getAtracao() + "}";
    }
}
