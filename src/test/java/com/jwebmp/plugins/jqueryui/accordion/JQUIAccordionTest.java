/*
 * Copyright (C) 2016 GedMarc
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

import com.jwebmp.core.base.html.attributes.HeaderTypes;
import com.jwebmp.core.generics.Direction;
import com.jwebmp.core.htmlbuilder.javascript.events.enumerations.EventTypes;
import com.jwebmp.plugins.easingeffects.JQEasingEffects;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author GedMarc
 */
public class JQUIAccordionTest

{

	public JQUIAccordionTest()
	{
	}

	@Test
	public void testDefault()
	{
		JQUIAccordion accordion = new JQUIAccordion();
		accordion.setID("id");
		String rendered = accordion.renderJavascript()
		                           .toString();
		String expected = "$(\"#id\").accordion();\n";
		System.out.println(rendered);
		Assertions.assertEquals(expected, rendered);

	}

	@Test
	public void testIcons()
	{
		JQUIAccordion accordion = new JQUIAccordion();
		accordion.setID("id");
		accordion.getOptions()
		         .getIcons()
		         .setHeader("headerIcons");
		accordion.getOptions()
		         .getIcons()
		         .setActiveHeader("activeHeaderIcons");
		String expected = "$(\"#id\").accordion({\n" +
		                  "  \"icons\" : {\n" +
		                  "    \"header\" : \"headerIcons\",\n" +
		                  "    \"activeHeader\" : \"activeHeaderIcons\"\n" +
		                  "  }\n" +
		                  "});\n" +
		                  "";
		String rendered = accordion.renderJavascript()
		                           .toString();
		System.out.println(rendered);

		//super.writeValuesToFile(expected, rendered);
		Assertions.assertEquals(expected, rendered);
	}

	@Test
	public void testActive()
	{
		JQUIAccordion accordion = new JQUIAccordion();
		accordion.setID("id");
		accordion.getOptions()
		         .setActive(1);

		String rendered = accordion.renderJavascript()
		                           .toString();
		String expected = "$(\"#id\").accordion({\n" + "  \"active\" : 1\n" + "});\n";
		System.out.println(rendered);
		//super.writeValuesToFile(expected, rendered);
		Assertions.assertEquals(expected, rendered);
	}

	@Test
	public void testCollapsible()
	{
		JQUIAccordion accordion = new JQUIAccordion();
		accordion.setID("id");
		accordion.getOptions()
		         .setCollapsible(true);
		String sss = accordion.renderJavascriptAll()
		                      .toString();
		System.out.println("ssss : " + sss);
		String rendered = accordion.renderJavascript()
		                           .toString();
		String expected = "$(\"#id\").accordion({\n" + "  \"collapsible\" : true\n" + "});\n";
		System.out.println(rendered);
		//super.writeValuesToFile(expected, rendered);
		Assertions.assertEquals(expected, rendered);
	}

	@Test
	public void testAnimate()
	{
		JQUIAccordion accordion = new JQUIAccordion();
		accordion.setID("id");
		accordion.getOptions()
		         .getAnimate()
		         .setDuration(200);
		accordion.getOptions()
		         .getAnimate()
		         .setDirection(Direction.Vertical);
		accordion.getOptions()
		         .getAnimate()
		         .setEasing(JQEasingEffects.easeInBack);
		String rendered = accordion.renderJavascript()
		                           .toString();
		String expected = "$(\"#id\").accordion({\n" +
		                  "  \"animate\" : {\n" +
		                  "    \"easing\" : \"easeInBack\",\n" +
		                  "    \"duration\" : 200,\n" +
		                  "    \"direction\" : \"vertical\"\n" +
		                  "  }\n" +
		                  "});\n";
		System.out.println(rendered);
		//super.writeValuesToFile(expected, rendered);
		Assertions.assertEquals(expected, rendered);
	}

	@Test
	public void testEvent()
	{
		JQUIAccordion accordion = new JQUIAccordion();
		accordion.setID("id");

		accordion.getOptions()
		         .setEvent(EventTypes.mouseOver);

		String rendered = accordion.renderJavascript()
		                           .toString();
		String expected = "$(\"#id\").accordion({\n" + "  \"event\" : \"mouseover\"\n" + "});\n";
		System.out.println(rendered);
		//super.writeValuesToFile(expected, rendered);
		Assertions.assertEquals(expected, rendered);
	}

	@Test
	public void testHeader()
	{
		JQUIAccordion accordion = new JQUIAccordion();
		accordion.setID("id");

		accordion.getOptions()
		         .setHeader(HeaderTypes.H3);

		String rendered = accordion.renderJavascript()
		                           .toString();
		String expected = "$(\"#id\").accordion({\n" + "  \"header\" : \"h3\"\n" + "});\n";
		System.out.println(rendered);
		//super.writeValuesToFile(expected, rendered);
		Assertions.assertEquals(expected, rendered);
	}

	@Test
	public void testStructure()
	{
		JQUIAccordion accordion = new JQUIAccordion();
		accordion.setID("id");
		JQUIAccordionContent<?> d1 = new JQUIAccordionContent();
		d1.setID("d1");
		JQUIAccordionContent<?> d2 = new JQUIAccordionContent();
		d2.setID("d2");
		JQUIAccordionTab<?> tab1 = new JQUIAccordionTab("tab1", d1);
		tab1.getHeader()
		    .setID("h1");
		JQUIAccordionTab<?> tab2 = new JQUIAccordionTab("tab2", d2);
		tab2.getHeader()
		    .setID("h2");

		accordion.addAccordianTab(tab1);
		accordion.addAccordianTab(tab2);

		accordion.getOptions()
		         .setHeader(HeaderTypes.H3);

		String rendered = accordion.toString(true);

		String expected = "<div id=\"id\" jwtype=\"accordion\">\n" +
		                  "\t<H3 id=\"h1\">tab1</H3>\n" +
		                  "\t<div id=\"d1\"></div>\n" +
		                  "\t<H3 id=\"h2\">tab2</H3>\n" +
		                  "\t<div id=\"d2\"></div>\n" +
		                  "</div>";
		System.out.println(rendered);
		//super.writeValuesToFile(expected, rendered);
		Assertions.assertEquals(expected, rendered);
	}
}
