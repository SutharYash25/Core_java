package collection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;
class Employees implements Serializable{
	int id;
	String name;
	double salary;

	public Employees(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
//	@Override
//	public String toString() {
//		return "id : "+id+" name : "+name+" salary : "+salary;
//	} 
}
public class SearilizartioDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		int id;
		String name;
		double salary;
		Scanner sc=  new Scanner(System.in);
		System.out.println("enter id : ");
		id = sc.nextInt();
		System.out.println("enter name : " );
		name = sc.next();
		System.out.println("enter salry : ");
		salary = sc.nextDouble();
		Employees e1 = new Employees(id, name, salary);
		
		FileOutputStream fos =  new FileOutputStream("employee.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e1);
		oos.flush();
		oos.close();
		System.out.println("data inserted");
		
		FileInputStream fis = new FileInputStream("employee.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employees e = (Employees)ois.readObject();
		System.out.println(e);
	}
}
