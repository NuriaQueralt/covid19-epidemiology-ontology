//-----------------------------------------------------------
// Núria Queralt Rosinach 
// Acknowledgements to Sarah M. Alghamdi
//-----------------------------------------------------------
// This changes the IRI of all classes in the ontology
// to run:
// groovy change_entity_iri.groovy ontology_path new_IRI_prefix new_ontology_path
// example:
// groovy change_cemo_iri_ids.groovy ./cemo.owl CEMO_ ./cemo_iris_updated.owl
//----------------------------------------------------------- 


@Grapes([
 @Grab(group='org.slf4j', module='slf4j-simple', version='1.6.1'),
 @Grab(group = 'org.semanticweb.elk', module = 'elk-owlapi', version = '0.4.2'),
 @Grab(group = 'net.sourceforge.owlapi', module = 'owlapi-api', version = '4.2.5'),
 @Grab(group = 'net.sourceforge.owlapi', module = 'owlapi-apibinding', version = '4.2.5'),
 @Grab(group = 'net.sourceforge.owlapi', module = 'owlapi-impl', version = '4.2.5'),
 @Grab(group = 'net.sourceforge.owlapi', module = 'owlapi-parsers', version = '4.2.5'),
 @GrabConfig(systemClassLoader = true)
])


import org.semanticweb.owlapi.model.parameters.*
import org.semanticweb.elk.owlapi.ElkReasonerFactory;
import org.semanticweb.elk.owlapi.ElkReasonerConfiguration
import org.semanticweb.elk.reasoner.config.*
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.reasoner.*
import org.semanticweb.owlapi.reasoner.structural.StructuralReasoner
import org.semanticweb.owlapi.vocab.OWLRDFVocabulary;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.io.*;
import org.semanticweb.owlapi.owllink.*;
import org.semanticweb.owlapi.util.*;
import org.semanticweb.owlapi.search.*;
import org.semanticweb.owlapi.manchestersyntax.renderer.*;
import org.semanticweb.owlapi.reasoner.structural.*
import groovy.json.JsonOutput
import java.io.File 


OWLOntologyManager manager = OWLManager.createOWLOntologyManager()
OWLDataFactory fac = manager.getOWLDataFactory()
StructuralReasonerFactory f1 = new StructuralReasonerFactory()



ont =manager.loadOntologyFromOntologyDocument(new File(args[0]))


ConsoleProgressMonitor progressMonitor = new ConsoleProgressMonitor()
OWLReasonerConfiguration config = new SimpleConfiguration(progressMonitor)
ElkReasonerFactory f = new ElkReasonerFactory()
OWLReasoner reasoner = f.createReasoner(ont,config)



final OWLEntityRenamer renamer = new OWLEntityRenamer(manager, Collections.singleton(ont));
final Map<OWLEntity, IRI> entity2IRIMap = new HashMap<>();


int id = 0
int count = 0
ont.getClassesInSignature(true).each {cl ->


	final IRI iri = cl.getIRI();
	class_iri = iri.toString().substring(0,iri.toString().lastIndexOf("/"))
	class_id  = iri.toString().substring(iri.toString().lastIndexOf("/")+1,iri.length())
        if (class_id =~ '^cemo.owl#'){
           id = id + 1
           newID =  args[1] + "0"*(7 - id.toString().length()) + id.toString()
           newIRI = iri.toString().replace(class_id,newID)
           entity2IRIMap.put(cl, IRI.create(newIRI));
        }
        count = count +1
}

    ont.applyChanges(renamer.changeIRI(entity2IRIMap));
    println "Total number of classes: " + count.toString();
    println "Total number of " + args[1].toString().substring(0,args[1].toString().length()-1) + " classes: " + id.toString();
    

// save ontology
manager.saveOntology(ont, IRI.create((new File(args[2]).toURI())))
