class Solution 
{
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) 
    {
        // [1] build a flattened "stream of streams"
        Stream<Character> ch1 = Stream.of(word1).flatMap(w -> w.chars().mapToObj(c -> (char)c));
        Stream<Character> ch2 = Stream.of(word2).flatMap(w -> w.chars().mapToObj(c -> (char)c));
        
        // [2] in Guava there is a simple iterator comparator
        //     retrun Iterators.elementsEqual(ch1.iterator(), ch2.iterator());
        
        // [3] on LeetCode, we are forced to use a somewhat longer solution...
        var it1 = ch1.iterator();
        var it2 = ch2.iterator();  
        while (it1.hasNext() && it2.hasNext())
            if (!it1.next().equals(it2.next())) return false;
               
        // [4] remember to check that iterators may have different lengths
        return !it1.hasNext() && !it2.hasNext();
    }
}
