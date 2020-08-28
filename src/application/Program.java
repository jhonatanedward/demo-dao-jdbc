package application;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entites.Department;
import model.entites.Seller;

public class Program {

	public static void main(String[] args) {
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TESTE 1: seller findById ===");
		
		Seller seller = sellerDao.findById(3);
		
		
		System.out.println("=== TESTE 2: seller findByDepartment ===");
		
		List<Seller> list = new ArrayList<Seller>();
		
		Department department = new Department(2, null);
		
		list = sellerDao.findByDepartment(department);
		
		for(Seller obj: list) {
			System.out.println(obj);
		}
		
		System.out.println(seller);
	}

}