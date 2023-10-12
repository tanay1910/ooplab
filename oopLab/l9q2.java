import java.util.concurrent.atomic.AtomicInteger;

class RowSumCalculator implements Runnable {
    private int[] row;
    private AtomicInteger totalSum;

    public RowSumCalculator(int[] row, AtomicInteger totalSum) {
        this.row = row;
        this.totalSum = totalSum;
    }

    @Override
    public void run() {
        int sum = 0;
        for (int value : row) {
            sum += value;
        }
        totalSum.addAndGet(sum);
    }
}

public class MatrixSum {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int numRows = matrix.length;
        AtomicInteger totalSum = new AtomicInteger(0);

        Thread[] threads = new Thread[numRows];

        for (int i = 0; i < numRows; i++) {
            threads[i] = new Thread(new RowSumCalculator(matrix[i], totalSum));
            threads[i].start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        int finalSum = totalSum.get();
        System.out.println("Matrix Sum: " + finalSum);
    }
}
