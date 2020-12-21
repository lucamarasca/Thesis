/*
 * generated by Xtext 2.23.0
 */
grammar DebugInternalBPMN_translator;

// Rule Model
ruleModel:
	ruleXml
;

// Rule Xml
ruleXml:
	ruleprolog?
	ruleelement
	*
;

// Rule prolog
ruleprolog:
	'<?'
	RULE_HEAD
	'version='
	RULE_STRING
	'encoding='
	RULE_STRING
	'?>'
;

// Rule element
ruleelement:
	(
		ruleOpen
		rulecontent
		ruleClose
		    |
		ruleSingleton
	)
;

// Rule content
rulecontent:
	(
		'_TASK'
		'{'
		rulecodex
		'}'
		    |
		ruleelement
		    |
		RULE_BODY
		    |
		RULE_KEYWORDS
		    |
		RULE_STRING
	)*
;

// Rule Open
ruleOpen:
	'<'
	RULE_HEAD
	':'
	RULE_KEYWORDS
	(
		RULE_HEAD
		':'
		    |
		(
			RULE_HEAD
			    |
			RULE_KEYWORDS
		)
		'='
		RULE_STRING
	)*
	'>'
;

// Rule Singleton
ruleSingleton:
	'<'
	RULE_HEAD
	':'
	RULE_KEYWORDS
	(
		RULE_HEAD
		':'
		    |
		RULE_KEYWORDS
		'='
		RULE_STRING
	)*
	'/>'
;

// Rule Close
ruleClose:
	'</'
	RULE_HEAD
	':'
	RULE_KEYWORDS
	'>'
;

// Rule codex
rulecodex:
	ruledevice
	ruleprotocol
	*
	rulesensor
	*
;

// Rule device
ruledevice:
	'DEVICE'
	':'
	RULE_STRING
	'NAMEID'
	':'
	RULE_STRING
;

// Rule protocol
ruleprotocol:
	'MQTT'
	'{'
	rulemqtt_data
	rulemqtt_device
	'}'
;

// Rule mqtt_data
rulemqtt_data:
	(
		'NAME'
		'='
		RULE_STRING
		    |
		'BROKER_USER'
		'='
		RULE_STRING
		    |
		'BROKER_PASSWORD'
		'='
		RULE_STRING
		    |
		'BROKER'
		'='
		RULE_STRING
		    |
		'NETWORK'
		'{'
		rulemqtt_network_data
		*
		'}'
		    |
		'SUBTOPICS'
		'{'
		(
			'TOPIC_NAME'
			'='
			RULE_STRING
		)*
		'}'
		    |
		'PUBTOPICS'
		'{'
		(
			'TOPIC_NAME'
			'='
			RULE_STRING
			*
			    |
			'DATA'
			'='
			(
				RULE_STRING
				    |rulevariable
			)
		)*
		'}'
	)*
;

// Rule mqtt_network_data
rulemqtt_network_data:
	'SSID'
	'='
	RULE_STRING
	'PASSWORD'
	'='
	RULE_STRING
;

// Rule mqtt_device
rulemqtt_device:
	'PROTOCOL_DEVICE'
	'{'
	'NAME'
	'='
	RULE_STRING
	'}'
;

// Rule sensor
rulesensor:
	(
		'TEMPERATURE'
		'{'
		rulesensor_data
		'}'
		    |
		'DISTANCE'
		'{'
		rulesensor_data
		'}'
	)
;

// Rule sensor_data
rulesensor_data:
	(
		'NAME'
		'='
		RULE_STRING
		    |
		'PINS'
		'='
		RULE_STRING
		    |
		'SENSOR_ID'
		'='
		RULE_STRING
	)*
;

// Rule variable
rulevariable:
	(
		'TEMPERATURE'
		    |
		'DISTANCE'
	)
;

RULE_HEAD : ('bpmn'|'bpmndi'|'camunda'|'xsi'|'xml'|'xmlns'|'dc'|'di');

RULE_KEYWORDS : ('id'|'name'|'isExecutable'|'sourceRef'|'processRef'|'targetRef'|'calledElement'|'type'|'expression'|'value'|'resultVariable'|'asyncBefore'|'intermediateThrowEvent'|'class'|'event'|'startEvent'|'task'|'messageEventDefinition'|'sequenceFlow'|'isExpanded'|'condition'|'association'|'outgoing'|'serviceTask'|'process'|'standardLoopCharacteristics'|'incoming'|'intermediateCatchEvent'|'conditionalEventDefinition'|'isMarkerVisible'|'terminateEventDefinition'|'endEvent'|'textAnnotation'|'text'|'dataStoreReference'|'bpmnElement'|'dataObjectReference'|'callActivity'|'laneSet'|'lane'|'flowNodeRef'|'definitions'|'userTask'|'documentation'|'dataOutputAssociation'|'exclusiveGateway'|'waypoint'|'BPMNLabel'|'diagramRelationId'|'extensionElements'|'inputOutput'|'list'|'inputParameter'|'height'|'messageFlow'|'dataObjectRef'|'outputParameter'|'properties'|'property'|'BPMNShape'|'Bounds'|'subProcess'|'cancelActivity'|'field'|'string'|'scriptTask'|'script'|'BPMNPlane'|'BPMNEdge'|'sendTask'|'boundaryEvent'|'executionListener'|'timerEventDefinition'|'timeDuration'|'width'|'dataInputAssociation'|'parallelGateway'|'collaboration'|'participant'|'targetNamespace'|'dataObject'|'signalEventDefinition'|'BPMNDiagram'|'exporter'|'exporterVersion'|'x'|'y'|'isHorizontal'|'attachedToRef'|'conditionExpression'|'receiveTask'|'messageRef'|'initiator'|'message');

RULE_BODY : ('a'..'z'|'A'..'Z'|'\u00E8'|'\u00F2'|RULE_INT|'_')*;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

fragment RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/' {skip();};

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')? {skip();};

RULE_WS : (' '|'\t'|'\r'|'\n')+ {skip();};

RULE_ANY_OTHER : .;
