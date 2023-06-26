public class TravelHandler {
    public Destination[] destinations;

    public TravelHandler() {
        this.generateDestinations();
    }

    public void generateDestinations() {
        this.destinations = new Destination[DestinationEnum.values().length];

        for (int i = 0; i < DestinationEnum.values().length; i++) {
            this.destinations[i] = new Destination(DestinationEnum.values()[i]);
        }
    }
}
