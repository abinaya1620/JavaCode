package com.alaTestProgram;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
	
public class CalculateCheapCall {
	

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System. in); 
    	System.out.println("Enter the phone number:");
	      String  phoneNumber = scanner.nextLine();
    	CalculateCheapCall c= new CalculateCheapCall();
    	c.calculateCheapcall(phoneNumber);	
    }
  

    
    public  void calculateCheapcall(String s){
    	
    	
    	
    	Map<String, Double> operatorA = new HashMap<String, Double>();
        operatorA.put("1", 0.9);
        operatorA.put("268", 5.1);
        operatorA.put("46", 0.17);
        operatorA.put("4620", 0.0);
        operatorA.put("468", 0.15);
        operatorA.put("4631", 0.15);
        operatorA.put("4673", 0.9);
        operatorA.put("46732", 1.1);
  
        Map<String,Double> operatorB= new HashMap<String,Double>(); 
        operatorB.put("1",0.92);
        operatorB.put("44", 0.5);
        operatorB.put("46", 0.2);
        operatorB.put("467", 1.0);
        operatorB.put("48", 1.2);
        
        String match1key=GetLongestMatchingkey(operatorA,s);
        String match2key=GetLongestMatchingkey(operatorB,s);
    
       if(match1key != "" && match2key != "")
       {
          printCheapestOperator(operatorA.get(match1key) >operatorB.get(match2key) ? "OperatorB" : "OperatorA",operatorA.get(match1key) >operatorB.get(match2key) ? operatorB.get(match2key) : operatorA.get(match1key));
       }else if(match1key !="" && match2key == "")
       {
    	   printCheapestOperator("OperatorA",operatorA.get(match1key));   
       }else if(match1key=="" && match2key !="")
       {
    	   printCheapestOperator("OperatorB",operatorB.get(match2key));
       }
       else {
    	   System.out.println("There is no cheapest call rate found for the number provided!");
       }
    }
    
    public  void  printCheapestOperator(String operator,Double cheapkey)
    {
    	System.out.println("Operator :"+operator + " has cheapest rate with :"+cheapkey.toString()+" / min");
    }
    
public  String GetLongestMatchingkey(Map<String,Double> operator, String s)
{
	Iterator i= GetSortedMap(operator).keySet().iterator();
    String matchedKey = "";
    String key="";
    while (i.hasNext()) {
        key = (String) i.next();
        if (s.contains(key) && (matchedKey == null || matchedKey.length() < key.length())) {
            matchedKey = key;
        }
    }
    if (matchedKey != "") {
    	return matchedKey;
    }
    return matchedKey;
}
    private  Map<String,Double> GetSortedMap(Map<String,Double> operator)
    {
    	 Map<String , Double> treeMap = new TreeMap<String, Double>(
                 new Comparator<String>() {

                     @Override
                     public int compare(String o1, String o2) {
                         return o2.compareTo(o1);
                     }

                 });
         treeMap.putAll(operator);

        return treeMap;

    }
    
}