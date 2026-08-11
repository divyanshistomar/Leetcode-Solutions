class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = 0; i < nums1.length; i++) {

            Stack<Integer> st = new Stack<>();

            for(int j = nums2.length - 1; j >= 0; j--) {

                if(nums1[i] == nums2[j]) {

                    while(!st.isEmpty() && st.peek() <= nums2[j]) {
                        st.pop();
                    }

                    if(st.isEmpty()) {
                        ans.add(-1);
                    } else {
                        ans.add(st.peek());
                    }

                    break;
                }

                st.push(nums2[j]);
            }
        }

        int[] result = new int[ans.size()];

        for(int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }

        return result;
    }
}