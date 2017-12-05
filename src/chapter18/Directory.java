package chapter18;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

public final class Directory {
	public static File[]
			local (File dir,final String regex) {
		return dir.listFiles(new FilenameFilter() {
			private Pattern pattern=Pattern.compile(regex);
			public boolean accept(File arg0, String arg1) {
				return pattern.matcher(new File(arg1).getName()).matches();
			}
		});
	}
	
	public static File[] //local方法的重载
			local(String path,final String regex) {
		return local(new File(path), regex);
	}
	
	public static class TreeInfo implements Iterable<File>{
		public List<File> files=new ArrayList<File>();
		public List<File> dirs=new ArrayList<File>();
		
		public Iterator<File> iterator() {
			return files.iterator();
		}
		void addAll(TreeInfo other) {
			files.addAll(other.files);
			dirs.addAll(other.dirs);
		}
		public String toString() {
			return "";
		}
	}
	
}
