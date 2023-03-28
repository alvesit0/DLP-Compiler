package es.uniovi.dlp.visitor.semantic;

import es.uniovi.dlp.ast.definitions.Definition;
import es.uniovi.dlp.ast.definitions.FunctionDefinition;
import es.uniovi.dlp.ast.definitions.VarDefinition;
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
        super.visit(variable, param);

        Definition definition = symbolTable.find(variable.getName());
        if (definition == null)
            ErrorManager.getInstance()
                    .getErrors()
                    .add(
                            new Error(
                                    new Location(
                                            variable.getLine(), variable.getColumn()),
                                    ErrorReason.VARIABLE_NOT_DECLARED));

        variable.setDefinition(definition);

        return null;
    }

    @Override
    public Type visit(FunctionDefinition functionDefinition, Type param) {
        super.visit(functionDefinition, param);



        return null;
    }

    @Override
    public Type visit(VarDefinition varDefinition, Type param) {
        symbolTable.insert(varDefinition);
        super.visit(varDefinition, param);

        boolean success = symbolTable.insert(varDefinition);
        if(!success)
            ErrorManager.getInstance()
                    .getErrors()
                    .add(
                            new Error(
                                    new Location(
                                            varDefinition.getLine(), varDefinition.getColumn()),
                                    ErrorReason.VARIABLE_ALREADY_DECLARED));
        symbolTable.insert(varDefinition);
        return null;

    }

}
