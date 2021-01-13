//Ticket class made abstract to avoid class instantiation
public abstract class Ticket {
    private int pnr;
    private String from;
    private String to;
    private String departureDateTime;
    private String arrivalDateTime;

    //Aggregation relationship between Flight and Ticket classes
    private Flight flight;
    private String seatNo;

    //Aggregation relationship between Passenger and Ticket classes
    private Passenger passenger;
    private boolean cancelled;



    public String checkStatus() {
        if (cancelled == true){
            return "Cancelled";
        }
        return "Confirmed";
    }

    public String checkDuration() {

        String str1[] = departureDateTime.split(",");
        int time1 = Integer.parseInt(str1[1]);

        String str2[] = arrivalDateTime.split(",");
        int time2 = Integer.parseInt(str2[1]);

        int time = time2-time1;

        return Integer.toString(time);


    }


    public void cancelTicket() {
        this.cancelled = true;
    }




    //Parameterized Constructor
    public Ticket(int pnr, String from, String to, String departureDateTime, String arrivalDateTime
            , Flight flight, String seatNo, Passenger passenger, boolean cancelled) {
        this.pnr = pnr;
        this.from = from;
        this.to = to;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.flight = flight;
        this.seatNo = seatNo;
        this.passenger = passenger;
        this.cancelled = cancelled;
    }


    //Getters and Setters for accessing all private attributes
    public int getPnr() {
        return this.pnr;
    }

    public void setPnr(int pnr){
        this.pnr=pnr;
    }

    public String getFrom(){
        return from;
    }

    public void setFrom(String from){
        this.from=from;
    }

    public String getTo(){
        return to;
    }

    public void setTo(String to){
        this.to=to;
    }

    public String getDepartureDateTime(){
        return departureDateTime;
    }

    public void setDepartureDateTime(String departureDateTime){
        this.arrivalDateTime=arrivalDateTime;
    }

    public  String getArrivalDateTime(){
        return this.arrivalDateTime;
    }
    public void setArrivalDateTime(String arrivalDateTime){
        this.arrivalDateTime=arrivalDateTime;
    }

    public Flight getFlight(){
        return this.flight;
    }

    public void setFlight(Flight flight){
        this.flight=flight;
    }

    public String getSeatNo(){
        return this.seatNo;
    }
    public void setSeatNo(String seatNo){
        this.seatNo=seatNo;
    }
    public Passenger getPassenger(){
        return this.passenger;
    }

    public void setPassenger(Passenger passenger){
        this.passenger=passenger;
    }

    public boolean isCancelled(){
        return cancelled;
    }





}