import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class FlightArrayList {

    public static void main(String[] args) {
        // an instance of FlightArrayList class
        FlightArrayList flightArrayList = new FlightArrayList();

        //an ArrayList to store Flight objects
        ArrayList<Flight> flightList = new ArrayList<>();

        //A DateFormatter as asked in question
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy HH:mm");

        //create 6 AircraftType objects to feed to Flight objects
        AircraftType[] airTypes = new AircraftType[6];
        airTypes[0] = flightArrayList.new AircraftType("Boeing", "737-600", "B736", EngineType.Jet, 2);
        airTypes[1] = flightArrayList.new AircraftType("Boeing", "767-800", "B738", EngineType.Electrical, 2);
        airTypes[2] = flightArrayList.new AircraftType("Airbus", "A-310", "A310", EngineType.Jet, 2);
        airTypes[3] = flightArrayList.new AircraftType("Airbus", "A-300B2", "A30B", EngineType.Jet, 2);
        airTypes[4] = flightArrayList.new AircraftType("Airbus", "A-340-500", "A-340-500", EngineType.Jet, 2);
        airTypes[5] = flightArrayList.new AircraftType("Embraer", "A-20", "E314", EngineType.TurboProp, 1);

        // create 6 instances of Flight class with the flight and aircraft details
        Flight flight1,flight2,flight3,flight4,flight5,flight6;

        try {
            flight1 = flightArrayList.new Flight("101", "American Airlines", "PHL", "ORD", airTypes[0], sdf.parse("12-10-2020 07:35"), sdf.parse("12-10-2020 09:35"), "A27");
            flight2 = flightArrayList.new Flight("101", "United Airlines", "PHL", "SFO", airTypes[1], sdf.parse("12-10-2020 08:35"), sdf.parse("12-10-2020 11:50"), "G15");
            flight3 = flightArrayList.new Flight("233", "Delta Airlines", "ATL", "CDG", airTypes[2], sdf.parse("12-10-2020 16:35"), sdf.parse("12-11-2020 07:50"), "B15");
            flight4 = flightArrayList.new Flight("101", "British Airlines", "PHL", "LAX", airTypes[3], sdf.parse("12-10-2020 08:35"), sdf.parse("12-10-2020 11:50"), "G15");
            flight5 = flightArrayList.new Flight("221", "United Airlines", "MCO", "FLL", airTypes[4], sdf.parse("12-10-2020 05:35"), sdf.parse("12-10-2020 07:33"), "C11");
            flight6 = flightArrayList.new Flight("199", "American Airlines", "PHL", "JFK", airTypes[5], sdf.parse("12-10-2020 08:35"), sdf.parse("12-10-2020 11:50"), "D15");
        } catch (ParseException e) {
            System.out.println("Exception occurs due to sdf.parse().");
            return;
        }
        //add these instances into flightList
        flightList.add(flight1);
        flightList.add(flight2);
        flightList.add(flight3);
        flightList.add(flight4);
        flightList.add(flight5);
        flightList.add(flight6);

        // print all flight details using foreEach loop
        for (Flight flight : flightList) {
            System.out.println(flight);
        }

    }

    // EngineType enumeration
    enum EngineType {
        Jet, Rocket, Electrical, TurboProp, Piston
    }

    // inner class AircraftType
    class AircraftType {
        private final String manufacturer;
        private final String model;
        private final String typeDesignator;
        private final EngineType engineType;
        private final int engineNumber;

        // Constructor
        public AircraftType(String manufacturer, String model, String typeDesignator, EngineType engineType, int engineNumber) {
            super();
            this.manufacturer = manufacturer;
            this.model = model;
            this.typeDesignator = typeDesignator;
            this.engineType = engineType;
            this.engineNumber = engineNumber;
        }

        @Override
        public String toString() {
            return manufacturer + "-" + model + " EngType/Num: " + engineType.name() + "/" + engineNumber;

        }
    }

    class Flight {
        private final String flightNumber;
        private final String airline;
        private final String origin;
        private final String destination;
        private final AircraftType aircraftType;
        private final Date scheduledDeparture;
        private final Date scheduledArrival;
        private final String gate;

        public Flight(String flightNumber, String airline, String origin, String destination, AircraftType aircraftType, Date scheduledDeparture, Date scheduledArrival, String gate) {
            super();
            this.flightNumber = flightNumber;
            this.airline = airline;
            this.origin = origin;
            this.destination = destination;
            this.aircraftType = aircraftType;
            this.scheduledDeparture = scheduledDeparture;
            this.scheduledArrival = scheduledArrival;
            this.gate = gate;
        }

        @Override
        public String toString() {
            SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy HH:mm");
            String[] x = airline.split(" ");
            String airlineName = x[0].toUpperCase().charAt(0) + String.valueOf(x[1].toUpperCase().charAt(0));
            // Print everything in the output format.
            return airlineName + " " + flightNumber + " " + origin + "/" + destination + " Departs: " + sdf.format(scheduledDeparture) + " Arrives: " + sdf.format(scheduledArrival) + " Aircraft: " + aircraftType + " Gate: " + gate;

        }
    }

}
