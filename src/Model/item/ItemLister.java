package Model.item;

import java.util.ArrayList;

import Model.item.Equipment.protection.Protection;
import Model.item.Equipment.protection.armor.FirstArmor;
import Model.item.Equipment.protection.armor.UltraArmor;
import Model.item.Equipment.protection.head.FirstHead;
import Model.item.Equipment.protection.legs.FirstLegs;
import Model.item.Equipment.weapons.Weapons;
import Model.item.Equipment.weapons.OneHand.BaseOneHand;
import Model.item.Equipment.weapons.Shield.BaseShield;
import Model.item.Equipment.weapons.TwoHand.BaseTwoHand;
import Model.item.potions.Potions;

/**
 * MUST BE CALL IN THE FIRST PRNCIPAL CODE LINE
 * 
 * List all the item of the game
 * 
 * @author joey
 *
 */
public class ItemLister {


	static ArrayList<Weapons> listWeap = new ArrayList<Weapons>();

	static ArrayList<Protection> listProtec = new ArrayList<Protection>();

	static ArrayList<Potions> listPotions = new ArrayList<Potions>();

	public ItemLister() {
		/////////////////////////////
		/***************************/
		/**** WEAPONS LISITNG ******/
		/***************************/
		/////////////////////////////

		/****************************
		 * One Hand Weapons listing *
		 ****************************/
		listWeap.add(new BaseOneHand());

		/****************************
		 * Two hand weapons listing *
		 ****************************/
		listWeap.add(new BaseTwoHand());

		/******************
		 * Shield listing *
		 ******************/
		listWeap.add(new BaseShield());

		////////////////////////////////
		/******************************/
		/***** PROTECTION LISITNG *****/
		/******************************/
		////////////////////////////////

		/*******************************
		 ******* Armor listing *********
		 *******************************/
		listProtec.add(new FirstArmor());
		listProtec.add(new UltraArmor());

		/*******************************
		 ******** Head listing *********
		 *******************************/
		listProtec.add(new FirstHead());

		/*******************************
		 ******** Legs listing *********
		 *******************************/
		listProtec.add(new FirstLegs());

		/////////////////////////////
		/***************************/
		/**** HEALING LISITNG ******/
		/***************************/
		/////////////////////////////
		listPotions.add(new Potions());
	}

}
