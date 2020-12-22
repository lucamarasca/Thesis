/**
 * generated by Xtext 2.23.0
 */
package org.xtext.generator;

import com.google.common.collect.Iterables;
import elements.Elements;
import java.util.ArrayList;
import network.protocols.MQTT;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.CollectionExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.xtext.bPMN_translator.Open;
import org.xtext.bPMN_translator.Singleton;
import org.xtext.bPMN_translator.codex;
import org.xtext.bPMN_translator.content;
import org.xtext.bPMN_translator.device;
import org.xtext.bPMN_translator.element;
import org.xtext.bPMN_translator.mqtt_data;
import org.xtext.bPMN_translator.mqtt_device;
import org.xtext.bPMN_translator.mqtt_network_data;
import org.xtext.bPMN_translator.protocol;
import org.xtext.bPMN_translator.sensor;
import org.xtext.bPMN_translator.sensor_data;
import org.xtext.generator.ArduinoCPPCodeGenerator;
import org.xtext.generator.ArduinoHCodeGenerator;
import org.xtext.generator.ArduinoInoCodeGenerator;
import org.xtext.generator.Parameters;
import sensor.devices.TemperatureSensor;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class BPMN_translatorGenerator extends AbstractGenerator {
  private ArrayList<String> task_type;
  
  private ArrayList<String> gateway_type;
  
  private ArrayList<String> start_events;
  
  private String cpp_code;
  
  private ArduinoCPPCodeGenerator cpp_gen;
  
  private String h_code;
  
  private ArduinoHCodeGenerator h_gen;
  
  private ArrayList<String> ino_code;
  
  private ArduinoInoCodeGenerator ino_gen;
  
  private MQTT netdata;
  
  private TemperatureSensor s;
  
  private ArrayList<Elements> elements;
  
  private ArrayList<String> generated_elements;
  
  private int iterations;
  
  private int n = 0;
  
  private int j = 0;
  
  private int i = 0;
  
  public void Initialize(final Resource resource) {
    ArduinoInoCodeGenerator _arduinoInoCodeGenerator = new ArduinoInoCodeGenerator();
    this.ino_gen = _arduinoInoCodeGenerator;
    ArrayList<String> _arrayList = new ArrayList<String>();
    this.ino_code = _arrayList;
    ArrayList<Elements> _arrayList_1 = new ArrayList<Elements>();
    this.elements = _arrayList_1;
    ArrayList<String> _arrayList_2 = new ArrayList<String>();
    this.generated_elements = _arrayList_2;
    ArrayList<String> _arrayList_3 = new ArrayList<String>();
    this.start_events = _arrayList_3;
    this.iterations = 0;
    this.cpp_code = "";
    this.h_code = "";
    this.generated_elements.add("");
    this.ino_code.add("");
    this.FillTaskType();
    this.FillGatewayType();
    this.setDatas(resource);
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
      this.FillEvent(resource);
      this.FindSuccessors("ExclusiveGateway_1tz8rou", resource);
      for (final String start : this.start_events) {
        System.out.println(start);
      }
      this.ino_code = this.ArduinoCodeGenerationIno();
      for (final String file : this.ino_code) {
        {
          fsa.generateFile((("Main" + Integer.valueOf(this.iterations)) + ".ino"), file);
          this.iterations++;
        }
      }
      fsa.generateFile("GeneratedLib.h", this.cpp_code);
      fsa.generateFile("GeneratedLib.cpp", this.cpp_code);
    } else {
      ArduinoHCodeGenerator _arduinoHCodeGenerator = new ArduinoHCodeGenerator(Parameters.selected_sensor, Parameters.selected_protocol, Parameters.selected_wifisensor);
      this.h_gen = _arduinoHCodeGenerator;
      String _ArduinoCodeGenerationH = this.ArduinoCodeGenerationH();
      String _plus = ("//+++++++++NO SOURCE BPMN SELECTED" + _ArduinoCodeGenerationH);
      fsa.generateFile("GeneratedLib.h", _plus);
      ArduinoCPPCodeGenerator _arduinoCPPCodeGenerator = new ArduinoCPPCodeGenerator(Parameters.selected_device, Parameters.selected_protocol, Parameters.selected_wifisensor, Parameters.selected_sensor);
      this.cpp_gen = _arduinoCPPCodeGenerator;
      String _ArduinoCodeGenerationCPP = this.ArduinoCodeGenerationCPP();
      String _plus_1 = ("//+++++++++NO SOURCE BPMN SELECTED" + _ArduinoCodeGenerationCPP);
      fsa.generateFile("GeneratedLib.cpp", _plus_1);
    }
  }
  
  public void FillEvent(final Resource r) {
    Iterable<element> _filter = Iterables.<element>filter(IteratorExtensions.<EObject>toIterable(r.getAllContents()), element.class);
    for (final element Element : _filter) {
      EList<Open> _open = Element.getOpen();
      for (final Open Open : _open) {
        boolean _equals = Open.getKeywords().get(0).equals("startEvent");
        if (_equals) {
          this.start_events.add(this.getID(Open));
        }
      }
    }
  }
  
  public String getID(final Open open) {
    this.i = 0;
    EList<String> _keywords1 = open.getKeywords1();
    for (final String keywords : _keywords1) {
      {
        boolean _equals = keywords.equals("id");
        if (_equals) {
          return open.getValue().get(this.i);
        }
        this.i++;
      }
    }
    return null;
  }
  
  public String getID(final Singleton tag) {
    this.i = 0;
    EList<String> _keywords = tag.getKeywords();
    for (final String keywords : _keywords) {
      {
        boolean _equals = keywords.equals("id");
        if (_equals) {
          return tag.getValue().get(this.i);
        }
        this.i++;
      }
    }
    return null;
  }
  
  public void FindSuccessors(final String my_id, final Resource r) {
    this.i = 0;
    this.n = 0;
    this.j = 0;
    Iterable<element> _filter = Iterables.<element>filter(IteratorExtensions.<EObject>toIterable(r.getAllContents()), element.class);
    for (final element Element : _filter) {
      {
        EList<Singleton> _singleton_tag = Element.getSingleton_tag();
        for (final Singleton Singleton : _singleton_tag) {
          {
            boolean _equals = Singleton.getKeywords().get(0).equals("sequenceFlow");
            if (_equals) {
              EList<String> _keywords1 = Singleton.getKeywords1();
              for (final String keywords : _keywords1) {
                {
                  boolean _equals_1 = keywords.equals("sourceRef");
                  if (_equals_1) {
                    boolean _equals_2 = Singleton.getValue().get(this.n).equals(my_id);
                    if (_equals_2) {
                      EList<String> _keywords1_1 = Singleton.getKeywords1();
                      for (final String keywords1 : _keywords1_1) {
                        {
                          boolean _equals_3 = keywords1.equals("targetRef");
                          if (_equals_3) {
                            System.out.println(Singleton.getValue().get(this.j));
                          }
                          this.j++;
                        }
                      }
                      this.j = 0;
                    }
                  }
                  this.n++;
                }
              }
              this.n = 0;
            }
            this.i++;
          }
        }
        this.i = 0;
      }
    }
    Iterable<element> _filter_1 = Iterables.<element>filter(IteratorExtensions.<EObject>toIterable(r.getAllContents()), element.class);
    for (final element Element_1 : _filter_1) {
      {
        EList<Open> _open = Element_1.getOpen();
        for (final Open Open : _open) {
          {
            boolean _equals = Open.getKeywords().get(0).equals("sequenceFlow");
            if (_equals) {
              EList<String> _keywords1 = Open.getKeywords1();
              for (final String keywords : _keywords1) {
                {
                  boolean _equals_1 = keywords.equals("sourceRef");
                  if (_equals_1) {
                    boolean _equals_2 = Open.getValue().get(this.n).equals(my_id);
                    if (_equals_2) {
                      EList<String> _keywords1_1 = Open.getKeywords1();
                      for (final String keywords1 : _keywords1_1) {
                        {
                          boolean _equals_3 = keywords1.equals("targetRef");
                          if (_equals_3) {
                            System.out.println(Open.getValue().get(this.j));
                          }
                          this.j++;
                        }
                      }
                      this.j = 0;
                    }
                  }
                  this.n++;
                }
              }
              this.n = 0;
            }
            this.i++;
          }
        }
        this.i = 0;
      }
    }
  }
  
  public ArrayList<String> ArduinoCodeGenerationIno() {
    return this.ino_gen.Generation(this.elements);
  }
  
  public String ArduinoCodeGenerationH() {
    return this.h_gen.Generation();
  }
  
  public String ArduinoCodeGenerationCPP() {
    return this.cpp_gen.Generation();
  }
  
  public void setDatas(final Resource r) {
    ArduinoCPPCodeGenerator _arduinoCPPCodeGenerator = new ArduinoCPPCodeGenerator();
    this.cpp_gen = _arduinoCPPCodeGenerator;
    ArduinoHCodeGenerator _arduinoHCodeGenerator = new ArduinoHCodeGenerator();
    this.h_gen = _arduinoHCodeGenerator;
    this.setNetworkProtocolDatas(r);
    this.cpp_gen.setProtocol(this.netdata);
    this.h_gen.setProtocol(this.netdata);
  }
  
  public void setNetworkProtocolDatas(final Resource r) {
    Iterable<element> _filter = Iterables.<element>filter(IteratorExtensions.<EObject>toIterable(r.getAllContents()), element.class);
    for (final element Element : _filter) {
      EList<content> _contents = Element.getContents();
      for (final content Content : _contents) {
        EList<codex> _codex = Content.getCodex();
        for (final codex Codex : _codex) {
          {
            boolean _equals = Content.getType().get(0).equals("_TASK");
            if (_equals) {
              EList<protocol> _protocol = Codex.getProtocol();
              for (final protocol Protocol : _protocol) {
                boolean _equals_1 = Protocol.getPname().get(0).toLowerCase().replaceAll("\\s+", "").equals("mqtt");
                if (_equals_1) {
                  MQTT _mQTT = new MQTT();
                  this.netdata = _mQTT;
                  this.elements.add(this.netdata);
                  this.netdata.setType("mqtt");
                  this.netdata.setName(this.getName(Element));
                  EList<device> _device_code = Codex.getDevice_code();
                  for (final device Device : _device_code) {
                    {
                      this.netdata.getDatas().setDevice(Device.getDevice().get(0));
                      this.cpp_gen.setDevice(Device.getDevice().get(0));
                      this.netdata.setId(Device.getId().get(0));
                    }
                  }
                  EList<mqtt_data> _mqtt_data = Protocol.getMqtt_data();
                  for (final mqtt_data MQTTData : _mqtt_data) {
                    {
                      this.h_gen.setNetwork_protocol(MQTTData.getPname().get(0).toLowerCase().replaceAll("\\s+", ""));
                      this.cpp_gen.setNetwork_protocol(MQTTData.getPname().get(0).toLowerCase().replaceAll("\\s+", ""));
                      this.netdata.getDatas().setName(MQTTData.getPname().get(0));
                      this.netdata.getDatas().setBroker_user(MQTTData.getBroker_user().get(0));
                      this.netdata.getDatas().setBroker_password(MQTTData.getBroker_password().get(0));
                      this.netdata.getDatas().setBroker(MQTTData.getBroker().get(0));
                      this.netdata.getDatas().getWifi_ssid().clear();
                      this.netdata.getDatas().getWifi_pass().clear();
                      EList<mqtt_network_data> _mqtt_network_data = MQTTData.getMqtt_network_data();
                      for (final mqtt_network_data MQTT_network_data : _mqtt_network_data) {
                        {
                          this.netdata.getDatas().getWifi_ssid().add(MQTT_network_data.getSsid().get(0));
                          this.netdata.getDatas().getWifi_pass().add(MQTT_network_data.getPassword().get(0));
                        }
                      }
                      this.netdata.getDatas().getPubTopics().clear();
                      EList<String> _pubtopics = MQTTData.getPubtopics();
                      for (final String MQTT_topic_pub : _pubtopics) {
                        boolean _contains = this.netdata.getDatas().getPubTopics().contains(MQTT_topic_pub.toString());
                        boolean _not = (!_contains);
                        if (_not) {
                          this.netdata.getDatas().getPubTopics().add(MQTT_topic_pub.toString());
                        }
                      }
                      this.netdata.getDatas().getSubTopics().clear();
                      EList<String> _subtopics = MQTTData.getSubtopics();
                      for (final String MQTT_topic_sub : _subtopics) {
                        boolean _contains_1 = this.netdata.getDatas().getSubTopics().contains(MQTT_topic_sub.toString());
                        boolean _not_1 = (!_contains_1);
                        if (_not_1) {
                          this.netdata.getDatas().getSubTopics().add(MQTT_topic_sub.toString());
                        }
                      }
                    }
                  }
                  EList<mqtt_device> _mqtt_device = Protocol.getMqtt_device();
                  for (final mqtt_device MQTTDevice : _mqtt_device) {
                    {
                      this.h_gen.setWifi_sensor(MQTTDevice.getDname().get(0).toLowerCase().replaceAll("\\s+", ""));
                      this.cpp_gen.setWifi_sensor(MQTTDevice.getDname().get(0).toLowerCase().replaceAll("\\s+", ""));
                      this.netdata.setWifi_module(MQTTDevice.getDname().get(0));
                    }
                  }
                  boolean _contains = this.generated_elements.contains("mqtt");
                  boolean _not = (!_contains);
                  if (_not) {
                    String _cpp_code = this.cpp_code;
                    String _generateProtocolCode = this.cpp_gen.generateProtocolCode(this.netdata);
                    this.cpp_code = (_cpp_code + _generateProtocolCode);
                    this.generated_elements.add("mqtt");
                  }
                }
              }
              EList<sensor> _sensor_code = Codex.getSensor_code();
              for (final sensor sensor : _sensor_code) {
                boolean _equals_2 = sensor.getSname().get(0).toLowerCase().replaceAll("\\s+", "").equals("temperature");
                if (_equals_2) {
                  TemperatureSensor _temperatureSensor = new TemperatureSensor();
                  this.s = _temperatureSensor;
                  EList<device> _device_code_1 = Codex.getDevice_code();
                  for (final device Device_1 : _device_code_1) {
                    {
                      this.cpp_gen.setDevice(Device_1.getDevice().get(0));
                      this.s.setId(Device_1.getId().get(0));
                    }
                  }
                  this.elements.add(this.s);
                  this.s.setType("dht22");
                  EList<sensor_data> _sensor = sensor.getSensor();
                  for (final sensor_data sensdata : _sensor) {
                    {
                      this.s.setModule(sensdata.getPname().get(0).toLowerCase().replaceAll("\\s+", ""));
                      this.s.setSensorId(sensdata.getSensor_id().get(0));
                      EList<String> _pins = sensdata.getPins();
                      for (final String pins : _pins) {
                        this.s.getPins().add(pins);
                      }
                    }
                  }
                  boolean _contains_1 = this.generated_elements.contains("dht22");
                  boolean _not_1 = (!_contains_1);
                  if (_not_1) {
                    String _cpp_code_1 = this.cpp_code;
                    String _generateSensorCode = this.cpp_gen.generateSensorCode(this.s);
                    this.cpp_code = (_cpp_code_1 + _generateSensorCode);
                    this.generated_elements.add("dht22");
                  }
                }
              }
            }
            boolean _equals_3 = Content.getType().get(0).equals("_GATEWAY");
            if (_equals_3) {
              System.out.println("Qui c\'� un gateway");
            }
          }
        }
      }
    }
  }
  
  public String StaticMainFileStart() {
    return (((("GeneratedLib gen;\n" + 
      "void setup()\n") + 
      "{\n") + 
      "\tSerial.begin(9600);\n // opens serial port, sets data rate to 9600 bps") + 
      "\twhile (!Serial);\n");
  }
  
  public String StaticMainFileSecond() {
    return "\r\n}\r\nvoid loop()\r\n{\r\n\r\n\r\n";
  }
  
  public String getName(final element e) {
    EList<Open> _open = e.getOpen();
    for (final Open Open : _open) {
      EList<String> _keywords1 = Open.getKeywords1();
      for (final String Keywords : _keywords1) {
        {
          boolean _equals = Keywords.equals("name");
          if (_equals) {
            return Open.getValue().get(this.i);
          }
          this.i++;
        }
      }
    }
    return null;
  }
}
