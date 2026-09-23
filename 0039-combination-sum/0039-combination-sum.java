class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>>  ans=new ArrayList<>();
        List<Integer> list= new ArrayList<>();
        solve(0,target,candidates,list,ans);
        return ans;
    }
    void solve(int idx,int target,int[] arr,List<Integer> list,List<List<Integer>> ans){
        if(target==0){
            ans.add( new ArrayList<>(list));
            return ;
        }
        if(idx==arr.length || target <0){
            return ;
        }

        //take
        list.add(arr[idx]);
        solve(idx,target-arr[idx],arr,list,ans);
        list.remove(list.size()-1);

        //not take
        solve(idx+1,target,arr,list,ans);
    }
}