package finalexam;

// corresponds to the ADD of our project with flags 4
// indirect addressing
public class ADDN extends ADD {

	public ADDN(CPU aCpu, Memory aMemory) {
		super(aCpu, aMemory);
	}
	
	@Override
	public void execute(int arg) {
		super.execute(memory.getData(arg));
// just use the execute of the parent ADD, 
// changing the argument to memory.getData(arg)
// See the "IMPORTANT" at the end of Question 3.
	}

	@Override
	public boolean isIndirect() {
		return true;
	}
}
