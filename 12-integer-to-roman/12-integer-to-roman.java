class Solution {
    public String intToRoman(int num) {
        String res="";
       // HashMap<Integer,String> romanNumb = new HashMap<Integer,String>();
           Map<Integer,String> romanNumb = new TreeMap<Integer,String>(Collections.reverseOrder());
        
        romanNumb.put(1,"I");
         romanNumb.put(4,"IV");
         romanNumb.put(5,"V");
        romanNumb.put(9,"IX");
        romanNumb.put(10,"X");
        romanNumb.put(40,"XL");
        romanNumb.put(50,"L");
        romanNumb.put(90,"XC");
        romanNumb.put(100,"C");
        romanNumb.put(400,"CD");
         romanNumb.put(500,"D");
         romanNumb.put(900,"CM");
        romanNumb.put(1000,"M");
        // Create a tree map to have so
       Map<Integer,String> treeMap = new TreeMap<Integer,String>(Collections.reverseOrder());
        
    
        System.out.println("hashmap iss"+ romanNumb);
        
         if(romanNumb.containsKey(num)){
         
             return (romanNumb.get(num));
         }
        else {
            for(int i: romanNumb.keySet()){
                
               if(num ==0){
                   return res;
               }
                
                while (num>= i){
                    
                    res = res + romanNumb.get(i);
                    num = num - i;
                }
                
            }
        
        }
        
  
        return res;

}        
        
        
        
    }
