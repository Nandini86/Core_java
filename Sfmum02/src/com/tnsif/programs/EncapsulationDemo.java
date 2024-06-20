package com.tnsif.programs;

public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Encapsulation obj= new Encapsulation();//created an object
// classname obj_name= new ClasName();
//		obj.serialnum=22;// calling datamem by using obj
//		obj.name="ramya";
//		obj.age=13;
		obj.setName("manu");
		obj.setSerialnum(22);
		obj.setAge(12);
		System.out.println(obj);// object repsentation
		//obj.show();
	}

}
