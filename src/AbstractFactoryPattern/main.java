package AbstractFactoryPattern;

import FactoryPattern.shape;

public class main {

	//test AbstractFactory
	public static void main(String[] args) {
		//��ȡ���� 
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
		//��ȡ ��״ Rectangle�Ķ��� 
		Shape rectangle = shapeFactory.getShape("RECTANGLE");
		rectangle.draw();
		
		//��ȡ��ɫ�Ĺ��� 
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
		Color blue = colorFactory.getColor("BLUE");
		blue.fill();
	}

}
