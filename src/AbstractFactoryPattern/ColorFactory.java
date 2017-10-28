package AbstractFactoryPattern;

public class ColorFactory extends AbstractFactory {
    
	   @Override
	   public Shape getShape(String shapeType){
	      return null;
	   }
	   
	   @Override
	   Color getColor(String color) {
	      if(color == null){
	         return null;
	      }        
	      if(color.equalsIgnoreCase("BLUE")){
	         return new Blue();
	      }
	      else {
			return null;
		}
	   }
	}
