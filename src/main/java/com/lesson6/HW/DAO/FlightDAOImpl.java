package com.lesson6.HW.DAO;

import com.lesson6.HW.DAO.Interface.FlightDAO;
import com.lesson6.HW.Model.Flight;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class FlightDAOImpl extends GeneralDAO<Flight> implements FlightDAO {


    @Override
    public List<Flight> flightsByDate() {
        return null;
    }

    @Override
    public List<Flight> mostPopularTo() {
        return null;
    }

    @Override
    public List<Flight> mostPopularFrom() {
        return null;
    }
}
