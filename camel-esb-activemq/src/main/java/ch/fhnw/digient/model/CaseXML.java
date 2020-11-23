package ch.fhnw.digient.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "case")
public class CaseXML {
	private int caseId;
	private String caseDescription;
	public int getCaseId() {
		return caseId;
	}
	public void setCaseId(int caseId) {
		this.caseId = caseId;
	}
	public String getCaseDescription() {
		return caseDescription;
	}
	public void setCaseDescription(String caseDescription) {
		this.caseDescription = caseDescription;
	}
	
	
}

