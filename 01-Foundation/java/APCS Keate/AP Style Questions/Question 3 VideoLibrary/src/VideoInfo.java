public class VideoInfo {
    /**
     * instance variables
     * THESE VARIABLES WOULD NOT BE SHOWN ON THE AP TEST.
     */
    private String title;
    private double duration;
    private boolean published;

    /**
     * constructor
     * Preconditions: title != null
     *                 duration >= 0
     * THE ENTIRE CONSTRUCTOR, INCLUDING THE HEADER, WOULD NOT BE SHOWN ON THE AP TEST.
     */
    public VideoInfo(String title, double duration, boolean published)
    {
        this.title = title;
        this.duration = duration;
        this.published = published;
    }

    /**
     * Returns the title of the video
     */
    public String getTitle()
    { return title; }

    /**
     * Returns the duration of the video in minutes
     */
    public double getDuration()
    { return duration; }

    /**
     * Returns true if the video is currently published and
     * returns false otherwise
     */
    public boolean isPublished()
    { return published; }

    /* There may be instance variables, constructors, and methods that are not shown. */
}