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
package za.co.mmagon.jwebswing.plugins.pools.jqueryui;

import za.co.mmagon.jwebswing.base.references.JavascriptReference;

/**
 * @author GedMarc
 * @version 1.0
 * <p>
 * <p>
 * @since Mar 8, 2015
 */
class JQUIDraggableJavaScriptReference extends JavascriptReference
{
	
	/**
	 *
	 */
	public JQUIDraggableJavaScriptReference()
	{
		super("JWDraggableJS", 1.114, "bower_components/jquery-ui/jquery-ui.js", "https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.0/jquery-ui.js");//draggable.js");
		setSortOrder(15);
	}
}
