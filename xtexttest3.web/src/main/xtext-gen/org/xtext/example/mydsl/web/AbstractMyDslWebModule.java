/*
 * generated by Xtext 2.9.2
 */
package org.xtext.example.mydsl.web;

import com.google.inject.Binder;
import com.google.inject.Provider;
import com.google.inject.name.Names;
import java.util.concurrent.ExecutorService;
import org.eclipse.xtext.ide.LexerIdeBindings;
import org.eclipse.xtext.ide.editor.contentassist.antlr.IContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
import org.eclipse.xtext.web.server.DefaultWebModule;
import org.xtext.example.mydsl.ide.contentassist.antlr.MyDslParser;
import org.xtext.example.mydsl.ide.contentassist.antlr.internal.InternalMyDslLexer;

/**
 * Manual modifications go to {@link MyDslWebModule}.
 */
@SuppressWarnings("all")
public abstract class AbstractMyDslWebModule extends DefaultWebModule {

	public AbstractMyDslWebModule(Provider<ExecutorService> executorServiceProvider) {
		super(executorServiceProvider);
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.web.WebIntegrationFragment
	public void configureContentAssistLexer(Binder binder) {
		binder.bind(Lexer.class).annotatedWith(Names.named(LexerIdeBindings.CONTENT_ASSIST)).to(InternalMyDslLexer.class);
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.web.WebIntegrationFragment
	public Class<? extends IContentAssistParser> bindIContentAssistParser() {
		return MyDslParser.class;
	}
	
}
