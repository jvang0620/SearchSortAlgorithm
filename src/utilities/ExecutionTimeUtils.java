package src.utilities;

public class ExecutionTimeUtils {
    // This method calculates execution time for void methods (like Runnable tasks)
    public static long calculateExecutionTime(Runnable task) {
        long startTime = System.currentTimeMillis();
        task.run();
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
}
