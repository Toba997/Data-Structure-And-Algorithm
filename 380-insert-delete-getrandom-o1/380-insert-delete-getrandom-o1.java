class RandomizedSet {
   HashMap<Integer,Integer> hm;
    ArrayList<Integer> list;
    Random rand;
    
    public RandomizedSet() {
       hm =new HashMap<>();
       list=new ArrayList<>();
       rand=new Random();
    }
    
    public boolean insert(int val) {
        if(hm.containsKey(val))
            return false;
        
        list.add(val);
        int lidx=list.size()-1;
        
        hm.put(val,lidx);
        
        return true;
    }
    
    public boolean remove(int val) {
        if(!hm.containsKey(val))
            return false;
        
        int lastidx=list.size()-1;
        int lastval=list.get(lastidx);
        
        int vidx=hm.get(val);
        
        list.set(lastidx,val);
        list.set(vidx,lastval);
        
       
        hm.put(lastval,vidx);
         hm.put(val,lastidx);
        
         list.remove(lastidx);
        hm.remove(val);
        
        return true;
    }
    
    public int getRandom() {
       int nu=  rand.nextInt(list.size());
        return list.get(nu);
    }
}
/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */