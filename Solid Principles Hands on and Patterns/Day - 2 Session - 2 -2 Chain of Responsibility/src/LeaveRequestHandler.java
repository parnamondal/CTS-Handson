
abstract class LeaveRequestHandler {
	private LeaveRequestHandler processor; 
	  
    public LeaveRequestHandler(LeaveRequestHandler processor){ 
        this.processor = processor; 
    }; 
      
    public void process(LeaveRequestemployee request){ 
        if(processor != null) 
            processor.process(request); 
    };  

}
