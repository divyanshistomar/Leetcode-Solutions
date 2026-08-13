class StockSpanner {
      ArrayList<Integer> ans;

    public StockSpanner() {
        ans=new ArrayList<>();
        
    }
    
    public int next(int price) {
        ans.add(price);
       int count=1;
       for(int i=ans.size()-2;i>=0;i--){
        if(ans.get(i)<=price){
            count++;
        }else 
     break;
       }


       return count; 
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */