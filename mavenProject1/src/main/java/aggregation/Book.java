package aggregation;

public class Book
{
	String bookname;
	int id;
	Author ref;
	public Book(String bookname,int id,Author ref)
	{
		this.bookname=bookname;
		this.id=id;
		this.ref=ref;
	}
	public void display()
	{
		System.out.println(ref.name+ " "+ref.age);
		System.out.println(bookname+" "+id);
	}

	public static void main(String[] args) 
	{
		Author au=new Author("Priya",33);
		Book bk=new Book("Java",100,au);
		bk.display();

	}

}
