class Solution {
      public String gcdOfStrings(String str1, String str2) {
          
          if(!(str1+str2).equals(str2+str1)){
            return "";
          }
          return str1.substring(0,gcd(str2.length(),str1.length()));
}
    
  public static int gcd(int a,int b){
       return (b==0)?a:gcd(b,a%b);
  }
}