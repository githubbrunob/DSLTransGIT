package visitors;

import mprolog.Clause;
import visitors.helpers.AsGenerator;

public interface HelpersTransformMPrologVisitor {
	Clause visit(AsGenerator asGenerator, Environ env);
}
