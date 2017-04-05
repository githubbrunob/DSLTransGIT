DSLTrans
===========

DSLTrans is a language specifically designed to support the definition of correct model transformations.
It is particularly useful when building a new language (for instance, a language to describe graphical user interfaces) whose semantics are not known and it is necessary to express them in terms of an existing well known language (for instance, a Java application).

The process of assigning meaning to a new language trough transformations involves coming up with a set of mappings between the terms of the source language to terms in the target language.

In DSLTrans those mappings are expressed in the form of rules where the first part of each rule has a pattern describing some arrangement of terms in the source language and the second part has the terms to be created in case the first part exists in some input model.

Special Features
-------------------

DSLTrans was designed with transformation verification in mind. 
All transformation specified in DSLTrans are garanteed to terminate.
This means that, given certain contracts, the transformations can be proven to obey the contracts, for any possible input. See https://github.com/levilucio/SyVOLT

Installation
-------------------

See [manual](./DSLTransManual/document.pdf) for the installation instructions.

DSLTrans is distributed as an eclipse plugin and works in all major operating systems. You can download eclipse modelling tools from [https://eclipse.org/](https://eclipse.org/).

The easiest way to install DSLTrans is trough the update site:
https://www.dropbox.com/s/t24iu6pbfkg6x7y/site.xml  (This is just the [UpdateSiteDSLTrans](./UpdateSiteDSLTrans) directory contents)

All the necessary software, including third party dependencies, is under the [DSLTrans-Release](./DSLTrans-Release) directory.

Getting Started
-------------------

The [manual](./DSLTransManual/document.pdf) contains all the necessary information, including background information on model transformations, to get you started.

