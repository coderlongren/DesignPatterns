package 工厂模式;

/**
 * 
 * 
 * <p>Title:</p>
 * <p>Description: 属于创建者模式 </p>
 * <p>Company:</p> 
 * @author code龙
 * @date
 * @version 1.0
 */

public class FactoryPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeFactory shapeFactory = new ShapeFactory();

	      //获取 Circle 的对象，并调用它的 draw 方法
	      shape shape1 = shapeFactory.getShape("CIRCLE");

	      //调用 Circle 的 draw 方法
	      shape1.draw();

	      //获取 Rectangle 的对象，并调用它的 draw 方法
	      shape shape2 = shapeFactory.getShape("RECTANGLE");

	      //调用 Rectangle 的 draw 方法
	      shape2.draw();

	      //获取 Square 的对象，并调用它的 draw 方法
	      shape shape3 = shapeFactory.getShape("SQUARE");

	      //调用 Square 的 draw 方法
	      shape3.draw();
	      
	      Rectangle rectangle = (Rectangle)shapeFactory1.getClass(Rectangle.class);
	      rectangle.draw();
	   }
	

}
