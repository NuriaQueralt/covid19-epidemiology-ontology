---
title: 'The COVID-19 epidemiology and monitoring ontology'
title-short: 'COVID-19 epidemiology and monitoring ontology'
tags:
  - COVID-19
  - Epidemiology
  - Monitoring
  - Ontology
authors:
  - name: Núria Queralt-Rosinach
    orcid: 0000-0003-0169-8159
    affiliation: 1
  - name: Paul Schofield
    orcid: 0000-0002-5111-7263
    affiliation: 2
  - name: Robert Hoehndorf
    orcid: 0000-0001-8149-5890
    affiliation: 3
  - name: Claus Weiland
    orcid: 0000-0003-0351-6523
    affiliation: 4   
  - name: Erik Schultes
    orcid: 0000-0001-8888-635X
    affiliation: 5
  - name: César Henrique Bernabé
    orcid: 0000-0003-1795-5930
    affiliation: 1
  - name: Marco Roos
    orcid: 0000-0002-8691-772X
    affiliation: 1        
affiliations:
 - name: Leiden University Medical Center, The Netherlands
   index: 1
 - name: University of Cambridge. United Kingdom
   index: 2
 - name: King Abdullah University of Science and Technology, Saudi Arabia
   index: 3
 - name: Senckenberg Biodiversity and Climate Research Center, Germany
   index: 4
 - name: GO FAIR Foundation
   index: 5
date: 11 August 2021
bibliography: paper.bib
authors_short: Queralt-Rosinach, N. et al. 
group: Ontologies
event: COVID-19 Virtual BioHackathon 2020
---

#### corresponding author: n.queralt_rosinach\@lumc.nl

# Motivation

One year ago, the novel COVID-19 infectious disease emerged and spread, causing high mortality and morbidity rates worldwide. In the OBO Foundry, there are more than one hundred ontologies to share and analyse large-scale datasets for biological and biomedical sciences. However, this pandemic revealed that we lack tools for an efficient and timely exchange of this epidemiological data which is necessary to assess the impact of disease outbreaks, the efficacy of mitigating interventions and to provide a rapid response [@nature_editorial2021]. Recently, several new COVID-19 ontologies have developed such as the Infectious Disease Ontology (IDO) [@ido-covid-owl] extension or Ontology of Coronavirus Infectious Disease (CIDO) [@cido2020]. Hence, our research question was to determine if there was a good representation of epidemiological quantitative concepts in OBO ontologies. Our objectives were to identify missing COVID-19 epidemiological terms and implement axiom patterns for extensions to existing ontologies or to build a new, logically well-formed, and accurate ontology in OBO. In this study we present our findings and contributions for the bio-ontologies community. 

# Method

