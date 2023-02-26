package com.zoo;

public class Zoo {
	private String name;
	private String species ;
	public Zoo(String name,String species){
		this.name=name;
		this.species=species;
	}
	class Animal{
		public String getDetails() {
			StringBuilder sb=new StringBuilder();
			sb.append("name: ").append(name).append(", species: ").append(species);
			return sb.toString();
		
		}
		
	}
	public static void main(String[] args) {
		
		Zoo animal=new Zoo("dog","leo");
		Zoo.Animal animal1=animal.new Animal();
		String details=animal1.getDetails();
		System.out.println(details);
	}

}
