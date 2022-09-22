
public class Bank 
{
private int accNumber;
private String bankName;
public int getAccNumber() {
	return accNumber;
}
public void setAccNumber(int accNumber) {
	this.accNumber = accNumber;
}
public String getBankName() {
	return bankName;
}
public void setBankName(String bankName) {
	this.bankName = bankName;
}
public Bank(int accNumber, String bankName) {
	super();
	this.accNumber = accNumber;
	this.bankName = bankName;
}
public Bank() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Bank [accNumber=" + accNumber + ", bankName=" + bankName + "]";
}

}
