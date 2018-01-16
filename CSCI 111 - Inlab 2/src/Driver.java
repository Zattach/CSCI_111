
public class Driver {
	public static void main(String[] args){
		Book book1 = new Book("Dracula", 7.55, 22);
		System.out.println("Name of book1: \"" + book1.getName() + "\" and the total value of book1: " + book1.getTot());
		System.out.println();
		Book book2 = new Book("The Story of DickButt", 4.20, 69);
		System.out.println("Name of book2: \"" + book2.getName() + "\" and the total value of book2: " + book2.getTot());
		System.out.println();
	}
}
