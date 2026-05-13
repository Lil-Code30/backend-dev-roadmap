/**
 * SwimInstructor.java
 *
 * @author - Jane Doe
 * @author - Period n
 * @author - I received help from ...
 *
 */
public class SwimInstructor
{
    /** The swim instructor's full name in the format "firstName lastName" */
    private String swimInstructorName;

    /** The swim class schedule this instructor works with */
    private SwimClassSchedule schedule;

    /** The swim instructor's bio, including the level of certification
     * ("Basic Swim Instructor" or "Water Safety Instructor") and years of experience.
     * All bios are formatted as described in part (b)
     * */
    private String bio;

    /**
     * Assigns sched to schedule, name to swimInstructorName, level to certLevel, and y to years
     * Precondition: name contains exactly one space separating first name and last name
     *                bio.length() > 0
     * THE IMPLEMENTATION OF THE CONSTRUCTOR WOULD NOT BE SHOWN ON THE AP TEST.
     */
    public SwimInstructor(String name, SwimClassSchedule sched, String bio)
    {
        schedule = sched;
        swimInstructorName = name;
        this.bio = bio;
    }

    /**
     * Books student classes for the specified class across time slots
     * in the range startSlot to endSlot, inclusive, as described in part (a)
     * Preconditions: className is not null
     *                1 <= startSlot <= endSlot <= 10
     *                studentsPerSlot > 0
     */
    public int scheduleStudents(String className, int startSlot, int endSlot, int studentsPerSlot)
    {
        /* TODO */
    }

    /**
     * Returns a shortened swim instructor bio summary, as described in part (b)
     * Precondition: swimInstructorName contains exactly one space separating first name and last name
     *               bio.length() > 0
     */
    public String getInstructorBioSummary()
    {
        /* TODO */
    }

    /* There may be instance variables, constructors, and methods that are not shown. */
}
