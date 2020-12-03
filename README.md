# Epidemiology and monitoring ontology for COVID-19

This project was conceived during the virtual BioHackathon-COVID 2020 and started at the ELIXIR-Europe BioHackathon 2020 [GitHub](https://github.com/elixir-europe/BioHackathon-projects-2020/tree/master/projects/30). This project is not supported by any institution, it is just the result of the commitment and volunteering work of scientists, experts and any person with interest in contributing. Feel free to contact or fork the repo to contribute!


## Abstract

Epidemiological data is necessary to monitor public health, and to assess the impact of disease outbreaks and efficacy of mitigating interventions. In the context of an infectious disease outbreak it is imperative to have these data as FAIR as possible to facilitate rapid analysis to support timely evidence-based decision making. During the past virtual BioHackathon-COVID-19 we evaluated the availability of some epidemiological quantitative indicators in OBO ontologies and detected that while between the [Statistics ontology](http://stato-ontology.org/) and Epidemiology Ontology (EPO) we have many of the usual concepts described, essential classes are entirely missing for capturing these different indicators with the precision required, and also definition reconciliation needs to be done. Furthermore, we noticed that EPO is not maintained since its publication and has been deprecated from OBO Foundry [1]. Another issue that may be improved is the current absence of axioms and definition patterns that relate epidemiology (i.e., observations of a population) to clinical ontologies (i.e., observations on an individual). A formal model is needed to describe epidemiological data for monitoring events such as COVID-19 disease as well as to capture information related to other disease outbreaks and future epidemics. 


#### References

[1] Pesquita et al. The epidemiology ontology: an ontology for the semantic annotation of epidemiological resources, J Biomed Semantics. 2014; 5: 4. doi: [10.1186/2041-1480-5-4](10.1186/2041-1480-5-4)

### Goals

Our main goal is to provide a minimal epidemiological ontology developed during the hackathon days that would have application to the entire biomedical community, not only the life science communities. The goals of the proposed project are: 

* To identify and structure the missing concepts, extending current ontologies or making a unified model combining them into single ontology. 

* To enable the biomedical community to provide machine-readable quantitative epidemiological data and make it easier for scientists to find and share it, and to link patient data to infectivity, transmissibility and outcomes of SARS-CoV-2 infection in humans. 

* To ultimately facilitate surveillance, research, and policy-making in pandemics like COVID-19.

Our project will facilitate epidemiological and bioinformatic studies enabling machine-readable and interoperable epidemiological data through common ontologies with application on patient data. Many of the solutions we expect to develop will be of general utility and we expect that the unified, or extended and axiomatised ontology will integrate as a bridging and facilitating component into the semantic landscape of the biomedical sciences.

## Topics

Covid-19 | Data Platform | Federated Human Data | Interoperability Platform


## Team

### Lead(s)

 Núria Queralt-Rosinach [ n.queralt_rosinach@lumc.nl ]
 
### Contributor(s)
 Elena de la Calle [elena.delacalle@bsc.es],
 Philippe Rocca-Serra [ philippe.rocca-serra@oerc.ox.ac.uk ]

<!-- ### Nominated participant(s)-->

<!-- Núria Queralt-Rosinach [ n.queralt_rosinach@lumc.nl ],-->
<!-- Rajaram Kaliyaperumal [ R.Kaliyaperumal@lumc.nl ] -->

## Expected outcomes

Develop an epidemiology information model in OBO focused on quantitative indicators. Incorporate this model in an existing resource for the community.
 
## Plan

From the first list of epidemiological quantitative terms analyzed, our plan is to: 

1. add new COVID-19 relevant content through manual extraction from publications in medrXiv and or case report forms 
2. try to map these to existing OBO ontologies 
3. refine the list of terms with epidemiologists 
4. define and implement axiom patterns 
5. contact ontology stakeholders to define what is missing and either to ask for extensions to existing ontologies or to build a new, logically well-formed, and accurate ontology in OBO. 

We plan to perform two rounds of work, a first round to focus on quantitative indicators and a second round to expand to other indicators such as [WHO indicators](https://www.who.int/healthinfo/indicators/2015/metadata/en/).

## Current outcomes
1. list of relevant terms manualy curated from publications, case report forms and institutional official websites [collaborative gsheet](https://docs.google.com/spreadsheets/d/1kS0nSc6lVjrRj1ZoP8i2ZJI3UIwEzeHZ6BayxZXarSE/edit?usp=sharing)
2. formal ontology in owl under development [ontocovid.owl](https://raw.githubusercontent.com/NuriaQueralt/covid19-epidemiology-ontology/main/owl/covid19-epidemiology-ontology.owl)

## References for curation and related models
### A Review terms
#### 1st round: quantitative terms
Review sources (publications, medrXiv, CRFs):
* https://isaric.org/wp-content/uploads/2020/10/ISARIC_WHO_nCoV_CORE_CRF_25.08.2020.pdf
* https://news.gov.bc.ca/files/COVID19_Going_Forward_Oct_2020.pdf
* https://www.eurosurveillance.org/content/10.2807/1560-7917.ES.2020.25.40.2000250
* https://www.medrxiv.org/content/10.1101/2020.05.02.20088385v1.full.pdf
* https://www.who.int/bulletin/online_first/20-257907.pdf
* https://www.ncbi.nlm.nih.gov/pmc/articles/PMC7176237/
* https://www.ncbi.nlm.nih.gov/pmc/articles/PMC2465549/
* https://bmcinfectdis.biomedcentral.com/articles/10.1186/s12879-020-05251-9
* https://www.nature.com/articles/s41586-020-2923-3?utm_source=twitter&utm_medium=social&utm_content=organic&utm_campaign=NGMT_USG_JC01_GL_Nature
* https://www.thelancet.com/journals/laninf/article/PIIS1473-3099(20)30581-8/fulltext#seccestitle70
* https://www.ncbi.nlm.nih.gov/pmc/articles/PMC7154215/
* https://www.nature.com/articles/s41562-020-0928-4
* https://science.sciencemag.org/content/370/6517/691/tab-pdf
* https://www.nature.com/articles/s41586-020-2923-3?utm_source=twitter&utm_medium=social&utm_content=organic&utm_campaign=NGMT_USG_JC01_GL_Nature
* https://www.medrxiv.org/search/covid-19%252B%252B%252Bepidemiology

#### 2nd round: other epidemiology terms 
Expand to other indicators such as WHO indicators:
* https://www.who.int/healthinfo/indicators/2015/metadata/en/
* https://www.ecdc.europa.eu/en/covid-19/latest-evidence/epidemiology
* https://covid19-surveillance-report.ecdc.europa.eu/#5_risk_groups_most_affected
* https://covid19-surveillance-report.ecdc.europa.eu/
* https://covid19-country-overviews.ecdc.europa.eu/#3_eueea_and_the_uk
* https://www.uptodate.com/contents/coronavirus-disease-2019-covid-19-epidemiology-virology-and-prevention
* https://www.cidrap.umn.edu/covid-19/epidemiology
* https://www.gov.uk/government/publications/wuhan-novel-coronavirus-background-information/wuhan-novel-coronavirus-epidemiology-virology-and-clinical-features
* https://github.com/thehyve/ohdsi-schemas/blob/master/models/ohdsi_model/ohdsi_semantic_model.ttl

### B Review models - design patterns
1. Statistics Ontology (STATO) [website]((http://stato-ontology.org/ )) (contact Philippe Rocca-Serra)
2. Epidemiology Ontology (EPO) ´´´´_deprecated_´´´´ [ontobee](http://www.ontobee.org/ontology/catalog/EPO?iri=http://www.w3.org/2002/07/owl%23Class)
3. Infectious Disease Ontology (IDO) [ontobee](http://www.ontobee.org/ontology/IDO)
4. CoVoc Coronavirus Vocabulary (CoVoc) [EBI OLS](https://www.ebi.ac.uk/ols/ontologies/covoc) 
5. Genomic Epidemiology Ontology (GenEpiO) [ontobee](http://www.ontobee.org/ontology/GENEPIO)
6. Ontology for Nutritional Epidemiology [NCBO BioPortal](Ontology for Nutritional Epidemiology)
7. Bringing epidemiology into the Semantic Web [NERO](https://www.researchgate.net/publication/233428062_Bringing_epidemiology_into_the_Semantic_Web)
8. Referenced by Claus Weiland: [Towards an ontological representation of morbidity and mortality in Description Logics](https://www.ncbi.nlm.nih.gov/pmc/articles/PMC3448531/pdf/2041-1480-3-S2-S7.pdf)
9. Expressive probabilistic description logics [DOI](https://doi.org/10.1016/j.artint.2007.10.017)

## General references
1. [CRAI URV books](https://github.com/NuriaQueralt/covid19-epidemiology-ontology/blob/main/images/epidemiology_books.jpg = 250x250)
2. [WHO indicators](https://www.who.int/healthinfo/indicators/2015/metadata/en/)
3. From Kees van Bochove (twitter, the hyve::ohdsi): Have a look at the way we used [schema.org](http://schema.org) to express structured metadata about observational studies [model](https://github.com/thehyve/ohdsi-schemas/blob/master/models/ohdsi_model/ohdsi_semantic_model.ttl) and example study
4. [On the usefulness of ontologies in epidemiology research and practice](https://www.ncbi.nlm.nih.gov/pmc/articles/PMC3607093/)




