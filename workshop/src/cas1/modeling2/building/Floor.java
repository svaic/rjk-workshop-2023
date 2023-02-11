package cas1.modeling2.building;

import java.util.List;

public class Floor {
    private List<Apartment> apartmentList;
    private int floorNumber;
    private int squareMeterPrice;


    public Floor(int floorNumber, List<Apartment> apartmentList, int squareMeterPrice) {
        this.apartmentList = apartmentList;
        this.floorNumber = floorNumber;
        this.squareMeterPrice = squareMeterPrice;
    }

    public int getNumberFreeApartments() {
        int freeApartments = 0;
        for (int i = 0; i < apartmentList.size(); i++) {
            Apartment apartment = apartmentList.get(i);
            if (!apartment.isSold()) {
                freeApartments++;
            }
        }

        return freeApartments;
    }

    public void printFreeApartmentDetails() {
        int freeApartments = getNumberFreeApartments();

        if (freeApartments == 0) {
            System.out.println("No available apartments on this floor.");
        } else {
            for (int i = 0; i < apartmentList.size(); i++) {
                Apartment apartment = apartmentList.get(i);
                printFreeApartmentDetails(apartment);
            }
        }
    }

    private void printFreeApartmentDetails(Apartment apartment) {
        if (!apartment.isSold()) {
            int size = apartment.getSize();
            int cost = size * squareMeterPrice;
            int num = apartment.getNumber();
            String msg = "apartment " + num + ": Size = " + size + "m^2, cost = " + cost + " euros";
            System.out.println(msg);
        }
    }

    public int getFloorNumber() {
        return floorNumber;
    }
}
