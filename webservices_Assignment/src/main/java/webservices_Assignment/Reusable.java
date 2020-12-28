package webservices_Assignment;



import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Reusable {
	
	static ExtentTest logger;
	static ExtentReports report;
	
	public static void 	InitializeExtentReport() {
		//String filename= new SimpleDateFormat("'Test_'yyyyMMddHHmm'.html'").format(new Date());
		//String path = "C:\\Users\\divya\\Documents\\SalesForceTestCases\\" +  filename;
		String path= "C:\\Users\\divya\\Documents\\webServices_Student\\" + "Tests.html";
		report= new ExtentReports(path);
		//logger= report.startTest("loginsfc");
		
		
	}

}
