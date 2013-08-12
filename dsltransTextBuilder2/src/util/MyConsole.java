package util;

import java.io.PrintStream;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;

public class MyConsole extends MessageConsole {
	private PrintStream errStream = null;
	private PrintStream outStream = null;
	public static final String CONSOLE_NAME = "DSLTrans Format Converter Output";
	
	public MyConsole(String name) {
		super(name, null);
	}

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