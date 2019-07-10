package com.lesson6.HW.DAO;

import com.lesson6.HW.DAO.Interface.PlaneDAO;
import com.lesson6.HW.Model.Plane;

import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class PlaneDAOImpl extends GeneralDAO<Plane> implements PlaneDAO {

    @Override
    public List<Plane> oldPlanes() {
        return null;
    }

    @Override
    public List<Plane> regularPlanes(int year) {
        return null;
    }
}
