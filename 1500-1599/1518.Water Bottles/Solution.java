class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int out = numBottles;
        int empty = numBottles;
        while (empty >= numExchange) {
            out += empty/numExchange;
            empty = empty/numExchange + empty%numExchange;
        }
        return out;
    }
}