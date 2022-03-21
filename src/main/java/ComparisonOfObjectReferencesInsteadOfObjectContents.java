package javacodechecker;

public class ComparisonOfObjectReferencesInsteadOfObjectContents {
	String str1 = new String("Hello");
	String str2 = new String("Hello");

	public void compare() {
		// EMB-ISSUE: CodeIssueNames.COMPARISON_OF_OBJECT_REFRENCE_INSTEAD_OF_OBJECT_CONTENTS
		if (str1 == str2) {
			logger.info("str1 == str2");
		}
		
		String name = "manasi";
		String myname = "mansi";
		compareName(name, myname);
	}
	
	public void compareName(String name,String myname) {
		// EMB-ISSUE: CodeIssueNames.COMPARISON_OF_OBJECT_REFRENCE_INSTEAD_OF_OBJECT_CONTENTS
		if(name == myname) {
			logger.info("name == myname");		}
	}
	
	

	public void compares() {
		// EMB-ISSUE: CodeIssueNames.COMPARISON_OF_OBJECT_REFRENCE_INSTEAD_OF_OBJECT_CONTENTS/no-detect
		if (str1.equals(str2)) {
			logger.info("str1 equals str2");
		}
	}

}
