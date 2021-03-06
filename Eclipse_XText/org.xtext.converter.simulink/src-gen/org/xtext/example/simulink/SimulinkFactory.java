/**
 * generated by Xtext 2.13.0
 */
package org.xtext.example.simulink;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.simulink.SimulinkPackage
 * @generated
 */
public interface SimulinkFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SimulinkFactory eINSTANCE = org.xtext.example.simulink.impl.SimulinkFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Root</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Root</em>'.
   * @generated
   */
  Root createRoot();

  /**
   * Returns a new object of class '<em>Sub Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sub Element</em>'.
   * @generated
   */
  SubElement createSubElement();

  /**
   * Returns a new object of class '<em>Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Element</em>'.
   * @generated
   */
  Element createElement();

  /**
   * Returns a new object of class '<em>Base Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Base Element</em>'.
   * @generated
   */
  BaseElement createBaseElement();

  /**
   * Returns a new object of class '<em>Vector Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Vector Element</em>'.
   * @generated
   */
  VectorElement createVectorElement();

  /**
   * Returns a new object of class '<em>Matrix Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Matrix Element</em>'.
   * @generated
   */
  MatrixElement createMatrixElement();

  /**
   * Returns a new object of class '<em>String Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Element</em>'.
   * @generated
   */
  StringElement createStringElement();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SimulinkPackage getSimulinkPackage();

} //SimulinkFactory
