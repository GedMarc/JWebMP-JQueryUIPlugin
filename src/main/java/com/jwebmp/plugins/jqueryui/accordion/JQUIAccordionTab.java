/*
 * Copyright (C) 2017 GedMarc
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.jwebmp.plugins.jqueryui.accordion;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;
import com.jwebmp.core.plugins.ComponentInformation;

/**
 * An Accordion Tab.
 * <p>
 * Split out from inner to class to object
 *
 * @author GedMarc
 * @since 22 Feb 2016
 */
@ComponentInformation(name = "JQuery UI Accordion Tab",
		description = "Displays accordions as tabs.",
		url = "http://jqueryui.com/accordion/",
		wikiUrl = "https://github.com/GedMarc/JWebMP-JQueryUIPlugin/wiki")
public class JQUIAccordionTab<J extends JQUIAccordionTab<J>>
		extends JavaScriptPart<J>
{
	/**
	 * The header for the accordion
	 */
	@JsonIgnore
	private JQUIAccordionHeader header;
	/**
	 * The component to display in the accordion
	 */
	@JsonIgnore
	private JQUIAccordionContent component;

	/**
	 * Constructs a new accordion tab
	 * <p>
	 *
	 * @param header
	 * 		The header to use
	 * @param component
	 * 		The component to use
	 */
	public JQUIAccordionTab(JQUIAccordionHeader header, JQUIAccordionContent component)
	{
		this.header = header;
		this.component = component;
	}

	/**
	 * Constructs a new accordion tab
	 * <p>
	 *
	 * @param header
	 * 		The header to use
	 * @param component
	 * 		The component to use
	 */
	public JQUIAccordionTab(String header, JQUIAccordionContent component)
	{
		this.header = new JQUIAccordionHeader(header);
		this.component = component;
	}

	/**
	 * Returns the header of this tab
	 * <p>
	 *
	 * @return
	 */
	public JQUIAccordionHeader getHeader()
	{
		return header;
	}

	/**
	 * Sets the header of this tab
	 * <p>
	 *
	 * @param header
	 */
	public void setHeader(JQUIAccordionHeader header)
	{
		this.header = header;
	}

	/**
	 * Gets the component of this tab
	 * <p>
	 *
	 * @return
	 */
	public JQUIAccordionContent getComponent()
	{
		return component;
	}

	/**
	 * Sets the component of this tab
	 * <p>
	 *
	 * @param component
	 */
	public void setComponent(JQUIAccordionContent component)
	{
		this.component = component;
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj)
	{
		return super.equals(obj);
	}

}
