
public class HR extends LeaveRequestHandler{
	public HR(LeaveRequestHandler processor){ 
        super(processor); 
          
    } 
  
    public void process(LeaveRequestemployee request)  
    {  
        if (request.getNumber() >5)  
        {  
            System.out.println("HR : " + request.getNumber());  
        }  
        else
        {  
            super.process(request);  
        }  
    }  
}
