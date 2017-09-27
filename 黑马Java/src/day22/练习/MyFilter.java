package day22.练习;

import java.io.File;
import java.io.FileFilter;

public class MyFilter implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        // return pathname.getName().endsWith(".exe");
        return pathname.length() < 204200;
    }
}
