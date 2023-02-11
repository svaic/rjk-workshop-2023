package cas1.modeling2.building;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Apartment apartment1 = new Apartment(1, 50, false);
        Apartment apartment2 = new Apartment(2, 60, false);
        Apartment apartment3 = new Apartment(3, 56, true);
        Apartment apartment4 = new Apartment(4, 70, false);
        List<Apartment> apartmentList1 = new ArrayList<>();
        apartmentList1.add(apartment1);
        apartmentList1.add(apartment2);
        apartmentList1.add(apartment3);
        apartmentList1.add(apartment4);
        Floor floor1 = new Floor(1, apartmentList1, 100);

        Apartment apartment5 = new Apartment(5, 100, false);
        Apartment apartment6 = new Apartment(6, 85, false);
        Apartment apartment7 = new Apartment(7, 50, false);
        Apartment apartment8 = new Apartment(8, 70, false);
        List<Apartment> apartmentList2 = new ArrayList<>();
        apartmentList2.add(apartment5);
        apartmentList2.add(apartment6);
        apartmentList2.add(apartment7);
        apartmentList2.add(apartment8);
        Floor floor2 = new Floor(2, apartmentList2, 150);

        Apartment apartment9 = new Apartment(9, 85, true);
        Apartment apartment10 = new Apartment(10, 60, true);
        Apartment apartment11 = new Apartment(11, 110, true);
        Apartment apartment12 = new Apartment(12, 65, true);
        List<Apartment> apartmentList3 = new ArrayList<>();
        apartmentList2.add(apartment9);
        apartmentList2.add(apartment10);
        apartmentList2.add(apartment11);
        apartmentList2.add(apartment12);
        Floor floor3 = new Floor(3, apartmentList3, 200);


        List<Floor> floorList = new ArrayList<>();
        floorList.add(floor1);
        floorList.add(floor2);
        floorList.add(floor3);
        Building building = new Building("My Street", floorList);
        building.printDetails();
    }
}
