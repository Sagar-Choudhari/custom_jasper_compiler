package main;


import net.sf.jasperreports.engine.JasperCompileManager;

public class CompileReport {
    public static void main(String[] args) {
        try {

			String jrxmlFilePath = "/Users/vasundhara-mac/Documents/"
			
			
			+ "BatchMixLoadSummaryReport"
			
			
			+ ".jrxml";
			String jasperFilePath = "/Users/vasundhara-mac/Documents/"
			
			
			+ "BatchMixLoadSummaryReport"
			
			
			+ ".jasper";

            JasperCompileManager.compileReportToFile(jrxmlFilePath, jasperFilePath);
            System.out.println("Compilation Successful!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
