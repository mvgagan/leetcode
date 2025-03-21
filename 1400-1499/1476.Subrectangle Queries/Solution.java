class SubrectangleQueries {
    private int[][] arr;

    public SubrectangleQueries(int[][] rectangle) {
        this.arr = rectangle;
    }

    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        for (int i = row1; i <= row2; i++) {
            for (int j = col1; j <= col2; j++) {
                arr[i][j] = newValue;
            }
        }
    }

    public int getValue(int row, int col) {
        return arr[row][col];
    }
}

class SubrectangleQueries2 {
    private int[][] arr;
    private List<int[]> list = new LinkedList<>();

    public SubrectangleQueries(int[][] rectangle) {
        this.arr = rectangle;
    }

    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        list.addFirst(new int[] { row1, col1, row2, col2, newValue });
    }

    public int getValue(int row, int col) {
        for (int[] ele : list) {
            if (ele[0] <= row && row <= ele[2] && ele[1] <= col && col <= ele[3]) {
                return ele[4];
            }
        }
        return arr[row][col];
    }
}

/**
 * Your SubrectangleQueries object will be instantiated and called as such:
 * SubrectangleQueries obj = new SubrectangleQueries(rectangle);
 * obj.updateSubrectangle(row1,col1,row2,col2,newValue);
 * int param_2 = obj.getValue(row,col);
 */