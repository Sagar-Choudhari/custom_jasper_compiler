package main;


import net.sf.jasperreports.engine.JasperCompileManager;

public class CompileReport {
    public static void main(String[] args) {
        try {

        	String fileDirectory = "/Users/vasundhara-mac/Documents/";
        	
        	String fileName = "RMCDateWiseBatchReport";
        	
        	
        	
        	
        	String jrxmlFilePath = fileDirectory + fileName + ".jrxml";
        	
        	String jasperFilePath = fileDirectory + fileName + ".jasper";

            JasperCompileManager.compileReportToFile(jrxmlFilePath, jasperFilePath);
            System.out.println("Compilation Successful!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


