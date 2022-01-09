package week3.day1.assignment.Assignment1;

class Desktop extends Computer 
{
	public void desktopSize()
	{
		System.out.println("This is a method for desktop size.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Desktop comp = new Desktop();
			comp.computerModel();
			comp.desktopSize();
			
	}

}
