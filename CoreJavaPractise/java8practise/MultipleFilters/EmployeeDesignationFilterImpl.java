package CoreJavaPractise.java8practise.MultipleFilters;

import java.util.List;

public class EmployeeDesignationFilterImpl implements FilterManagement{

    @Override
    public List<Employee> doFilter(List<String> value) {
        return Constants.list.stream().filter(x->PredicateConstants.designationPredicate.test(x,value)).toList();
    }
}
