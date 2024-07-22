package application;

import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

        Department department = new Department(1, "Books");
        Seller seller = new Seller(21, "Henrique", "Henrique@gmail.com", new Date(), 2000.00, department);

        System.out.println(seller);
    }
}
