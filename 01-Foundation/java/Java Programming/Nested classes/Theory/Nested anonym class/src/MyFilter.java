import java.io.File;
import java.io.FilenameFilter;

public abstract class MyFilter implements FilenameFilter {
  @Override
  public abstract boolean accept(File dir, String name);
}
