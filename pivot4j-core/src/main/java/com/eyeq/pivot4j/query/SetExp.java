/*
 * ====================================================================
 * This software is subject to the terms of the Common Public License
 * Agreement, available at the following URL:
 *   http://www.opensource.org/licenses/cpl.html .
 * You must accept the terms of that agreement to use this software.
 * ====================================================================
 */
package com.eyeq.pivot4j.query;

import org.olap4j.metadata.Hierarchy;

import com.eyeq.pivot4j.mdx.AbstractExp;
import com.eyeq.pivot4j.mdx.Exp;
import com.eyeq.pivot4j.mdx.ExpVisitor;

/**
 * Wrapper for Set Object to be placed on a query axis
 */
public class SetExp extends AbstractExp {

	private static final long serialVersionUID = 1634345220637156479L;

	private CalcSetMode mode;

	private Exp expression;

	private Hierarchy hierarchy;

	/**
	 * @param mode
	 * @param expression
	 * @param hierarchy
	 */
	public SetExp(CalcSetMode mode, Exp expression, Hierarchy hierarchy) {
		this.mode = mode;
		this.expression = expression;
		this.hierarchy = hierarchy;
	}

	/**
	 * @return
	 */
	public Hierarchy getHierarchy() {
		return hierarchy;
	}

	/**
	 * @return
	 */
	public CalcSetMode getMode() {
		return mode;
	}

	/**
	 * @return
	 */
	public Exp getExpression() {
		return expression;
	}

	/**
	 * @see com.eyeq.pivot4j.mdx.Exp#toMdx()
	 */
	public String toMdx() {
		if (expression == null) {
			return null;
		}

		return expression.toMdx();
	}

	/**
	 * @see com.eyeq.pivot4j.mdx.Exp#accept(com.eyeq.pivot4j.mdx.ExpVisitor)
	 */
	public void accept(ExpVisitor visitor) {
		if (expression != null) {
			expression.accept(visitor);
		}
	}

	/**
	 * @see com.eyeq.pivot4j.mdx.Exp#copy()
	 */
	public SetExp copy() {
		return new SetExp(mode, expression.copy(), hierarchy);
	}
}
