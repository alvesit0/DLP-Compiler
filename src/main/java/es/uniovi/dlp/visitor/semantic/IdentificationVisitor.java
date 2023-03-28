package es.uniovi.dlp.visitor.semantic;

import es.uniovi.dlp.ast.definitions.Definition;
import es.uniovi.dlp.ast.expressions.Variable;
import es.uniovi.dlp.ast.types.Type;
import es.uniovi.dlp.error.Error;
import es.uniovi.dlp.error.ErrorManager;
import es.uniovi.dlp.error.ErrorReason;
import es.uniovi.dlp.error.Location;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class IdentificationVisitor extends AbstractVisitor<Type, Type> {

    private SymbolTable symbolTable = new SymbolTable();

    @Override
    public Type visit(Variable variable, Type param) {
        Definition definition = symbolTable.find(variable.getName());
        if (definition == null)
            ErrorManager.getInstance()
                    .getErrors()
                    .add(
                            new Error(
                                    new Location(
                                            definition.getLine(), definition.getColumn()),
                                    ErrorReason.VARIABLE_NOT_DECLARED));

        variable.setDefinition(definition);

        return null;
    }

}
