class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //can use a hashmap 
        //find the frq create an arralist based on this freq and
        //then sort it with the help of freq and return the k number 
        
        //lets start with creating a hashmap
        
        HashMap<Integer,Integer>mp =new HashMap<>();
        for(int num:nums){
         mp.put(num,mp.getOrDefault(num,0)+1);
         
        }
        List<int[]>arr=new ArrayList<>();
        for(Map.Entry<Integer,Integer>entry:mp.entrySet()){
              arr.add(new int[]{entry.getValue(),entry.getKey()});
        }
        arr.sort((a,b)->b[0]-a[0]);
        int[] res=new int[k];
        for(int i=0;i<k;i++){
            res[i]=arr.get(i)[1];

        }
        return res;
    }
}