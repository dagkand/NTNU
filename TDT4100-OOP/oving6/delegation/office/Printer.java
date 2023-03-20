package oving6.delegation.office;

import java.util.*;

public class Printer {

    void printDocument(String document, Employee employee) {
        if (! history.containsKey(employee)) {
			history.put(employee, new ArrayList<String>());
		}
		history.get(employee).add(document);
		System.out.println(document);
    }

    List<String> getPrintHistory(Employee employee)
    
}
