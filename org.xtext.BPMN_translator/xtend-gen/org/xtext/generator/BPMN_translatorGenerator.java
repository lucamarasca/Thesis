/**
 * generated by Xtext 2.23.0
 */
package org.xtext.generator;

import java.util.ArrayList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.CollectionExtensions;
import org.xtext.generator.Parameters;
import org.xtext.generator.SensorsCodeGenerator;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class BPMN_translatorGenerator extends AbstractGenerator {
  private ArrayList<String> task_type;
  
  private ArrayList<String> gateway_type;
  
  private String app;
  
  private Resource r;
  
  private int i;
  
  private String incoming_arrow;
  
  private String outgoing_arrow;
  
  private SensorsCodeGenerator s;
  
  private String return_value;
  
  public Resource Initialize(final Resource resource) {
    Resource _xblockexpression = null;
    {
      this.FillTaskType();
      this.FillGatewayType();
      _xblockexpression = this.r = resource;
    }
    return _xblockexpression;
  }
  
  public boolean FillTaskType() {
    boolean _xblockexpression = false;
    {
      ArrayList<String> _arrayList = new ArrayList<String>();
      this.task_type = _arrayList;
      _xblockexpression = CollectionExtensions.<String>addAll(this.task_type, "task", "sendTask", "receiveTask", "userTask", 
        "manualTask", "businessRuleTask", "serviceTask", "scriptTask", 
        "callActivity");
    }
    return _xblockexpression;
  }
  
  public boolean FillGatewayType() {
    boolean _xblockexpression = false;
    {
      ArrayList<String> _arrayList = new ArrayList<String>();
      this.gateway_type = _arrayList;
      _xblockexpression = CollectionExtensions.<String>addAll(this.gateway_type, "exclusiveGateway", "parallelGateway", "inclusiveGateway", 
        "complexGateway", "eventBasedGateway");
    }
    return _xblockexpression;
  }
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    if ((resource != null)) {
      this.Initialize(resource);
      String _StaticMainFileStart = this.StaticMainFileStart();
      String _StaticMainFileEnd = this.StaticMainFileEnd();
      String _plus = (_StaticMainFileStart + _StaticMainFileEnd);
      fsa.generateFile("Main.ino", _plus);
      String _StaticLibHStart = this.StaticLibHStart();
      String _StaticLibHEnd = this.StaticLibHEnd();
      String _plus_1 = (_StaticLibHStart + _StaticLibHEnd);
      fsa.generateFile("GeneratedLib.h", _plus_1);
      fsa.generateFile("GeneratedLib.cpp", this.ArduinoSensorGenerationCodeCPP());
    } else {
      String _StaticMainFileStart_1 = this.StaticMainFileStart();
      String _StaticMainFileEnd_1 = this.StaticMainFileEnd();
      String _plus_2 = (_StaticMainFileStart_1 + _StaticMainFileEnd_1);
      fsa.generateFile("Main.ino", _plus_2);
      String _StaticLibHStart_1 = this.StaticLibHStart();
      String _StaticLibHEnd_1 = this.StaticLibHEnd();
      String _plus_3 = (_StaticLibHStart_1 + _StaticLibHEnd_1);
      fsa.generateFile("GeneratedLib.h", _plus_3);
      fsa.generateFile("GeneratedLib.cpp", this.ArduinoSensorGenerationCodeCPP());
    }
  }
  
  public String ArduinoSensorGenerationCodeCPP() {
    SensorsCodeGenerator _sensorsCodeGenerator = new SensorsCodeGenerator(Parameters.selected_sensor, 0);
    this.s = _sensorsCodeGenerator;
    return this.s.GenerateCPPCode();
  }
  
  public String StaticLibHStart() {
    return "\r\n#include \"Arduino.h\"        //includes the library Arduino.h\r\n#include \"SoftwareSerial.h\" //Includes the library SoftwareSerial.h\r\n//Used for defining static variables\r\nenum {\r\n\t//rate of trnsmission\r\n\tBAUND_RATE = 9600,\r\n};\r\nclass MyBPMNClass {\r\n";
  }
  
  public String StaticLibHEnd() {
    return "}";
  }
  
  public String StaticMainFileStart() {
    return (((("#include <GeneratedLib.h>\n" + 
      "void setup()\n") + 
      "{") + 
      "\tSerial.begin(9600);\n // opens serial port, sets data rate to 9600 bps") + 
      "\twhile (!Serial);");
  }
  
  public String StaticMainFileEnd() {
    return "\r\n}\r\nvoid loop()\r\n{\r\n\r\n}\r\n";
  }
}
