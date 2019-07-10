package com.lesson6.HW.DAO.Interface;

import com.lesson6.HW.Model.Passenger;

import java.util.List;

public interface PassengegDAO extends DAO<Passenger> {
    List<Passenger> regularPassengers(int year);
}
