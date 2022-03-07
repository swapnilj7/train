package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Sum_By_Collectors_Methods {
public static void main(String[] args) {
	 List<Product> productsList = new ArrayList<Product>();  
     //Adding Products  
     productsList.add(new Product(1,"HP Laptop",25000f));  
     productsList.add(new Product(2,"Dell Laptop",30000f));  
     productsList.add(new Product(3,"Lenevo Laptop",28000f));  
     productsList.add(new Product(4,"Sony Laptop",28000f));  
     productsList.add(new Product(5,"Apple Laptop",90000f));  
     
     Double collect = productsList.stream().collect(Collectors.summingDouble(product->product.price));
     
     System.out.println(collect);
     Set<Float> set = productsList.stream().map(product->product.price).collect(Collectors.toSet());
     System.out.println(set);
     Map<Integer,String> map=productsList.stream().collect(Collectors.toMap(product->product.id,product->product.name));
     System.out.println(map);
}
}
