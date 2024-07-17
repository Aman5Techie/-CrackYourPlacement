//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	    int t=Integer.parseInt(br.readLine().trim());
	    while(t > 0)
	    {
	        int n= Integer.parseInt(br.readLine().trim());
	        String x = br.readLine().trim();
	        String string_list[] = x.split(" ",n);
	        
	        Solution ob = new  Solution();
	        
	        List <List<String>> ans = ob.Anagrams(string_list);
	        
	        Collections.sort(ans, new Comparator<List<String>>(){
            public int compare(List<String> l1, List<String> l2) {
                    String s1 =  l1.get(0);
                    String s2 = l2.get(0);
                    
                    return s1.compareTo(s2);
                }
            });
	        
	        for(int i=0;i<ans.size();i++)
	        {
	            for(int j=0;j<ans.get(i).size();j++)
	            {
	                System.out.print(ans.get(i).get(j) + " ");
	            }
	            System.out.println();
	        }
	       
	       
            t--;
	    }
	}
    
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    public List<List<String>> Anagrams(String[] string_list) {
        // Code here
        List<List<String>> list = new ArrayList<>();
        HashMap<Double, List<String>> map = new HashMap<>();
        
        for(String str : string_list ){
            double cal_value = getValue(str);
            if(map.containsKey(cal_value)){
                List<String> get_list = map.get(cal_value);
                get_list.add(str);
                map.put(cal_value,get_list);
                
            }else{
                List<String> init_list = new ArrayList<>();
                init_list.add(str);
                map.put(cal_value,init_list);
            }
        }
        
        for(double key : map.keySet()){
            list.add(map.get(key));
        }
        return list;
        
    }
    
    public double getValue(String str){
        str = str.toLowerCase();
        int[] arrOfPrime = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        double value= 1;
        int index ;
        for(char c : str.toCharArray()){
            index = c - 'a';
            value *= arrOfPrime[index];
        }
        
        return value;
        
        
    }
}
