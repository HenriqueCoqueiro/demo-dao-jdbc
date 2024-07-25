package model.entities;

import db.DB;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

    public static SellerDaoJDBC createSellerDao(){
        return new SellerDaoJDBC(DB.getConnection());
    }
}
