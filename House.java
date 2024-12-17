/* This is a stub for the House class */

import java.util.ArrayList;

public class House extends Building {

  private ArrayList<String> residents; // The <String> tells Java what kind of data we plan to store IN the ArrayList
  private boolean hasDiningRoom;

  /**
  * constructor for house
  * @param name name of house
  * @param address street address of house
  * @param nFloors number of floors in the house
  * @param hasDiningRoom boolean indicating whether or not the house has a dining room
  */
  public House(String name, String address, int nFloors, boolean hasDiningRoom) {
    super(name, address, nFloors);
    this.hasDiningRoom = hasDiningRoom;
    System.out.println("You have built a house: 🏠");
  }

  /**
  * accessor for whether or not house has dining room
  * @return boolean hasDiningRooom
  */
  public boolean getHasDiningRoom() {
    return hasDiningRoom;
  }

  /**
  * accessor for number of residents
  * @return int nResidents
  */
  public int nResidents() {
    return residents.size();
  }

  /**
  * method to move in a person, as long as they don't already live in the house
  * @param name name of person trying to move in
  */
  public void moveIn(String name) {
    if (residents.contains(name)) {
      throw new RuntimeException("Cannot move in because already a resident");
    }
    residents.add(name);
  }
  
  /**
  * method to move out a person, as long as they currently live in the house
  * @param name name of person trying to move out
  * @return name of person who sucessfully moved out
  */
  public String moveOut(String name) { // return the name of the person who moved out
    if (!residents.contains(name)) {
      throw new RuntimeException("Cannot move out, as person is not moved in yet.");
    }
    residents.remove(name);
    return name;
  }
  
  /**
  * method to check if a person is a resident
  * @param name name of person we are checking about
  * @return boolean indicating if they live in the house
  */
  public boolean isResident(String person) {
    return residents.contains(person);
  }

  /**
  * creates new house, wilson
  */
  public static void main(String[] args) {
    new House("Wilson House", "Kensington Ave", 4, true);
  }

}