public class StopWatch {
    private long startTime;
    private long endTime;
    public long getStartTime() {
        return startTime;
    }
    public long getEndTime() {
        return endTime;
    }
    public void start(){
        startTime = System.currentTimeMillis();
    }
    public void stop(){
         endTime = System.currentTimeMillis();
    }

}
