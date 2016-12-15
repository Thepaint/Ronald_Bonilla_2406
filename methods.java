
public class methods2 {

	private String userAccount;
	private String userFirst;
	private String userLast;
	private String password;
	private String description;
	private int userID;
	private int workerID;
	private double commission;

	public void makeAccount(String userAccount, String userFirst, String userLast, String password)
	{
		this.userFirst = userAccount;
		this.userLast = userAccount;
		this.password = userAccount;
	}

	public void setAccount(String userFirst, String userLast, String password)
	{
		this.userFirst = userAccount;
		this.userLast = userAccount;
		this.password = userAccount;
	}

	public String getAccount()
	{
		return userAccount;
	}
		public String getFirst()
		{
			return userFirst;
		
	}
	public String getlast()
	{
		return userLast;
	}
	public String getpassword()
	{
		return password;
	}
	public String description (String description)
	{
		return this.description = description;
	}
	public String setdescription (String description)
	{
		return this.description = description;
	}
	public String getDescription()
	{
		return description;
	}
	public void workerID(int workerID)
	{
		this.workerID = workerID;
	}
	public int setworkerID (int workerID)
	{
		return this.workerID = workerID;
	}
	public int getworkerID()
	{
		return workerID;
	}
	public void userID(int userID)
	{
		this.userID = userID;
	}
	public int setuserID (int userID)
	{
		return this.userID = userID;
	}
	public int getuserID()
	{
		return userID;
	}
	public double commission(double commission)
	{
		return this.commission = commission;
	}
	public double setcommission(double commission)
	{
		return this.commission = commission;
	}
	public double getcommission()
	{
		return commission;
	}
    
}
