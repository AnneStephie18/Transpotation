package com.ShowRoom;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Logger;
/**
 * 
 * @author Anne.Sivakumar
 *
 */
public class ShowRoom {
	public static Scanner sc = new Scanner(System.in);
	public static String model;

	public static void main(String[] args) {
		Dealer vehicle = new Dealer();
		Logger log = Logger.getLogger(ShowRoom.class.getName());
		log.info("Which Brand do you need?" +"\n"+ vehicle.vehicleList);
		String brand = sc.next();
		vehicle.brand(brand);
		log.info("These are the available model" +"\n");
		for(String s:vehicle.vehicleModel1)
		{
			log.info(s);
		}
		log.info("which model do you want?" +"\n");
		String model = sc.next();
		vehicle.model(model);
		

      
	}

}
