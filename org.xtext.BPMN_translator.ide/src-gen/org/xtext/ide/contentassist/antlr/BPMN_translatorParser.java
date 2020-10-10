/*
 * generated by Xtext 2.23.0
 */
package org.xtext.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.ide.contentassist.antlr.internal.InternalBPMN_translatorParser;
import org.xtext.services.BPMN_translatorGrammarAccess;

public class BPMN_translatorParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(BPMN_translatorGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, BPMN_translatorGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getTagAccess().getAlternatives(), "rule__Tag__Alternatives");
			builder.put(grammarAccess.getTagAccess().getAlternatives_1(), "rule__Tag__Alternatives_1");
			builder.put(grammarAccess.getSingletonAccess().getAlternatives_1(), "rule__Singleton__Alternatives_1");
			builder.put(grammarAccess.getSingletonAccess().getAlternatives_1_0_0(), "rule__Singleton__Alternatives_1_0_0");
			builder.put(grammarAccess.getSingletonAccess().getAlternatives_1_0_4(), "rule__Singleton__Alternatives_1_0_4");
			builder.put(grammarAccess.getXmlAccess().getGroup(), "rule__Xml__Group__0");
			builder.put(grammarAccess.getSingletonAccess().getGroup(), "rule__Singleton__Group__0");
			builder.put(grammarAccess.getSingletonAccess().getGroup_1_0(), "rule__Singleton__Group_1_0__0");
			builder.put(grammarAccess.getSingletonAccess().getGroup_1_0_4_0(), "rule__Singleton__Group_1_0_4_0__0");
			builder.put(grammarAccess.getSingletonAccess().getGroup_1_0_4_1(), "rule__Singleton__Group_1_0_4_1__0");
			builder.put(grammarAccess.getModelAccess().getModelAssignment(), "rule__Model__ModelAssignment");
			builder.put(grammarAccess.getXmlAccess().getTagAssignment_1(), "rule__Xml__TagAssignment_1");
			builder.put(grammarAccess.getTagAccess().getResultAssignment_1_0(), "rule__Tag__ResultAssignment_1_0");
			builder.put(grammarAccess.getTagAccess().getResultAssignment_1_1(), "rule__Tag__ResultAssignment_1_1");
			builder.put(grammarAccess.getTagAccess().getResultAssignment_2(), "rule__Tag__ResultAssignment_2");
			builder.put(grammarAccess.getSingletonAccess().getValueAssignment_1_0_4_1_2(), "rule__Singleton__ValueAssignment_1_0_4_1_2");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private BPMN_translatorGrammarAccess grammarAccess;

	@Override
	protected InternalBPMN_translatorParser createParser() {
		InternalBPMN_translatorParser result = new InternalBPMN_translatorParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public BPMN_translatorGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(BPMN_translatorGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}