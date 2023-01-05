//import java.util.*;
class Solution {
    public String getHint(String secret, String guess) {
int s[] = new int[10];
int g[]= new int[10];
int bulls=0;
int cows =0;


for(int i=0; i<secret.length(); i++){
    if(secret.charAt(i)==guess.charAt(i)){
        bulls++;
    }
    else{
        s[secret.charAt(i)-'0']++;
        g[guess.charAt(i)-'0']++;
    }
}
for(int i=0; i<10; i++){
    cows = cows + Math.min(s[i],g[i]);
}
String res = String.valueOf(bulls);
res = res+ "A";
res =res + String.valueOf(cows);
res= res+ "B";

return res;
}

        
    
}
