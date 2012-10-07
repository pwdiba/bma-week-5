	// task class
	class InsideTheAssignment {
		int value1;
		
		// Constructor with one value
		InsideTheAssignment(int value1) {
			value1 = 5;	
			System.out.println("Task :Inside the Assignment: value: "+value1);
		}
		// Constructor with no arguments
		InsideTheAssignment () {		
		}
		class toString {
			public String toString() {			
			return null;
			}
		}	
	}
	
	public class Assignment {
		
		public static void main(String args[]) {
		
		InsideTheAssignment Task1 = new InsideTheAssignment();
		System.out.println("1: "+ Task1 );

		InsideTheAssignment Task2 = new InsideTheAssignment(1);
		System.out.println("2: "+ Task2 );
		
	}

	public static String getElement(String[] values, int index) {
		String error = null ;
		if (index == (int)index)  {
			return values[index];
		}
		else {
			return error;
		}		
	}
}

