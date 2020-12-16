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
package com.jwebmp.plugins.jqueryui.resizable;

import com.jwebmp.core.Feature;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.plugins.jqueryui.resizable.options.JQUIResizableOptions;

/**
 * Controls items being resizable
 *
 * @author GedMarc
 * @since Forever
 */
public class JQUIResizableFeature<J extends JQUIResizableFeature<J>>
		extends Feature<GlobalFeatures, JQUIResizableOptions<?>, J>
{
	
	
	private JQUIResizableOptions<?> options;
	
	public JQUIResizableFeature(IComponentHierarchyBase<?, ?> component)
	{
		super("JWResizableFeature");
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
	public JQUIResizableOptions<?> getOptions()
	{
		if (options == null)
		{
			options = new JQUIResizableOptions<>();
		}
		return options;
	}
	
	@Override
	public void assignFunctionsToComponent()
	{
		String resizableString = getComponent().asBase()
		                                       .getJQueryID() + "resizable(" + getOptions().toString() +
				");" +
				getNewLine();
		addQuery(resizableString);
	}
}
