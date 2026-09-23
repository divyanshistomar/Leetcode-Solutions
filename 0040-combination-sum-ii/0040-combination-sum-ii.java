class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);
          List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        solve(0,target,candidates,list,ans);
        return ans;
    }
    void solve(int start,int target,int[] arr,List<Integer> list,List<List<Integer>> ans){
        if(target==0){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=start;i<arr.length;i++){
            if(i>start && arr[i]==arr[i-1]){
                continue;
            }
            if(arr[i]>target){
                break;
            }

        list.add(arr[i]);
        solve(i+1,target-arr[i],arr,list,ans);
        list.remove(list.size()-1);
        }

    

        
    }
}