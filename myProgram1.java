
import javax.swing.*;
import java.awt.*;

class myFrame extends JFrame
{
	myFrame()
	{
		setSize(400,450);
	}
}

class myProgram1
{
	public static void main(String args[])
	{
		myFrame obj = new myFrame();
		obj.show();
		obj.setDefaultCloseOperation(3);
	}
}


