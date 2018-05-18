/*
 * generated by Xtext 2.13.0
 */
package org.xtext.example.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.ide.contentassist.antlr.internal.InternalSimulinkParser;
import org.xtext.example.services.SimulinkGrammarAccess;

public class SimulinkParser extends AbstractContentAssistParser {

	@Inject
	private SimulinkGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalSimulinkParser createParser() {
		InternalSimulinkParser result = new InternalSimulinkParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getElementAccess().getAlternatives(), "rule__Element__Alternatives");
					put(grammarAccess.getBaseValueAccess().getAlternatives(), "rule__BaseValue__Alternatives");
					put(grammarAccess.getSubElementAccess().getGroup(), "rule__SubElement__Group__0");
					put(grammarAccess.getBaseElementAccess().getGroup(), "rule__BaseElement__Group__0");
					put(grammarAccess.getVectorElementAccess().getGroup(), "rule__VectorElement__Group__0");
					put(grammarAccess.getVectorElementAccess().getGroup_3(), "rule__VectorElement__Group_3__0");
					put(grammarAccess.getMatrixElementAccess().getGroup(), "rule__MatrixElement__Group__0");
					put(grammarAccess.getMatrixElementAccess().getGroup_3(), "rule__MatrixElement__Group_3__0");
					put(grammarAccess.getMatrixElementAccess().getGroup_4(), "rule__MatrixElement__Group_4__0");
					put(grammarAccess.getMatrixElementAccess().getGroup_4_2(), "rule__MatrixElement__Group_4_2__0");
					put(grammarAccess.getStringElementAccess().getGroup(), "rule__StringElement__Group__0");
					put(grammarAccess.getRootAccess().getRootElementAssignment(), "rule__Root__RootElementAssignment");
					put(grammarAccess.getSubElementAccess().getNameAssignment_0(), "rule__SubElement__NameAssignment_0");
					put(grammarAccess.getSubElementAccess().getElementAssignment_2(), "rule__SubElement__ElementAssignment_2");
					put(grammarAccess.getBaseElementAccess().getNameAssignment_0(), "rule__BaseElement__NameAssignment_0");
					put(grammarAccess.getBaseElementAccess().getValueAssignment_1(), "rule__BaseElement__ValueAssignment_1");
					put(grammarAccess.getVectorElementAccess().getNameAssignment_0(), "rule__VectorElement__NameAssignment_0");
					put(grammarAccess.getVectorElementAccess().getValueAssignment_2(), "rule__VectorElement__ValueAssignment_2");
					put(grammarAccess.getVectorElementAccess().getValueAssignment_3_1(), "rule__VectorElement__ValueAssignment_3_1");
					put(grammarAccess.getMatrixElementAccess().getNameAssignment_0(), "rule__MatrixElement__NameAssignment_0");
					put(grammarAccess.getMatrixElementAccess().getValueAssignment_2(), "rule__MatrixElement__ValueAssignment_2");
					put(grammarAccess.getMatrixElementAccess().getValueAssignment_3_1(), "rule__MatrixElement__ValueAssignment_3_1");
					put(grammarAccess.getMatrixElementAccess().getValueAssignment_4_1(), "rule__MatrixElement__ValueAssignment_4_1");
					put(grammarAccess.getMatrixElementAccess().getValueAssignment_4_2_1(), "rule__MatrixElement__ValueAssignment_4_2_1");
					put(grammarAccess.getStringElementAccess().getNameAssignment_0(), "rule__StringElement__NameAssignment_0");
					put(grammarAccess.getStringElementAccess().getValueAssignment_1(), "rule__StringElement__ValueAssignment_1");
					put(grammarAccess.getStringElementAccess().getValueAssignment_2(), "rule__StringElement__ValueAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public SimulinkGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SimulinkGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}