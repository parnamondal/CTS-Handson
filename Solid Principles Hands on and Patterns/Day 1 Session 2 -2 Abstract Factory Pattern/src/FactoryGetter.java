
public class FactoryGetter {
	   public static Factory getFactory(String brand){   
	      if(brand.equalsIgnoreCase("Audi")){
	         return new AudiFactory();         
	      }else if (brand.equalsIgnoreCase("Mercedes")) {
	         return new MercedesFactory();
	      }
	   return null;
	   }
	}