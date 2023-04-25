package ch.fhnw.digient.model;

public class CaseJSON {
	private int problemCaseId;
	private String problemCaseDescription;
	private String problemCallerId;
	private String problemCallDate;
	private String problemCallDuration;
	private String problemOperator;
	private String problemClientName;
	private String problemClientId;

	public String getProblemCallerId() {
		return problemCallerId;
	}

	public void setProblemCallerId(String problemCallerId) {
		this.problemCallerId = problemCallerId;
	}

	public String getProblemCallDate() {
		return problemCallDate;
	}

	public void setProblemCallDate(String problemCallDate) {
		this.problemCallDate = problemCallDate;
	}

	public String getProblemCallDuration() {
		return problemCallDuration;
	}

	public void setProblemCallDuration(String problemCallDuration) {
		this.problemCallDuration = problemCallDuration;
	}

	public String getProblemOperator() {
		return problemOperator;
	}

	public void setProblemOperator(String problemOperator) {
		this.problemOperator = problemOperator;
	}

	public String getProblemClientName() {
		return problemClientName;
	}

	public void setProblemClientName(String problemClientName) {
		this.problemClientName = problemClientName;
	}

	public String getProblemClientId() {
		return problemClientId;
	}

	public void setProblemClientId(String problemClientId) {
		this.problemClientId = problemClientId;
	}

	public int getProblemCaseId() {
		return problemCaseId;
	}

	public void setProblemCaseId(int problemCaseId) {
		this.problemCaseId = problemCaseId;
	}

	public String getProblemCaseDescription() {
		return problemCaseDescription;
	}

	public void setProblemCaseDescription(String problemCaseDescription) {
		this.problemCaseDescription = problemCaseDescription;
	}
}
