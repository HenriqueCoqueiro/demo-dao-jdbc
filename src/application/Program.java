package application;

import model.dao.SellerDao;
import model.entities.DaoFactory;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;


public class Program {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();
        System.out.println("=== TEST 1: seller findById ===");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println();

        System.out.println("=== TEST 2: seller findByDepartmentId ===");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller s: list){
            System.out.println(s);
        }

        System.out.println();

        System.out.println("=== TEST 3: seller findAll ===");
        list = sellerDao.findAll();
        for (Seller s: list){
            System.out.println(s);
        }

        System.out.println();

        System.out.println("=== TEST 3: seller insert ===");
        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com",  new Date(), 4000.00, department);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! new id: " + newSeller.getId());

    }
}
