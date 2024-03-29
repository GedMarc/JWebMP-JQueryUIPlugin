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
package com.jwebmp.plugins.jqueryui.events;

import com.jwebmp.core.Component;
import com.jwebmp.core.events.focus.FocusAdapter;
import com.jwebmp.plugins.jqueryui.autocomplete.interfaces.JQUIAutoCompleteEvents;
import com.jwebmp.plugins.jqueryui.dialog.interfaces.JQUIDialogEvents;
import com.jwebmp.plugins.jqueryui.draggable.interfaces.JQUIDraggableEvents;
import com.jwebmp.plugins.jqueryui.menu.interfaces.JQUIMenuEvents;
import com.jwebmp.plugins.jqueryui.selectmenu.interfaces.JQUISelectMenuEvents;

/**
 * @author GedMarc
 * @since 27 Feb 2017
 */
public abstract class FocusEvent<J extends FocusEvent<J>>
		extends FocusAdapter<J>
		implements JQUIAutoCompleteEvents<J>,
		           JQUIDraggableEvents<J>,
		           JQUIDialogEvents<J>,
		           JQUIMenuEvents<J>,
		           JQUISelectMenuEvents<J>
{
	public FocusEvent(Component component)
	{
		super(component);
	}
}
