package homework6;

public class Die
{    
	//instance data declaration (instance data)    
	private int faceValue;    
	private final int MAX=6;    
	
	//default constructor    
	public Die()
	{       
		// faceValue=3; //my own default       
		roll();
	}
	
	//method roll    
	//method header -> returnType, methodName, parameterList    
	public void roll()
	{        
		faceValue=(int)(Math.random()*MAX)+1;    
	}    
	
	//getter method    
	public int getFaceValue()
	{       
		return faceValue;    
	}    
	
	//setter method    
	public void setFaceValue(int newFace)
	{        
		faceValue=newFace;    
	}     
	
	//toString()    
	public String toString()
	{        
		String info ="Die with face value: "+ faceValue;        
		return info;    
	}
}