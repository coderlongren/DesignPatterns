package ����ģʽ;

/**
 * 
 * 
 * <p>Title:</p>
 * <p>Description: ���ڴ�����ģʽ </p>
 * <p>Company:</p> 
 * @author code��
 * @date
 * @version 1.0
 */

public class FactoryPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeFactory shapeFactory = new ShapeFactory();

	      //��ȡ Circle �Ķ��󣬲��������� draw ����
	      shape shape1 = shapeFactory.getShape("CIRCLE");

	      //���� Circle �� draw ����
	      shape1.draw();

	      //��ȡ Rectangle �Ķ��󣬲��������� draw ����
	      shape shape2 = shapeFactory.getShape("RECTANGLE");

	      //���� Rectangle �� draw ����
	      shape2.draw();

	      //��ȡ Square �Ķ��󣬲��������� draw ����
	      shape shape3 = shapeFactory.getShape("SQUARE");

	      //���� Square �� draw ����
	      shape3.draw();
	      
	      Rectangle rectangle = (Rectangle)shapeFactory1.getClass(Rectangle.class);
	      rectangle.draw();
	   }
	

}
