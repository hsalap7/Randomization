import java.util.Random;
import javax.swing.JOptionPane;
public class GetRandomNumber
{
	int range;
	String message="";
	void Generate()
	{
		Random r=new Random();
		String R=JOptionPane.showInputDialog(null,"Enter your range");
		range=Integer.parseInt(R);
		for(int i=0;i<=range;i++)
		{
			int num=r.nextInt(range);	
			message=message+num;
			message=message+"\n";
		}
		
	}
	public static void main(String ... args)
	{
		GetRandomNumber g1=new GetRandomNumber();
		g1.Generate();
		JOptionPane.showMessageDialog(null,g1.message);
	}
}