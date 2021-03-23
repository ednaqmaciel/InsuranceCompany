package br.com.able.vehicles;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.com.able.parts.Part;

@Entity 
@Table(name = "vehicle")
public class Vehicle {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String brand;

	private String model;

	private int year;
	private int sumValuesParts;

	@OneToMany(cascade = CascadeType.ALL, mappedBy="vehicle") 
	private List<Part> parts;	

	public Vehicle() {
		parts= new ArrayList<>();
	}

	public void add(Part part) {
		parts.add(part);
	}

	/**public int SumValueParts(){
	int sum = 0;
    for(int i = 0 ; i < sumValuesParts.size(); i++) {
        sum += sumValuesParts.get(i);
    }
    System.out.println("O valor total das peças desse veículo é:" +sum);
}**/


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public List<Part> getParts() {
		return parts;
	}

	public void setParts(List<Part> parts) {
		this.parts = parts;
	}
}
