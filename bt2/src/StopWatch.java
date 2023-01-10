import java.time.LocalTime;

public class StopWatch {
    private LocalTime startTime, endTime;

    public StopWatch() {
        startTime=LocalTime.now();
        endTime=LocalTime.now();
    }

    public StopWatch(LocalTime startTime, LocalTime endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public LocalTime getStartTime() {
        startTime=LocalTime.now();
        return startTime;
    }

    public LocalTime getEndTime() {
        endTime=LocalTime.now();
        return endTime;
    }

    public void start(){
        startTime=LocalTime.now();
    }

    public void stop(){
        endTime=LocalTime.now();
    }

    public int getElapsedTime(){
        return ((endTime.getHour()-startTime.getHour())*3600 +
                (endTime.getMinute()-startTime.getMinute())*60 +
                (endTime.getSecond()-startTime.getSecond())*1000);
    }
}