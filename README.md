DSLTrans
===========

DSLTrans is a language specifically designed to support the defnition of Ecore-based model transformations.
It is particularly useful when building a new language (for instance, a language to describe graphical user interfaces) whose semantics are not known and it is necessary to express them in terms of an existing well known language (for instance, a Java application).

The process of assigning meaning to a new language trough transformations involves coming up with a set of mappings between the terms of the source language to terms in the target language.

In DSLTrans those mappings are expressed in the form of rules where the first part of each rule has a pattern describing some arrangement of terms in the source language and the second part has the terms to be created in case the first part exists in some input model.

Special Features
-------------------

DSLTrans was designed with transformation verification in mind. 

All transformation specified in DSLTrans are garanteed to terminate. This means the transformations can be analised to prove specific properties between the source models and the target models.


Installation
-------------------

DSLTrans is distributed as an eclipse plugin and works in all major operating systems. You can download eclipse modelling tools from [https://eclipse.org/](https://eclipse.org/).

The easiest way to install DSLTrans is trough the update site:
https://dl.dropboxusercontent.com/u/9650993/UpdateSiteDSLTrans/site.xml  (This is just the [UpdateSiteDSLTrans](./UpdateSiteDSLTrans) directory contents)

If you need to run the DSLTrans transformer, then you need to also install SWI-Prolog.

All the necessary software, including third party dependencies, is under the [DSLTrans-Release](./DSLTrans-Release) directory.

Check out the [manual](./DSLTransManual/document.pdf) that contains the installation instructions.


Getting Started
-------------------

The [manual](./DSLTransManual/document.pdf) contains all the necessary information, including background information on model transformations, to get you started.

