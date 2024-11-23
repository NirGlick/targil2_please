import java.util.ArrayList;

/** Description of SharedData
 * this class is used for generating of an array that can store shared data
 * it has the getArray function that helps us getting data from the array
 */
public class SharedData 
{
	private ArrayList<Integer> array;
	private boolean [] winArray;
	private boolean flag;
	private final int b;
	
	/** Description of the constructor SharedData(ArrayList<Integer> array2, int b)
	 * @param array2 is an ArrayList of integers
	 * @param b is an integer
	 */
	public SharedData(ArrayList<Integer> array2, int b) {
		
		this.array = array2;
		this.b = b;
	}

	/** Description of getWinArray() 
	 * @return an array of boolean type
	 */
	public boolean[] getWinArray() 
	{
		return winArray;
	}

	/** Description of setWinArray(boolean [] winArray)
	 * @param winArray is an array of boolean type
	 */
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	/** Description of getArray()
	 * @return an array of ArrayList<Integet> type
	 */
	public ArrayList<Integer> getArray() 
	{
		return array;
	}

	/** Description of getB()
	 * @return an integer
	 */
	public int getB() 
	{
		return b;
	}

	/** Description of getFlag()
	 * @return boolean type (flag)
	 */
	public boolean getFlag() 
	{
		return flag;
	}

	/** Description of setFlag(boolean flag)
	 * @param flag is a boolean parameter
	 */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
