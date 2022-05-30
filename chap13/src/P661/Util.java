package P661;

import P658.Box;

public class Util {
	public static<T> Box<T> boxing(T t){
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}

}
