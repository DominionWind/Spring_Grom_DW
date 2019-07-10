package com.lesson6.HW.DAO;

import com.lesson6.HW.DAO.Interface.PassengegDAO;
import com.lesson6.HW.Model.Passenger;

import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class PassengerDAOImpl extends GeneralDAO<Passenger> implements PassengegDAO {
    @Override
    public List<Passenger> regularPassengers(int year) {
        return null;
    }
}
