
import resources.Script1Helper;
import com.rational.test.ft.*;
import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.object.interfaces.SAP.*;
import com.rational.test.ft.object.interfaces.WPF.*;
import com.rational.test.ft.object.interfaces.dojo.*;
import com.rational.test.ft.object.interfaces.siebel.*;
import com.rational.test.ft.object.interfaces.flex.*;
import com.rational.test.ft.object.interfaces.generichtmlsubdomain.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.value.*;
import com.rational.test.ft.vp.*;
import com.ibm.rational.test.ft.object.interfaces.sapwebportal.*;
/**
 * Description   : Functional Test Script
 * @author sanjeet.kumar
 */
public class Script1 extends Script1Helper
{
	/**
	 * Script Name   : <b>Script1</b>
	 * Generated     : <b>10-Sep-2019 5:51:45 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 10.0  Build 15063 ()
	 * 
	 * @since  2019/09/10
	 * @author sanjeet.kumar
	 */
	public void testMain(Object[] args) 
	{
		// TODO Insert code here
		//close IE window
		RootTestObject root = RootTestObject.getRootTestObject();
		// Find all the windows on the system
		IWindow windows[] = root.getTopWindows(); 
		String className;


		for (int i=0;i<windows.length;i++)
		{
		// Get the class name of each window
		className = windows[i].getWindowClassName();
		System.out.println(className);

		// If the window is an instance of IE, close it
		if (className.equals("IEFrame"))
		{
		System.out.println(className);
		windows[i].close();
		System.out.println("closed---------------------------------------------- IE");
		
		}
		if (className.equals("IlogViewsWndClass"))
		{
		System.out.println(className);
		windows[i].close();
		System.out.println("closed -----------------------------------------------logview");
		}
		// If the window is an instance of Edge, close it
		if (className.equals("ApplicationFrameWindow"))
		{
		System.out.println(className);
		windows[i].close();
		System.out.println("closed -----------------------------------------------Window");
		}
		
		}

	}
}

