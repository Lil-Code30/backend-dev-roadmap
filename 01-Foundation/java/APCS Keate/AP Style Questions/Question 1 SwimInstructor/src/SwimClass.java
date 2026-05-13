//THIS ENTIRE CLASS WOULD NOT BE SHOWN ON THE AP TEST.
public class SwimClass {

    //instance variables
    private String className;
    private int[] studentCountByTime;
    private int studentCapacity;


    //constructor
    public SwimClass(String className, int[] studentCountByTime, int studentCapacity)
    {
        this.className = className;
        this.studentCountByTime = studentCountByTime;
        this.studentCapacity = studentCapacity;
    }

    //getter methods
    public String getClassName() {
        return className;
    }

    public int getStudentCountByTime(int timeSlot) {
        return studentCountByTime[timeSlot - 1];
    }

    public int getStudentCapacity(){
        return studentCapacity;
    }


    //setter methods
    public void setStudentCountByTimeSlot(int timeSlot, int studentCount) {
        if(timeSlot > studentCountByTime.length)
            return;
        this.studentCountByTime[timeSlot - 1] = studentCount;
    }

    public void setAllStudentCountsPerTimeSlot(int[] studentCountByTime)
    {
        this.studentCountByTime = studentCountByTime;
    }
}
