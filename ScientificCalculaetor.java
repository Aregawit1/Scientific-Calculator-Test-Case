
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


    public static ArrayList<String> powerMaker(ArrayList<String> stringarraylist){
            
        if(stringarraylist.contains("^")){
            int indexofpow = stringarraylist.indexOf("^");
            double result = Math.pow(Double.parseDouble(stringarraylist.get(indexofpow-1)), Double.parseDouble(stringarraylist.get(indexofpow+1)));
            stringarraylist.remove(indexofpow-1);
            stringarraylist.remove(indexofpow-1);
            stringarraylist.remove(indexofpow-1);
            stringarraylist.add(indexofpow-1,Double.toString(result));
            
            powerMaker(stringarraylist);
        }
        
        return stringarraylist;  
    }

    public static ArrayList<String> sinMaker(ArrayList<String> stringarraylist){
        if(stringarraylist.contains("sin")){
            int indexofsin = stringarraylist.indexOf("sin");
            double result = Math.nextUp(Math.sin(Math.toRadians(Double.parseDouble(stringarraylist.get(indexofsin+1)))));
            stringarraylist.remove(indexofsin);
            stringarraylist.remove(indexofsin);
            stringarraylist.add(Double.toString(result));
             if(indexofsin != 0){
           char tempchar [] = stringarraylist.get(indexofsin - 1).toCharArray();
           if(Character.isDigit(tempchar[0])){
           stringarraylist.add(indexofsin,"*");
        }
        }
        
        sinMaker(stringarraylist);
        }
    return stringarraylist;
}
    public static ArrayList<String> cosMaker(ArrayList<String> stringarraylist){
    if(stringarraylist.contains("cos")){
        int indexofcos = stringarraylist.indexOf("cos");
        double result = Math.nextDown(Math.cos(Math.toRadians(Double.parseDouble(stringarraylist.get(indexofcos+1)))));
        stringarraylist.remove(indexofcos);
        stringarraylist.remove(indexofcos);
        stringarraylist.add(Double.toString(result));
         if(indexofcos != 0){
       char tempchar [] = stringarraylist.get(indexofcos - 1).toCharArray();
       if(Character.isDigit(tempchar[0])){
       stringarraylist.add(indexofcos,"×");
    }
    }
    
    cosMaker(stringarraylist);
    }
return stringarraylist;
}

    // Declaring and implementing tanMaker() Method

public static ArrayList<String> tanMaker(ArrayList<String> stringarraylist){
    if(stringarraylist.contains("tan")){
        int indexoftan = stringarraylist.indexOf("tan");
        double result = Math.tan(Math.toRadians(Double.parseDouble(stringarraylist.get(indexoftan+1))));
        stringarraylist.remove(indexoftan);
        stringarraylist.remove(indexoftan);
        stringarraylist.add(Double.toString(result));
         if(indexoftan != 0){
       char tempchar [] = stringarraylist.get(indexoftan - 1).toCharArray();
       if(Character.isDigit(tempchar[0])){
       stringarraylist.add(indexoftan,"*");
    }
    }
    
    tanMaker(stringarraylist);
    }
return stringarraylist;
}
    //Function definition for the method arcsinMaker() method

     public static ArrayList<String> arcsinMaker(ArrayList<String> stringarraylist){

          if(stringarraylist.contains("arcsin")){
                int indexofarcsin = stringarraylist.indexOf("arcsin");
                double result = Math.nextDown(Math.toDegrees(Math.asin((Double.parseDouble(stringarraylist.get(indexofarcsin+1))))));
                stringarraylist.remove(indexofarcsin);
                stringarraylist.remove(indexofarcsin);
                stringarraylist.add(Double.toString(result));
                 if(indexofarcsin != 0){
               char tempchar [] = stringarraylist.get(indexofarcsin - 1).toCharArray();
               if(Character.isDigit(tempchar[0])){
               stringarraylist.add(indexofarcsin,"×");
            }
            }
            
            arcsinMaker(stringarraylist);
            }
        return stringarraylist;
     }
    
    
}
