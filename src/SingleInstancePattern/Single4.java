package SingleInstancePattern;

public class Single4 {
	//静态内部类 
	//既实现了 线程安全 又避免了同步带来的影响 
	private static class LazyHolder{
		private static final Single4 instance = new Single4();
	}
	
	private Single4(){
		
	}
	public static final Single4 getInstance(){
		return LazyHolder.instance;
	}
	
	
}
