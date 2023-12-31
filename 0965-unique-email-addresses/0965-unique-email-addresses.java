import java.util.*;
class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> valid=new HashSet<>();
        for(String s: emails){
            //splitting by @
            String [] split=s.split("@");
            String local=split[0];

            //case 1 : no dots in local name
            String localWithoutDots="";
            for(int i=0; i<local.length(); i++){
                if(local.charAt(i)!='.'){
                    localWithoutDots+=local.charAt(i);
                }
            }
            if (localWithoutDots.contains("+")) {
            String[] localParts = localWithoutDots.split("\\+");
            localWithoutDots = localParts[0];
            }
            valid.add(localWithoutDots+"@"+split[1]);
            
        }
        
        return valid.size();
    }
}