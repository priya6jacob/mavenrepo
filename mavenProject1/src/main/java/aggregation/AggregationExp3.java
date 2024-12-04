package aggregation;

public class AggregationExp3 
{
String name;
int id;
AggregationExp2 ae;
public AggregationExp3(String name,int id,AggregationExp2 ae)
{
	this.name=name;
	this.id=id;
	this.ae=ae;
}
public void display()
{
	System.out.println(ae.a+" "+ae.b);
	System.out.println(name+" "+id);
}
	public static void main(String[] args)
	{
		AggregationExp2 ag=new AggregationExp2(12,15);
		AggregationExp3 ag1=new AggregationExp3("Fara",120,ag);
		ag1.display();

	}

}
