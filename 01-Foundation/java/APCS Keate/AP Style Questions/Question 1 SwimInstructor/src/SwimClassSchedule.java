public class SwimClassSchedule {

    /**
     * instance variables
     * THESE VARIABLES WOULD NOT BE SHOWN ON THE AP TEST.
     */
    private SwimClass[] swimClasses;
    private int timeSlots;

    /**
     * constructor
     * Preconditions: className.length == numClasses
     *                 studentCapacity.length == numClasses
     *                 1 <= timeSlot <= 10
     * THE ENTIRE CONSTRUCTOR, INCLUDING THE HEADER, WOULD NOT BE SHOWN ON THE AP TEST.
     */
    public SwimClassSchedule(int numClasses, String[] className, int timeSlots, int[] studentCapacity)
    {
        this.timeSlots = timeSlots;
        swimClasses = new SwimClass[numClasses];
        for(int i = 0; i < numClasses; i++)
        {
            int[] studentCountByTime = new int[timeSlots];
            swimClasses[i] = new SwimClass(className[i], studentCountByTime, studentCapacity[i]);
        }
    }

    /**
     * getter method
     * THIS ENTIRE METHOD WOULD NOT BE SHOWN ON THE AP TEST.
     */
    public SwimClass[] getSwimClasses()
    {
        return swimClasses;
    }


    /**
     * Returns the number of students, always greater than or equal to 0,
     * that are currently scheduled in the SwimClass specified
     * by className during the time slot specified by timeSlot
     * Preconditions: className is not null
     *                1 <= timeSlot <= 10
     * (The swim school has 10 time slots per day)
     * THE IMPLEMENTATION OF THIS METHOD WOULD NOT BE SHOWN ON THE AP TEST.
     */
    public int getStudentCount(String className, int timeSlot)
    {
        for(int i = 0; i < swimClasses.length; i++)
        {
            if((swimClasses[i].getClassName()).equals(className))
                return swimClasses[i].getStudentCountByTime(timeSlot);
        }
        return 0;
    }

    /**
     * Schedules numStudents for classes in the SwimClassSchedule specified by
     * className during the time slot specified by timeSlot by adding
     * numStudents to the current student count
     * Preconditions: className is not null
     *                1 <= timeSlot <= 10
     *                numPatients > 0
     * THE IMPLEMENTATION OF THIS METHOD WOULD NOT BE SHOWN ON THE AP TEST.
     */
    public void bookClass(String className, int timeSlot, int numStudents)
    {
        if(timeSlot > timeSlots)
            return;
        for(int i = 0; i < swimClasses.length; i++)
        {
            if((swimClasses[i].getClassName()).equals(className))
                swimClasses[i].setStudentCountByTimeSlot(timeSlot, getStudentCount(className, timeSlot) + numStudents);
        }
    }

    /**
     * Returns the maximum capacity of student for the swim class specified
     * by className
     * Precondition: className is not null
     */
    public int getClassCapacity(String className)
    {
        for(int i = 0; i < swimClasses.length; i++)
        {
            if((swimClasses[i].getClassName()).equals(className))
                return swimClasses[i].getStudentCapacity();
        }
        return 0;
    }

    /* There may be instance variables, constructors, and methods that are not shown. */
}