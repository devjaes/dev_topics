import java.util.LinkedList;
import java.util.Stack;

public class Destination {
    public DestinationEnum destiny;
    private Stack<Traveler> waitingTravelers;
    private LinkedList<Flights> flights;

    public Destination(DestinationEnum destiny) {
        this.destiny = destiny;
        this.waitingTravelers = new Stack<Traveler>();
        this.flights = new LinkedList<Flights>();
    }

    public DestinationEnum getDestiny() {
        return destiny;
    }

    public void setDestiny(DestinationEnum destiny) {
        this.destiny = destiny;
    }

    public LinkedList<Flights> getTravels() {
        return flights;
    }

    public void setFlights(LinkedList<Flights> flights) {
        this.flights = flights;
    }

    public Stack<Traveler> getWaitingTravelers() {
        return waitingTravelers;
    }

    public void setWaitingTravelers(Stack<Traveler> waitingTravelers) {
        this.waitingTravelers = waitingTravelers;
    }

    public void addWaitingTraveler(Traveler traveler) {
        this.waitingTravelers.push(traveler);
    }

    public void addflights(Flights flights) {
        this.flights.add(flights);
    }

    public void removeTravel(Flights flights) {
        this.flights.remove(flights);
    }

    public void removeWaitingTraveler(Traveler traveler) {
        this.waitingTravelers.remove(traveler);
    }

}
