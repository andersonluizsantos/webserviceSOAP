package entidade;

public class DefaultOut {

	private int pOutCode;
	private String pOutMessage;

	public DefaultOut() {
		super();
	}

	public DefaultOut(int pOutCode, String pOutMessage) {
		super();
		this.pOutCode = pOutCode;
		this.pOutMessage = pOutMessage;
	}

	public int getPOutCode() {
		return pOutCode;
	}

	public void setPOutCode(int pOutCode) {
		this.pOutCode = pOutCode;
	}

	public String getPOutMessage() {
		return pOutMessage;
	}

	public void setPOutMessage(String pOutMessage) {
		this.pOutMessage = pOutMessage;
	}

	@Override
	public String toString() {
		return "DefaultOut {pOutCode=" + pOutCode + ", pOutMessage=" + pOutMessage + "}";
	}
}
