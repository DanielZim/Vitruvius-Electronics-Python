/*
 * generated by Xtext 2.13.0
 */
package org.xtext.example.generator;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provider;

import java.io.IOException;
import java.util.List;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.generator.GeneratorContext;
import org.eclipse.xtext.generator.GeneratorDelegate;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;
import org.xtext.example.SimulinkStandaloneSetup;

public class Main {

	public static void main(String[] args) 
	{
		String path = "C:\\Users\\Daniel\\Desktop\\Druva_Backup\\Matlab\\";
		
		Injector injector = new SimulinkStandaloneSetup().createInjectorAndDoEMFRegistration();
		Main main = injector.getInstance(Main.class);
		main.runGenerator(path);
	}

	@Inject
	private Provider<ResourceSet> resourceSetProvider;

	@Inject
	private IResourceValidator validator;

	@Inject
	private GeneratorDelegate generator;

	@Inject 
	private JavaIoFileSystemAccess fileAccess;

	protected void runGenerator(String path) 
	{
		
		
		// Load the resource
		ResourceSet set = resourceSetProvider.get();
		
		
		Resource source = set.getResource(URI.createFileURI(path+"test.mdl"), true);


		// Validate the resource
		List<Issue> list = validator.validate(source, CheckMode.ALL, CancelIndicator.NullImpl);
		if (!list.isEmpty()) {
			for (Issue issue : list) {
				System.err.println(issue);
			}
			return;
		}

		// Configure and start the generator
		fileAccess.setOutputPath("src-gen/");
		GeneratorContext context = new GeneratorContext();
		context.setCancelIndicator(CancelIndicator.NullImpl);
		generator.generate(source, fileAccess, context);
		
		
		//From XText to XMI
		//Resource target = set.getResource(URI.createFileURI(string+"test.xmi"), true);
		Resource target = set.createResource(URI.createFileURI(path+"test.xmi"));
		
		target.getContents().add(source.getContents().get(0));
		try 
		{
			target.save(null);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();

		}
		
		/*
		//From XMI to XText
		Resource target2 = set.createResource(URI.createFileURI(string+"test_out.mdl"));
		target2.getContents().add(target.getContents().get(0));
		try 
		{
			target2.save(null);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();

		}
		*/
		
		System.out.println("Code generation finished.");
	}
}