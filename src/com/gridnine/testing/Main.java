package com.gridnine.testing;

import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<Flight> list = FlightBuilder.createFlights();
        System.out.println("Original list: " + list);

        List<Flight> list1 = FlightFilter.sortingDepartureBeforeNow(FlightBuilder.createFlights());
        System.out.println("Sorted by departure before current time: " + list1);
        List<Flight> list2 = FlightFilter.sortingByArrivalBeforeDeparture(FlightBuilder.createFlights());
        System.out.println("Sorted by arrival before departure time: " + list2);
        List<Flight> list3 = FlightFilter.sortingByMoreThanTwoHours(FlightBuilder.createFlights());
        System.out.println("Sorted by more than two hours: " + list3);
    }
}