This work was conceived and mainly developed during open community hackathons [COVID-19 Virtual BioHackathon 2020](https://github.com/virtual-biohackathons/covid-19-bh20/), [BioHackathon Europe 2020](https://github.com/elixir-europe/BioHackathon-projects-2020/tree/master/projects/30), [SWAT4HCLS Hackathon 2020](https://swat4hcls.wiki.opencura.com/wiki/Main_Page#Title:_Adding_logical_structure_to_the_COVID-19_epidemiology_ontology). Our approach was based on first, extracting a list of relevant epidemiological terms through manual curation of recent COVID-19 epidemiological studies published in peer-reviewed journals, medRxiv and public health surveillance websites, and mapping them to existing OBO ontologies. Curation was focused on quantitative data and indicators. Second, developing a minimal ontological representation of COVID-19 epidemiological quantitative information. And third, to refine and evaluate the model with domain expert input. 

Our formal modeling followed a rationale already used in other studies: 1) determine the domain and scope of the ontology; 2) ontology reuse and addressing poor ontological coverage of COVID-19 epidemiology; and 3) development of a conceptual model [@sanchezjbi2011,@kouameasi2021]. We extracted core domain knowledge concepts from existing sources[@epibook1,@epibook2,@idehandbook2014]. We re-used ontological terms and models as much as possible using ontology search engines such as the [Ontology Lookup Service (OLS)](https://www.ebi.ac.uk/ols/index) and the [Open Biological and Biomedical Ontology (OBO) Foundry](http://www.obofoundry.org/). To build an interoperable biomedical ontology, we decided to build an OBO ontology and use the OWL 2, a DL-based formalism and semantic web standard for knowledge representation, to enable data sharing and formal reasoning. We used knowledge-engineering best practices following the [OBO principles](http://www.obofoundry.org/principles/fp-000-summary.html) and modularization guidelines [@rector2003] to achieve a logically well-formed model. Finally, we based our decisions on building a FAIR (findable, accessible, interoperable, reusable) [@wilkinson2016fair] resource for health data and research following recent recommendations published by international data standard organizations [@rdacovid2020,@ehden2020]. More information on the method, the list of sources used for curation and extracted terms, and the developed OWL ontology are open and publicly available for reproducibility and community re-use on https://github.com/NuriaQueralt/covid19-epidemiology-ontology.

# Results

We provide a formal ontological model for COVID-19 epidemiology and monitoring (graphical and OWL representations are in our [GitHub repository](https://github.com/NuriaQueralt/covid19-epidemiology-ontology)). With the rise of new variants of the virus that may challenge vaccine efficacy, a compatible logical model for quantities that enables researchers to represent and share machine-readable patient monitoring and epidemiology surveillance data for rapid analysis, modeling and response is an urgent need. In this work we re-used the SIO design pattern for [measurements](https://github.com/MaastrichtU-IDS/semanticscience/wiki/DP-Measurements), a model already applied to patient health data for rare diseases in the [European Joint Programme on Rare Diseases (EJP RD)](https://www.ejprarediseases.org/), clinical research data in the Leiden University Medical Center (LUMC) [@rosinach_damalos_2020] and the measurements schema in the new GA4GH Phenopackets release [@ppv2_2021]. The taxonomic structure is extended from IDO, a core ontology for infectious diseases. For domain concepts we re-used General Formal Ontology (GFO) [@gfo2006] to formalize timelines concepts using the ‘chronoid’ and the GFO-based ‘mortality’ model approach [@santanajbs2012]. To link patient-population is an RDA COVID-19 recommendation on data sharing, thus we checked common data models such as [(OMOP)](https://www.ohdsi.org/data-standardization/the-common-data-model/) and re-used the relationship used in Phenopackets based on *composition* semantics.

We filled the gap for epidemiological surveillance terms in OBO adding 100 new terms. From an initial set of 138 manually extracted terms, only 38 are covered by bio-ontologies, 21% (30 terms) IDO [@ido-owl] and 24% Statistical Methods Ontology (STATO) (33 terms) [@stato-owl] (although including fallbacks this percentage could increase to 50%) and the rest by epidemiological-related ontologies such as Apollo Structure Vocabulary (APOLLO_SV) [@apollo-owl] and Genomic Epidemiology Ontology (GenEpiO) [@genepio-owl]. We noticed that the Epidemiology Ontology (EPO) [@epo-owl] is not maintained since its publication and has been deprecated from OBO Foundry and IDO is working towards epidemiological enrichment [@ido-2021]. While interoperability within the OBO landscape is fostered by adopting the BFO backbone structure, the link with GFO can lead to incompatible temporal regions  due to logical inconsistency [@gfo-bfo-2013]. Another issue that may be improved is the current absence of axioms and definition patterns that relate epidemiology (i.e., observations of a population) to clinical ontologies (i.e., observations on an individual) and allow reasoning for discovery. The re-use of the Entity-Quality(EQ) model [@eq-mungall2011] or the adaptation of the Resources, events, agents (REA) model [@mabee2020] will be evaluated. In the future, we will evaluate our ontology with domain experts and logical competency questions [@almeidafois2014]. Moreover, we expect to use this model in FAIR-based projects such as Trusted World of Corona (TWOC) [@twoc2020] to publish epidemiological claims as nanopublications for trust [@groth-nanopubs-2010]. We aim at FAIR reasoning and analytics of person-level real world observations over epidemiological surveillance information [@sherimon2020]. Therefore, checking common data models such as Phenopackets or OHDSI standards was done to enable the development of applications to discover patterns with ontology-guided machine learning algorithms and translational research.

# Conclusion

In the context of an infectious disease outbreak it is imperative to have these data as FAIR as possible to facilitate rapid analysis and support timely evidence-based decision making and trust. To enable the community to provide machine-readable epidemiological quantitative data and make it easier to share, we contributed with the development of an ontological representation, which was built based on ontology engineering best-practices such as reuse and ontology formalization through upper-level ontologies (i.e., GFO, SIO).

# Jupyter notebooks, GitHub repositories and data repositories

* Github repo. covid-19-epidemiology-ontology, https://github.com/NuriaQueralt/covid19-epidemiology-ontology, CC0

# Paper data sources

* Paper.md and paper.bib location: https://github.com/NuriaQueralt/covid19-epidemiology-ontology

# Acknowledgements

We would like to specially thank Birgit Meldal for her input and ideas. This initiative has received funding from the European Union's Horizon 2020 research and innovation programme under grant agreement N°825575 (the European Joint Programme Rare Diseases), and the Trusted World of Corona (TWOC; LSH Health Holland).

# References

