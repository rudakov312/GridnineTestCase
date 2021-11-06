package com.gridnine.testing;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

public class FlightFilterTest {

    /**
     * To cover the task with unit tests, I had to change the attached file. If you need to check the lists for identity, you need to specify an immutable date, not the current one.
     */

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