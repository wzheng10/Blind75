class Combinaton Sum III{

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        combination(result, new ArrayList<Integer>(), k, 1, n);
        return result;
    }

    private void combination(List<List<Integer>> result, List<Integer> comb, int k, int start, int n) {
        if (comb.size() == k && n == 0) {
            List<Integer> li = new ArrayList<Integer>(comb);
            result.add(li);
            return;     //just exits out of the method at that statement, not running the following statements.
        }
        for (int i = start; i <= 9; i++) {
            comb.add(i);
            combination(result, comb, k, i+1, n-i); //recursion
            comb.remove(comb.size() - 1);   //after each "fail" or "success", since we don't need to do further
                                            // attempts given such a condition, we delete the last element, and then
                                            // end current backtracking. Next step is, add the next element to the
                                             //deleted index, go on attempting.
        }
    }
}