package javacodechecker;
import java.applet.Applet;

public class Finalize1 extends Applet {
	// EMB-ISSUE: CodeIssueNames.Finalize_METHOD_DECLARE_PUBLIC/no-detect
	protected void finalize() throws Throwable {

	    try {

	        close();

	    } catch(Exception e) {

	    }

	    finally {

	        super.finalize();


	    }
	} 
}
