public class Flight {

    private String flightNumber;
    private String airline;
    private int capacity;
    private int booked;


    public String getFlightDetails() {
        return flightNumber + ", " + airline;
    }

    public boolean checkAvailability() {
        if (booked < capacity) {
            return true;
        }
        return false;
    }

    public void incrementBookingCounter(int i) {
        booked += i;
        capacity -= i;
    }


   //Parameterized Constructor
   public Flight(String flightNumber, String airline, int capacity, int booked) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.capacity = capacity;
        this.booked = booked;
    }

    // Getter and Setter methods for accessing private attributes outside Flight class

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getBooked() {
        return booked;
    }

    public void setBooked(int booked) {
        this.booked = booked;
    }

}



