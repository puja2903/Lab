//Problem Statement 2:
package DEC_08_Lab;
import java.util.HashSet;
import java.util.Iterator;
public class Country {    //main class
HashSet<String> Hs = new HashSet<>();  //creating hash set
public HashSet<String> storeCountryNames(String CountryName) {
		Hs.add(CountryName);
		return Hs;   }
	public String retrieveCountry(String CountryName) {
		Iterator<String> it = Hs.iterator();
		while (it.hasNext()) {
			if (it.next().equals(CountryName))
				return CountryName;   }
		return null;   }
public static void main(String[] args) {  //main method
		Country co = new Country();  //creating object of country class
		
		//using object store country name
		co.storeCountryNames("India");
		co.storeCountryNames("USA");
		co.storeCountryNames("Pakistan");
		co.storeCountryNames("Bangladesh");
		co.storeCountryNames("China");
	 
		//printing the output
		System.out.println("China: " + co.retrieveCountry("China"));
		System.out.println("Japan: " + co.retrieveCountry("Japan"));		
	}}
