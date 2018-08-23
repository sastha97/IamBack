import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public interface OrdersInterface {
	List<Double> buyOrders = new ArrayList<>();
	List<Double> sellOrders = new ArrayList();
	
	
	public int insertBuyOrder(double value) ;
	public int insertSellOrder(double value) ;
	public int tradeExecution();
	
	
	

}
