package com.day2.session2.part2.compostion;

//Building<>--------Flat
public class Building {
	private String buildingId;
	private String buildingAddress;
	public Flat flat;

	public Building(String buildingId, String buildingAddress) {
		this.buildingId = buildingId;
		this.buildingAddress = buildingAddress;
	}

	public void addFlat(int number, String address, String owerName, double price) {
		flat=new Flat(number, address, owerName, price);
	}

	public void printBuildingDetails() {

		System.out.println("-----------------building details----------------");
		System.out.println("buildingId: " + buildingId);
		System.out.println("buildingAddress: " + buildingAddress);
		flat.printFlatDetails();
	}

}
