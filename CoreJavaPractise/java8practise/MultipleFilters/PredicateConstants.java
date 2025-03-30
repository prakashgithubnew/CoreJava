package CoreJavaPractise.java8practise.MultipleFilters;

import java.util.List;
import java.util.function.BiPredicate;

public final class PredicateConstants {

    public final static BiPredicate<Employee,List<String>> designationPredicate =
            (i,j) -> j.contains(i.getDesignation());

    public final static BiPredicate<Employee,List<String>> agePredicate =
            (i,j) -> j.contains(i.getAge());



}
