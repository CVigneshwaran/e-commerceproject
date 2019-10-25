package Sampleproject.system;

public interface PaymentDAO {
	public boolean addPayment(Payment pa);
	public boolean deletePayment(Payment pa);
	public boolean updatePayment(Payment pa);
	public Payment findPayment(int id);
	public java.util.List<Payment> getAllPayments(String cartid);

}
