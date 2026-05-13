/**
 * VideoLibrary.java
 *
 * @author - Jane Doe
 * @author - Period n
 * @author - I received help from ...
 *
 */
import java.util.ArrayList;
public class VideoLibrary
{
    /** The list of all videos on the platform */
    private ArrayList<VideoInfo> library;

    /**
     * constructor
     * Preconditions: library != null
     * THE ENTIRE CONSTRUCTOR, INCLUDING THE HEADER, WOULD NOT BE SHOWN ON THE AP TEST.
     */
    public VideoLibrary(ArrayList<VideoInfo> library)
    {
        this.library = library;
    }

    /**
     * Returns a list of the titles of published videos with durations between
     * minDuration and maxDuration, inclusive. If no videos in library
     * with these specifications exist, return null.
     * Precondition: minDuration <= maxDuration
     *                No elements of library are null.
     * Postcondition: library is unchanged.
     */
    public ArrayList<String> getVideoTitlesInRange(double minDuration, double maxDuration)
    {
        /* TODO */
    }

    /* There may be instance variables, constructors, and methods that are not shown. */
}