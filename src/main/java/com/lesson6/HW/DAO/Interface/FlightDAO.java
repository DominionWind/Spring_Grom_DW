package com.lesson6.HW.DAO.Interface;

import com.lesson6.HW.Model.Flight;

import java.util.List;

public interface FlightDAO extends DAO<Flight> {
    List<Flight> flightsByDate();
    List<Flight> mostPopularTo();
    List<Flight> mostPopularFrom();
}
