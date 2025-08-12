import java.text.*;
class NumberFormatDemo{
	public static void main(String [] args){
	NumberFormat f=NumberFormat.getNumberInstance();
	f.setMaximumFractionDigits(2);
	f.setMinimumFractionDigits(2);
	System.out.println("price=rs."+f.format(89.198));
	}
}
