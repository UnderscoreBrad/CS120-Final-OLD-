package finalexam;

// corresponds to the STO of our project with flags 0
// direct addressing
public class STO extends Instruction{

	public STO(CPU aCpu, Memory aMemory) {
		super(aCpu, aMemory);
	}
	
	@Override
	public void execute(int arg) {
		memory.setData(arg,cpu.getAccum());
		cpu.setPc(cpu.getPc()+1);
// set the data in memory at index arg to the value in the accum in cpu
// add 1 to the pc in cpu as is done in NOT
	}
}
