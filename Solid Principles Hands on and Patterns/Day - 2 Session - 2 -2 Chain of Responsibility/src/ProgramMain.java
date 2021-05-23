
public class ProgramMain {
public static void main(String args[]) {
	Chain chain=new Chain();
	chain.process(new LeaveRequestemployee(1));
	chain.process(new LeaveRequestemployee(4));
	chain.process(new LeaveRequestemployee(7));
}
}
