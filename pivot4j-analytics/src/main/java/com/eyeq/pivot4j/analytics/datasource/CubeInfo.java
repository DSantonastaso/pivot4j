package com.eyeq.pivot4j.analytics.datasource;

import java.io.Serializable;

import org.apache.commons.lang.NullArgumentException;

public class CubeInfo implements Serializable {

	private static final long serialVersionUID = -2405346074869143874L;

	private String name;

	private String label;

	private String description;

	/**
	 * @param name
	 * @param label
	 * @param description
	 */
	public CubeInfo(String name, String label, String description) {
		if (name == null) {
			throw new NullArgumentException("name");
		}

		this.name = name;

		if (label == null) {
			this.label = name;
		} else {
			this.label = label;
		}

		this.description = description;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
}
