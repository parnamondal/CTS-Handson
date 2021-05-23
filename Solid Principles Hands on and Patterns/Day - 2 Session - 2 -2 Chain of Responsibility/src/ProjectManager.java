

public class ProjectManager extends LeaveRequestHandler{
	public ProjectManager(LeaveRequestHandler processor){ 
        super(processor); 
          
    } 
  
    public void process(LeaveRequestemployee request)  
    {  
        if (request.getNumber() >3 && request.getNumber()<=5)  
        {  
            System.out.println("ProjectManager : " + request.getNumber());  
        }  
        else
        {  
            super.process(request);  
        }  
    }  
}
