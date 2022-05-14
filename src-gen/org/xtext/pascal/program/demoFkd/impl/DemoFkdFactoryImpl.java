/**
 * generated by Xtext 2.26.0
 */
package org.xtext.pascal.program.demoFkd.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.pascal.program.demoFkd.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DemoFkdFactoryImpl extends EFactoryImpl implements DemoFkdFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DemoFkdFactory init()
  {
    try
    {
      DemoFkdFactory theDemoFkdFactory = (DemoFkdFactory)EPackage.Registry.INSTANCE.getEFactory(DemoFkdPackage.eNS_URI);
      if (theDemoFkdFactory != null)
      {
        return theDemoFkdFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DemoFkdFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DemoFkdFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case DemoFkdPackage.PASCAL: return createpascal();
      case DemoFkdPackage.PROGRAM: return createprogram();
      case DemoFkdPackage.PROGRAM_HEADING_BLOCK: return createprogram_heading_block();
      case DemoFkdPackage.IDENTIFIER_LIST: return createidentifier_list();
      case DemoFkdPackage.BLOCK: return createblock();
      case DemoFkdPackage.USES_COMMAND_DEFINITION_PART: return createuses_command_definition_part();
      case DemoFkdPackage.STATEMENT_PART: return createstatement_part();
      case DemoFkdPackage.STATEMENT_SEQUENCE: return createstatement_sequence();
      case DemoFkdPackage.STATEMENT: return createstatement();
      case DemoFkdPackage.LABEL: return createlabel();
      case DemoFkdPackage.SIMPLE_STATEMENT: return createsimple_statement();
      case DemoFkdPackage.ASSIGNMENT_STATEMENT: return createassignment_statement();
      case DemoFkdPackage.VARIABLE: return createvariable();
      case DemoFkdPackage.VAR_: return createvar_();
      case DemoFkdPackage.EXPRESSION_LIST: return createexpression_list();
      case DemoFkdPackage.EXPRESSION: return createexpression();
      case DemoFkdPackage.SIMPLE_EXPRESSION: return createsimple_expression();
      case DemoFkdPackage.TERM: return createterm();
      case DemoFkdPackage.FACTOR: return createfactor();
      case DemoFkdPackage.NUMBER: return createnumber();
      case DemoFkdPackage.ANY_NUMBER: return createany_number();
      case DemoFkdPackage.SET: return createset();
      case DemoFkdPackage.FUNCTION_DESIGNATOR: return createfunction_designator();
      case DemoFkdPackage.STRUCTURED_STATEMENT: return createstructured_statement();
      case DemoFkdPackage.COMPOUND_STATEMENT: return createcompound_statement();
      case DemoFkdPackage.REPETITIVE_STATEMENT: return createrepetitive_statement();
      case DemoFkdPackage.WHILE_STATEMENT: return createwhile_statement();
      case DemoFkdPackage.REPEAT_STATEMENT: return createrepeat_statement();
      case DemoFkdPackage.FOR_STATEMENT: return createfor_statement();
      case DemoFkdPackage.CONDITIONAL_STATEMENT: return createconditional_statement();
      case DemoFkdPackage.IF_STATEMENT: return createif_statement();
      case DemoFkdPackage.CASE_STATEMENT: return createcase_statement();
      case DemoFkdPackage.CASE_LIMB: return createcase_limb();
      case DemoFkdPackage.CASE_LABEL_LIST: return createcase_label_list();
      case DemoFkdPackage.CONSTANT: return createconstant();
      case DemoFkdPackage.WITH_STATEMENT: return createwith_statement();
      case DemoFkdPackage.GOTO_STATEMENT: return creategoto_statement();
      case DemoFkdPackage.LABEL_DECLARATION_PART: return createlabel_declaration_part();
      case DemoFkdPackage.CONSTANT_DEFINITION_PART: return createconstant_definition_part();
      case DemoFkdPackage.CONSTANT_DEFINITION: return createconstant_definition();
      case DemoFkdPackage.TYPE_DEFINITION_PART: return createtype_definition_part();
      case DemoFkdPackage.TYPE_DEFINITION: return createtype_definition();
      case DemoFkdPackage.TYPE: return createtype();
      case DemoFkdPackage.SIMPLE_TYPE: return createsimple_type();
      case DemoFkdPackage.SUBRANGE_TYPE: return createsubrange_type();
      case DemoFkdPackage.ENUMERATED_TYPE: return createenumerated_type();
      case DemoFkdPackage.STRUCTURED_TYPE: return createstructured_type();
      case DemoFkdPackage.UNPACKED_STRUCTURED_TYPE: return createunpacked_structured_type();
      case DemoFkdPackage.ARRAY_TYPE: return createarray_type();
      case DemoFkdPackage.DYNAMIC_ARRAY_TYPE: return createdynamic_array_type();
      case DemoFkdPackage.INDEX_TYPE: return createindex_type();
      case DemoFkdPackage.RECORD_TYPE: return createrecord_type();
      case DemoFkdPackage.CLASS_TYPE: return createclass_type();
      case DemoFkdPackage.MEMBER_LIST: return createmember_list();
      case DemoFkdPackage.PROPERTIES_PART: return createproperties_part();
      case DemoFkdPackage.PROPERTY_SECTION: return createproperty_section();
      case DemoFkdPackage.PROPERTY_LIST: return createproperty_list();
      case DemoFkdPackage.METHOD_PART: return createmethod_part();
      case DemoFkdPackage.METHOD_SECTION: return createmethod_section();
      case DemoFkdPackage.FIELD_LIST: return createfield_list();
      case DemoFkdPackage.FIXED_PART: return createfixed_part();
      case DemoFkdPackage.VARIABLE_IDENTIFIER_LIST: return createvariable_identifier_list();
      case DemoFkdPackage.VARIABLE_SECTION: return createvariable_section();
      case DemoFkdPackage.RECORD_SECTION: return createrecord_section();
      case DemoFkdPackage.VARIANT_PART: return createvariant_part();
      case DemoFkdPackage.TAG_FIELD: return createtag_field();
      case DemoFkdPackage.VARIANT: return createvariant();
      case DemoFkdPackage.SET_TYPE: return createset_type();
      case DemoFkdPackage.FILE_TYPE: return createfile_type();
      case DemoFkdPackage.POINTER_TYPE: return createpointer_type();
      case DemoFkdPackage.VARIABLE_DECLARATION_PART: return createvariable_declaration_part();
      case DemoFkdPackage.PROCEDURE_AND_FUNCTION_DECLARATION_PART: return createprocedure_and_function_declaration_part();
      case DemoFkdPackage.ABSTRACTION_DECLARATION: return createabstraction_declaration();
      case DemoFkdPackage.ABSTRACTION_HEADING: return createabstraction_heading();
      case DemoFkdPackage.FORMAL_PARAMETER_LIST: return createformal_parameter_list();
      case DemoFkdPackage.FORMAL_PARAMETER_SECTION: return createformal_parameter_section();
      case DemoFkdPackage.VALUE_PARAMETER_SECTION: return createvalue_parameter_section();
      case DemoFkdPackage.PARAMETER_TYPE: return createparameter_type();
      case DemoFkdPackage.CONFORMANT_ARRAY_SCHEMA: return createconformant_array_schema();
      case DemoFkdPackage.PACKED_CONFORMANT_ARRAY_SCHEMA: return createpacked_conformant_array_schema();
      case DemoFkdPackage.BOUND_SPECIFICATION: return createbound_specification();
      case DemoFkdPackage.UNPACKED_CONFORMANT_ARRAY_SCHEMA: return createunpacked_conformant_array_schema();
      case DemoFkdPackage.VARIABLE_PARAMETER_SECTION: return createvariable_parameter_section();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public pascal createpascal()
  {
    pascalImpl pascal = new pascalImpl();
    return pascal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public program createprogram()
  {
    programImpl program = new programImpl();
    return program;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public program_heading_block createprogram_heading_block()
  {
    program_heading_blockImpl program_heading_block = new program_heading_blockImpl();
    return program_heading_block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public identifier_list createidentifier_list()
  {
    identifier_listImpl identifier_list = new identifier_listImpl();
    return identifier_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public block createblock()
  {
    blockImpl block = new blockImpl();
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public uses_command_definition_part createuses_command_definition_part()
  {
    uses_command_definition_partImpl uses_command_definition_part = new uses_command_definition_partImpl();
    return uses_command_definition_part;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public statement_part createstatement_part()
  {
    statement_partImpl statement_part = new statement_partImpl();
    return statement_part;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public statement_sequence createstatement_sequence()
  {
    statement_sequenceImpl statement_sequence = new statement_sequenceImpl();
    return statement_sequence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public statement createstatement()
  {
    statementImpl statement = new statementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public label createlabel()
  {
    labelImpl label = new labelImpl();
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public simple_statement createsimple_statement()
  {
    simple_statementImpl simple_statement = new simple_statementImpl();
    return simple_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public assignment_statement createassignment_statement()
  {
    assignment_statementImpl assignment_statement = new assignment_statementImpl();
    return assignment_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public variable createvariable()
  {
    variableImpl variable = new variableImpl();
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public var_ createvar_()
  {
    var_Impl var_ = new var_Impl();
    return var_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public expression_list createexpression_list()
  {
    expression_listImpl expression_list = new expression_listImpl();
    return expression_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public expression createexpression()
  {
    expressionImpl expression = new expressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public simple_expression createsimple_expression()
  {
    simple_expressionImpl simple_expression = new simple_expressionImpl();
    return simple_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public term createterm()
  {
    termImpl term = new termImpl();
    return term;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public factor createfactor()
  {
    factorImpl factor = new factorImpl();
    return factor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public number createnumber()
  {
    numberImpl number = new numberImpl();
    return number;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public any_number createany_number()
  {
    any_numberImpl any_number = new any_numberImpl();
    return any_number;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public set createset()
  {
    setImpl set = new setImpl();
    return set;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public function_designator createfunction_designator()
  {
    function_designatorImpl function_designator = new function_designatorImpl();
    return function_designator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public structured_statement createstructured_statement()
  {
    structured_statementImpl structured_statement = new structured_statementImpl();
    return structured_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public compound_statement createcompound_statement()
  {
    compound_statementImpl compound_statement = new compound_statementImpl();
    return compound_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public repetitive_statement createrepetitive_statement()
  {
    repetitive_statementImpl repetitive_statement = new repetitive_statementImpl();
    return repetitive_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public while_statement createwhile_statement()
  {
    while_statementImpl while_statement = new while_statementImpl();
    return while_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public repeat_statement createrepeat_statement()
  {
    repeat_statementImpl repeat_statement = new repeat_statementImpl();
    return repeat_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public for_statement createfor_statement()
  {
    for_statementImpl for_statement = new for_statementImpl();
    return for_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public conditional_statement createconditional_statement()
  {
    conditional_statementImpl conditional_statement = new conditional_statementImpl();
    return conditional_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public if_statement createif_statement()
  {
    if_statementImpl if_statement = new if_statementImpl();
    return if_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public case_statement createcase_statement()
  {
    case_statementImpl case_statement = new case_statementImpl();
    return case_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public case_limb createcase_limb()
  {
    case_limbImpl case_limb = new case_limbImpl();
    return case_limb;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public case_label_list createcase_label_list()
  {
    case_label_listImpl case_label_list = new case_label_listImpl();
    return case_label_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public constant createconstant()
  {
    constantImpl constant = new constantImpl();
    return constant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public with_statement createwith_statement()
  {
    with_statementImpl with_statement = new with_statementImpl();
    return with_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public goto_statement creategoto_statement()
  {
    goto_statementImpl goto_statement = new goto_statementImpl();
    return goto_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public label_declaration_part createlabel_declaration_part()
  {
    label_declaration_partImpl label_declaration_part = new label_declaration_partImpl();
    return label_declaration_part;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public constant_definition_part createconstant_definition_part()
  {
    constant_definition_partImpl constant_definition_part = new constant_definition_partImpl();
    return constant_definition_part;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public constant_definition createconstant_definition()
  {
    constant_definitionImpl constant_definition = new constant_definitionImpl();
    return constant_definition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public type_definition_part createtype_definition_part()
  {
    type_definition_partImpl type_definition_part = new type_definition_partImpl();
    return type_definition_part;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public type_definition createtype_definition()
  {
    type_definitionImpl type_definition = new type_definitionImpl();
    return type_definition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public type createtype()
  {
    typeImpl type = new typeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public simple_type createsimple_type()
  {
    simple_typeImpl simple_type = new simple_typeImpl();
    return simple_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public subrange_type createsubrange_type()
  {
    subrange_typeImpl subrange_type = new subrange_typeImpl();
    return subrange_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public enumerated_type createenumerated_type()
  {
    enumerated_typeImpl enumerated_type = new enumerated_typeImpl();
    return enumerated_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public structured_type createstructured_type()
  {
    structured_typeImpl structured_type = new structured_typeImpl();
    return structured_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public unpacked_structured_type createunpacked_structured_type()
  {
    unpacked_structured_typeImpl unpacked_structured_type = new unpacked_structured_typeImpl();
    return unpacked_structured_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public array_type createarray_type()
  {
    array_typeImpl array_type = new array_typeImpl();
    return array_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public dynamic_array_type createdynamic_array_type()
  {
    dynamic_array_typeImpl dynamic_array_type = new dynamic_array_typeImpl();
    return dynamic_array_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public index_type createindex_type()
  {
    index_typeImpl index_type = new index_typeImpl();
    return index_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public record_type createrecord_type()
  {
    record_typeImpl record_type = new record_typeImpl();
    return record_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public class_type createclass_type()
  {
    class_typeImpl class_type = new class_typeImpl();
    return class_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public member_list createmember_list()
  {
    member_listImpl member_list = new member_listImpl();
    return member_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public properties_part createproperties_part()
  {
    properties_partImpl properties_part = new properties_partImpl();
    return properties_part;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public property_section createproperty_section()
  {
    property_sectionImpl property_section = new property_sectionImpl();
    return property_section;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public property_list createproperty_list()
  {
    property_listImpl property_list = new property_listImpl();
    return property_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public method_part createmethod_part()
  {
    method_partImpl method_part = new method_partImpl();
    return method_part;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public method_section createmethod_section()
  {
    method_sectionImpl method_section = new method_sectionImpl();
    return method_section;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public field_list createfield_list()
  {
    field_listImpl field_list = new field_listImpl();
    return field_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public fixed_part createfixed_part()
  {
    fixed_partImpl fixed_part = new fixed_partImpl();
    return fixed_part;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public variable_identifier_list createvariable_identifier_list()
  {
    variable_identifier_listImpl variable_identifier_list = new variable_identifier_listImpl();
    return variable_identifier_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public variable_section createvariable_section()
  {
    variable_sectionImpl variable_section = new variable_sectionImpl();
    return variable_section;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public record_section createrecord_section()
  {
    record_sectionImpl record_section = new record_sectionImpl();
    return record_section;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public variant_part createvariant_part()
  {
    variant_partImpl variant_part = new variant_partImpl();
    return variant_part;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public tag_field createtag_field()
  {
    tag_fieldImpl tag_field = new tag_fieldImpl();
    return tag_field;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public variant createvariant()
  {
    variantImpl variant = new variantImpl();
    return variant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public set_type createset_type()
  {
    set_typeImpl set_type = new set_typeImpl();
    return set_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public file_type createfile_type()
  {
    file_typeImpl file_type = new file_typeImpl();
    return file_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public pointer_type createpointer_type()
  {
    pointer_typeImpl pointer_type = new pointer_typeImpl();
    return pointer_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public variable_declaration_part createvariable_declaration_part()
  {
    variable_declaration_partImpl variable_declaration_part = new variable_declaration_partImpl();
    return variable_declaration_part;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public procedure_and_function_declaration_part createprocedure_and_function_declaration_part()
  {
    procedure_and_function_declaration_partImpl procedure_and_function_declaration_part = new procedure_and_function_declaration_partImpl();
    return procedure_and_function_declaration_part;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public abstraction_declaration createabstraction_declaration()
  {
    abstraction_declarationImpl abstraction_declaration = new abstraction_declarationImpl();
    return abstraction_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public abstraction_heading createabstraction_heading()
  {
    abstraction_headingImpl abstraction_heading = new abstraction_headingImpl();
    return abstraction_heading;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public formal_parameter_list createformal_parameter_list()
  {
    formal_parameter_listImpl formal_parameter_list = new formal_parameter_listImpl();
    return formal_parameter_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public formal_parameter_section createformal_parameter_section()
  {
    formal_parameter_sectionImpl formal_parameter_section = new formal_parameter_sectionImpl();
    return formal_parameter_section;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public value_parameter_section createvalue_parameter_section()
  {
    value_parameter_sectionImpl value_parameter_section = new value_parameter_sectionImpl();
    return value_parameter_section;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public parameter_type createparameter_type()
  {
    parameter_typeImpl parameter_type = new parameter_typeImpl();
    return parameter_type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public conformant_array_schema createconformant_array_schema()
  {
    conformant_array_schemaImpl conformant_array_schema = new conformant_array_schemaImpl();
    return conformant_array_schema;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public packed_conformant_array_schema createpacked_conformant_array_schema()
  {
    packed_conformant_array_schemaImpl packed_conformant_array_schema = new packed_conformant_array_schemaImpl();
    return packed_conformant_array_schema;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public bound_specification createbound_specification()
  {
    bound_specificationImpl bound_specification = new bound_specificationImpl();
    return bound_specification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public unpacked_conformant_array_schema createunpacked_conformant_array_schema()
  {
    unpacked_conformant_array_schemaImpl unpacked_conformant_array_schema = new unpacked_conformant_array_schemaImpl();
    return unpacked_conformant_array_schema;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public variable_parameter_section createvariable_parameter_section()
  {
    variable_parameter_sectionImpl variable_parameter_section = new variable_parameter_sectionImpl();
    return variable_parameter_section;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DemoFkdPackage getDemoFkdPackage()
  {
    return (DemoFkdPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DemoFkdPackage getPackage()
  {
    return DemoFkdPackage.eINSTANCE;
  }

} //DemoFkdFactoryImpl
