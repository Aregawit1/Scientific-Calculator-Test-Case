
import java.util.ArrayList;
import java.util.List;
import java.lang.Math;


public class ScientificCalculaetor {

    public static ArrayList<String> additionMaker(ArrayList<String> stringarraylist){
        if(stringarraylist.contains("+")){
            
        int indexofaddition =stringarraylist.indexOf("+");
       
        //System.out.println(indexofaddition);
        double firstnumber = Double.parseDouble(stringarraylist.get(indexofaddition -1));
        double secondnumber = Double.parseDouble(stringarraylist.get(indexofaddition + 1));
        double sum = firstnumber + secondnumber;
        stringarraylist.remove(indexofaddition-1);//removes first number left side of the operator from the list
        stringarraylist.remove(indexofaddition-1);//removes the operator
        stringarraylist.remove(indexofaddition-1);//removes the second number right side of the operator
        stringarraylist.add(indexofaddition - 1,Double.toString(sum));
        
        additionMaker(stringarraylist);
            
        }
        return stringarraylist;
    }

    public static ArrayList<String> subtractionMaker(ArrayList<String> stringarraylist){
             if(stringarraylist.contains("-")){
            
            int indexofoperator =stringarraylist.indexOf("-");
           
           
            double firstnumber = Double.parseDouble(stringarraylist.get(indexofoperator -1));
            double secondnumber = Double.parseDouble(stringarraylist.get(indexofoperator + 1));
            double result = firstnumber - secondnumber;
            stringarraylist.remove(indexofoperator-1);//removes first number left side of the operator from the list
            stringarraylist.remove(indexofoperator-1);//removes the operator
            stringarraylist.remove(indexofoperator-1);//removes the second number right side of the operator
            stringarraylist.add(indexofoperator - 1,Double.toString(result));
            
            subtractionMaker(stringarraylist);
                
            }
            return stringarraylist;
    }
    
}
