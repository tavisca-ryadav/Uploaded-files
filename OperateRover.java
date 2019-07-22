
public class OperateRover {
	Rover rover;
	public OperateRover(Rover rover){
		this.rover = rover;
	}
	
	public void PerformOperations(String command){
		char[] commandArray = command.toCharArray();
		if(commandArray.length>0){
			for(char v:commandArray){
				ProcessCommands(v);
			}
		}
	}
	
	private void ProcessCommands(char command){
		switch (command){
		case 'L':
			MoveLeft();
			break;
		case 'R':
			MoveRight();
			break;
		case 'M':
			MoveForward();
			break;
		}
	}

	private void MoveForward() {
		switch (rover.direction){
		case 'N':
			rover.yAxis++;
			break;
		case 'S':
			rover.yAxis--;
			break;
		case 'W':
			rover.xAxis--;
			break;
		case 'E':
			rover.xAxis++;
			break;
		}
		
	}

	private void MoveRight() {
		switch (rover.direction){
		case 'N':
			rover.direction = 'E';
			break;
		case 'S':
			rover.direction = 'W';
			break;
		case 'W':
			rover.direction = 'N';
			break;
		case 'E':
			rover.direction = 'S';
			break;
		}
		
	}

	private void MoveLeft() {
		switch (rover.direction){
		case 'N':
			rover.direction = 'W';
			break;
		case 'S':
			rover.direction = 'E';
			break;
		case 'W':
			rover.direction = 'S';
			break;
		case 'E':
			rover.direction = 'N';
			break;
		}
		
	}
}
