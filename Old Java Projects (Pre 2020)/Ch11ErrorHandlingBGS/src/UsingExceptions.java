
public class UsingExceptions 
{

	public static void main(String[] args)
	{
		try
		{
			throwException();
		}
		catch (Exception exception)
		{
			System.err.println("Exception handler in main");
		}
		doesNotThrowException();
	}
	
	public static void throwException() throws Exception
	{
		try
		{
			System.out.println("Method throwException");
			throw new Exception();
		}
		catch(Exception ex)
		{
			try
			{
				System.err.println("Exception handling in method throwException");
				throw ex;
			}
			finally
			{
				System.err.println("Finally executed in throwException");
			}
		}
	} // end of throwException

public static void doesNotThrowException()
	{
		try
		{
			System.err.println("Method doesNotThrowException");
		}
		catch (Exception ex)
		{
			System.err.println(ex);
		}
		finally 
		{
			System.err.println("Finally executes in doesNotThrowException");
		}
		System.out.println("End of method doesNotThrowException");
	}

} // end of class UsingExceptions

