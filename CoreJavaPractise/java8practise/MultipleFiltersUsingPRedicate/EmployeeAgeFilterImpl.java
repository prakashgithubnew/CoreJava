package CoreJavaPractise.java8practise.MultipleFiltersUsingPRedicate;

import java.util.List;

import static CoreJavaPractise.java8practise.MultipleFiltersUsingPRedicate.PredicateConstants.agePredicate;

public class EmployeeAgeFilterImpl implements FilterManagement{
    @Override
    public List<Employee> doFilter(List<String> value) {
        return Constants.list.stream().filter(x-> agePredicate.test(x,value)).toList();
    }
}
