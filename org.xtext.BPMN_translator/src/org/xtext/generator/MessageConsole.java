package org.xtext.generator;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import javax.swing.JTextArea;

public class MessageConsole extends JTextArea{

	private PrintStream printStream;
	
    public MessageConsole() {
        
    	printStream = new PrintStream(new ConsolePrintStream());
        
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Test program");
        }
    }
    public PrintStream getPrintStream() {
        return printStream;
      }
    
  //L' output stream definito da noi
    private class ConsolePrintStream extends ByteArrayOutputStream {
      public synchronized void write(byte[] b, int off, int len) {
        setCaretPosition(getDocument().getLength());
        String str = new String(b);
        append(str.substring(off, len));
      }
    }
}