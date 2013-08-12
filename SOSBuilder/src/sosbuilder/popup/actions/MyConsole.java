package sosbuilder.popup.actions;

import java.io.OutputStream;
import java.io.PrintStream;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;

public class MyConsole extends MessageConsole {
	PrintStream errStream = null;
	PrintStream outStream = null;
	
	public MyConsole(String name) {
		super(name, null);
		// TODO Auto-generated constructor stub
	}

	static final String CONSOLE_NAME = "DSLTrans Output";

	public PrintStream getOutStream() {
		if(outStream == null)  
			outStream = new PrintStream(newMessageStream());
		return outStream;
	}

	public PrintStream getErrStream() {
		if(errStream == null) {
			MessageConsoleStream err = newMessageStream();
			err.setColor(new Color(Display.getCurrent(), 255, 128, 0));
			errStream =  new PrintStream(err);
		}
		return errStream;
	}

}
