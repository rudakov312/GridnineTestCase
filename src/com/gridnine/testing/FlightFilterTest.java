package com.gridnine.testing;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

public class FlightFilterTest {

    @Test
    public void sortingDepartureBeforeNow() {
        List<Flight> ActualList = new LinkedList<>(FlightBuilder.createFlights());
        ActualList.remove(2);

        List<Flight> ExpectedList = FlightFilter.sortingDepartureBeforeNow(FlightBuilder.createFlights());

        Assert.assertEquals(ExpectedList, ActualList);
    }

    @Test
    public void sortingByArrivalBeforeDeparture() {
        List<Flight> ActualList = new LinkedList<>(FlightBuilder.createFlights());
        ActualList.remove(3);

        List<Flight> ExpectedList = FlightFilter.sortingByArrivalBeforeDeparture(FlightBuilder.createFlights());

        Assert.assertEquals(ExpectedList, ActualList);
    }

    @Test
    public void sortingByMoreThanTwoHours() {
        List<Flight> ActualList = new LinkedList<>(FlightBuilder.createFlights());
        ActualList.remove(4);

        List<Flight> ExpectedList = FlightFilter.sortingByMoreThanTwoHours(FlightBuilder.createFlights());

        Assert.assertEquals(ExpectedList, ActualList);
    }
}