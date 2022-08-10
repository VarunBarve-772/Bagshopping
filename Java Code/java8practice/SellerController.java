package java8practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SellerController {

	List <SellerModel> sellerList = new ArrayList <SellerModel> ();
	
	public void populateRecords() {
		sellerList.add(new SellerModel(0, "John Doe", "John@gmail.com", "Chennai"));
		sellerList.add(new SellerModel(1, "Jenny Doe", "Jenny@gmail.com", "Banglore"));
		sellerList.add(new SellerModel(2, "Steve Harrington", "John@gmail.com", "Hyderabad"));
		sellerList.add(new SellerModel(3, "Matt Murdock", "Matt@gmail.com", "Mumbai"));
		sellerList.add(new SellerModel(4, "Foggy Nelson", "Foggy@gmail.com", "Pune"));
		sellerList.add(new SellerModel(5, "Elektra", "Elektra@gmail.com", "Indore"));
	}
	
	public void addSeller(int id, String name, String location, String email) {
		sellerList.add(new SellerModel(id, name, location, email));
		System.out.println("Seller Added");
	}
	
	public void displayAllSellers() {
		sellerList.stream().forEach((seller) -> System.out.println(seller));
	}
	
	public void searchById(int id) {
		sellerList.stream()
		.filter((seller) -> id == seller.getId())
		.forEach((seller) -> System.out.println(seller));
	}
	
	public void deleteById(int id) {
		
		sellerList =  sellerList.stream()
		.filter((seller) -> id != seller.getId())
		.collect(Collectors.toList());
		
		sellerList.stream()
		.forEach((seller) -> System.out.println(seller));
	}
	
	public void updateById(int id, String name, String location, String email) {
		sellerList.stream()
		.filter((seller) -> id == seller.getId())
		.forEach((seller) -> {
			seller.setId(id);
			seller.setName(name);
			seller.setEmail(email);
			seller.setLocation(location);
		});
		
		sellerList.stream().forEach((seller) -> System.out.println(seller));

	}
	
	public void displayByLocation(String location) {
		sellerList.stream()
		.filter((seller) -> location.equals(seller.getLocation()))
		.forEach((seller) -> System.out.println(seller));
	}
	
}
