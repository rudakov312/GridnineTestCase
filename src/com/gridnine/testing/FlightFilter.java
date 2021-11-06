package com.gridnine.testing;


import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

public class FlightFilter {

    public static List<Flight> sortingDepartureBeforeNow(List<Flight> OriginalList) {
        List<Flight> filteredFlights = new LinkedList<>(OriginalList);
        for (int i = 0; i < filteredFlights.size(); i++) {
            List<Segment> segList = filteredFlights.get(i).getSegments();
            if (LocalDateTime.now().isAfter(segList.get(0).getDepartureDate())) {
                filteredFlights.remove(filteredFlights.get(i));
                segList.clear();
                i--;
            }
        }
        return filteredFlights;
    }

    public static List<Flight> sortingByArrivalBeforeDeparture(List<Flight> OriginalList) {
        List<Flight> filteredFlights = new LinkedList<>(OriginalList);
        for (int i = 0; i < filteredFlights.size(); i++) {
            List<Segment> segList = filteredFlights.get(i).getSegments();
            for (int j = 0; j < segList.size(); j++) {
                if (segList.get(j).getDepartureDate().isAfter(segList.get(j).getArrivalDate())) {
                    filteredFlights.remove(filteredFlights.get(i));
                    segList.clear();
                    i--;
                }
            }
        }
        return filteredFlights;
    }

    public static List<Flight> sortingByMoreThanTwoHours(List<Flight> OriginalList) {
        List<Flight> filteredFlights = new LinkedList<>(OriginalList);
        for (int i = 0; i < filteredFlights.size(); i++) {
            List<Segment> segList = filteredFlights.get(i).getSegments();
            if (segList.size() != 1) {
                for (int j = 0; j < segList.size() - 1; j++) {
                    if (Math.abs(segList.get(j).getArrivalDate().getHour() - segList.get(j + 1).getDepartureDate().getHour()) > 2) {
                        System.out.println(filteredFlights.get(i));
                        filteredFlights.remove(filteredFlights.get(i));
                        segList.clear();
                        i--;
                    }
                }

            }
        }
        return filteredFlights;
    }
}
