package com.designpatterns.structural.filterpattern;

import java.util.List;

public interface Criteria {
	
	public List<Person> meetCriteria(List<Person> persons);
	
}
