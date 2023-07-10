package dataDrivenFramework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class WriteExcelData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		Flib flib = new Flib();
		flib.writeExcelData("./data/TestData.xlsx","IPL",1,6,"Nashik");
	}

}
