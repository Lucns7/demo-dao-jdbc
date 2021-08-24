package model.DAO;

import java.util.List;

import model.entities.Seller;

public interface SellerDAO {
	
	void inset(Seller obj);
	void update (Seller onj);
	void deleteById(Integer id);
	Seller findById(Integer id);
	List<Seller> findAll();
}
