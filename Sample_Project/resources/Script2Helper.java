// DO NOT EDIT: This file is automatically generated.
//
// Only the associated template file should be edited directly.
// Helper class files are automatically regenerated from the template
// files at various times, including record actions and test object
// insertion actions.  Any changes made directly to a helper class
// file will be lost when automatically updated.

package resources;

import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.object.interfaces.SAP.*;
import com.rational.test.ft.object.interfaces.WPF.*;
import com.rational.test.ft.object.interfaces.siebel.*;
import com.rational.test.ft.object.interfaces.flex.*;
import com.rational.test.ft.object.interfaces.dojo.*;
import com.rational.test.ft.object.interfaces.generichtmlsubdomain.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.vp.IFtVerificationPoint;
import com.ibm.rational.test.ft.object.interfaces.sapwebportal.*;
/**
 * Script Name   : <b>Script2</b><br>
 * Generated     : <b>2020/02/10 7:26:14 pm</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows 10 amd64 10.0 <br>
 * 
 * @since  February 10, 2020
 * @author sanjeet.kumar
 */
public abstract class Script2Helper extends RationalTestScript
{
	/**
	 * Edit: with default state.
	 *		.text : Text Editor
	 * 		.class : Edit
	 * 		.name : Text Editor
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject edittext() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("edittext"));
	}
	/**
	 * Edit: with specific test context and state.
	 *		.text : Text Editor
	 * 		.class : Edit
	 * 		.name : Text Editor
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject edittext(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("edittext"), anchor, flags);
	}
	
	

	protected Script2Helper()
	{
		setScriptName("Script2");
	}
	
}

