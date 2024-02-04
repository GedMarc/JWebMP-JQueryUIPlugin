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
package com.jwebmp.plugins.jqueryui.checkboxradio;

import com.jwebmp.core.Component;
import com.jwebmp.core.Feature;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.plugins.jqueryui.checkboxradio.options.JQUICheckBoxRadioOptions;

import jakarta.validation.constraints.NotNull;

import static com.guicedee.services.jsonrepresentation.json.StaticStrings.*;

/**
 * @author GedMarc
 * @since 27 Feb 2017
 */
public class JQUICheckBoxRadioFeature<J extends JQUICheckBoxRadioFeature<J>>
		extends Feature<GlobalFeatures, JQUICheckBoxRadioOptions<?>, J>
{
	private JQUICheckBoxRadioOptions<?> options;
	
	public JQUICheckBoxRadioFeature(IComponentHierarchyBase<?, ?> component)
	{
		super("JQUICHeckBoxRadioFeature");
		setComponent(component);
	}
	
	@Override
	public int hashCode()
	{
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object o)
	{
		return super.equals(o);
	}
	
	@Override
	@NotNull
	public JQUICheckBoxRadioOptions<?> getOptions()
	{
		if (options == null)
		{
			options = new JQUICheckBoxRadioOptions<>();
		}
		return options;
	}
	
	@Override
	protected void assignFunctionsToComponent()
	{
		addQuery(getComponent().asBase()
		                       .getJQueryID()
				         + "checkboxradio(" + getOptions() + STRING_CLOSING_BRACKET_SEMICOLON);
	}
}
