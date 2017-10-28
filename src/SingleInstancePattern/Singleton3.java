package SingleInstancePattern;
//饿汉单例类 在类的初始化的时候 已经自动实例化  
//饿汉式在类创建的同时就已经创建好一个静态的对象供系统使用，以后不再改变，所以天生是线程安全的。
public class Singleton3 {
	private Singleton3(){
		
	}
	private static final Singleton3 single = new Singleton3();
	//静态工厂方法 
	public static Singleton3 getInstance(){
		return single;
	}

}
