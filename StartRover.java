
public class StartRover {
	public static void main(String[] args){
		String command = "MMRMRL";
		Rover rover1 = new Rover(2,3,'E');
		Rover rover2 = new Rover(-9,8,'N');
		
		OperateRover operate1 = new OperateRover(rover1);
		operate1.PerformOperations(command);
		System.out.println(rover1.xAxis+" "+rover1.yAxis+" "+rover1.direction);
		
		OperateRover operate2 = new OperateRover(rover2);
		operate2.PerformOperations(command);
		System.out.println(rover2.xAxis+" "+rover2.yAxis+" "+rover2.direction);
		
		
	}
}
