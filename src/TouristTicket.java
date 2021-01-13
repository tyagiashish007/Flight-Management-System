public class TouristTicket extends Ticket {
    private String hotelAddress;
    private String[] TouristLocations = new String[5];


    TouristTicket(int pnr , String from , String to , String departureDateTime , String arrivalDateTime
            , Flight flight, String seatNo,Passenger passenger , boolean cancelled,String hotelAddress){

        super(pnr,from,to,departureDateTime,arrivalDateTime,flight,seatNo,passenger,cancelled);
        this.hotelAddress=hotelAddress;

    }




    public String getHotelAddress(){
        return this.hotelAddress;
    }

    public void setHotelAddress(String hotelAddress){
        this.hotelAddress=hotelAddress;
    }

    public String[] getTouristLocations(){
        String[] locations = new String[5];
        for(int i=0; i<5;i++){
            locations[i] = this.TouristLocations[i];
        }
        return locations;
    }

    public void addTouristLocation(String TouristLocation){
        for(int i = 0; i<5 ; i++){
            if(TouristLocations[i] == null){
                TouristLocations[i] = TouristLocation;
                return;
            }
        }

    }

    public void removeTouristLocation(String TouristLocation){
        for(int i=0;i<5; i++){
            if(TouristLocations[i] == TouristLocation){
                TouristLocations[i]=null;
                return;
            }
        }
    }




}
