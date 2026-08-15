//https://leetcode.com/problems/top-k-frequent-elements/
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
      Map<Integer,Integer> map=new HashMap<>();
      for(int n:nums)map.put(n,map.getOrDefault(n,0)+1);
      PriorityQueue<Pair> p=new PriorityQueue<>((a,b)->b.val-a.val);
      int[] ans=new int[k];
      for(int key:map.keySet()){
        p.offer(new Pair(key,map.get(key)));
      }
      for(int i=0;i<k;i++){
        ans[i]=p.poll().key;
      }
      return ans;

    }
}

class Pair{
    int key;
    int val;
    Pair(int k,int v){
        this.key=k;
        this.val=v;
    }
}
/*
MAP → MAX HEAP → K POLLS
Array
  ↓
COUNT
  ↓
HashMap
  ↓
(key, frequency)
  ↓
Max Heap
  ↓
poll K times
  ↓
Answer
*/
