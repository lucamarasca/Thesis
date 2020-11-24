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
			builder.put(grammarAccess.getElementAccess().getAlternatives(), "rule__Element__Alternatives");
			builder.put(grammarAccess.getContentAccess().getAlternatives_1(), "rule__Content__Alternatives_1");
			builder.put(grammarAccess.getOpenAccess().getAlternatives_4(), "rule__Open__Alternatives_4");
			builder.put(grammarAccess.getOpenAccess().getAlternatives_4_1_0(), "rule__Open__Alternatives_4_1_0");
			builder.put(grammarAccess.getSingletonAccess().getAlternatives_1_4(), "rule__Singleton__Alternatives_1_4");
			builder.put(grammarAccess.getXmlAccess().getGroup(), "rule__Xml__Group__0");
			builder.put(grammarAccess.getPrologAccess().getGroup(), "rule__Prolog__Group__0");
			builder.put(grammarAccess.getElementAccess().getGroup_0(), "rule__Element__Group_0__0");
			builder.put(grammarAccess.getElementAccess().getGroup_1(), "rule__Element__Group_1__0");
			builder.put(grammarAccess.getContentAccess().getGroup(), "rule__Content__Group__0");
			builder.put(grammarAccess.getOpenAccess().getGroup(), "rule__Open__Group__0");
			builder.put(grammarAccess.getOpenAccess().getGroup_4_0(), "rule__Open__Group_4_0__0");
			builder.put(grammarAccess.getOpenAccess().getGroup_4_1(), "rule__Open__Group_4_1__0");
			builder.put(grammarAccess.getSingletonAccess().getGroup(), "rule__Singleton__Group__0");
			builder.put(grammarAccess.getSingletonAccess().getGroup_1(), "rule__Singleton__Group_1__0");
			builder.put(grammarAccess.getSingletonAccess().getGroup_1_4_0(), "rule__Singleton__Group_1_4_0__0");
			builder.put(grammarAccess.getSingletonAccess().getGroup_1_4_1(), "rule__Singleton__Group_1_4_1__0");
			builder.put(grammarAccess.getCloseAccess().getGroup(), "rule__Close__Group__0");
			builder.put(grammarAccess.getCloseAccess().getGroup_1(), "rule__Close__Group_1__0");
			builder.put(grammarAccess.getModelAccess().getModelAssignment(), "rule__Model__ModelAssignment");
			builder.put(grammarAccess.getXmlAccess().getProvaAssignment_2(), "rule__Xml__ProvaAssignment_2");
			builder.put(grammarAccess.getElementAccess().getOpenAssignment_0_0(), "rule__Element__OpenAssignment_0_0");
			builder.put(grammarAccess.getElementAccess().getContentsAssignment_0_1(), "rule__Element__ContentsAssignment_0_1");
			builder.put(grammarAccess.getElementAccess().getClose_tagAssignment_0_2(), "rule__Element__Close_tagAssignment_0_2");
			builder.put(grammarAccess.getElementAccess().getSingleton_tagAssignment_1_1(), "rule__Element__Singleton_tagAssignment_1_1");
			builder.put(grammarAccess.getContentAccess().getProvaAssignment_1_0(), "rule__Content__ProvaAssignment_1_0");
			builder.put(grammarAccess.getOpenAccess().getHeadAssignment_1(), "rule__Open__HeadAssignment_1");
			builder.put(grammarAccess.getOpenAccess().getKeywordsAssignment_3(), "rule__Open__KeywordsAssignment_3");
			builder.put(grammarAccess.getOpenAccess().getHead1Assignment_4_0_0(), "rule__Open__Head1Assignment_4_0_0");
			builder.put(grammarAccess.getOpenAccess().getHead1Assignment_4_1_0_0(), "rule__Open__Head1Assignment_4_1_0_0");
			builder.put(grammarAccess.getOpenAccess().getKeywords1Assignment_4_1_0_1(), "rule__Open__Keywords1Assignment_4_1_0_1");
			builder.put(grammarAccess.getOpenAccess().getValueAssignment_4_1_2(), "rule__Open__ValueAssignment_4_1_2");
			builder.put(grammarAccess.getSingletonAccess().getValueAssignment_1_4_1_2(), "rule__Singleton__ValueAssignment_1_4_1_2");
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
