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
package za.co.mmagon.jwebswing.plugins.jqueryui.selectable;

import za.co.mmagon.jwebswing.Component;
import za.co.mmagon.jwebswing.base.html.interfaces.CssClass;
import za.co.mmagon.jwebswing.base.servlets.enumarations.ComponentTypes;
import za.co.mmagon.jwebswing.htmlbuilder.javascript.JavaScriptPart;

import java.util.ArrayList;
import java.util.List;

/**
 * @author GedMarc
 * @version 1.0
 * 		<p>
 * 		TODO CRP this guy	<p>
 * @since Mar 17, 2015
 */
public class JQUISelectableOptions extends JavaScriptPart
{

	private static final long serialVersionUID = 1L;
	/**
	 * Prevents selecting if you start on elements matching the selector
	 */
	private List<CssClass> cancel;
	/**
	 * The matching child elements will be made selectees (able to be selected).
	 */
	private List<ComponentTypes> filter;
	/**
	 * Which element the selectable helper should be appended to while dragging.
	 */
	private String appendTo;
	/**
	 * This determines whether to refresh (recalculate) the position and size of each selectee at the beginning of each select operation. If you have many items, you may want to set this to false and
	 * call the refresh() method manually. Default is true
	 */
	private Boolean autoRefresh = true;
	/**
	 * Time in milliseconds to define when the selecting should start. This helps prevent unwanted selections when clicking on an element.
	 */
	private Integer delay;
	/**
	 * Tolerance, in pixels, for when selecting should start. If specified, selecting will not start until the mouse has been dragged beyond the specified distance.
	 */
	private Integer distance;

	/**
	 *
	 */
	public JQUISelectableOptions()
	{
		//Nothing Needed
	}

	/**
	 * Which element the selectable helper should be appended to while dragging.
	 *
	 * @return The component that the selectable helper should be appended to while dragging.
	 */
	public String getAppendTo()
	{
		return appendTo;
	}

	/**
	 * Which element the selectable helper should be appended to while dragging.
	 *
	 * @param appendTo
	 * 		Which element the selectable helper should be appended to while dragging.
	 */
	public void setAppendTo(Component appendTo)
	{
		this.appendTo = appendTo.getID(true);
	}

	/**
	 * This determines whether to refresh (recalculate) the position and size of each selectee at the beginning of each select operation. If you have many items, you may want to set this to false and
	 * call the refresh() method manually. Default is true
	 *
	 * @return Is Auto Refresh
	 */
	public Boolean isAutoRefresh()
	{
		return autoRefresh;
	}

	/**
	 * Prevents selecting if you start on elements matching the selector
	 *
	 * @return The list of CssClasses that don't start on the selector
	 */
	public List<CssClass> getCancel()
	{
		if (cancel == null)
		{
			cancel = new ArrayList<>();
		}
		return cancel;
	}

	/**
	 * Sets the cancel list
	 *
	 * @param cancel
	 */
	public void setCancel(List<CssClass> cancel)
	{
		this.cancel = cancel;
	}

	/**
	 * Time in milliseconds to define when the selecting should start. This helps prevent unwanted selections when clicking on an element.
	 *
	 * @return The Delay
	 */
	public Integer getDelay()
	{
		return delay;
	}

	/**
	 * Time in milliseconds to define when the selecting should start. This helps prevent unwanted selections when clicking on an element.
	 *
	 * @param delay
	 * 		The delay to set
	 */
	public void setDelay(Integer delay)
	{
		this.delay = delay;
	}

	/**
	 * Tolerance, in pixels, for when selecting should start. If specified, selecting will not start until the mouse has been dragged beyond the specified distance.
	 *
	 * @return The distance in pixels
	 */
	public Integer getDistance()
	{
		return distance;
	}

	/**
	 * Tolerance, in pixels, for when selecting should start. If specified, selecting will not start until the mouse has been dragged beyond the specified distance.
	 *
	 * @param distance
	 * 		Sets the distance in pixels
	 */
	public void setDistance(Integer distance)
	{
		this.distance = distance;
	}

	/**
	 * Returns the list of filters
	 *
	 * @return
	 */
	public List<ComponentTypes> getFilter()
	{
		if (filter == null)
		{
			filter = new ArrayList<>();
		}
		return filter;
	}

	/**
	 * Sets the filter list
	 *
	 * @param filter
	 */
	public void setFilter(List<ComponentTypes> filter)
	{
		this.filter = filter;
	}

	/**
	 * Sets the append to string
	 *
	 * @param appendTo
	 */
	public void setAppendTo(String appendTo)
	{
		this.appendTo = appendTo;
	}

	/**
	 * Return if auto refresh is enabled
	 *
	 * @return
	 */
	public Boolean getAutoRefresh()
	{
		return autoRefresh;
	}

	/**
	 * This determines whether to refresh (recalculate) the position and size of each selectee at the beginning of each select operation. If you have many items, you may want to set this to false and
	 * call the refresh() method manually.
	 *
	 * @param autoRefresh
	 * 		Whether to refresh on call
	 */
	public void setAutoRefresh(Boolean autoRefresh)
	{
		this.autoRefresh = autoRefresh;
	}
}
