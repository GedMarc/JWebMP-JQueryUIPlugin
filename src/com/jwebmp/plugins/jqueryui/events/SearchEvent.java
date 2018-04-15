/*
 * Copyright (C) 2017 Marc Magon
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
package com.jwebmp.plugins.jqueryui.events;

import com.jwebmp.Component;
import com.jwebmp.events.search.SearchAdapter;
import com.jwebmp.plugins.jqueryui.autocomplete.interfaces.JQUIAutoCompleteEvents;

/**
 * @author GedMarc
 * @since 27 Feb 2017
 */
public abstract class SearchEvent
		extends SearchAdapter
		implements JQUIAutoCompleteEvents
{

	private static final long serialVersionUID = 1L;

	public SearchEvent(Component component)
	{
		super(component);
	}
}