import java.util.ArrayList;
import java.util.Iterator;

public class ElectricCarsList {
    ArrayList<String> carModels = new ArrayList<>();
    ArrayList<ElectricCar> carList = new ArrayList<>();

    public static void main(String[] args){
        ElectricCarsList cars = new ElectricCarsList();
        cars.addCars();
        cars.printList();
    }

    private void printList() {
        Iterator<ElectricCar> itr = carList.iterator();
        System.out.println("                                           Top-10 Electric Cars List                                          ");
        System.out.println("");
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("");
    }

    public void addCars() {
        carList.add(new ElectricCar("2020 Tesla Model S", 74990, 402, 9.0,1));
        carList.add(new ElectricCar("2020 Tesla Model 3", 37990, 322, 8.8,2));
        carList.add(new ElectricCar("2020 Porsche Taycan", 103800, 201, 9.6,3));
        carList.add(new ElectricCar("2020 Audi e-tron", 77400, 204, 8.3,4));
        carList.add(new ElectricCar("2020 Tesla Model X", 79990, 351, 8.3,5));
        carList.add(new ElectricCar("2020 Jaguar I-Pace", 69850, 234, 8.2,6));
        carList.add(new ElectricCar("2020 Hyundai Ioniq Electric", 33045, 170, 8.0,7));
        carList.add(new ElectricCar("2020 Tesla Model Y", 49990, 316, 7.9,8));
        carList.add(new ElectricCar("2020 Chevrolet Bolt", 36620, 259, 7.8,9));
        carList.add(new ElectricCar("2020 Kia Niro EV", 39090, 239, 7.6,10));
    }
    class ElectricCar {
        String modelName;
        double mfgPrice;
        int maxRange;
        double usNewsRating;  // 1.0-10.0
        int rank;

        public ElectricCar(String modelName, double mfgPrice, int maxRange, double usNewsRating, int rank) {
            this.modelName = modelName;
            this.mfgPrice = mfgPrice;
            this.maxRange = maxRange;
            this.usNewsRating = usNewsRating;
            this.rank = rank;
        }

        public String getModelName() {
            return modelName;
        }

        public void setModelName(String modelName) {
            this.modelName = modelName;
        }

        public double getMfgPrice() {
            return mfgPrice;
        }

        public void setMfgPrice(double mfgPrice) {
            this.mfgPrice = mfgPrice;
        }

        public int getMaxRange() {
            return maxRange;
        }

        public void setMaxRange(int maxRange) {
            this.maxRange = maxRange;
        }

        public double getUsNewsRating() {
            return usNewsRating;
        }

        public void setUsNewsRating(double usNewsRating) {
            this.usNewsRating = usNewsRating;
        }

        public int getRank() {
            return rank;
        }

        public void setRank(int rank) {
            this.rank = rank;
        }

        @Override
        public String toString() {
            return String.format("Model: %-30s MfgPrice:'%.2f', MaxRange:'%-4d', Rating:'%.1f', Rank:'%d'",modelName,mfgPrice,maxRange,usNewsRating,rank);
        }
    }
}