package ����ģʽ;
//����java�ķ������ ���ÿ������һ����Ʒ�� ����Ҫ����һ�� ����ʵ�ֹ�����ȱ�� 
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
