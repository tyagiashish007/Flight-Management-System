//Inheritance relationship between Ticket and RegularTicket class
public class RegularTicket extends Ticket{

    String specialServices;


    public String getSpecialServices() {
        return specialServices;
    }

    public void updateSpecialServices(String specialServices){
        this.specialServices = specialServices;
    }


    //Should I put food,water, snacks are separate boolean variables???




    //Parametrized Constructor for object creation

    public RegularTicket(int pnr, String from, String to, String departureDateTime, String arrivalDateTime
            , Flight flight, String seatNo, Passenger passenger, boolean cancelled, String specialServices) {

        //super keyword to pass attribute values to Ticket superclass
        super(pnr,from,to,departureDateTime,arrivalDateTime,flight,seatNo,passenger,cancelled);
        this.specialServices = specialServices;
    }






}
