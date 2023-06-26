import java.sql.Date;
import java.time.LocalDateTime;

public class Flights {
    public String travelNumber;
    public Destination destination;
    public Date date;
    public LocalDateTime time;
    public int freeSeats;
    private Traveler[] travelers;
    private boolean isFlying;

    public Flights(String travelNumber, Destination destination, Date date, LocalDateTime time, int freeSeats) {
        this.travelNumber = travelNumber;
        this.destination = destination;
        this.date = date;
        this.time = time;
        this.freeSeats = freeSeats;
        this.travelers = new Traveler[freeSeats];
        this.isFlying = false;
    }

    public void addTraveler(Traveler traveler) {
        for (int i = 0; i < this.travelers.length; i++) {
            if (this.travelers[i] == null) {
                this.travelers[i] = traveler;
                break;
            }
        }
    }

    public void removeTraveler(Traveler traveler) {
        for (int i = 0; i < this.travelers.length; i++) {
            if (this.travelers[i] == traveler) {
                this.travelers[i] = null;
                break;
            }
        }
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public boolean isFlying() {
        return isFlying;
    }

    public void setFlying(boolean isFlying) {
        this.isFlying = isFlying;
    }

    public Traveler[] getTravelers() {
        return travelers;
    }

    public void setTravelers(Traveler[] travelers) {
        this.travelers = travelers;
    }

    public String getTravelNumber() {
        return travelNumber;
    }

    public void setTravelNumber(String travelNumber) {
        this.travelNumber = travelNumber;
    }

    public Destination getDestination() {
        return this.destination;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public int getFreeSeats() {
        return freeSeats;
    }

    public void setFreeSeats(int freeSeats) {
        this.freeSeats = freeSeats;
    }

    public boolean isFull() {
        for (int i = 0; i < this.travelers.length; i++) {
            if (this.travelers[i] == null) {
                return false;
            }
        }
        return true;
    }

    public boolean isAvailable() {
        return this.freeSeats > 0;
    }

    public void takeOff() {
        this.freeSeats = 0;
        this.isFlying = true;

        for (Traveler traveler : this.travelers) {
            if (traveler != null) {
                this.getDestination().removeWaitingTraveler(traveler);
                traveler.setTraveling(true);
            }
        }

    }

}
