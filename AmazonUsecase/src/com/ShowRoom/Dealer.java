package com.ShowRoom;
/**
 * 
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Vector;
import java.util.logging.Logger;
/**
 * 
 * @author Anne.Sivakumar
 *
 */
public class Dealer {
	Logger log = Logger.getLogger(Dealer.class.getName());
	static ArrayList<String> vehicleList = new ArrayList<String>();
	LinkedList<String> vehicleModel1 = new LinkedList<String>();
	Vector<String> vehicleModel2 = new Vector();
	HashSet<String> vehicleModel3 = new HashSet();
	TreeSet<String> vehicleModel4 = new TreeSet();
	HashMap<String,String> vehicleModel5=new HashMap();
	static {
		vehicleList.add("Honda");
		vehicleList.add("TVS");
		vehicleList.add("Suzuki");
		vehicleList.add("Hero");

	}

	LinkedList<String> brand(String brand) {
		if (brand.contains("Honda")) {
			vehicleModel1.add("Honda Activa 5G");
			vehicleModel1.add("Honda Dream Neo ");
			vehicleModel1.add("Honda Dio");
			vehicleModel1.add("Honda CB Unicorn 150");
		} 
		else if(brand.contains("TVS"))
		{
			vehicleModel1.add("TVS Jupiter");
			vehicleModel1.add("TVS Apache RTR 160");
			vehicleModel1.add("TVS Sport");
			vehicleModel1.add("TVS Scooty Pep Plus");
			vehicleModel1.add("TVS Wego");
			vehicleModel1.add("TVS Radeon");
			vehicleModel1.add("TVS Apache RTR 160");

		}
		else if(brand.contains("Suzuki"))
		{
			vehicleModel1.add("Suzuki Gixxer SF 250");
			vehicleModel1.add("Suzuki Access 125 ");
			vehicleModel1.add("Suzuki Intruder");
			vehicleModel1.add("Suzuki Burgman Street");
			vehicleModel1.add("Suzuki GSX S750");
			vehicleModel1.add("Suzuki Gixxer SF 250");

		}
		else if(brand.contains("Hero"))
		{
			vehicleModel1.add("Hero Pleasure");
			vehicleModel1.add("Hero Maestro Edge ");
			vehicleModel1.add("Hero Splendor");
			vehicleModel1.add("Hero Glamour");
			vehicleModel1.add("Hero Passion Pro");
			vehicleModel1.add("Hero Splendor");

		}
		else {
			System.out.println("MODEL IS NOT AVAILABLE");
			System.exit(0);
		}
		return vehicleModel1;

	}
	public void order(int items)
	{
		
	}

	public void model(String model) 
	{
		log.info("how many model do you want?" );
		int items = ShowRoom.sc.nextInt();
		if(model.contains("Activa5G"))
		{			
			for(int i=0;i<items;i++)
			{			
			vehicleModel2.add("NAME :   Honda Activa");
			vehicleModel2.add("TYPE :   5G");
			vehicleModel2.add("COLOR:   yellow");
			vehicleModel2.add("SPEED:   60Kmpl");
			vehicleModel2.add("MILEAGE: 109.19cc");
			vehicleModel2.add("FUEL:    Petrol "); 
			vehicleModel2.add("WEIGHT:  109kg"+"\n");
			}log.info("SPECIFICATION:");
			for(String s:vehicleModel2)
			{
				log.info(s);
			}

		}
		else if(model.contains("DreamNeo"))
		{
			for(int i=0;i<items;i++)
			{
			vehicleModel3.add("NAME :   Honda Dream");
			vehicleModel3.add("COLOR:   Red");
			vehicleModel3.add("SPEED:   60Kmpl");
			vehicleModel3.add("MILEAGE: 109.19cc");
			vehicleModel3.add("FUEL:    Petrol "); 
			vehicleModel3.add("WEIGHT:  109kg");
			vehicleModel3.add("WEIGHT:  109kg"+"\n");
			}				log.info("SPECIFICATION:");
			for(String s:vehicleModel2)
			{
				log.info(s);
			}
		}
		else if(model.contains("Dio"))
		{
			for(int i=0;i<items;i++)
			{
			vehicleModel4.add("NAME :   Honda Dio");
			vehicleModel4.add("COLOR:   Blue");
			vehicleModel4.add("SPEED:   55Kmpl");
			vehicleModel4.add("MILEAGE: 109.19cc");
			vehicleModel4.add("FUEL:    Petrol "); 
			vehicleModel4.add("WEIGHT:  104kg");
			vehicleModel4.add("NAME :   Honda Dio"+"\n");
			}				log.info("SPECIFICATION:");
			for(String s:vehicleModel2)
			{
				log.info(s);
			}
		}
		else if(model.contains("HondaCBUnicorn150"))
		{				
			for(int i=0;i<items;i++)
			{
			vehicleModel5.put("NAME ","Honda CB Unicorn 150");
			vehicleModel5.put("COLOR","Black");
			vehicleModel5.put("SPEED","55Kmpl");
			vehicleModel5.put("MILEAGE","149.2cc");
			vehicleModel5.put("FUEL","Petrol "); 
			vehicleModel5.put("WEIGHT","104kg");
			vehicleModel5.put("NAME","Honda Dio"+"\n");
			}			
			log.info("SPECIFICATION:"+"\n");
			for(String s:vehicleModel2)
			{
				log.info(s);
			}
		}

		else
		{
			log.info("There is not any other model" );
			System.exit(0);

		}
	
		
	}

}
