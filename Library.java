/* This is a stub for the Library class */
import java.util.Hashtable;

public class Library extends Building {
  private Hashtable<String, Boolean> collection;

    public Library() {
      System.out.println("You have built a library: 📖");
      Hashtable<String, boolean> collection = new Hashtable<>();
    }

    public void addTitle(String title) {
      collection.put(title, true);
    }

    public String removeTitle(String title) {
      if (collection.containsKey(title)) {
        collection.remove(title);
        return title;
      } else {
        return "none";
      }
    }

    public void checkOut(String title) {
      if ()
    }
    public void returnBook(String title);
    
    

    public static void main(String[] args) {
      new Library();
    }
  
  }