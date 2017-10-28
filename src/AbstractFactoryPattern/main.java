package AbstractFactoryPattern;

import FactoryPattern.shape;

public class main {

	//test AbstractFactory
	public static void main(String[] args) {
		//获取工厂 
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
		//获取 形状 Rectangle的对象 
		Shape rectangle = shapeFactory.getShape("RECTANGLE");
		rectangle.draw();
		
		//获取颜色的工厂 
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
		Color blue = colorFactory.getColor("BLUE");
		blue.fill();
	}

}
