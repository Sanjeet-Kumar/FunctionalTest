
import resources.Script3Helper;
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
public class Script3 extends Script3Helper
{
	/**
	 * Script Name   : <b>Script3</b>
	 * Generated     : <b>17-Feb-2020 7:55:48 pm</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 10.0  Build 17763 ()
	 * 
	 * @since  2020/02/17
	 * @author sanjeet.kumar
	 */
	/*private void focus(TestObject to) {
	    boolean hasFocus = ((Boolean)to.getProperty(".hasFocus")).booleanValue();
	    if (!hasFocus)
	        throw new RuntimeException(to.getNameInScript()+" has an invalid focus order!");
	}*/
	public void testMain(Object[] args) 
	{
		startApp("ClassicsJavaA");
		
		// Frame: ClassicsCD
		album().click(atText("Details"));
		placeOrder().click();
		
		boolean focusNC= newCustomer().hasFocus();
		System.out.println("Focus on New Customer: "+ focusNC);
		// Frame: Member Logon
		memberLogon().inputKeys("{TAB}");
		memberLogon().inputKeys("{TAB}");
		password().click(atPoint(68,17));
		boolean focuspwd = password().hasFocus();
		System.out.println("Focus on Password: " + focuspwd);
		memberLogon().inputKeys("{TAB}");
		boolean focusRP = rememberPassword().hasFocus();
		System.out.println("Focus on Remember Password: " + focusRP);
		memberLogon().inputKeys("{TAB}");
		boolean focusOK = ok().hasFocus();
		System.out.println("Focus on Ok button: " + focusOK);
		ok().click();
				
		// Frame: Place an Order
		item().click(atPoint(85,11));
		boolean focusItem = item().hasFocus();
		System.out.println("Focus on Item: " + focusItem);
		placeAnOrder().inputKeys("{TAB}");
		placeAnOrder().inputKeys("{TAB}");
		boolean focusQty= quantity().hasFocus();
		System.out.println("Focus on Quantity: " + focusQty);
		placeAnOrder().inputKeys("{TAB}");
		boolean focusCardNumber= cardNumberIncludeTheSpaces().hasFocus();
		System.out.println("Focus on Card Number: " + focusCardNumber);
		placeAnOrder().inputKeys("{TAB}");
		placeAnOrder().inputKeys("{TAB}");
		boolean focusExp = expirationDate().hasFocus();
		System.out.println("Focus on Exp date: " + focusExp);
		
		cancel().click();
		
		// Frame: ClassicsCD
		classicsCD(ANY,MAY_EXIT).close();
	}
}

