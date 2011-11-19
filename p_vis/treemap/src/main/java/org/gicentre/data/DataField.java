package org.gicentre.data;

import java.util.List;

/**
 * DataField is essentially a column in a data file Stores the column number,
 * name and type Has the functionality to remap values as it imports
 * 
 * @author Aidan Slingsby
 * 
 */
public class DataField {
	protected String name;
	protected int colIdx;
	protected FieldType fieldType;
	protected List<Object> orderedValues;
	protected boolean useAllValues = false;

	// indicates that the data contained
	// within applies for a particular
	// hierarchy field
	protected DataField appliesToHierField;

	/**
	 * Creates an instance
	 * 
	 * @param name
	 *            Name
	 * @param colIdx
	 *            In the original file
	 * @param fieldType
	 *            Type
	 */
	public DataField(String name, int colIdx, FieldType fieldType) {
		this.name = name;
		this.colIdx = colIdx;
		this.fieldType = fieldType;
	}

	/**
	 * Returns the dataField's name
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * Returns the datafield's field type
	 * 
	 * @return
	 */
	public FieldType getFieldType() {
		return fieldType;
	}

	/**
	 * Returns a String representation
	 * 
	 */
	public String toString() {
		return this.name;
	}

	/**
	 * Returns the column index. This may not be the same as originally Should
	 * not need to be accessed on common use
	 * 
	 * @return
	 */
	public int getColIdx() {
		return colIdx;
	}

	/**
	 * Sets the hier variable to which data in this field applies null if it
	 * applies to the record itself
	 * 
	 * @param dataField
	 */
	public void setAppliesToHierField(DataField dataField) {
		this.appliesToHierField = dataField;
	}

	/**
	 * Gets the hier variable to which data in this field applies null if it
	 * applies to the record itself
	 * 
	 * @return
	 */

	public DataField getAppliesToHierField() {
		return this.appliesToHierField;
	}

	public void setOrderedValues(List<Object> orderedValues) {
		this.orderedValues = orderedValues;
	}

	public void setUseAllValues(boolean useAllValues) {
		this.useAllValues = useAllValues;
	}

	public boolean getUseAllValues() {
		return useAllValues;
	}

	public List<Object> getOrderValues() {
		return this.orderedValues;
	}
}