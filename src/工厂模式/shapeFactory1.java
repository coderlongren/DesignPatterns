package 工厂模式;
//利用java的反射可以 解决每次增加一个产品是 都需要增加一个 对象实现工厂的缺点 
public class shapeFactory1 {
	public static Object getClass(Class<?extends shape> clazz){
		Object object = null;
		try {
			object = Class.forName(clazz.getName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return object;
	}

}
