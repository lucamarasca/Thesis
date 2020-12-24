import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        DebugInternalBPMN_translatorLexer lex = new DebugInternalBPMN_translatorLexer(new ANTLRFileStream("C:\\Users\\Luca\\eclipse-workspace\\org.xtext.BPMN_translator\\bin\\org\\xtext\\parser\\antlr\\internal\\output\\__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        DebugInternalBPMN_translatorParser g = new DebugInternalBPMN_translatorParser(tokens, 49100, null);
        try {
            g.ruleModel();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}