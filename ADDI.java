package finalexam;

// corresponds to the ADD of our project with flags 2
// immediate addressing
public class ADDI extends Instruction {

    public ADDI(CPU aCpu, Memory aMemory) {
        super(aCpu, aMemory);
    }
	
	@Override
	public void execute(int arg) throws DataAccessException {
        cpu.setAccum(arg + cpu.getAccum());
        cpu.setPc(cpu.getPc()+1);
// use get and set of accum in cpu to add arg to the accum.
// see how NOT changes the pc in cpu
	}
	
    @Override
    public boolean isImmediate( ) {
       return false;
    }
}
