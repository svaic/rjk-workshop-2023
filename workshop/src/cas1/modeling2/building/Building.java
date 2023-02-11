package cas1.modeling2.building;

import java.util.List;

public class Building {

    private String address;

    private List<Floor> floorList;

    public Building(String address, List<Floor> floorList) {
        this.address = address;
        this.floorList = floorList;
    }

    public void printDetails() {
        System.out.println("Details for building with address '" + address + "':");
        System.out.println();
        for (int i = 0; i < floorList.size(); i++) {
            Floor floor = floorList.get(i);
            printFloorDetails(floor);
        }
    }

    private void printFloorDetails(Floor floor) {
        int freeApartments = floor.getNumberFreeApartments();
        int num = floor.getFloorNumber();
        System.out.println("Floor " + num + " - free apartments: " + freeApartments);
        floor.printFreeApartmentDetails();
        System.out.println();
    }
}
