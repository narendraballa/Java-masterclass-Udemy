import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;
public class Demo {

	public static void main(String[]args) {
		
		LinkedList<String>placesToVisit=new LinkedList<String>();
	
		placesToVisit.add("Sydney");
		placesToVisit.add("Melbourne");
		placesToVisit.add("Brisbane");
		placesToVisit.add("perth");
		placesToVisit.add("Canberra");
		placesToVisit.add("Adelaide");
		placesToVisit.add("Darwin");
			
		printList(placesToVisit);
		
		placesToVisit.add(1,"Alice Springs");
	    printList(placesToVisit);
	    
	    placesToVisit.remove(4);
	    printList(placesToVisit);
	    
	    addInOrder(placesToVisit,"Sydney");
	    addInOrder(placesToVisit,"melbourne");
	    addInOrder(placesToVisit,"Brisbane");
	    addInOrder(placesToVisit,"perth");
	    addInOrder(placesToVisit,"canberra");
	    addInOrder(placesToVisit,"Aledaide");
	    addInOrder(placesToVisit,"Darwin");
	    printList(placesToVisit);
	    
	    addInOrder(placesToVisit,"Alice springs"); 
	    addInOrder(placesToVisit,"Darwin");
	    printList(placesToVisit);
	}
	
	private static void printList(LinkedList<String>linkedList) {
		Iterator<String> i=linkedList.iterator();
		while(i.hasNext()) {
			System.out.println("Now visting " + i.next());
		}
		System.out.println("=================");
	}
	
	private static boolean addInOrder(LinkedList<String>linkedList,String newCity) {
  
		ListIterator<String>stringListIterator=linkedList.listIterator();
			
		while(stringListIterator.hasNext()) {
			
			int comparision=stringListIterator.next().compareTo(newCity);
			if(comparision==0) {
				System.out.println(newCity + "is already included in destination");
               return false;			
 			}
			else if(comparision>0) {
				stringListIterator.previous();
				stringListIterator.add(newCity);
				return true;
			}
			else if(comparision<0) {
				//move on to next city
			}
		}
		stringListIterator.add(newCity);
		return true;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
