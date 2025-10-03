import java.util.PriorityQueue;

class Solution {
    public int trapRainWater(int[][] heightMap) {
        int trappedWater = 0;
        int waterLevel = 0;
        int[][] dirs = new int[][] { { 0, -1 }, { 0, 1 }, { 1, 0 }, { -1, 0 } };
        int rows = heightMap.length;
        int cols = heightMap[0].length;
        int totalUnVisitedCells = rows * cols;
        boolean[][] visited = new boolean[rows][cols];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> (a[0] - b[0]));

        for (int i = 0; i < rows; i++) {
            pq.offer(new int[] { heightMap[i][0], i, 0 });
            pq.offer(new int[] { heightMap[i][cols - 1], i, cols - 1 });
            visited[i][0] = true;
            visited[i][cols - 1] = true;
            totalUnVisitedCells--;
            totalUnVisitedCells--;
        }

        for (int i = 1; i < cols - 1; i++) {
            pq.offer(new int[] { heightMap[0][i], 0, i });
            pq.offer(new int[] { heightMap[rows - 1][i], rows - 1, i });
            visited[0][i] = true;
            visited[rows - 1][i] = true;
            totalUnVisitedCells--;
            totalUnVisitedCells--;
        }

        while (!pq.isEmpty() && totalUnVisitedCells > 0) {
            int[] temp = pq.poll();
            int currentLevel = temp[0];
            int currentRow = temp[1];
            int currentCol = temp[2];
            waterLevel = Math.max(waterLevel, currentLevel);
            for (int d = 0; d < 4; d++) {
                int nextRow = currentRow + dirs[d][0];
                int nextCol = currentCol + dirs[d][1];
                if (isValid(nextRow, nextCol, rows, cols) && !visited[nextRow][nextCol]) {
                    int nextHeight = heightMap[nextRow][nextCol];
                    if (nextHeight < waterLevel) {
                        trappedWater += waterLevel - nextHeight;
                    }
                    pq.offer(new int[] { heightMap[nextRow][nextCol], nextRow, nextCol });
                    visited[nextRow][nextCol] = true;
                    totalUnVisitedCells--;
                }
            }
        }

        return trappedWater;
    }

    private boolean isValid(int row, int col, int rows, int cols) {
        return (row > 0 && col > 0 && row < rows && col < cols);
    }
}