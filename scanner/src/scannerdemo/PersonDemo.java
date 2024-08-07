package scannerdemo;

import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {
		
		scanner ob = new Scanner(System.in);
		
		String name;
		System.out.println("Enter taxable income");
		int income = ob.nextInt();
		
		Person person = new Person();
		person.setName(name);
		person.setAge(age);
		person.setGender(gender);
        person.setIncome(income);
        
        System.out.println(person);
        
        TaxCalculation calc = new TaxCalulation();
        calc.calculateTax(person);
        System.out.println("After calculating tax: ");
        System.out.println(person);
        
        ob.close();
  
	}

}
