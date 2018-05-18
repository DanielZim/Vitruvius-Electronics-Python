package org.xtext.example.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.services.SimulinkGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSimulinkParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_FLOAT", "RULE_FLOAT_X", "RULE_INT_X", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'}'", "'['", "']'", "','", "';'"
    };
    public static final int RULE_INT_X=6;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int RULE_FLOAT_X=5;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=7;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_INT=9;
    public static final int RULE_ML_COMMENT=10;
    public static final int RULE_FLOAT=4;

    // delegates
    // delegators


        public InternalSimulinkParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSimulinkParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSimulinkParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSimulink.g"; }


    	private SimulinkGrammarAccess grammarAccess;

    	public void setGrammarAccess(SimulinkGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleRoot"
    // InternalSimulink.g:53:1: entryRuleRoot : ruleRoot EOF ;
    public final void entryRuleRoot() throws RecognitionException {
        try {
            // InternalSimulink.g:54:1: ( ruleRoot EOF )
            // InternalSimulink.g:55:1: ruleRoot EOF
            {
             before(grammarAccess.getRootRule()); 
            pushFollow(FOLLOW_1);
            ruleRoot();

            state._fsp--;

             after(grammarAccess.getRootRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRoot"


    // $ANTLR start "ruleRoot"
    // InternalSimulink.g:62:1: ruleRoot : ( ( rule__Root__RootElementAssignment )* ) ;
    public final void ruleRoot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:66:2: ( ( ( rule__Root__RootElementAssignment )* ) )
            // InternalSimulink.g:67:2: ( ( rule__Root__RootElementAssignment )* )
            {
            // InternalSimulink.g:67:2: ( ( rule__Root__RootElementAssignment )* )
            // InternalSimulink.g:68:3: ( rule__Root__RootElementAssignment )*
            {
             before(grammarAccess.getRootAccess().getRootElementAssignment()); 
            // InternalSimulink.g:69:3: ( rule__Root__RootElementAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSimulink.g:69:4: rule__Root__RootElementAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Root__RootElementAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getRootAccess().getRootElementAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRoot"


    // $ANTLR start "entryRuleSubElement"
    // InternalSimulink.g:78:1: entryRuleSubElement : ruleSubElement EOF ;
    public final void entryRuleSubElement() throws RecognitionException {
        try {
            // InternalSimulink.g:79:1: ( ruleSubElement EOF )
            // InternalSimulink.g:80:1: ruleSubElement EOF
            {
             before(grammarAccess.getSubElementRule()); 
            pushFollow(FOLLOW_1);
            ruleSubElement();

            state._fsp--;

             after(grammarAccess.getSubElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSubElement"


    // $ANTLR start "ruleSubElement"
    // InternalSimulink.g:87:1: ruleSubElement : ( ( rule__SubElement__Group__0 ) ) ;
    public final void ruleSubElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:91:2: ( ( ( rule__SubElement__Group__0 ) ) )
            // InternalSimulink.g:92:2: ( ( rule__SubElement__Group__0 ) )
            {
            // InternalSimulink.g:92:2: ( ( rule__SubElement__Group__0 ) )
            // InternalSimulink.g:93:3: ( rule__SubElement__Group__0 )
            {
             before(grammarAccess.getSubElementAccess().getGroup()); 
            // InternalSimulink.g:94:3: ( rule__SubElement__Group__0 )
            // InternalSimulink.g:94:4: rule__SubElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SubElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubElement"


    // $ANTLR start "entryRuleElement"
    // InternalSimulink.g:103:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalSimulink.g:104:1: ( ruleElement EOF )
            // InternalSimulink.g:105:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalSimulink.g:112:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:116:2: ( ( ( rule__Element__Alternatives ) ) )
            // InternalSimulink.g:117:2: ( ( rule__Element__Alternatives ) )
            {
            // InternalSimulink.g:117:2: ( ( rule__Element__Alternatives ) )
            // InternalSimulink.g:118:3: ( rule__Element__Alternatives )
            {
             before(grammarAccess.getElementAccess().getAlternatives()); 
            // InternalSimulink.g:119:3: ( rule__Element__Alternatives )
            // InternalSimulink.g:119:4: rule__Element__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Element__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleBaseElement"
    // InternalSimulink.g:128:1: entryRuleBaseElement : ruleBaseElement EOF ;
    public final void entryRuleBaseElement() throws RecognitionException {
        try {
            // InternalSimulink.g:129:1: ( ruleBaseElement EOF )
            // InternalSimulink.g:130:1: ruleBaseElement EOF
            {
             before(grammarAccess.getBaseElementRule()); 
            pushFollow(FOLLOW_1);
            ruleBaseElement();

            state._fsp--;

             after(grammarAccess.getBaseElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBaseElement"


    // $ANTLR start "ruleBaseElement"
    // InternalSimulink.g:137:1: ruleBaseElement : ( ( rule__BaseElement__Group__0 ) ) ;
    public final void ruleBaseElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:141:2: ( ( ( rule__BaseElement__Group__0 ) ) )
            // InternalSimulink.g:142:2: ( ( rule__BaseElement__Group__0 ) )
            {
            // InternalSimulink.g:142:2: ( ( rule__BaseElement__Group__0 ) )
            // InternalSimulink.g:143:3: ( rule__BaseElement__Group__0 )
            {
             before(grammarAccess.getBaseElementAccess().getGroup()); 
            // InternalSimulink.g:144:3: ( rule__BaseElement__Group__0 )
            // InternalSimulink.g:144:4: rule__BaseElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BaseElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBaseElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBaseElement"


    // $ANTLR start "entryRuleVectorElement"
    // InternalSimulink.g:153:1: entryRuleVectorElement : ruleVectorElement EOF ;
    public final void entryRuleVectorElement() throws RecognitionException {
        try {
            // InternalSimulink.g:154:1: ( ruleVectorElement EOF )
            // InternalSimulink.g:155:1: ruleVectorElement EOF
            {
             before(grammarAccess.getVectorElementRule()); 
            pushFollow(FOLLOW_1);
            ruleVectorElement();

            state._fsp--;

             after(grammarAccess.getVectorElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVectorElement"


    // $ANTLR start "ruleVectorElement"
    // InternalSimulink.g:162:1: ruleVectorElement : ( ( rule__VectorElement__Group__0 ) ) ;
    public final void ruleVectorElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:166:2: ( ( ( rule__VectorElement__Group__0 ) ) )
            // InternalSimulink.g:167:2: ( ( rule__VectorElement__Group__0 ) )
            {
            // InternalSimulink.g:167:2: ( ( rule__VectorElement__Group__0 ) )
            // InternalSimulink.g:168:3: ( rule__VectorElement__Group__0 )
            {
             before(grammarAccess.getVectorElementAccess().getGroup()); 
            // InternalSimulink.g:169:3: ( rule__VectorElement__Group__0 )
            // InternalSimulink.g:169:4: rule__VectorElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VectorElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVectorElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVectorElement"


    // $ANTLR start "entryRuleMatrixElement"
    // InternalSimulink.g:178:1: entryRuleMatrixElement : ruleMatrixElement EOF ;
    public final void entryRuleMatrixElement() throws RecognitionException {
        try {
            // InternalSimulink.g:179:1: ( ruleMatrixElement EOF )
            // InternalSimulink.g:180:1: ruleMatrixElement EOF
            {
             before(grammarAccess.getMatrixElementRule()); 
            pushFollow(FOLLOW_1);
            ruleMatrixElement();

            state._fsp--;

             after(grammarAccess.getMatrixElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMatrixElement"


    // $ANTLR start "ruleMatrixElement"
    // InternalSimulink.g:187:1: ruleMatrixElement : ( ( rule__MatrixElement__Group__0 ) ) ;
    public final void ruleMatrixElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:191:2: ( ( ( rule__MatrixElement__Group__0 ) ) )
            // InternalSimulink.g:192:2: ( ( rule__MatrixElement__Group__0 ) )
            {
            // InternalSimulink.g:192:2: ( ( rule__MatrixElement__Group__0 ) )
            // InternalSimulink.g:193:3: ( rule__MatrixElement__Group__0 )
            {
             before(grammarAccess.getMatrixElementAccess().getGroup()); 
            // InternalSimulink.g:194:3: ( rule__MatrixElement__Group__0 )
            // InternalSimulink.g:194:4: rule__MatrixElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MatrixElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMatrixElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMatrixElement"


    // $ANTLR start "entryRuleStringElement"
    // InternalSimulink.g:203:1: entryRuleStringElement : ruleStringElement EOF ;
    public final void entryRuleStringElement() throws RecognitionException {
        try {
            // InternalSimulink.g:204:1: ( ruleStringElement EOF )
            // InternalSimulink.g:205:1: ruleStringElement EOF
            {
             before(grammarAccess.getStringElementRule()); 
            pushFollow(FOLLOW_1);
            ruleStringElement();

            state._fsp--;

             after(grammarAccess.getStringElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringElement"


    // $ANTLR start "ruleStringElement"
    // InternalSimulink.g:212:1: ruleStringElement : ( ( rule__StringElement__Group__0 ) ) ;
    public final void ruleStringElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:216:2: ( ( ( rule__StringElement__Group__0 ) ) )
            // InternalSimulink.g:217:2: ( ( rule__StringElement__Group__0 ) )
            {
            // InternalSimulink.g:217:2: ( ( rule__StringElement__Group__0 ) )
            // InternalSimulink.g:218:3: ( rule__StringElement__Group__0 )
            {
             before(grammarAccess.getStringElementAccess().getGroup()); 
            // InternalSimulink.g:219:3: ( rule__StringElement__Group__0 )
            // InternalSimulink.g:219:4: rule__StringElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StringElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringElement"


    // $ANTLR start "entryRuleBaseValue"
    // InternalSimulink.g:228:1: entryRuleBaseValue : ruleBaseValue EOF ;
    public final void entryRuleBaseValue() throws RecognitionException {
        try {
            // InternalSimulink.g:229:1: ( ruleBaseValue EOF )
            // InternalSimulink.g:230:1: ruleBaseValue EOF
            {
             before(grammarAccess.getBaseValueRule()); 
            pushFollow(FOLLOW_1);
            ruleBaseValue();

            state._fsp--;

             after(grammarAccess.getBaseValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBaseValue"


    // $ANTLR start "ruleBaseValue"
    // InternalSimulink.g:237:1: ruleBaseValue : ( ( rule__BaseValue__Alternatives ) ) ;
    public final void ruleBaseValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:241:2: ( ( ( rule__BaseValue__Alternatives ) ) )
            // InternalSimulink.g:242:2: ( ( rule__BaseValue__Alternatives ) )
            {
            // InternalSimulink.g:242:2: ( ( rule__BaseValue__Alternatives ) )
            // InternalSimulink.g:243:3: ( rule__BaseValue__Alternatives )
            {
             before(grammarAccess.getBaseValueAccess().getAlternatives()); 
            // InternalSimulink.g:244:3: ( rule__BaseValue__Alternatives )
            // InternalSimulink.g:244:4: rule__BaseValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BaseValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBaseValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBaseValue"


    // $ANTLR start "entryRuleFloatValue"
    // InternalSimulink.g:253:1: entryRuleFloatValue : ruleFloatValue EOF ;
    public final void entryRuleFloatValue() throws RecognitionException {
        try {
            // InternalSimulink.g:254:1: ( ruleFloatValue EOF )
            // InternalSimulink.g:255:1: ruleFloatValue EOF
            {
             before(grammarAccess.getFloatValueRule()); 
            pushFollow(FOLLOW_1);
            ruleFloatValue();

            state._fsp--;

             after(grammarAccess.getFloatValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFloatValue"


    // $ANTLR start "ruleFloatValue"
    // InternalSimulink.g:262:1: ruleFloatValue : ( RULE_FLOAT ) ;
    public final void ruleFloatValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:266:2: ( ( RULE_FLOAT ) )
            // InternalSimulink.g:267:2: ( RULE_FLOAT )
            {
            // InternalSimulink.g:267:2: ( RULE_FLOAT )
            // InternalSimulink.g:268:3: RULE_FLOAT
            {
             before(grammarAccess.getFloatValueAccess().getFLOATTerminalRuleCall()); 
            match(input,RULE_FLOAT,FOLLOW_2); 
             after(grammarAccess.getFloatValueAccess().getFLOATTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFloatValue"


    // $ANTLR start "entryRuleFloatExpValue"
    // InternalSimulink.g:278:1: entryRuleFloatExpValue : ruleFloatExpValue EOF ;
    public final void entryRuleFloatExpValue() throws RecognitionException {
        try {
            // InternalSimulink.g:279:1: ( ruleFloatExpValue EOF )
            // InternalSimulink.g:280:1: ruleFloatExpValue EOF
            {
             before(grammarAccess.getFloatExpValueRule()); 
            pushFollow(FOLLOW_1);
            ruleFloatExpValue();

            state._fsp--;

             after(grammarAccess.getFloatExpValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFloatExpValue"


    // $ANTLR start "ruleFloatExpValue"
    // InternalSimulink.g:287:1: ruleFloatExpValue : ( RULE_FLOAT_X ) ;
    public final void ruleFloatExpValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:291:2: ( ( RULE_FLOAT_X ) )
            // InternalSimulink.g:292:2: ( RULE_FLOAT_X )
            {
            // InternalSimulink.g:292:2: ( RULE_FLOAT_X )
            // InternalSimulink.g:293:3: RULE_FLOAT_X
            {
             before(grammarAccess.getFloatExpValueAccess().getFLOAT_XTerminalRuleCall()); 
            match(input,RULE_FLOAT_X,FOLLOW_2); 
             after(grammarAccess.getFloatExpValueAccess().getFLOAT_XTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFloatExpValue"


    // $ANTLR start "entryRuleIntValue"
    // InternalSimulink.g:303:1: entryRuleIntValue : ruleIntValue EOF ;
    public final void entryRuleIntValue() throws RecognitionException {
        try {
            // InternalSimulink.g:304:1: ( ruleIntValue EOF )
            // InternalSimulink.g:305:1: ruleIntValue EOF
            {
             before(grammarAccess.getIntValueRule()); 
            pushFollow(FOLLOW_1);
            ruleIntValue();

            state._fsp--;

             after(grammarAccess.getIntValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntValue"


    // $ANTLR start "ruleIntValue"
    // InternalSimulink.g:312:1: ruleIntValue : ( RULE_INT_X ) ;
    public final void ruleIntValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:316:2: ( ( RULE_INT_X ) )
            // InternalSimulink.g:317:2: ( RULE_INT_X )
            {
            // InternalSimulink.g:317:2: ( RULE_INT_X )
            // InternalSimulink.g:318:3: RULE_INT_X
            {
             before(grammarAccess.getIntValueAccess().getINT_XTerminalRuleCall()); 
            match(input,RULE_INT_X,FOLLOW_2); 
             after(grammarAccess.getIntValueAccess().getINT_XTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntValue"


    // $ANTLR start "entryRuleIdValue"
    // InternalSimulink.g:328:1: entryRuleIdValue : ruleIdValue EOF ;
    public final void entryRuleIdValue() throws RecognitionException {
        try {
            // InternalSimulink.g:329:1: ( ruleIdValue EOF )
            // InternalSimulink.g:330:1: ruleIdValue EOF
            {
             before(grammarAccess.getIdValueRule()); 
            pushFollow(FOLLOW_1);
            ruleIdValue();

            state._fsp--;

             after(grammarAccess.getIdValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIdValue"


    // $ANTLR start "ruleIdValue"
    // InternalSimulink.g:337:1: ruleIdValue : ( RULE_ID ) ;
    public final void ruleIdValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:341:2: ( ( RULE_ID ) )
            // InternalSimulink.g:342:2: ( RULE_ID )
            {
            // InternalSimulink.g:342:2: ( RULE_ID )
            // InternalSimulink.g:343:3: RULE_ID
            {
             before(grammarAccess.getIdValueAccess().getIDTerminalRuleCall()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIdValueAccess().getIDTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIdValue"


    // $ANTLR start "rule__Element__Alternatives"
    // InternalSimulink.g:352:1: rule__Element__Alternatives : ( ( ruleSubElement ) | ( ruleBaseElement ) | ( ruleVectorElement ) | ( ruleMatrixElement ) | ( ruleStringElement ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:356:1: ( ( ruleSubElement ) | ( ruleBaseElement ) | ( ruleVectorElement ) | ( ruleMatrixElement ) | ( ruleStringElement ) )
            int alt2=5;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalSimulink.g:357:2: ( ruleSubElement )
                    {
                    // InternalSimulink.g:357:2: ( ruleSubElement )
                    // InternalSimulink.g:358:3: ruleSubElement
                    {
                     before(grammarAccess.getElementAccess().getSubElementParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSubElement();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getSubElementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSimulink.g:363:2: ( ruleBaseElement )
                    {
                    // InternalSimulink.g:363:2: ( ruleBaseElement )
                    // InternalSimulink.g:364:3: ruleBaseElement
                    {
                     before(grammarAccess.getElementAccess().getBaseElementParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleBaseElement();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getBaseElementParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSimulink.g:369:2: ( ruleVectorElement )
                    {
                    // InternalSimulink.g:369:2: ( ruleVectorElement )
                    // InternalSimulink.g:370:3: ruleVectorElement
                    {
                     before(grammarAccess.getElementAccess().getVectorElementParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleVectorElement();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getVectorElementParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSimulink.g:375:2: ( ruleMatrixElement )
                    {
                    // InternalSimulink.g:375:2: ( ruleMatrixElement )
                    // InternalSimulink.g:376:3: ruleMatrixElement
                    {
                     before(grammarAccess.getElementAccess().getMatrixElementParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleMatrixElement();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getMatrixElementParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSimulink.g:381:2: ( ruleStringElement )
                    {
                    // InternalSimulink.g:381:2: ( ruleStringElement )
                    // InternalSimulink.g:382:3: ruleStringElement
                    {
                     before(grammarAccess.getElementAccess().getStringElementParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleStringElement();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getStringElementParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Alternatives"


    // $ANTLR start "rule__BaseValue__Alternatives"
    // InternalSimulink.g:391:1: rule__BaseValue__Alternatives : ( ( ruleFloatValue ) | ( ruleFloatExpValue ) | ( ruleIntValue ) | ( ruleIdValue ) );
    public final void rule__BaseValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:395:1: ( ( ruleFloatValue ) | ( ruleFloatExpValue ) | ( ruleIntValue ) | ( ruleIdValue ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case RULE_FLOAT:
                {
                alt3=1;
                }
                break;
            case RULE_FLOAT_X:
                {
                alt3=2;
                }
                break;
            case RULE_INT_X:
                {
                alt3=3;
                }
                break;
            case RULE_ID:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalSimulink.g:396:2: ( ruleFloatValue )
                    {
                    // InternalSimulink.g:396:2: ( ruleFloatValue )
                    // InternalSimulink.g:397:3: ruleFloatValue
                    {
                     before(grammarAccess.getBaseValueAccess().getFloatValueParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleFloatValue();

                    state._fsp--;

                     after(grammarAccess.getBaseValueAccess().getFloatValueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSimulink.g:402:2: ( ruleFloatExpValue )
                    {
                    // InternalSimulink.g:402:2: ( ruleFloatExpValue )
                    // InternalSimulink.g:403:3: ruleFloatExpValue
                    {
                     before(grammarAccess.getBaseValueAccess().getFloatExpValueParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFloatExpValue();

                    state._fsp--;

                     after(grammarAccess.getBaseValueAccess().getFloatExpValueParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSimulink.g:408:2: ( ruleIntValue )
                    {
                    // InternalSimulink.g:408:2: ( ruleIntValue )
                    // InternalSimulink.g:409:3: ruleIntValue
                    {
                     before(grammarAccess.getBaseValueAccess().getIntValueParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleIntValue();

                    state._fsp--;

                     after(grammarAccess.getBaseValueAccess().getIntValueParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSimulink.g:414:2: ( ruleIdValue )
                    {
                    // InternalSimulink.g:414:2: ( ruleIdValue )
                    // InternalSimulink.g:415:3: ruleIdValue
                    {
                     before(grammarAccess.getBaseValueAccess().getIdValueParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleIdValue();

                    state._fsp--;

                     after(grammarAccess.getBaseValueAccess().getIdValueParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseValue__Alternatives"


    // $ANTLR start "rule__SubElement__Group__0"
    // InternalSimulink.g:424:1: rule__SubElement__Group__0 : rule__SubElement__Group__0__Impl rule__SubElement__Group__1 ;
    public final void rule__SubElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:428:1: ( rule__SubElement__Group__0__Impl rule__SubElement__Group__1 )
            // InternalSimulink.g:429:2: rule__SubElement__Group__0__Impl rule__SubElement__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__SubElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubElement__Group__0"


    // $ANTLR start "rule__SubElement__Group__0__Impl"
    // InternalSimulink.g:436:1: rule__SubElement__Group__0__Impl : ( ( rule__SubElement__NameAssignment_0 ) ) ;
    public final void rule__SubElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:440:1: ( ( ( rule__SubElement__NameAssignment_0 ) ) )
            // InternalSimulink.g:441:1: ( ( rule__SubElement__NameAssignment_0 ) )
            {
            // InternalSimulink.g:441:1: ( ( rule__SubElement__NameAssignment_0 ) )
            // InternalSimulink.g:442:2: ( rule__SubElement__NameAssignment_0 )
            {
             before(grammarAccess.getSubElementAccess().getNameAssignment_0()); 
            // InternalSimulink.g:443:2: ( rule__SubElement__NameAssignment_0 )
            // InternalSimulink.g:443:3: rule__SubElement__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SubElement__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSubElementAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubElement__Group__0__Impl"


    // $ANTLR start "rule__SubElement__Group__1"
    // InternalSimulink.g:451:1: rule__SubElement__Group__1 : rule__SubElement__Group__1__Impl rule__SubElement__Group__2 ;
    public final void rule__SubElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:455:1: ( rule__SubElement__Group__1__Impl rule__SubElement__Group__2 )
            // InternalSimulink.g:456:2: rule__SubElement__Group__1__Impl rule__SubElement__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__SubElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubElement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubElement__Group__1"


    // $ANTLR start "rule__SubElement__Group__1__Impl"
    // InternalSimulink.g:463:1: rule__SubElement__Group__1__Impl : ( '{' ) ;
    public final void rule__SubElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:467:1: ( ( '{' ) )
            // InternalSimulink.g:468:1: ( '{' )
            {
            // InternalSimulink.g:468:1: ( '{' )
            // InternalSimulink.g:469:2: '{'
            {
             before(grammarAccess.getSubElementAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSubElementAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubElement__Group__1__Impl"


    // $ANTLR start "rule__SubElement__Group__2"
    // InternalSimulink.g:478:1: rule__SubElement__Group__2 : rule__SubElement__Group__2__Impl rule__SubElement__Group__3 ;
    public final void rule__SubElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:482:1: ( rule__SubElement__Group__2__Impl rule__SubElement__Group__3 )
            // InternalSimulink.g:483:2: rule__SubElement__Group__2__Impl rule__SubElement__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__SubElement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubElement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubElement__Group__2"


    // $ANTLR start "rule__SubElement__Group__2__Impl"
    // InternalSimulink.g:490:1: rule__SubElement__Group__2__Impl : ( ( rule__SubElement__ElementAssignment_2 )* ) ;
    public final void rule__SubElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:494:1: ( ( ( rule__SubElement__ElementAssignment_2 )* ) )
            // InternalSimulink.g:495:1: ( ( rule__SubElement__ElementAssignment_2 )* )
            {
            // InternalSimulink.g:495:1: ( ( rule__SubElement__ElementAssignment_2 )* )
            // InternalSimulink.g:496:2: ( rule__SubElement__ElementAssignment_2 )*
            {
             before(grammarAccess.getSubElementAccess().getElementAssignment_2()); 
            // InternalSimulink.g:497:2: ( rule__SubElement__ElementAssignment_2 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSimulink.g:497:3: rule__SubElement__ElementAssignment_2
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__SubElement__ElementAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getSubElementAccess().getElementAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubElement__Group__2__Impl"


    // $ANTLR start "rule__SubElement__Group__3"
    // InternalSimulink.g:505:1: rule__SubElement__Group__3 : rule__SubElement__Group__3__Impl ;
    public final void rule__SubElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:509:1: ( rule__SubElement__Group__3__Impl )
            // InternalSimulink.g:510:2: rule__SubElement__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubElement__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubElement__Group__3"


    // $ANTLR start "rule__SubElement__Group__3__Impl"
    // InternalSimulink.g:516:1: rule__SubElement__Group__3__Impl : ( '}' ) ;
    public final void rule__SubElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:520:1: ( ( '}' ) )
            // InternalSimulink.g:521:1: ( '}' )
            {
            // InternalSimulink.g:521:1: ( '}' )
            // InternalSimulink.g:522:2: '}'
            {
             before(grammarAccess.getSubElementAccess().getRightCurlyBracketKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSubElementAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubElement__Group__3__Impl"


    // $ANTLR start "rule__BaseElement__Group__0"
    // InternalSimulink.g:532:1: rule__BaseElement__Group__0 : rule__BaseElement__Group__0__Impl rule__BaseElement__Group__1 ;
    public final void rule__BaseElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:536:1: ( rule__BaseElement__Group__0__Impl rule__BaseElement__Group__1 )
            // InternalSimulink.g:537:2: rule__BaseElement__Group__0__Impl rule__BaseElement__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__BaseElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BaseElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseElement__Group__0"


    // $ANTLR start "rule__BaseElement__Group__0__Impl"
    // InternalSimulink.g:544:1: rule__BaseElement__Group__0__Impl : ( ( rule__BaseElement__NameAssignment_0 ) ) ;
    public final void rule__BaseElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:548:1: ( ( ( rule__BaseElement__NameAssignment_0 ) ) )
            // InternalSimulink.g:549:1: ( ( rule__BaseElement__NameAssignment_0 ) )
            {
            // InternalSimulink.g:549:1: ( ( rule__BaseElement__NameAssignment_0 ) )
            // InternalSimulink.g:550:2: ( rule__BaseElement__NameAssignment_0 )
            {
             before(grammarAccess.getBaseElementAccess().getNameAssignment_0()); 
            // InternalSimulink.g:551:2: ( rule__BaseElement__NameAssignment_0 )
            // InternalSimulink.g:551:3: rule__BaseElement__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__BaseElement__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBaseElementAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseElement__Group__0__Impl"


    // $ANTLR start "rule__BaseElement__Group__1"
    // InternalSimulink.g:559:1: rule__BaseElement__Group__1 : rule__BaseElement__Group__1__Impl ;
    public final void rule__BaseElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:563:1: ( rule__BaseElement__Group__1__Impl )
            // InternalSimulink.g:564:2: rule__BaseElement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BaseElement__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseElement__Group__1"


    // $ANTLR start "rule__BaseElement__Group__1__Impl"
    // InternalSimulink.g:570:1: rule__BaseElement__Group__1__Impl : ( ( rule__BaseElement__ValueAssignment_1 ) ) ;
    public final void rule__BaseElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:574:1: ( ( ( rule__BaseElement__ValueAssignment_1 ) ) )
            // InternalSimulink.g:575:1: ( ( rule__BaseElement__ValueAssignment_1 ) )
            {
            // InternalSimulink.g:575:1: ( ( rule__BaseElement__ValueAssignment_1 ) )
            // InternalSimulink.g:576:2: ( rule__BaseElement__ValueAssignment_1 )
            {
             before(grammarAccess.getBaseElementAccess().getValueAssignment_1()); 
            // InternalSimulink.g:577:2: ( rule__BaseElement__ValueAssignment_1 )
            // InternalSimulink.g:577:3: rule__BaseElement__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BaseElement__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBaseElementAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseElement__Group__1__Impl"


    // $ANTLR start "rule__VectorElement__Group__0"
    // InternalSimulink.g:586:1: rule__VectorElement__Group__0 : rule__VectorElement__Group__0__Impl rule__VectorElement__Group__1 ;
    public final void rule__VectorElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:590:1: ( rule__VectorElement__Group__0__Impl rule__VectorElement__Group__1 )
            // InternalSimulink.g:591:2: rule__VectorElement__Group__0__Impl rule__VectorElement__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__VectorElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VectorElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VectorElement__Group__0"


    // $ANTLR start "rule__VectorElement__Group__0__Impl"
    // InternalSimulink.g:598:1: rule__VectorElement__Group__0__Impl : ( ( rule__VectorElement__NameAssignment_0 ) ) ;
    public final void rule__VectorElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:602:1: ( ( ( rule__VectorElement__NameAssignment_0 ) ) )
            // InternalSimulink.g:603:1: ( ( rule__VectorElement__NameAssignment_0 ) )
            {
            // InternalSimulink.g:603:1: ( ( rule__VectorElement__NameAssignment_0 ) )
            // InternalSimulink.g:604:2: ( rule__VectorElement__NameAssignment_0 )
            {
             before(grammarAccess.getVectorElementAccess().getNameAssignment_0()); 
            // InternalSimulink.g:605:2: ( rule__VectorElement__NameAssignment_0 )
            // InternalSimulink.g:605:3: rule__VectorElement__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__VectorElement__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVectorElementAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VectorElement__Group__0__Impl"


    // $ANTLR start "rule__VectorElement__Group__1"
    // InternalSimulink.g:613:1: rule__VectorElement__Group__1 : rule__VectorElement__Group__1__Impl rule__VectorElement__Group__2 ;
    public final void rule__VectorElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:617:1: ( rule__VectorElement__Group__1__Impl rule__VectorElement__Group__2 )
            // InternalSimulink.g:618:2: rule__VectorElement__Group__1__Impl rule__VectorElement__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__VectorElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VectorElement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VectorElement__Group__1"


    // $ANTLR start "rule__VectorElement__Group__1__Impl"
    // InternalSimulink.g:625:1: rule__VectorElement__Group__1__Impl : ( '[' ) ;
    public final void rule__VectorElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:629:1: ( ( '[' ) )
            // InternalSimulink.g:630:1: ( '[' )
            {
            // InternalSimulink.g:630:1: ( '[' )
            // InternalSimulink.g:631:2: '['
            {
             before(grammarAccess.getVectorElementAccess().getLeftSquareBracketKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getVectorElementAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VectorElement__Group__1__Impl"


    // $ANTLR start "rule__VectorElement__Group__2"
    // InternalSimulink.g:640:1: rule__VectorElement__Group__2 : rule__VectorElement__Group__2__Impl rule__VectorElement__Group__3 ;
    public final void rule__VectorElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:644:1: ( rule__VectorElement__Group__2__Impl rule__VectorElement__Group__3 )
            // InternalSimulink.g:645:2: rule__VectorElement__Group__2__Impl rule__VectorElement__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__VectorElement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VectorElement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VectorElement__Group__2"


    // $ANTLR start "rule__VectorElement__Group__2__Impl"
    // InternalSimulink.g:652:1: rule__VectorElement__Group__2__Impl : ( ( rule__VectorElement__ValueAssignment_2 )? ) ;
    public final void rule__VectorElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:656:1: ( ( ( rule__VectorElement__ValueAssignment_2 )? ) )
            // InternalSimulink.g:657:1: ( ( rule__VectorElement__ValueAssignment_2 )? )
            {
            // InternalSimulink.g:657:1: ( ( rule__VectorElement__ValueAssignment_2 )? )
            // InternalSimulink.g:658:2: ( rule__VectorElement__ValueAssignment_2 )?
            {
             before(grammarAccess.getVectorElementAccess().getValueAssignment_2()); 
            // InternalSimulink.g:659:2: ( rule__VectorElement__ValueAssignment_2 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_FLOAT && LA5_0<=RULE_ID)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSimulink.g:659:3: rule__VectorElement__ValueAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__VectorElement__ValueAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVectorElementAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VectorElement__Group__2__Impl"


    // $ANTLR start "rule__VectorElement__Group__3"
    // InternalSimulink.g:667:1: rule__VectorElement__Group__3 : rule__VectorElement__Group__3__Impl rule__VectorElement__Group__4 ;
    public final void rule__VectorElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:671:1: ( rule__VectorElement__Group__3__Impl rule__VectorElement__Group__4 )
            // InternalSimulink.g:672:2: rule__VectorElement__Group__3__Impl rule__VectorElement__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__VectorElement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VectorElement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VectorElement__Group__3"


    // $ANTLR start "rule__VectorElement__Group__3__Impl"
    // InternalSimulink.g:679:1: rule__VectorElement__Group__3__Impl : ( ( rule__VectorElement__Group_3__0 )* ) ;
    public final void rule__VectorElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:683:1: ( ( ( rule__VectorElement__Group_3__0 )* ) )
            // InternalSimulink.g:684:1: ( ( rule__VectorElement__Group_3__0 )* )
            {
            // InternalSimulink.g:684:1: ( ( rule__VectorElement__Group_3__0 )* )
            // InternalSimulink.g:685:2: ( rule__VectorElement__Group_3__0 )*
            {
             before(grammarAccess.getVectorElementAccess().getGroup_3()); 
            // InternalSimulink.g:686:2: ( rule__VectorElement__Group_3__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSimulink.g:686:3: rule__VectorElement__Group_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__VectorElement__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getVectorElementAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VectorElement__Group__3__Impl"


    // $ANTLR start "rule__VectorElement__Group__4"
    // InternalSimulink.g:694:1: rule__VectorElement__Group__4 : rule__VectorElement__Group__4__Impl ;
    public final void rule__VectorElement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:698:1: ( rule__VectorElement__Group__4__Impl )
            // InternalSimulink.g:699:2: rule__VectorElement__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VectorElement__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VectorElement__Group__4"


    // $ANTLR start "rule__VectorElement__Group__4__Impl"
    // InternalSimulink.g:705:1: rule__VectorElement__Group__4__Impl : ( ']' ) ;
    public final void rule__VectorElement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:709:1: ( ( ']' ) )
            // InternalSimulink.g:710:1: ( ']' )
            {
            // InternalSimulink.g:710:1: ( ']' )
            // InternalSimulink.g:711:2: ']'
            {
             before(grammarAccess.getVectorElementAccess().getRightSquareBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getVectorElementAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VectorElement__Group__4__Impl"


    // $ANTLR start "rule__VectorElement__Group_3__0"
    // InternalSimulink.g:721:1: rule__VectorElement__Group_3__0 : rule__VectorElement__Group_3__0__Impl rule__VectorElement__Group_3__1 ;
    public final void rule__VectorElement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:725:1: ( rule__VectorElement__Group_3__0__Impl rule__VectorElement__Group_3__1 )
            // InternalSimulink.g:726:2: rule__VectorElement__Group_3__0__Impl rule__VectorElement__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__VectorElement__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VectorElement__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VectorElement__Group_3__0"


    // $ANTLR start "rule__VectorElement__Group_3__0__Impl"
    // InternalSimulink.g:733:1: rule__VectorElement__Group_3__0__Impl : ( ',' ) ;
    public final void rule__VectorElement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:737:1: ( ( ',' ) )
            // InternalSimulink.g:738:1: ( ',' )
            {
            // InternalSimulink.g:738:1: ( ',' )
            // InternalSimulink.g:739:2: ','
            {
             before(grammarAccess.getVectorElementAccess().getCommaKeyword_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getVectorElementAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VectorElement__Group_3__0__Impl"


    // $ANTLR start "rule__VectorElement__Group_3__1"
    // InternalSimulink.g:748:1: rule__VectorElement__Group_3__1 : rule__VectorElement__Group_3__1__Impl ;
    public final void rule__VectorElement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:752:1: ( rule__VectorElement__Group_3__1__Impl )
            // InternalSimulink.g:753:2: rule__VectorElement__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VectorElement__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VectorElement__Group_3__1"


    // $ANTLR start "rule__VectorElement__Group_3__1__Impl"
    // InternalSimulink.g:759:1: rule__VectorElement__Group_3__1__Impl : ( ( rule__VectorElement__ValueAssignment_3_1 ) ) ;
    public final void rule__VectorElement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:763:1: ( ( ( rule__VectorElement__ValueAssignment_3_1 ) ) )
            // InternalSimulink.g:764:1: ( ( rule__VectorElement__ValueAssignment_3_1 ) )
            {
            // InternalSimulink.g:764:1: ( ( rule__VectorElement__ValueAssignment_3_1 ) )
            // InternalSimulink.g:765:2: ( rule__VectorElement__ValueAssignment_3_1 )
            {
             before(grammarAccess.getVectorElementAccess().getValueAssignment_3_1()); 
            // InternalSimulink.g:766:2: ( rule__VectorElement__ValueAssignment_3_1 )
            // InternalSimulink.g:766:3: rule__VectorElement__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__VectorElement__ValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getVectorElementAccess().getValueAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VectorElement__Group_3__1__Impl"


    // $ANTLR start "rule__MatrixElement__Group__0"
    // InternalSimulink.g:775:1: rule__MatrixElement__Group__0 : rule__MatrixElement__Group__0__Impl rule__MatrixElement__Group__1 ;
    public final void rule__MatrixElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:779:1: ( rule__MatrixElement__Group__0__Impl rule__MatrixElement__Group__1 )
            // InternalSimulink.g:780:2: rule__MatrixElement__Group__0__Impl rule__MatrixElement__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__MatrixElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MatrixElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatrixElement__Group__0"


    // $ANTLR start "rule__MatrixElement__Group__0__Impl"
    // InternalSimulink.g:787:1: rule__MatrixElement__Group__0__Impl : ( ( rule__MatrixElement__NameAssignment_0 ) ) ;
    public final void rule__MatrixElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:791:1: ( ( ( rule__MatrixElement__NameAssignment_0 ) ) )
            // InternalSimulink.g:792:1: ( ( rule__MatrixElement__NameAssignment_0 ) )
            {
            // InternalSimulink.g:792:1: ( ( rule__MatrixElement__NameAssignment_0 ) )
            // InternalSimulink.g:793:2: ( rule__MatrixElement__NameAssignment_0 )
            {
             before(grammarAccess.getMatrixElementAccess().getNameAssignment_0()); 
            // InternalSimulink.g:794:2: ( rule__MatrixElement__NameAssignment_0 )
            // InternalSimulink.g:794:3: rule__MatrixElement__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MatrixElement__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMatrixElementAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatrixElement__Group__0__Impl"


    // $ANTLR start "rule__MatrixElement__Group__1"
    // InternalSimulink.g:802:1: rule__MatrixElement__Group__1 : rule__MatrixElement__Group__1__Impl rule__MatrixElement__Group__2 ;
    public final void rule__MatrixElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:806:1: ( rule__MatrixElement__Group__1__Impl rule__MatrixElement__Group__2 )
            // InternalSimulink.g:807:2: rule__MatrixElement__Group__1__Impl rule__MatrixElement__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__MatrixElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MatrixElement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatrixElement__Group__1"


    // $ANTLR start "rule__MatrixElement__Group__1__Impl"
    // InternalSimulink.g:814:1: rule__MatrixElement__Group__1__Impl : ( '[' ) ;
    public final void rule__MatrixElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:818:1: ( ( '[' ) )
            // InternalSimulink.g:819:1: ( '[' )
            {
            // InternalSimulink.g:819:1: ( '[' )
            // InternalSimulink.g:820:2: '['
            {
             before(grammarAccess.getMatrixElementAccess().getLeftSquareBracketKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMatrixElementAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatrixElement__Group__1__Impl"


    // $ANTLR start "rule__MatrixElement__Group__2"
    // InternalSimulink.g:829:1: rule__MatrixElement__Group__2 : rule__MatrixElement__Group__2__Impl rule__MatrixElement__Group__3 ;
    public final void rule__MatrixElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:833:1: ( rule__MatrixElement__Group__2__Impl rule__MatrixElement__Group__3 )
            // InternalSimulink.g:834:2: rule__MatrixElement__Group__2__Impl rule__MatrixElement__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__MatrixElement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MatrixElement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatrixElement__Group__2"


    // $ANTLR start "rule__MatrixElement__Group__2__Impl"
    // InternalSimulink.g:841:1: rule__MatrixElement__Group__2__Impl : ( ( rule__MatrixElement__ValueAssignment_2 )? ) ;
    public final void rule__MatrixElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:845:1: ( ( ( rule__MatrixElement__ValueAssignment_2 )? ) )
            // InternalSimulink.g:846:1: ( ( rule__MatrixElement__ValueAssignment_2 )? )
            {
            // InternalSimulink.g:846:1: ( ( rule__MatrixElement__ValueAssignment_2 )? )
            // InternalSimulink.g:847:2: ( rule__MatrixElement__ValueAssignment_2 )?
            {
             before(grammarAccess.getMatrixElementAccess().getValueAssignment_2()); 
            // InternalSimulink.g:848:2: ( rule__MatrixElement__ValueAssignment_2 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_FLOAT && LA7_0<=RULE_ID)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSimulink.g:848:3: rule__MatrixElement__ValueAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__MatrixElement__ValueAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMatrixElementAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatrixElement__Group__2__Impl"


    // $ANTLR start "rule__MatrixElement__Group__3"
    // InternalSimulink.g:856:1: rule__MatrixElement__Group__3 : rule__MatrixElement__Group__3__Impl rule__MatrixElement__Group__4 ;
    public final void rule__MatrixElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:860:1: ( rule__MatrixElement__Group__3__Impl rule__MatrixElement__Group__4 )
            // InternalSimulink.g:861:2: rule__MatrixElement__Group__3__Impl rule__MatrixElement__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__MatrixElement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MatrixElement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatrixElement__Group__3"


    // $ANTLR start "rule__MatrixElement__Group__3__Impl"
    // InternalSimulink.g:868:1: rule__MatrixElement__Group__3__Impl : ( ( rule__MatrixElement__Group_3__0 )* ) ;
    public final void rule__MatrixElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:872:1: ( ( ( rule__MatrixElement__Group_3__0 )* ) )
            // InternalSimulink.g:873:1: ( ( rule__MatrixElement__Group_3__0 )* )
            {
            // InternalSimulink.g:873:1: ( ( rule__MatrixElement__Group_3__0 )* )
            // InternalSimulink.g:874:2: ( rule__MatrixElement__Group_3__0 )*
            {
             before(grammarAccess.getMatrixElementAccess().getGroup_3()); 
            // InternalSimulink.g:875:2: ( rule__MatrixElement__Group_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSimulink.g:875:3: rule__MatrixElement__Group_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__MatrixElement__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getMatrixElementAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatrixElement__Group__3__Impl"


    // $ANTLR start "rule__MatrixElement__Group__4"
    // InternalSimulink.g:883:1: rule__MatrixElement__Group__4 : rule__MatrixElement__Group__4__Impl rule__MatrixElement__Group__5 ;
    public final void rule__MatrixElement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:887:1: ( rule__MatrixElement__Group__4__Impl rule__MatrixElement__Group__5 )
            // InternalSimulink.g:888:2: rule__MatrixElement__Group__4__Impl rule__MatrixElement__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__MatrixElement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MatrixElement__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatrixElement__Group__4"


    // $ANTLR start "rule__MatrixElement__Group__4__Impl"
    // InternalSimulink.g:895:1: rule__MatrixElement__Group__4__Impl : ( ( ( rule__MatrixElement__Group_4__0 ) ) ( ( rule__MatrixElement__Group_4__0 )* ) ) ;
    public final void rule__MatrixElement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:899:1: ( ( ( ( rule__MatrixElement__Group_4__0 ) ) ( ( rule__MatrixElement__Group_4__0 )* ) ) )
            // InternalSimulink.g:900:1: ( ( ( rule__MatrixElement__Group_4__0 ) ) ( ( rule__MatrixElement__Group_4__0 )* ) )
            {
            // InternalSimulink.g:900:1: ( ( ( rule__MatrixElement__Group_4__0 ) ) ( ( rule__MatrixElement__Group_4__0 )* ) )
            // InternalSimulink.g:901:2: ( ( rule__MatrixElement__Group_4__0 ) ) ( ( rule__MatrixElement__Group_4__0 )* )
            {
            // InternalSimulink.g:901:2: ( ( rule__MatrixElement__Group_4__0 ) )
            // InternalSimulink.g:902:3: ( rule__MatrixElement__Group_4__0 )
            {
             before(grammarAccess.getMatrixElementAccess().getGroup_4()); 
            // InternalSimulink.g:903:3: ( rule__MatrixElement__Group_4__0 )
            // InternalSimulink.g:903:4: rule__MatrixElement__Group_4__0
            {
            pushFollow(FOLLOW_12);
            rule__MatrixElement__Group_4__0();

            state._fsp--;


            }

             after(grammarAccess.getMatrixElementAccess().getGroup_4()); 

            }

            // InternalSimulink.g:906:2: ( ( rule__MatrixElement__Group_4__0 )* )
            // InternalSimulink.g:907:3: ( rule__MatrixElement__Group_4__0 )*
            {
             before(grammarAccess.getMatrixElementAccess().getGroup_4()); 
            // InternalSimulink.g:908:3: ( rule__MatrixElement__Group_4__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==19) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSimulink.g:908:4: rule__MatrixElement__Group_4__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__MatrixElement__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getMatrixElementAccess().getGroup_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatrixElement__Group__4__Impl"


    // $ANTLR start "rule__MatrixElement__Group__5"
    // InternalSimulink.g:917:1: rule__MatrixElement__Group__5 : rule__MatrixElement__Group__5__Impl ;
    public final void rule__MatrixElement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:921:1: ( rule__MatrixElement__Group__5__Impl )
            // InternalSimulink.g:922:2: rule__MatrixElement__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MatrixElement__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatrixElement__Group__5"


    // $ANTLR start "rule__MatrixElement__Group__5__Impl"
    // InternalSimulink.g:928:1: rule__MatrixElement__Group__5__Impl : ( ']' ) ;
    public final void rule__MatrixElement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:932:1: ( ( ']' ) )
            // InternalSimulink.g:933:1: ( ']' )
            {
            // InternalSimulink.g:933:1: ( ']' )
            // InternalSimulink.g:934:2: ']'
            {
             before(grammarAccess.getMatrixElementAccess().getRightSquareBracketKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMatrixElementAccess().getRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatrixElement__Group__5__Impl"


    // $ANTLR start "rule__MatrixElement__Group_3__0"
    // InternalSimulink.g:944:1: rule__MatrixElement__Group_3__0 : rule__MatrixElement__Group_3__0__Impl rule__MatrixElement__Group_3__1 ;
    public final void rule__MatrixElement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:948:1: ( rule__MatrixElement__Group_3__0__Impl rule__MatrixElement__Group_3__1 )
            // InternalSimulink.g:949:2: rule__MatrixElement__Group_3__0__Impl rule__MatrixElement__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__MatrixElement__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MatrixElement__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatrixElement__Group_3__0"


    // $ANTLR start "rule__MatrixElement__Group_3__0__Impl"
    // InternalSimulink.g:956:1: rule__MatrixElement__Group_3__0__Impl : ( ',' ) ;
    public final void rule__MatrixElement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:960:1: ( ( ',' ) )
            // InternalSimulink.g:961:1: ( ',' )
            {
            // InternalSimulink.g:961:1: ( ',' )
            // InternalSimulink.g:962:2: ','
            {
             before(grammarAccess.getMatrixElementAccess().getCommaKeyword_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMatrixElementAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatrixElement__Group_3__0__Impl"


    // $ANTLR start "rule__MatrixElement__Group_3__1"
    // InternalSimulink.g:971:1: rule__MatrixElement__Group_3__1 : rule__MatrixElement__Group_3__1__Impl ;
    public final void rule__MatrixElement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:975:1: ( rule__MatrixElement__Group_3__1__Impl )
            // InternalSimulink.g:976:2: rule__MatrixElement__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MatrixElement__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatrixElement__Group_3__1"


    // $ANTLR start "rule__MatrixElement__Group_3__1__Impl"
    // InternalSimulink.g:982:1: rule__MatrixElement__Group_3__1__Impl : ( ( rule__MatrixElement__ValueAssignment_3_1 ) ) ;
    public final void rule__MatrixElement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:986:1: ( ( ( rule__MatrixElement__ValueAssignment_3_1 ) ) )
            // InternalSimulink.g:987:1: ( ( rule__MatrixElement__ValueAssignment_3_1 ) )
            {
            // InternalSimulink.g:987:1: ( ( rule__MatrixElement__ValueAssignment_3_1 ) )
            // InternalSimulink.g:988:2: ( rule__MatrixElement__ValueAssignment_3_1 )
            {
             before(grammarAccess.getMatrixElementAccess().getValueAssignment_3_1()); 
            // InternalSimulink.g:989:2: ( rule__MatrixElement__ValueAssignment_3_1 )
            // InternalSimulink.g:989:3: rule__MatrixElement__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__MatrixElement__ValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMatrixElementAccess().getValueAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatrixElement__Group_3__1__Impl"


    // $ANTLR start "rule__MatrixElement__Group_4__0"
    // InternalSimulink.g:998:1: rule__MatrixElement__Group_4__0 : rule__MatrixElement__Group_4__0__Impl rule__MatrixElement__Group_4__1 ;
    public final void rule__MatrixElement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:1002:1: ( rule__MatrixElement__Group_4__0__Impl rule__MatrixElement__Group_4__1 )
            // InternalSimulink.g:1003:2: rule__MatrixElement__Group_4__0__Impl rule__MatrixElement__Group_4__1
            {
            pushFollow(FOLLOW_13);
            rule__MatrixElement__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MatrixElement__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatrixElement__Group_4__0"


    // $ANTLR start "rule__MatrixElement__Group_4__0__Impl"
    // InternalSimulink.g:1010:1: rule__MatrixElement__Group_4__0__Impl : ( ';' ) ;
    public final void rule__MatrixElement__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:1014:1: ( ( ';' ) )
            // InternalSimulink.g:1015:1: ( ';' )
            {
            // InternalSimulink.g:1015:1: ( ';' )
            // InternalSimulink.g:1016:2: ';'
            {
             before(grammarAccess.getMatrixElementAccess().getSemicolonKeyword_4_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMatrixElementAccess().getSemicolonKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatrixElement__Group_4__0__Impl"


    // $ANTLR start "rule__MatrixElement__Group_4__1"
    // InternalSimulink.g:1025:1: rule__MatrixElement__Group_4__1 : rule__MatrixElement__Group_4__1__Impl rule__MatrixElement__Group_4__2 ;
    public final void rule__MatrixElement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:1029:1: ( rule__MatrixElement__Group_4__1__Impl rule__MatrixElement__Group_4__2 )
            // InternalSimulink.g:1030:2: rule__MatrixElement__Group_4__1__Impl rule__MatrixElement__Group_4__2
            {
            pushFollow(FOLLOW_13);
            rule__MatrixElement__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MatrixElement__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatrixElement__Group_4__1"


    // $ANTLR start "rule__MatrixElement__Group_4__1__Impl"
    // InternalSimulink.g:1037:1: rule__MatrixElement__Group_4__1__Impl : ( ( rule__MatrixElement__ValueAssignment_4_1 )? ) ;
    public final void rule__MatrixElement__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:1041:1: ( ( ( rule__MatrixElement__ValueAssignment_4_1 )? ) )
            // InternalSimulink.g:1042:1: ( ( rule__MatrixElement__ValueAssignment_4_1 )? )
            {
            // InternalSimulink.g:1042:1: ( ( rule__MatrixElement__ValueAssignment_4_1 )? )
            // InternalSimulink.g:1043:2: ( rule__MatrixElement__ValueAssignment_4_1 )?
            {
             before(grammarAccess.getMatrixElementAccess().getValueAssignment_4_1()); 
            // InternalSimulink.g:1044:2: ( rule__MatrixElement__ValueAssignment_4_1 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_FLOAT && LA10_0<=RULE_ID)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSimulink.g:1044:3: rule__MatrixElement__ValueAssignment_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MatrixElement__ValueAssignment_4_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMatrixElementAccess().getValueAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatrixElement__Group_4__1__Impl"


    // $ANTLR start "rule__MatrixElement__Group_4__2"
    // InternalSimulink.g:1052:1: rule__MatrixElement__Group_4__2 : rule__MatrixElement__Group_4__2__Impl ;
    public final void rule__MatrixElement__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:1056:1: ( rule__MatrixElement__Group_4__2__Impl )
            // InternalSimulink.g:1057:2: rule__MatrixElement__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MatrixElement__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatrixElement__Group_4__2"


    // $ANTLR start "rule__MatrixElement__Group_4__2__Impl"
    // InternalSimulink.g:1063:1: rule__MatrixElement__Group_4__2__Impl : ( ( rule__MatrixElement__Group_4_2__0 )* ) ;
    public final void rule__MatrixElement__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:1067:1: ( ( ( rule__MatrixElement__Group_4_2__0 )* ) )
            // InternalSimulink.g:1068:1: ( ( rule__MatrixElement__Group_4_2__0 )* )
            {
            // InternalSimulink.g:1068:1: ( ( rule__MatrixElement__Group_4_2__0 )* )
            // InternalSimulink.g:1069:2: ( rule__MatrixElement__Group_4_2__0 )*
            {
             before(grammarAccess.getMatrixElementAccess().getGroup_4_2()); 
            // InternalSimulink.g:1070:2: ( rule__MatrixElement__Group_4_2__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==18) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSimulink.g:1070:3: rule__MatrixElement__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__MatrixElement__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getMatrixElementAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatrixElement__Group_4__2__Impl"


    // $ANTLR start "rule__MatrixElement__Group_4_2__0"
    // InternalSimulink.g:1079:1: rule__MatrixElement__Group_4_2__0 : rule__MatrixElement__Group_4_2__0__Impl rule__MatrixElement__Group_4_2__1 ;
    public final void rule__MatrixElement__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:1083:1: ( rule__MatrixElement__Group_4_2__0__Impl rule__MatrixElement__Group_4_2__1 )
            // InternalSimulink.g:1084:2: rule__MatrixElement__Group_4_2__0__Impl rule__MatrixElement__Group_4_2__1
            {
            pushFollow(FOLLOW_6);
            rule__MatrixElement__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MatrixElement__Group_4_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatrixElement__Group_4_2__0"


    // $ANTLR start "rule__MatrixElement__Group_4_2__0__Impl"
    // InternalSimulink.g:1091:1: rule__MatrixElement__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__MatrixElement__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:1095:1: ( ( ',' ) )
            // InternalSimulink.g:1096:1: ( ',' )
            {
            // InternalSimulink.g:1096:1: ( ',' )
            // InternalSimulink.g:1097:2: ','
            {
             before(grammarAccess.getMatrixElementAccess().getCommaKeyword_4_2_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMatrixElementAccess().getCommaKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatrixElement__Group_4_2__0__Impl"


    // $ANTLR start "rule__MatrixElement__Group_4_2__1"
    // InternalSimulink.g:1106:1: rule__MatrixElement__Group_4_2__1 : rule__MatrixElement__Group_4_2__1__Impl ;
    public final void rule__MatrixElement__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:1110:1: ( rule__MatrixElement__Group_4_2__1__Impl )
            // InternalSimulink.g:1111:2: rule__MatrixElement__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MatrixElement__Group_4_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatrixElement__Group_4_2__1"


    // $ANTLR start "rule__MatrixElement__Group_4_2__1__Impl"
    // InternalSimulink.g:1117:1: rule__MatrixElement__Group_4_2__1__Impl : ( ( rule__MatrixElement__ValueAssignment_4_2_1 ) ) ;
    public final void rule__MatrixElement__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:1121:1: ( ( ( rule__MatrixElement__ValueAssignment_4_2_1 ) ) )
            // InternalSimulink.g:1122:1: ( ( rule__MatrixElement__ValueAssignment_4_2_1 ) )
            {
            // InternalSimulink.g:1122:1: ( ( rule__MatrixElement__ValueAssignment_4_2_1 ) )
            // InternalSimulink.g:1123:2: ( rule__MatrixElement__ValueAssignment_4_2_1 )
            {
             before(grammarAccess.getMatrixElementAccess().getValueAssignment_4_2_1()); 
            // InternalSimulink.g:1124:2: ( rule__MatrixElement__ValueAssignment_4_2_1 )
            // InternalSimulink.g:1124:3: rule__MatrixElement__ValueAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__MatrixElement__ValueAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMatrixElementAccess().getValueAssignment_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatrixElement__Group_4_2__1__Impl"


    // $ANTLR start "rule__StringElement__Group__0"
    // InternalSimulink.g:1133:1: rule__StringElement__Group__0 : rule__StringElement__Group__0__Impl rule__StringElement__Group__1 ;
    public final void rule__StringElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:1137:1: ( rule__StringElement__Group__0__Impl rule__StringElement__Group__1 )
            // InternalSimulink.g:1138:2: rule__StringElement__Group__0__Impl rule__StringElement__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__StringElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringElement__Group__0"


    // $ANTLR start "rule__StringElement__Group__0__Impl"
    // InternalSimulink.g:1145:1: rule__StringElement__Group__0__Impl : ( ( rule__StringElement__NameAssignment_0 ) ) ;
    public final void rule__StringElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:1149:1: ( ( ( rule__StringElement__NameAssignment_0 ) ) )
            // InternalSimulink.g:1150:1: ( ( rule__StringElement__NameAssignment_0 ) )
            {
            // InternalSimulink.g:1150:1: ( ( rule__StringElement__NameAssignment_0 ) )
            // InternalSimulink.g:1151:2: ( rule__StringElement__NameAssignment_0 )
            {
             before(grammarAccess.getStringElementAccess().getNameAssignment_0()); 
            // InternalSimulink.g:1152:2: ( rule__StringElement__NameAssignment_0 )
            // InternalSimulink.g:1152:3: rule__StringElement__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__StringElement__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStringElementAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringElement__Group__0__Impl"


    // $ANTLR start "rule__StringElement__Group__1"
    // InternalSimulink.g:1160:1: rule__StringElement__Group__1 : rule__StringElement__Group__1__Impl rule__StringElement__Group__2 ;
    public final void rule__StringElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:1164:1: ( rule__StringElement__Group__1__Impl rule__StringElement__Group__2 )
            // InternalSimulink.g:1165:2: rule__StringElement__Group__1__Impl rule__StringElement__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__StringElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringElement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringElement__Group__1"


    // $ANTLR start "rule__StringElement__Group__1__Impl"
    // InternalSimulink.g:1172:1: rule__StringElement__Group__1__Impl : ( ( rule__StringElement__ValueAssignment_1 ) ) ;
    public final void rule__StringElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:1176:1: ( ( ( rule__StringElement__ValueAssignment_1 ) ) )
            // InternalSimulink.g:1177:1: ( ( rule__StringElement__ValueAssignment_1 ) )
            {
            // InternalSimulink.g:1177:1: ( ( rule__StringElement__ValueAssignment_1 ) )
            // InternalSimulink.g:1178:2: ( rule__StringElement__ValueAssignment_1 )
            {
             before(grammarAccess.getStringElementAccess().getValueAssignment_1()); 
            // InternalSimulink.g:1179:2: ( rule__StringElement__ValueAssignment_1 )
            // InternalSimulink.g:1179:3: rule__StringElement__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__StringElement__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStringElementAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringElement__Group__1__Impl"


    // $ANTLR start "rule__StringElement__Group__2"
    // InternalSimulink.g:1187:1: rule__StringElement__Group__2 : rule__StringElement__Group__2__Impl ;
    public final void rule__StringElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:1191:1: ( rule__StringElement__Group__2__Impl )
            // InternalSimulink.g:1192:2: rule__StringElement__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringElement__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringElement__Group__2"


    // $ANTLR start "rule__StringElement__Group__2__Impl"
    // InternalSimulink.g:1198:1: rule__StringElement__Group__2__Impl : ( ( rule__StringElement__ValueAssignment_2 )* ) ;
    public final void rule__StringElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:1202:1: ( ( ( rule__StringElement__ValueAssignment_2 )* ) )
            // InternalSimulink.g:1203:1: ( ( rule__StringElement__ValueAssignment_2 )* )
            {
            // InternalSimulink.g:1203:1: ( ( rule__StringElement__ValueAssignment_2 )* )
            // InternalSimulink.g:1204:2: ( rule__StringElement__ValueAssignment_2 )*
            {
             before(grammarAccess.getStringElementAccess().getValueAssignment_2()); 
            // InternalSimulink.g:1205:2: ( rule__StringElement__ValueAssignment_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_STRING) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSimulink.g:1205:3: rule__StringElement__ValueAssignment_2
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__StringElement__ValueAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getStringElementAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringElement__Group__2__Impl"


    // $ANTLR start "rule__Root__RootElementAssignment"
    // InternalSimulink.g:1214:1: rule__Root__RootElementAssignment : ( ruleSubElement ) ;
    public final void rule__Root__RootElementAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:1218:1: ( ( ruleSubElement ) )
            // InternalSimulink.g:1219:2: ( ruleSubElement )
            {
            // InternalSimulink.g:1219:2: ( ruleSubElement )
            // InternalSimulink.g:1220:3: ruleSubElement
            {
             before(grammarAccess.getRootAccess().getRootElementSubElementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleSubElement();

            state._fsp--;

             after(grammarAccess.getRootAccess().getRootElementSubElementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Root__RootElementAssignment"


    // $ANTLR start "rule__SubElement__NameAssignment_0"
    // InternalSimulink.g:1229:1: rule__SubElement__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__SubElement__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:1233:1: ( ( RULE_ID ) )
            // InternalSimulink.g:1234:2: ( RULE_ID )
            {
            // InternalSimulink.g:1234:2: ( RULE_ID )
            // InternalSimulink.g:1235:3: RULE_ID
            {
             before(grammarAccess.getSubElementAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSubElementAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubElement__NameAssignment_0"


    // $ANTLR start "rule__SubElement__ElementAssignment_2"
    // InternalSimulink.g:1244:1: rule__SubElement__ElementAssignment_2 : ( ruleElement ) ;
    public final void rule__SubElement__ElementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:1248:1: ( ( ruleElement ) )
            // InternalSimulink.g:1249:2: ( ruleElement )
            {
            // InternalSimulink.g:1249:2: ( ruleElement )
            // InternalSimulink.g:1250:3: ruleElement
            {
             before(grammarAccess.getSubElementAccess().getElementElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getSubElementAccess().getElementElementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubElement__ElementAssignment_2"


    // $ANTLR start "rule__BaseElement__NameAssignment_0"
    // InternalSimulink.g:1259:1: rule__BaseElement__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__BaseElement__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:1263:1: ( ( RULE_ID ) )
            // InternalSimulink.g:1264:2: ( RULE_ID )
            {
            // InternalSimulink.g:1264:2: ( RULE_ID )
            // InternalSimulink.g:1265:3: RULE_ID
            {
             before(grammarAccess.getBaseElementAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBaseElementAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseElement__NameAssignment_0"


    // $ANTLR start "rule__BaseElement__ValueAssignment_1"
    // InternalSimulink.g:1274:1: rule__BaseElement__ValueAssignment_1 : ( ruleBaseValue ) ;
    public final void rule__BaseElement__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:1278:1: ( ( ruleBaseValue ) )
            // InternalSimulink.g:1279:2: ( ruleBaseValue )
            {
            // InternalSimulink.g:1279:2: ( ruleBaseValue )
            // InternalSimulink.g:1280:3: ruleBaseValue
            {
             before(grammarAccess.getBaseElementAccess().getValueBaseValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBaseValue();

            state._fsp--;

             after(grammarAccess.getBaseElementAccess().getValueBaseValueParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseElement__ValueAssignment_1"


    // $ANTLR start "rule__VectorElement__NameAssignment_0"
    // InternalSimulink.g:1289:1: rule__VectorElement__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__VectorElement__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:1293:1: ( ( RULE_ID ) )
            // InternalSimulink.g:1294:2: ( RULE_ID )
            {
            // InternalSimulink.g:1294:2: ( RULE_ID )
            // InternalSimulink.g:1295:3: RULE_ID
            {
             before(grammarAccess.getVectorElementAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVectorElementAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VectorElement__NameAssignment_0"


    // $ANTLR start "rule__VectorElement__ValueAssignment_2"
    // InternalSimulink.g:1304:1: rule__VectorElement__ValueAssignment_2 : ( ruleBaseValue ) ;
    public final void rule__VectorElement__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:1308:1: ( ( ruleBaseValue ) )
            // InternalSimulink.g:1309:2: ( ruleBaseValue )
            {
            // InternalSimulink.g:1309:2: ( ruleBaseValue )
            // InternalSimulink.g:1310:3: ruleBaseValue
            {
             before(grammarAccess.getVectorElementAccess().getValueBaseValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBaseValue();

            state._fsp--;

             after(grammarAccess.getVectorElementAccess().getValueBaseValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VectorElement__ValueAssignment_2"


    // $ANTLR start "rule__VectorElement__ValueAssignment_3_1"
    // InternalSimulink.g:1319:1: rule__VectorElement__ValueAssignment_3_1 : ( ruleBaseValue ) ;
    public final void rule__VectorElement__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:1323:1: ( ( ruleBaseValue ) )
            // InternalSimulink.g:1324:2: ( ruleBaseValue )
            {
            // InternalSimulink.g:1324:2: ( ruleBaseValue )
            // InternalSimulink.g:1325:3: ruleBaseValue
            {
             before(grammarAccess.getVectorElementAccess().getValueBaseValueParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBaseValue();

            state._fsp--;

             after(grammarAccess.getVectorElementAccess().getValueBaseValueParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VectorElement__ValueAssignment_3_1"


    // $ANTLR start "rule__MatrixElement__NameAssignment_0"
    // InternalSimulink.g:1334:1: rule__MatrixElement__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__MatrixElement__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:1338:1: ( ( RULE_ID ) )
            // InternalSimulink.g:1339:2: ( RULE_ID )
            {
            // InternalSimulink.g:1339:2: ( RULE_ID )
            // InternalSimulink.g:1340:3: RULE_ID
            {
             before(grammarAccess.getMatrixElementAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMatrixElementAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatrixElement__NameAssignment_0"


    // $ANTLR start "rule__MatrixElement__ValueAssignment_2"
    // InternalSimulink.g:1349:1: rule__MatrixElement__ValueAssignment_2 : ( ruleBaseValue ) ;
    public final void rule__MatrixElement__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:1353:1: ( ( ruleBaseValue ) )
            // InternalSimulink.g:1354:2: ( ruleBaseValue )
            {
            // InternalSimulink.g:1354:2: ( ruleBaseValue )
            // InternalSimulink.g:1355:3: ruleBaseValue
            {
             before(grammarAccess.getMatrixElementAccess().getValueBaseValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBaseValue();

            state._fsp--;

             after(grammarAccess.getMatrixElementAccess().getValueBaseValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatrixElement__ValueAssignment_2"


    // $ANTLR start "rule__MatrixElement__ValueAssignment_3_1"
    // InternalSimulink.g:1364:1: rule__MatrixElement__ValueAssignment_3_1 : ( ruleBaseValue ) ;
    public final void rule__MatrixElement__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:1368:1: ( ( ruleBaseValue ) )
            // InternalSimulink.g:1369:2: ( ruleBaseValue )
            {
            // InternalSimulink.g:1369:2: ( ruleBaseValue )
            // InternalSimulink.g:1370:3: ruleBaseValue
            {
             before(grammarAccess.getMatrixElementAccess().getValueBaseValueParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBaseValue();

            state._fsp--;

             after(grammarAccess.getMatrixElementAccess().getValueBaseValueParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatrixElement__ValueAssignment_3_1"


    // $ANTLR start "rule__MatrixElement__ValueAssignment_4_1"
    // InternalSimulink.g:1379:1: rule__MatrixElement__ValueAssignment_4_1 : ( ruleBaseValue ) ;
    public final void rule__MatrixElement__ValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:1383:1: ( ( ruleBaseValue ) )
            // InternalSimulink.g:1384:2: ( ruleBaseValue )
            {
            // InternalSimulink.g:1384:2: ( ruleBaseValue )
            // InternalSimulink.g:1385:3: ruleBaseValue
            {
             before(grammarAccess.getMatrixElementAccess().getValueBaseValueParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBaseValue();

            state._fsp--;

             after(grammarAccess.getMatrixElementAccess().getValueBaseValueParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatrixElement__ValueAssignment_4_1"


    // $ANTLR start "rule__MatrixElement__ValueAssignment_4_2_1"
    // InternalSimulink.g:1394:1: rule__MatrixElement__ValueAssignment_4_2_1 : ( ruleBaseValue ) ;
    public final void rule__MatrixElement__ValueAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:1398:1: ( ( ruleBaseValue ) )
            // InternalSimulink.g:1399:2: ( ruleBaseValue )
            {
            // InternalSimulink.g:1399:2: ( ruleBaseValue )
            // InternalSimulink.g:1400:3: ruleBaseValue
            {
             before(grammarAccess.getMatrixElementAccess().getValueBaseValueParserRuleCall_4_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBaseValue();

            state._fsp--;

             after(grammarAccess.getMatrixElementAccess().getValueBaseValueParserRuleCall_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MatrixElement__ValueAssignment_4_2_1"


    // $ANTLR start "rule__StringElement__NameAssignment_0"
    // InternalSimulink.g:1409:1: rule__StringElement__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__StringElement__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:1413:1: ( ( RULE_ID ) )
            // InternalSimulink.g:1414:2: ( RULE_ID )
            {
            // InternalSimulink.g:1414:2: ( RULE_ID )
            // InternalSimulink.g:1415:3: RULE_ID
            {
             before(grammarAccess.getStringElementAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStringElementAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringElement__NameAssignment_0"


    // $ANTLR start "rule__StringElement__ValueAssignment_1"
    // InternalSimulink.g:1424:1: rule__StringElement__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__StringElement__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:1428:1: ( ( RULE_STRING ) )
            // InternalSimulink.g:1429:2: ( RULE_STRING )
            {
            // InternalSimulink.g:1429:2: ( RULE_STRING )
            // InternalSimulink.g:1430:3: RULE_STRING
            {
             before(grammarAccess.getStringElementAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringElementAccess().getValueSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringElement__ValueAssignment_1"


    // $ANTLR start "rule__StringElement__ValueAssignment_2"
    // InternalSimulink.g:1439:1: rule__StringElement__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__StringElement__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSimulink.g:1443:1: ( ( RULE_STRING ) )
            // InternalSimulink.g:1444:2: ( RULE_STRING )
            {
            // InternalSimulink.g:1444:2: ( RULE_STRING )
            // InternalSimulink.g:1445:3: RULE_STRING
            {
             before(grammarAccess.getStringElementAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringElementAccess().getValueSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringElement__ValueAssignment_2"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\21\uffff";
    static final String dfa_2s = "\1\7\1\4\2\uffff\1\4\1\uffff\4\21\1\4\2\uffff\4\21";
    static final String dfa_3s = "\1\7\1\20\2\uffff\1\23\1\uffff\4\23\1\7\2\uffff\4\23";
    static final String dfa_4s = "\2\uffff\1\5\1\2\1\uffff\1\1\5\uffff\1\4\1\3\4\uffff";
    static final String dfa_5s = "\21\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\4\3\1\2\5\uffff\1\5\1\uffff\1\4",
            "",
            "",
            "\1\6\1\7\1\10\1\11\11\uffff\1\14\1\12\1\13",
            "",
            "\1\14\1\12\1\13",
            "\1\14\1\12\1\13",
            "\1\14\1\12\1\13",
            "\1\14\1\12\1\13",
            "\1\15\1\16\1\17\1\20",
            "",
            "",
            "\1\14\1\12\1\13",
            "\1\14\1\12\1\13",
            "\1\14\1\12\1\13",
            "\1\14\1\12\1\13"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "352:1: rule__Element__Alternatives : ( ( ruleSubElement ) | ( ruleBaseElement ) | ( ruleVectorElement ) | ( ruleMatrixElement ) | ( ruleStringElement ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008080L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000600F0L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000C00F0L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000C00F2L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000102L});

}