package oving5;

import java.util.Comparator;

public class NamedComparator implements Comparator<Named> {
    
    public int compare(Named Person1, Named Person2){
        if(!Person1.getFamilyName().equals(Person2.getFamilyName())){
			return Person1.getFamilyName().compareTo(Person2.getFamilyName());
		}
		else if(!Person1.getGivenName().equals(Person2.getGivenName())){
			return Person1.getGivenName().compareTo(Person2.getGivenName());
		}
		return 0;
    }
}
