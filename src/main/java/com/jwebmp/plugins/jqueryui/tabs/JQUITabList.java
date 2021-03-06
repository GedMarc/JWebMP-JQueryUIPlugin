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
package com.jwebmp.plugins.jqueryui.tabs;

import com.jwebmp.core.base.html.List;
import com.jwebmp.core.base.html.attributes.GlobalAttributes;
import com.jwebmp.core.base.html.attributes.NoAttributes;
import com.jwebmp.core.base.html.interfaces.children.ListChildren;
import com.jwebmp.core.base.html.interfaces.events.GlobalEvents;
import com.jwebmp.plugins.jqueryui.tabs.interfaces.JQUITabsChildren;

/**
 * @author GedMarc
 * @since 28 Feb 2017
 */
public class JQUITabList<J extends JQUITabList<J>>
		extends List<ListChildren, NoAttributes, GlobalEvents,J>
		implements JQUITabsChildren
{
	/**
	 * A list for the tabs display
	 */
	public JQUITabList()
	{
		//Nothing needed
	}

}
