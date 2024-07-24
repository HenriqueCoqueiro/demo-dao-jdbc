package application;

import model.dao.SellerDao;
import model.entities.DaoFactory;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

        Department department = new Department(1, "Books");
        Seller seller = new Seller(21, "Henrique", "Henrique@gmail.com", new Date(), 2000.00, department);

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println(seller);
    }
}
