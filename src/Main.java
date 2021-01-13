public class Main {
    public static void printTicketDetails(Ticket ticket){
        System.out.println(ticket.getPnr());
    }

    public static void main(String[] args) {

        //Flight object creation
        //Due to Aggregation Relationship, Flight object formed outside Ticket class object.
        Flight flight  = new Flight("4561","Jet",120,100);

        //Passenger object creation
        //Due to Aggregation Relationship, Passenger object formed outside Ticket class object.
        Passenger p1 = new Passenger("Old Street","Mumbai","Maharashtra","Pushkar","9874563210",
                "p.rao@gmail.com");

        //Passenger object creation
        //Due to Aggregation Relationship, Passenger object formed outside Ticket class object.
        Passenger p2 = new Passenger("Malabar Street" , "Kolkata","WB", "Biswa","852431790"
        ,"biswap7@yahoo.com");
        flight.getCapacity();
//      flight.capacity;


        //RegularTicket object creation
        RegularTicket regTicket = new RegularTicket(1,"Delhi","Mumbai","29/11/20,6",
                "29/11/20,10",flight,"18A",p1,false,"food,water,snacks");


        //TouristTicket object creation
        TouristTicket tourTicket = new TouristTicket(2,"Delhi" , "Mumbai","29/11/20,6 ",
                "29/11/20,10",flight,"18C",p2,false,"Hotel Vue,Beach Ave,Mumbai");

        System.out.println(regTicket.getPnr());
        System.out.println(tourTicket.getPnr());
    }
}

