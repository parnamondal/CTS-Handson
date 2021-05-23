
public class Supervisor extends LeaveRequestHandler{
	public Supervisor(LeaveRequestHandler processor){ 
        super(processor); 
          
    } 
  
    public void process(LeaveRequestemployee request)  
    {  
        if (request.getNumber() >=1 && request.getNumber()<=3)  
        {  
            System.out.println("Supervisor : " + request.getNumber());  
        }  
        else
        {  
            super.process(request);  
        }  
    }  
}
