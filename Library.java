/* This is a stub for the Library class */
import java.util.Hashtable;

public class Library extends Building {
  private Hashtable<String, Boolean> collection;

    /**
     * constructor for library
     * @param name name of library building
     * @param address street address of library
     * @param nFloors number of floors in the library
     */
    public Library(String name, String address, int nFloors) {
      super(name, address, nFloors);
      System.out.println("You have built a library: 📖");
    }

    /**
     * method to add a book to the library if library doesn't already have it
     * @param title title of the book to be added
     */
    public void addTitle(String title) {
      if (collection.containsKey(title)) {
        throw new RuntimeException("We already have this title.");
      } 
      collection.put(title, true);
    }

    /**
     * method to remove a book from the library if library has it
     * @param title title of the book to be removed
     * @return title of book removed
     */
    public String removeTitle(String title) {
      if (!collection.containsKey(title)) {
        throw new RuntimeException("We do not have this title, so it cannot be removed.");
      }
      collection.remove(title);
      return title;
    }

    /**
     * method to check out a book from the library, as long as library has it and it hasn't already been checked out
     * @param title title of the book to be checked out
     */
    public void checkOut(String title) {
      if (!collection.containsKey(title)) {
        throw new RuntimeException("Book not in library.");
      }
      if (collection.get(title).equals(false)) {
        throw new RuntimeException("Book is not available.");
      }
      collection.remove(title);
      collection.put(title, false);
    }

    /**
     * method to return a book as long as the library has it and it hasn't already been returned
     * @param title title of the book to be returned
     */
    public void returnBook(String title) {
      if (!collection.containsKey(title)) {
        throw new RuntimeException("Book not in library.");
      }
      if (collection.get(title).equals(true)) {
        throw new RuntimeException("Book is already returned.");
      }
      collection.remove(title);
      collection.put(title, true);
    }
    
    /**
     * method to indicate whether or not the library contains a book
     * @param title title of book that is being looked up
     * @return a boolean indicating whether or not the library has the book
     */
    public boolean containsTitle(String title) { // returns true if the title appears as a key in the Libary's collection, false otherwise 
      return collection.containsKey(title);
    }
    
    /**
     * method to indicate whether or not the book is available
     * @param title title of book whose availability is being checked
     * @return boolean indicating whether or not the title is available
     */
    public boolean isAvailable(String title) { // returns true if the title is currently available, false otherwise
      return collection.get(title);
    }

    /**
     * method to print out the entire collection of books in the library
     */
    public void printCollection() { // prints out the entire collection in an easy-to-read way (including checkout status)
      for (String key : collection.keySet()) {
        System.out.println("Key: " + key + ", Value: " + collection.get(key));
      }
    }
    
    /**
    * creates new library, neilson
    */
    public static void main(String[] args) {
      new Library("Neilson", "Neilson Drive", 4);
    }
  
  }