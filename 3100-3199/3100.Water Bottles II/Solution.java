class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int out = numBottles;
        int empty = numBottles;
        int temp = 0;
        while (empty >= numExchange) {
            int exch = empty - numExchange;
            temp++;
            empty = exch + 1;
            numExchange++;
        }
        
        out += temp;
        return out;
    }
}