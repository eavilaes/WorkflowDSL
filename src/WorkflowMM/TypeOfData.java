/**
 */
package WorkflowMM;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type Of Data</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see WorkflowMM.WorkflowMMPackage#getTypeOfData()
 * @model
 * @generated
 */
public enum TypeOfData implements Enumerator {
	/**
	 * The '<em><b>FILL FORM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FILL_FORM_VALUE
	 * @generated
	 * @ordered
	 */
	FILL_FORM(0, "FILL_FORM", "FILL_FORM"),

	/**
	 * The '<em><b>SELECT OPTIONS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SELECT_OPTIONS_VALUE
	 * @generated
	 * @ordered
	 */
	SELECT_OPTIONS(1, "SELECT_OPTIONS", "SELECT_OPTIONS"),

	/**
	 * The '<em><b>UPLOAD FILES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPLOAD_FILES_VALUE
	 * @generated
	 * @ordered
	 */
	UPLOAD_FILES(2, "UPLOAD_FILES", "UPLOAD_FILES"),

	/**
	 * The '<em><b>TEXT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXT_VALUE
	 * @generated
	 * @ordered
	 */
	TEXT(3, "TEXT", "TEXT"),

	/**
	 * The '<em><b>FILE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FILE_VALUE
	 * @generated
	 * @ordered
	 */
	FILE(4, "FILE", "FILE");

	/**
	 * The '<em><b>FILL FORM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FILL FORM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FILL_FORM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FILL_FORM_VALUE = 0;

	/**
	 * The '<em><b>SELECT OPTIONS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SELECT OPTIONS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SELECT_OPTIONS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SELECT_OPTIONS_VALUE = 1;

	/**
	 * The '<em><b>UPLOAD FILES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UPLOAD FILES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UPLOAD_FILES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UPLOAD_FILES_VALUE = 2;

	/**
	 * The '<em><b>TEXT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TEXT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEXT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TEXT_VALUE = 3;

	/**
	 * The '<em><b>FILE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FILE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FILE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FILE_VALUE = 4;

	/**
	 * An array of all the '<em><b>Type Of Data</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeOfData[] VALUES_ARRAY =
		new TypeOfData[] {
			FILL_FORM,
			SELECT_OPTIONS,
			UPLOAD_FILES,
			TEXT,
			FILE,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Of Data</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeOfData> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Of Data</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeOfData get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeOfData result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Of Data</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeOfData getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeOfData result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Of Data</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeOfData get(int value) {
		switch (value) {
			case FILL_FORM_VALUE: return FILL_FORM;
			case SELECT_OPTIONS_VALUE: return SELECT_OPTIONS;
			case UPLOAD_FILES_VALUE: return UPLOAD_FILES;
			case TEXT_VALUE: return TEXT;
			case FILE_VALUE: return FILE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TypeOfData(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //TypeOfData
