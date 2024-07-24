package model.entities;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

    public static SellerDaoJDBC createSellerDao(){
        return new SellerDaoJDBC();
    }
}
