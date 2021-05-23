

public class Chain 
{ 
LeaveRequestHandler chain; 
  
public Chain(){ 
    buildChain(); 
} 
  
private void buildChain(){ 
    chain = new Supervisor(new ProjectManager(new HR(null))); 
} 
  
public void process(LeaveRequestemployee request) { 
    chain.process(request); 
} 
  
} 