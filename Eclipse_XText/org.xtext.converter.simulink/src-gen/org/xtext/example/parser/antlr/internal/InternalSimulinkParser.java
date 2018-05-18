package org.xtext.example.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.services.SimulinkGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSimulinkParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_FLOAT", "RULE_FLOAT_X", "RULE_INT_X", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'}'", "'['", "','", "']'", "';'"
    };
    public static final int RULE_INT_X=8;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int RULE_FLOAT_X=7;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_INT=9;
    public static final int RULE_ML_COMMENT=10;
    public static final int RULE_FLOAT=6;

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

        public InternalSimulinkParser(TokenStream input, SimulinkGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Root";
       	}

       	@Override
       	protected SimulinkGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRoot"
    // InternalSimulink.g:64:1: entryRuleRoot returns [EObject current=null] : iv_ruleRoot= ruleRoot EOF ;
    public final EObject entryRuleRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoot = null;


        try {
            // InternalSimulink.g:64:45: (iv_ruleRoot= ruleRoot EOF )
            // InternalSimulink.g:65:2: iv_ruleRoot= ruleRoot EOF
            {
             newCompositeNode(grammarAccess.getRootRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoot=ruleRoot();

            state._fsp--;

             current =iv_ruleRoot; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRoot"


    // $ANTLR start "ruleRoot"
    // InternalSimulink.g:71:1: ruleRoot returns [EObject current=null] : ( (lv_rootElement_0_0= ruleSubElement ) )* ;
    public final EObject ruleRoot() throws RecognitionException {
        EObject current = null;

        EObject lv_rootElement_0_0 = null;



        	enterRule();

        try {
            // InternalSimulink.g:77:2: ( ( (lv_rootElement_0_0= ruleSubElement ) )* )
            // InternalSimulink.g:78:2: ( (lv_rootElement_0_0= ruleSubElement ) )*
            {
            // InternalSimulink.g:78:2: ( (lv_rootElement_0_0= ruleSubElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSimulink.g:79:3: (lv_rootElement_0_0= ruleSubElement )
            	    {
            	    // InternalSimulink.g:79:3: (lv_rootElement_0_0= ruleSubElement )
            	    // InternalSimulink.g:80:4: lv_rootElement_0_0= ruleSubElement
            	    {

            	    				newCompositeNode(grammarAccess.getRootAccess().getRootElementSubElementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_rootElement_0_0=ruleSubElement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getRootRule());
            	    				}
            	    				add(
            	    					current,
            	    					"rootElement",
            	    					lv_rootElement_0_0,
            	    					"org.xtext.example.Simulink.SubElement");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRoot"


    // $ANTLR start "entryRuleSubElement"
    // InternalSimulink.g:100:1: entryRuleSubElement returns [EObject current=null] : iv_ruleSubElement= ruleSubElement EOF ;
    public final EObject entryRuleSubElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubElement = null;


        try {
            // InternalSimulink.g:100:51: (iv_ruleSubElement= ruleSubElement EOF )
            // InternalSimulink.g:101:2: iv_ruleSubElement= ruleSubElement EOF
            {
             newCompositeNode(grammarAccess.getSubElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubElement=ruleSubElement();

            state._fsp--;

             current =iv_ruleSubElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubElement"


    // $ANTLR start "ruleSubElement"
    // InternalSimulink.g:107:1: ruleSubElement returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_element_2_0= ruleElement ) )* otherlv_3= '}' ) ;
    public final EObject ruleSubElement() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_element_2_0 = null;



        	enterRule();

        try {
            // InternalSimulink.g:113:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_element_2_0= ruleElement ) )* otherlv_3= '}' ) )
            // InternalSimulink.g:114:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_element_2_0= ruleElement ) )* otherlv_3= '}' )
            {
            // InternalSimulink.g:114:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_element_2_0= ruleElement ) )* otherlv_3= '}' )
            // InternalSimulink.g:115:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_element_2_0= ruleElement ) )* otherlv_3= '}'
            {
            // InternalSimulink.g:115:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSimulink.g:116:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSimulink.g:116:4: (lv_name_0_0= RULE_ID )
            // InternalSimulink.g:117:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_0_0, grammarAccess.getSubElementAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubElementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.example.Simulink.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getSubElementAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSimulink.g:137:3: ( (lv_element_2_0= ruleElement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSimulink.g:138:4: (lv_element_2_0= ruleElement )
            	    {
            	    // InternalSimulink.g:138:4: (lv_element_2_0= ruleElement )
            	    // InternalSimulink.g:139:5: lv_element_2_0= ruleElement
            	    {

            	    					newCompositeNode(grammarAccess.getSubElementAccess().getElementElementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_element_2_0=ruleElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSubElementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"element",
            	    						lv_element_2_0,
            	    						"org.xtext.example.Simulink.Element");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_3=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getSubElementAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubElement"


    // $ANTLR start "entryRuleElement"
    // InternalSimulink.g:164:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalSimulink.g:164:48: (iv_ruleElement= ruleElement EOF )
            // InternalSimulink.g:165:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalSimulink.g:171:1: ruleElement returns [EObject current=null] : (this_SubElement_0= ruleSubElement | this_BaseElement_1= ruleBaseElement | this_VectorElement_2= ruleVectorElement | this_MatrixElement_3= ruleMatrixElement | this_StringElement_4= ruleStringElement ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_SubElement_0 = null;

        EObject this_BaseElement_1 = null;

        EObject this_VectorElement_2 = null;

        EObject this_MatrixElement_3 = null;

        EObject this_StringElement_4 = null;



        	enterRule();

        try {
            // InternalSimulink.g:177:2: ( (this_SubElement_0= ruleSubElement | this_BaseElement_1= ruleBaseElement | this_VectorElement_2= ruleVectorElement | this_MatrixElement_3= ruleMatrixElement | this_StringElement_4= ruleStringElement ) )
            // InternalSimulink.g:178:2: (this_SubElement_0= ruleSubElement | this_BaseElement_1= ruleBaseElement | this_VectorElement_2= ruleVectorElement | this_MatrixElement_3= ruleMatrixElement | this_StringElement_4= ruleStringElement )
            {
            // InternalSimulink.g:178:2: (this_SubElement_0= ruleSubElement | this_BaseElement_1= ruleBaseElement | this_VectorElement_2= ruleVectorElement | this_MatrixElement_3= ruleMatrixElement | this_StringElement_4= ruleStringElement )
            int alt3=5;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalSimulink.g:179:3: this_SubElement_0= ruleSubElement
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getSubElementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SubElement_0=ruleSubElement();

                    state._fsp--;


                    			current = this_SubElement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSimulink.g:188:3: this_BaseElement_1= ruleBaseElement
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getBaseElementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_BaseElement_1=ruleBaseElement();

                    state._fsp--;


                    			current = this_BaseElement_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSimulink.g:197:3: this_VectorElement_2= ruleVectorElement
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getVectorElementParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_VectorElement_2=ruleVectorElement();

                    state._fsp--;


                    			current = this_VectorElement_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSimulink.g:206:3: this_MatrixElement_3= ruleMatrixElement
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getMatrixElementParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_MatrixElement_3=ruleMatrixElement();

                    state._fsp--;


                    			current = this_MatrixElement_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalSimulink.g:215:3: this_StringElement_4= ruleStringElement
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getStringElementParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringElement_4=ruleStringElement();

                    state._fsp--;


                    			current = this_StringElement_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleBaseElement"
    // InternalSimulink.g:227:1: entryRuleBaseElement returns [EObject current=null] : iv_ruleBaseElement= ruleBaseElement EOF ;
    public final EObject entryRuleBaseElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseElement = null;


        try {
            // InternalSimulink.g:227:52: (iv_ruleBaseElement= ruleBaseElement EOF )
            // InternalSimulink.g:228:2: iv_ruleBaseElement= ruleBaseElement EOF
            {
             newCompositeNode(grammarAccess.getBaseElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBaseElement=ruleBaseElement();

            state._fsp--;

             current =iv_ruleBaseElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBaseElement"


    // $ANTLR start "ruleBaseElement"
    // InternalSimulink.g:234:1: ruleBaseElement returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= ruleBaseValue ) ) ) ;
    public final EObject ruleBaseElement() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalSimulink.g:240:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= ruleBaseValue ) ) ) )
            // InternalSimulink.g:241:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= ruleBaseValue ) ) )
            {
            // InternalSimulink.g:241:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= ruleBaseValue ) ) )
            // InternalSimulink.g:242:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= ruleBaseValue ) )
            {
            // InternalSimulink.g:242:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSimulink.g:243:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSimulink.g:243:4: (lv_name_0_0= RULE_ID )
            // InternalSimulink.g:244:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_0_0, grammarAccess.getBaseElementAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBaseElementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.example.Simulink.ID");
            				

            }


            }

            // InternalSimulink.g:260:3: ( (lv_value_1_0= ruleBaseValue ) )
            // InternalSimulink.g:261:4: (lv_value_1_0= ruleBaseValue )
            {
            // InternalSimulink.g:261:4: (lv_value_1_0= ruleBaseValue )
            // InternalSimulink.g:262:5: lv_value_1_0= ruleBaseValue
            {

            					newCompositeNode(grammarAccess.getBaseElementAccess().getValueBaseValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleBaseValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBaseElementRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.xtext.example.Simulink.BaseValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBaseElement"


    // $ANTLR start "entryRuleVectorElement"
    // InternalSimulink.g:283:1: entryRuleVectorElement returns [EObject current=null] : iv_ruleVectorElement= ruleVectorElement EOF ;
    public final EObject entryRuleVectorElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVectorElement = null;


        try {
            // InternalSimulink.g:283:54: (iv_ruleVectorElement= ruleVectorElement EOF )
            // InternalSimulink.g:284:2: iv_ruleVectorElement= ruleVectorElement EOF
            {
             newCompositeNode(grammarAccess.getVectorElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVectorElement=ruleVectorElement();

            state._fsp--;

             current =iv_ruleVectorElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVectorElement"


    // $ANTLR start "ruleVectorElement"
    // InternalSimulink.g:290:1: ruleVectorElement returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_value_2_0= ruleBaseValue ) )? (otherlv_3= ',' ( (lv_value_4_0= ruleBaseValue ) ) )* otherlv_5= ']' ) ;
    public final EObject ruleVectorElement() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;

        AntlrDatatypeRuleToken lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalSimulink.g:296:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_value_2_0= ruleBaseValue ) )? (otherlv_3= ',' ( (lv_value_4_0= ruleBaseValue ) ) )* otherlv_5= ']' ) )
            // InternalSimulink.g:297:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_value_2_0= ruleBaseValue ) )? (otherlv_3= ',' ( (lv_value_4_0= ruleBaseValue ) ) )* otherlv_5= ']' )
            {
            // InternalSimulink.g:297:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_value_2_0= ruleBaseValue ) )? (otherlv_3= ',' ( (lv_value_4_0= ruleBaseValue ) ) )* otherlv_5= ']' )
            // InternalSimulink.g:298:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_value_2_0= ruleBaseValue ) )? (otherlv_3= ',' ( (lv_value_4_0= ruleBaseValue ) ) )* otherlv_5= ']'
            {
            // InternalSimulink.g:298:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSimulink.g:299:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSimulink.g:299:4: (lv_name_0_0= RULE_ID )
            // InternalSimulink.g:300:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_0_0, grammarAccess.getVectorElementAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVectorElementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.example.Simulink.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getVectorElementAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalSimulink.g:320:3: ( (lv_value_2_0= ruleBaseValue ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID||(LA4_0>=RULE_FLOAT && LA4_0<=RULE_INT_X)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSimulink.g:321:4: (lv_value_2_0= ruleBaseValue )
                    {
                    // InternalSimulink.g:321:4: (lv_value_2_0= ruleBaseValue )
                    // InternalSimulink.g:322:5: lv_value_2_0= ruleBaseValue
                    {

                    					newCompositeNode(grammarAccess.getVectorElementAccess().getValueBaseValueParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_9);
                    lv_value_2_0=ruleBaseValue();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getVectorElementRule());
                    					}
                    					add(
                    						current,
                    						"value",
                    						lv_value_2_0,
                    						"org.xtext.example.Simulink.BaseValue");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSimulink.g:339:3: (otherlv_3= ',' ( (lv_value_4_0= ruleBaseValue ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSimulink.g:340:4: otherlv_3= ',' ( (lv_value_4_0= ruleBaseValue ) )
            	    {
            	    otherlv_3=(Token)match(input,17,FOLLOW_6); 

            	    				newLeafNode(otherlv_3, grammarAccess.getVectorElementAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalSimulink.g:344:4: ( (lv_value_4_0= ruleBaseValue ) )
            	    // InternalSimulink.g:345:5: (lv_value_4_0= ruleBaseValue )
            	    {
            	    // InternalSimulink.g:345:5: (lv_value_4_0= ruleBaseValue )
            	    // InternalSimulink.g:346:6: lv_value_4_0= ruleBaseValue
            	    {

            	    						newCompositeNode(grammarAccess.getVectorElementAccess().getValueBaseValueParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_value_4_0=ruleBaseValue();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getVectorElementRule());
            	    						}
            	    						add(
            	    							current,
            	    							"value",
            	    							lv_value_4_0,
            	    							"org.xtext.example.Simulink.BaseValue");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_5=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getVectorElementAccess().getRightSquareBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVectorElement"


    // $ANTLR start "entryRuleMatrixElement"
    // InternalSimulink.g:372:1: entryRuleMatrixElement returns [EObject current=null] : iv_ruleMatrixElement= ruleMatrixElement EOF ;
    public final EObject entryRuleMatrixElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatrixElement = null;


        try {
            // InternalSimulink.g:372:54: (iv_ruleMatrixElement= ruleMatrixElement EOF )
            // InternalSimulink.g:373:2: iv_ruleMatrixElement= ruleMatrixElement EOF
            {
             newCompositeNode(grammarAccess.getMatrixElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMatrixElement=ruleMatrixElement();

            state._fsp--;

             current =iv_ruleMatrixElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMatrixElement"


    // $ANTLR start "ruleMatrixElement"
    // InternalSimulink.g:379:1: ruleMatrixElement returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_value_2_0= ruleBaseValue ) )? (otherlv_3= ',' ( (lv_value_4_0= ruleBaseValue ) ) )* (otherlv_5= ';' ( (lv_value_6_0= ruleBaseValue ) )? (otherlv_7= ',' ( (lv_value_8_0= ruleBaseValue ) ) )* )+ otherlv_9= ']' ) ;
    public final EObject ruleMatrixElement() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;

        AntlrDatatypeRuleToken lv_value_4_0 = null;

        AntlrDatatypeRuleToken lv_value_6_0 = null;

        AntlrDatatypeRuleToken lv_value_8_0 = null;



        	enterRule();

        try {
            // InternalSimulink.g:385:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_value_2_0= ruleBaseValue ) )? (otherlv_3= ',' ( (lv_value_4_0= ruleBaseValue ) ) )* (otherlv_5= ';' ( (lv_value_6_0= ruleBaseValue ) )? (otherlv_7= ',' ( (lv_value_8_0= ruleBaseValue ) ) )* )+ otherlv_9= ']' ) )
            // InternalSimulink.g:386:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_value_2_0= ruleBaseValue ) )? (otherlv_3= ',' ( (lv_value_4_0= ruleBaseValue ) ) )* (otherlv_5= ';' ( (lv_value_6_0= ruleBaseValue ) )? (otherlv_7= ',' ( (lv_value_8_0= ruleBaseValue ) ) )* )+ otherlv_9= ']' )
            {
            // InternalSimulink.g:386:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_value_2_0= ruleBaseValue ) )? (otherlv_3= ',' ( (lv_value_4_0= ruleBaseValue ) ) )* (otherlv_5= ';' ( (lv_value_6_0= ruleBaseValue ) )? (otherlv_7= ',' ( (lv_value_8_0= ruleBaseValue ) ) )* )+ otherlv_9= ']' )
            // InternalSimulink.g:387:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_value_2_0= ruleBaseValue ) )? (otherlv_3= ',' ( (lv_value_4_0= ruleBaseValue ) ) )* (otherlv_5= ';' ( (lv_value_6_0= ruleBaseValue ) )? (otherlv_7= ',' ( (lv_value_8_0= ruleBaseValue ) ) )* )+ otherlv_9= ']'
            {
            // InternalSimulink.g:387:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSimulink.g:388:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSimulink.g:388:4: (lv_name_0_0= RULE_ID )
            // InternalSimulink.g:389:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_0_0, grammarAccess.getMatrixElementAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMatrixElementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.example.Simulink.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getMatrixElementAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalSimulink.g:409:3: ( (lv_value_2_0= ruleBaseValue ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID||(LA6_0>=RULE_FLOAT && LA6_0<=RULE_INT_X)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSimulink.g:410:4: (lv_value_2_0= ruleBaseValue )
                    {
                    // InternalSimulink.g:410:4: (lv_value_2_0= ruleBaseValue )
                    // InternalSimulink.g:411:5: lv_value_2_0= ruleBaseValue
                    {

                    					newCompositeNode(grammarAccess.getMatrixElementAccess().getValueBaseValueParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_11);
                    lv_value_2_0=ruleBaseValue();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMatrixElementRule());
                    					}
                    					add(
                    						current,
                    						"value",
                    						lv_value_2_0,
                    						"org.xtext.example.Simulink.BaseValue");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSimulink.g:428:3: (otherlv_3= ',' ( (lv_value_4_0= ruleBaseValue ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==17) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSimulink.g:429:4: otherlv_3= ',' ( (lv_value_4_0= ruleBaseValue ) )
            	    {
            	    otherlv_3=(Token)match(input,17,FOLLOW_6); 

            	    				newLeafNode(otherlv_3, grammarAccess.getMatrixElementAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalSimulink.g:433:4: ( (lv_value_4_0= ruleBaseValue ) )
            	    // InternalSimulink.g:434:5: (lv_value_4_0= ruleBaseValue )
            	    {
            	    // InternalSimulink.g:434:5: (lv_value_4_0= ruleBaseValue )
            	    // InternalSimulink.g:435:6: lv_value_4_0= ruleBaseValue
            	    {

            	    						newCompositeNode(grammarAccess.getMatrixElementAccess().getValueBaseValueParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_value_4_0=ruleBaseValue();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMatrixElementRule());
            	    						}
            	    						add(
            	    							current,
            	    							"value",
            	    							lv_value_4_0,
            	    							"org.xtext.example.Simulink.BaseValue");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // InternalSimulink.g:453:3: (otherlv_5= ';' ( (lv_value_6_0= ruleBaseValue ) )? (otherlv_7= ',' ( (lv_value_8_0= ruleBaseValue ) ) )* )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==19) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSimulink.g:454:4: otherlv_5= ';' ( (lv_value_6_0= ruleBaseValue ) )? (otherlv_7= ',' ( (lv_value_8_0= ruleBaseValue ) ) )*
            	    {
            	    otherlv_5=(Token)match(input,19,FOLLOW_12); 

            	    				newLeafNode(otherlv_5, grammarAccess.getMatrixElementAccess().getSemicolonKeyword_4_0());
            	    			
            	    // InternalSimulink.g:458:4: ( (lv_value_6_0= ruleBaseValue ) )?
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0==RULE_ID||(LA8_0>=RULE_FLOAT && LA8_0<=RULE_INT_X)) ) {
            	        alt8=1;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // InternalSimulink.g:459:5: (lv_value_6_0= ruleBaseValue )
            	            {
            	            // InternalSimulink.g:459:5: (lv_value_6_0= ruleBaseValue )
            	            // InternalSimulink.g:460:6: lv_value_6_0= ruleBaseValue
            	            {

            	            						newCompositeNode(grammarAccess.getMatrixElementAccess().getValueBaseValueParserRuleCall_4_1_0());
            	            					
            	            pushFollow(FOLLOW_13);
            	            lv_value_6_0=ruleBaseValue();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getMatrixElementRule());
            	            						}
            	            						add(
            	            							current,
            	            							"value",
            	            							lv_value_6_0,
            	            							"org.xtext.example.Simulink.BaseValue");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalSimulink.g:477:4: (otherlv_7= ',' ( (lv_value_8_0= ruleBaseValue ) ) )*
            	    loop9:
            	    do {
            	        int alt9=2;
            	        int LA9_0 = input.LA(1);

            	        if ( (LA9_0==17) ) {
            	            alt9=1;
            	        }


            	        switch (alt9) {
            	    	case 1 :
            	    	    // InternalSimulink.g:478:5: otherlv_7= ',' ( (lv_value_8_0= ruleBaseValue ) )
            	    	    {
            	    	    otherlv_7=(Token)match(input,17,FOLLOW_6); 

            	    	    					newLeafNode(otherlv_7, grammarAccess.getMatrixElementAccess().getCommaKeyword_4_2_0());
            	    	    				
            	    	    // InternalSimulink.g:482:5: ( (lv_value_8_0= ruleBaseValue ) )
            	    	    // InternalSimulink.g:483:6: (lv_value_8_0= ruleBaseValue )
            	    	    {
            	    	    // InternalSimulink.g:483:6: (lv_value_8_0= ruleBaseValue )
            	    	    // InternalSimulink.g:484:7: lv_value_8_0= ruleBaseValue
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getMatrixElementAccess().getValueBaseValueParserRuleCall_4_2_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_13);
            	    	    lv_value_8_0=ruleBaseValue();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getMatrixElementRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"value",
            	    	    								lv_value_8_0,
            	    	    								"org.xtext.example.Simulink.BaseValue");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop9;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            otherlv_9=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getMatrixElementAccess().getRightSquareBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMatrixElement"


    // $ANTLR start "entryRuleStringElement"
    // InternalSimulink.g:511:1: entryRuleStringElement returns [EObject current=null] : iv_ruleStringElement= ruleStringElement EOF ;
    public final EObject entryRuleStringElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringElement = null;


        try {
            // InternalSimulink.g:511:54: (iv_ruleStringElement= ruleStringElement EOF )
            // InternalSimulink.g:512:2: iv_ruleStringElement= ruleStringElement EOF
            {
             newCompositeNode(grammarAccess.getStringElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringElement=ruleStringElement();

            state._fsp--;

             current =iv_ruleStringElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringElement"


    // $ANTLR start "ruleStringElement"
    // InternalSimulink.g:518:1: ruleStringElement returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_STRING ) ) ( (lv_value_2_0= RULE_STRING ) )* ) ;
    public final EObject ruleStringElement() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_value_1_0=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalSimulink.g:524:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_STRING ) ) ( (lv_value_2_0= RULE_STRING ) )* ) )
            // InternalSimulink.g:525:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_STRING ) ) ( (lv_value_2_0= RULE_STRING ) )* )
            {
            // InternalSimulink.g:525:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_STRING ) ) ( (lv_value_2_0= RULE_STRING ) )* )
            // InternalSimulink.g:526:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_value_1_0= RULE_STRING ) ) ( (lv_value_2_0= RULE_STRING ) )*
            {
            // InternalSimulink.g:526:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSimulink.g:527:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSimulink.g:527:4: (lv_name_0_0= RULE_ID )
            // InternalSimulink.g:528:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_0_0, grammarAccess.getStringElementAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStringElementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.example.Simulink.ID");
            				

            }


            }

            // InternalSimulink.g:544:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalSimulink.g:545:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalSimulink.g:545:4: (lv_value_1_0= RULE_STRING )
            // InternalSimulink.g:546:5: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_value_1_0, grammarAccess.getStringElementAccess().getValueSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStringElementRule());
            					}
            					addWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalSimulink.g:562:3: ( (lv_value_2_0= RULE_STRING ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_STRING) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSimulink.g:563:4: (lv_value_2_0= RULE_STRING )
            	    {
            	    // InternalSimulink.g:563:4: (lv_value_2_0= RULE_STRING )
            	    // InternalSimulink.g:564:5: lv_value_2_0= RULE_STRING
            	    {
            	    lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            	    					newLeafNode(lv_value_2_0, grammarAccess.getStringElementAccess().getValueSTRINGTerminalRuleCall_2_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getStringElementRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"value",
            	    						lv_value_2_0,
            	    						"org.eclipse.xtext.common.Terminals.STRING");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringElement"


    // $ANTLR start "entryRuleBaseValue"
    // InternalSimulink.g:584:1: entryRuleBaseValue returns [String current=null] : iv_ruleBaseValue= ruleBaseValue EOF ;
    public final String entryRuleBaseValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBaseValue = null;


        try {
            // InternalSimulink.g:584:49: (iv_ruleBaseValue= ruleBaseValue EOF )
            // InternalSimulink.g:585:2: iv_ruleBaseValue= ruleBaseValue EOF
            {
             newCompositeNode(grammarAccess.getBaseValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBaseValue=ruleBaseValue();

            state._fsp--;

             current =iv_ruleBaseValue.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBaseValue"


    // $ANTLR start "ruleBaseValue"
    // InternalSimulink.g:591:1: ruleBaseValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_FloatValue_0= ruleFloatValue | this_FloatExpValue_1= ruleFloatExpValue | this_IntValue_2= ruleIntValue | this_IdValue_3= ruleIdValue ) ;
    public final AntlrDatatypeRuleToken ruleBaseValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_FloatValue_0 = null;

        AntlrDatatypeRuleToken this_FloatExpValue_1 = null;

        AntlrDatatypeRuleToken this_IntValue_2 = null;

        AntlrDatatypeRuleToken this_IdValue_3 = null;



        	enterRule();

        try {
            // InternalSimulink.g:597:2: ( (this_FloatValue_0= ruleFloatValue | this_FloatExpValue_1= ruleFloatExpValue | this_IntValue_2= ruleIntValue | this_IdValue_3= ruleIdValue ) )
            // InternalSimulink.g:598:2: (this_FloatValue_0= ruleFloatValue | this_FloatExpValue_1= ruleFloatExpValue | this_IntValue_2= ruleIntValue | this_IdValue_3= ruleIdValue )
            {
            // InternalSimulink.g:598:2: (this_FloatValue_0= ruleFloatValue | this_FloatExpValue_1= ruleFloatExpValue | this_IntValue_2= ruleIntValue | this_IdValue_3= ruleIdValue )
            int alt12=4;
            switch ( input.LA(1) ) {
            case RULE_FLOAT:
                {
                alt12=1;
                }
                break;
            case RULE_FLOAT_X:
                {
                alt12=2;
                }
                break;
            case RULE_INT_X:
                {
                alt12=3;
                }
                break;
            case RULE_ID:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalSimulink.g:599:3: this_FloatValue_0= ruleFloatValue
                    {

                    			newCompositeNode(grammarAccess.getBaseValueAccess().getFloatValueParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_FloatValue_0=ruleFloatValue();

                    state._fsp--;


                    			current.merge(this_FloatValue_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSimulink.g:610:3: this_FloatExpValue_1= ruleFloatExpValue
                    {

                    			newCompositeNode(grammarAccess.getBaseValueAccess().getFloatExpValueParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_FloatExpValue_1=ruleFloatExpValue();

                    state._fsp--;


                    			current.merge(this_FloatExpValue_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSimulink.g:621:3: this_IntValue_2= ruleIntValue
                    {

                    			newCompositeNode(grammarAccess.getBaseValueAccess().getIntValueParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntValue_2=ruleIntValue();

                    state._fsp--;


                    			current.merge(this_IntValue_2);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSimulink.g:632:3: this_IdValue_3= ruleIdValue
                    {

                    			newCompositeNode(grammarAccess.getBaseValueAccess().getIdValueParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_IdValue_3=ruleIdValue();

                    state._fsp--;


                    			current.merge(this_IdValue_3);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBaseValue"


    // $ANTLR start "entryRuleFloatValue"
    // InternalSimulink.g:646:1: entryRuleFloatValue returns [String current=null] : iv_ruleFloatValue= ruleFloatValue EOF ;
    public final String entryRuleFloatValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloatValue = null;


        try {
            // InternalSimulink.g:646:50: (iv_ruleFloatValue= ruleFloatValue EOF )
            // InternalSimulink.g:647:2: iv_ruleFloatValue= ruleFloatValue EOF
            {
             newCompositeNode(grammarAccess.getFloatValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFloatValue=ruleFloatValue();

            state._fsp--;

             current =iv_ruleFloatValue.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFloatValue"


    // $ANTLR start "ruleFloatValue"
    // InternalSimulink.g:653:1: ruleFloatValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_FLOAT_0= RULE_FLOAT ;
    public final AntlrDatatypeRuleToken ruleFloatValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_FLOAT_0=null;


        	enterRule();

        try {
            // InternalSimulink.g:659:2: (this_FLOAT_0= RULE_FLOAT )
            // InternalSimulink.g:660:2: this_FLOAT_0= RULE_FLOAT
            {
            this_FLOAT_0=(Token)match(input,RULE_FLOAT,FOLLOW_2); 

            		current.merge(this_FLOAT_0);
            	

            		newLeafNode(this_FLOAT_0, grammarAccess.getFloatValueAccess().getFLOATTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFloatValue"


    // $ANTLR start "entryRuleFloatExpValue"
    // InternalSimulink.g:670:1: entryRuleFloatExpValue returns [String current=null] : iv_ruleFloatExpValue= ruleFloatExpValue EOF ;
    public final String entryRuleFloatExpValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloatExpValue = null;


        try {
            // InternalSimulink.g:670:53: (iv_ruleFloatExpValue= ruleFloatExpValue EOF )
            // InternalSimulink.g:671:2: iv_ruleFloatExpValue= ruleFloatExpValue EOF
            {
             newCompositeNode(grammarAccess.getFloatExpValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFloatExpValue=ruleFloatExpValue();

            state._fsp--;

             current =iv_ruleFloatExpValue.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFloatExpValue"


    // $ANTLR start "ruleFloatExpValue"
    // InternalSimulink.g:677:1: ruleFloatExpValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_FLOAT_X_0= RULE_FLOAT_X ;
    public final AntlrDatatypeRuleToken ruleFloatExpValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_FLOAT_X_0=null;


        	enterRule();

        try {
            // InternalSimulink.g:683:2: (this_FLOAT_X_0= RULE_FLOAT_X )
            // InternalSimulink.g:684:2: this_FLOAT_X_0= RULE_FLOAT_X
            {
            this_FLOAT_X_0=(Token)match(input,RULE_FLOAT_X,FOLLOW_2); 

            		current.merge(this_FLOAT_X_0);
            	

            		newLeafNode(this_FLOAT_X_0, grammarAccess.getFloatExpValueAccess().getFLOAT_XTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFloatExpValue"


    // $ANTLR start "entryRuleIntValue"
    // InternalSimulink.g:694:1: entryRuleIntValue returns [String current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final String entryRuleIntValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIntValue = null;


        try {
            // InternalSimulink.g:694:48: (iv_ruleIntValue= ruleIntValue EOF )
            // InternalSimulink.g:695:2: iv_ruleIntValue= ruleIntValue EOF
            {
             newCompositeNode(grammarAccess.getIntValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntValue=ruleIntValue();

            state._fsp--;

             current =iv_ruleIntValue.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntValue"


    // $ANTLR start "ruleIntValue"
    // InternalSimulink.g:701:1: ruleIntValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_X_0= RULE_INT_X ;
    public final AntlrDatatypeRuleToken ruleIntValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_X_0=null;


        	enterRule();

        try {
            // InternalSimulink.g:707:2: (this_INT_X_0= RULE_INT_X )
            // InternalSimulink.g:708:2: this_INT_X_0= RULE_INT_X
            {
            this_INT_X_0=(Token)match(input,RULE_INT_X,FOLLOW_2); 

            		current.merge(this_INT_X_0);
            	

            		newLeafNode(this_INT_X_0, grammarAccess.getIntValueAccess().getINT_XTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntValue"


    // $ANTLR start "entryRuleIdValue"
    // InternalSimulink.g:718:1: entryRuleIdValue returns [String current=null] : iv_ruleIdValue= ruleIdValue EOF ;
    public final String entryRuleIdValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdValue = null;


        try {
            // InternalSimulink.g:718:47: (iv_ruleIdValue= ruleIdValue EOF )
            // InternalSimulink.g:719:2: iv_ruleIdValue= ruleIdValue EOF
            {
             newCompositeNode(grammarAccess.getIdValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIdValue=ruleIdValue();

            state._fsp--;

             current =iv_ruleIdValue.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIdValue"


    // $ANTLR start "ruleIdValue"
    // InternalSimulink.g:725:1: ruleIdValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleIdValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalSimulink.g:731:2: (this_ID_0= RULE_ID )
            // InternalSimulink.g:732:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            		current.merge(this_ID_0);
            	

            		newLeafNode(this_ID_0, grammarAccess.getIdValueAccess().getIDTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIdValue"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    static final String dfa_1s = "\21\uffff";
    static final String dfa_2s = "\2\4\2\uffff\1\4\1\uffff\4\21\1\4\2\uffff\4\21";
    static final String dfa_3s = "\1\4\1\20\2\uffff\1\23\1\uffff\4\23\1\10\2\uffff\4\23";
    static final String dfa_4s = "\2\uffff\1\2\1\1\1\uffff\1\5\5\uffff\1\4\1\3\4\uffff";
    static final String dfa_5s = "\21\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2\1\5\3\2\5\uffff\1\3\1\uffff\1\4",
            "",
            "",
            "\1\11\1\uffff\1\6\1\7\1\10\10\uffff\1\12\1\14\1\13",
            "",
            "\1\12\1\14\1\13",
            "\1\12\1\14\1\13",
            "\1\12\1\14\1\13",
            "\1\12\1\14\1\13",
            "\1\20\1\uffff\1\15\1\16\1\17",
            "",
            "",
            "\1\12\1\14\1\13",
            "\1\12\1\14\1\13",
            "\1\12\1\14\1\13",
            "\1\12\1\14\1\13"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "178:2: (this_SubElement_0= ruleSubElement | this_BaseElement_1= ruleBaseElement | this_VectorElement_2= ruleVectorElement | this_MatrixElement_3= ruleMatrixElement | this_StringElement_4= ruleStringElement )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000001D0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000601D0L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000A01D0L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000E01D0L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000000E0000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000022L});

}