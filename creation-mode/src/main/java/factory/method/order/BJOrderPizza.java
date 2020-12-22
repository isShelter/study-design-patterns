package factory.method.order;


import com.factory.method.pizza.BJCheesePizza;
import com.factory.method.pizza.BJPepperPizza;
import com.factory.method.pizza.Pizza;

public class BJOrderPizza extends OrderPizza {

	
	@Override
    Pizza createPizza(String orderType) {
	
		Pizza pizza = null;
		if(orderType.equals("cheese")) {
			pizza = new BJCheesePizza();
		} else if (orderType.equals("pepper")) {
			pizza = new BJPepperPizza();
		}
		// TODO Auto-generated method stub
		return pizza;
	}

}
