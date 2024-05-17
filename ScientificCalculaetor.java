
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

      public static ArrayList<String> multiplicationMaker(ArrayList<String> stringarraylist){
        if(stringarraylist.contains("*")){
            
        int indexofoperator =stringarraylist.indexOf("*");
     
        double firstnumber = Double.parseDouble(stringarraylist.get(indexofoperator -1));
        double secondnumber = Double.parseDouble(stringarraylist.get(indexofoperator + 1));
        double result = firstnumber * secondnumber;
        stringarraylist.remove(indexofoperator-1);//removes first number left side of the operator from the list
        stringarraylist.remove(indexofoperator-1);//removes the operator
        stringarraylist.remove(indexofoperator-1);//removes the second number right side of the operator
        stringarraylist.add(indexofoperator - 1,Double.toString(result));
        
        multiplicationMaker(stringarraylist);
            
        }
        return stringarraylist;
    }
    public static ArrayList<String> divisionMaker(ArrayList<String> stringarraylist){
        if(stringarraylist.contains("÷")){
            
        int indexofoperator =stringarraylist.indexOf("÷");
     
        double firstnumber = Double.parseDouble(stringarraylist.get(indexofoperator -1));
        double secondnumber = Double.parseDouble(stringarraylist.get(indexofoperator + 1));
        double result = firstnumber / secondnumber;
        stringarraylist.remove(indexofoperator-1);//removes first number left side of the operator from the list
        stringarraylist.remove(indexofoperator-1);//removes the operator
        stringarraylist.remove(indexofoperator-1);//removes the second number right side of the operator
        stringarraylist.add(indexofoperator - 1,Double.toString(result));
        
        divisionMaker(stringarraylist);
            
        }
        return stringarraylist;
    }
      public static ArrayList<String> radicalMaker (ArrayList<String> stringarraylist){
        try{


            if(stringarraylist.contains("√")){
                int indexofradical = stringarraylist.indexOf("√");
                double number = Double.parseDouble(stringarraylist.get(indexofradical+1));
                double result = Math.sqrt(number);
                
                stringarraylist.remove(indexofradical);
                stringarraylist.remove(indexofradical);
                stringarraylist.add(indexofradical,Double.toString(result));
                if(indexofradical != 0){
                   char tempchar [] = stringarraylist.get(indexofradical-1).toCharArray();
                   if(Character.isDigit(tempchar[0])){
                   stringarraylist.add(indexofradical,"*");
                }
                }
                radicalMaker(stringarraylist);
            }
            
            return stringarraylist;
        }catch(Exception  ex){

            stringarraylist.add("Syntax Error");

        }
        if(stringarraylist.contains("√")){
            int indexofradical = stringarraylist.indexOf("√");
            double number = Double.parseDouble(stringarraylist.get(indexofradical+1));
            double result = Math.sqrt(number);
            
            stringarraylist.remove(indexofradical);
            stringarraylist.remove(indexofradical);
            stringarraylist.add(indexofradical,Double.toString(result));
            if(indexofradical != 0){
               char tempchar [] = stringarraylist.get(indexofradical-1).toCharArray();
               if(Character.isDigit(tempchar[0])){
               stringarraylist.add(indexofradical,"*");
            }
            }
            radicalMaker(stringarraylist);
        }
        
        return stringarraylist;
    }
    
    
}
