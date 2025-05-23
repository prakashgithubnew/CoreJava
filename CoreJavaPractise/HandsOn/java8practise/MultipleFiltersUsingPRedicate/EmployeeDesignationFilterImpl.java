package CoreJavaPractise.HandsOn.java8practise.MultipleFiltersUsingPRedicate;

import java.util.List;

public class EmployeeDesignationFilterImpl implements FilterManagement{

    @Override
    public List<Employee> doFilter(List<String> value) {
        return Constants.list.stream().filter(x->PredicateConstants.designationPredicate.test(x,value)).toList();
    }
}
