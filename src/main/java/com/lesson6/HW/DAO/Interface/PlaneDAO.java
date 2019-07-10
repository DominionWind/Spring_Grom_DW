package com.lesson6.HW.DAO.Interface;

import com.lesson6.HW.Model.Plane;

import java.util.List;

public interface PlaneDAO extends DAO<Plane> {
    List<Plane> oldPlanes();
    List<Plane> regularPlanes(int year);
}
