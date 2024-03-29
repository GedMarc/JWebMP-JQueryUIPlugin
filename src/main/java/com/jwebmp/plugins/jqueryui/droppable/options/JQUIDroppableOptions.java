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
package com.jwebmp.plugins.jqueryui.droppable.options;

import com.guicedee.services.jsonrepresentation.json.StaticStrings;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;
import com.jwebmp.plugins.jqueryui.basethemes.JQUIThemeBlocks;
import com.jwebmp.plugins.jqueryui.droppable.enumerations.JQUIDroppableTolerances;
import jakarta.validation.constraints.NotNull;

/**
 * @author GedMarc
 * @version 1.0
 * @since 07 Aug 2015
 */
@SuppressWarnings({"MissingClassJavaDoc", "unused"})
public class JQUIDroppableOptions<J extends JQUIDroppableOptions<J>>
		extends JavaScriptPart<J>
{
	/**
	 * Default: "*" Controls which draggable elements are accepted by the droppable.
	 */
	private String accept;
	/**
	 * If specified, the class will be added to the droppable while an acceptable draggable is being dragged.
	 */
	private String activeClassType;
	/**
	 * If set to false, will prevent the ui-droppable class from being added. This may be desired as a performance optimization when
	 * calling .droppable() init on hundreds of elements.
	 */
	private Boolean activeClass;
	/**
	 * By default, when an element is dropped on nested droppables, each droppable will receive the element. However, by setting this
	 * option to true, any parent droppables will not receive the
	 * element. The drop event will still bubble normally, but the event.target can be checked to see which droppable received the
	 * draggable element.
	 */
	private Boolean greedy;
	/**
	 * If specified, the class will be added to the droppable while an acceptable draggable is being hovered over the droppable.
	 */
	private String hoverClass;
	/**
	 * Used to group sets of draggable and droppable items, in addition to droppable's accept option. A draggable with the same scope
	 * value as a droppable will be accepted by the droppable.
	 */
	private String scope;
	/**
	 * Specifies which mode to use for testing whether a draggable is hovering over a droppable
	 */
	private JQUIDroppableTolerances tolerance;

	/**
	 * The default droppable options
	 */
	public JQUIDroppableOptions()
	{
		//Nothing needed here
	}

	/**
	 * Sets the acceptable to a specific class
	 * <p>
	 *
	 * @param <E>
	 * 		A component to set the class of accepted drop objects
	 * @param componentClass
	 * 		The component class to set
	 * @param classAllocation
	 * 		A boolean place holder to specify the association is for a class
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public <E extends IComponentHierarchyBase<?,?>> J setAccept(E componentClass, boolean classAllocation)
	{
		if (classAllocation)
		{
			accept = StaticStrings.STRING_DOT + componentClass.getClass()
			                                                  .getSimpleName();
		}
		else
		{
			setAccept(componentClass);
		}

		return (J) this;
	}

	/**
	 * Sets the component that must be draggable
	 * <p>
	 *
	 * @param component
	 * 		The component to accept dragging from
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setAccept(IComponentHierarchyBase<?,?> component)
	{
		accept = component.asBase().getID(true);
		return (J) this;
	}

	/**
	 * @return Controls which draggable elements are accepted by the droppable.
	 */
	public String getAccept()
	{
		return accept;
	}

	/**
	 * Sets the component that must be draggable
	 * <p>
	 *
	 * @param component
	 * 		The component to accept dragging from
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setAccept(String component)
	{
		accept = component;
		return (J) this;
	}

	/**
	 * @return If specified, the class will be added to the droppable while an acceptable draggable is being dragged.
	 */
	public String getActiveClassType()
	{
		return activeClassType;
	}

	/**
	 * @param activeClassType
	 * 		If specified, the class will be added to the droppable while an acceptable draggable is being dragged.
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setActiveClassType(String activeClassType)
	{
		this.activeClassType = activeClassType;
		return (J) this;
	}

	/**
	 * @param activeClassType
	 * 		If specified, the class will be added to the droppable while an acceptable draggable is being dragged.
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setActiveClassType(JQUIThemeBlocks activeClassType)
	{
		this.activeClassType = activeClassType.toString();
		return (J) this;
	}

	/**
	 * @return If set to false, will prevent the ui-droppable class from being added. This may be desired as a performance optimization
	 * 		when calling .droppable() init on hundreds of elements.
	 */
	public boolean isActiveClass()
	{
		return activeClass;
	}

	/**
	 * @param activeClass
	 * 		If set to false, will prevent the ui-droppable class from being added. This may be desired as a performance optimization when
	 * 		calling .droppable() init on hundreds of
	 * 		elements.
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setActiveClass(boolean activeClass)
	{
		this.activeClass = activeClass;
		return (J) this;
	}

	/**
	 * @return By default, when an element is dropped on nested droppables, each droppable will receive the element. However, by setting
	 * 		this option to true, any parent droppables will not receive the
	 * 		element. The drop event will still bubble normally, but the event.target can be checked to see which droppable received the
	 * 		draggable element.
	 */
	public boolean isGreedy()
	{
		return greedy;
	}

	/**
	 * @param greedy
	 * 		By default, when an element is dropped on nested droppables, each droppable will receive the element. However, by setting this
	 * 		option to true, any parent droppables will not
	 * 		receive the element. The drop event will still bubble normally, but the event.target can be checked to see which droppable
	 * 		received the draggable element.
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setGreedy(boolean greedy)
	{
		this.greedy = greedy;
		return (J) this;
	}

	/**
	 * @return If specified, the class will be added to the droppable while an acceptable draggable is being hovered over the droppable.
	 */
	public String getHoverClass()
	{
		return hoverClass;
	}

	/**
	 * @param hoverClass
	 * 		If specified, the class will be added to the droppable while an acceptable draggable is being hovered over the droppable.
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setHoverClass(JQUIThemeBlocks hoverClass)
	{
		this.hoverClass = hoverClass.toString();
		return (J) this;
	}

	/**
	 * @param hoverClass
	 * 		If specified, the class will be added to the droppable while an acceptable draggable is being hovered over the droppable.
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setHoverClass(String hoverClass)
	{
		this.hoverClass = hoverClass;
		return (J) this;
	}

	/**
	 * @return Used to group sets of draggable and droppable items, in addition to the accept option. A draggable with the same scope
	 * 		value as a droppable will be accepted.
	 */
	public String getScope()
	{
		return scope;
	}

	/**
	 * @param scope
	 * 		Used to group sets of draggable and droppable items, in addition to the accept option. A draggable with the same scope value
	 * 		as a droppable will be accepted.
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setScope(String scope)
	{
		this.scope = scope;
		return (J) this;
	}

	/**
	 * @return Specifies which mode to use for testing whether a draggable is hovering over a droppable
	 */
	public JQUIDroppableTolerances getTolerance()
	{
		return tolerance;
	}

	/**
	 * @param tolerance
	 * 		Specifies which mode to use for testing whether a draggable is hovering over a droppable
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setTolerance(JQUIDroppableTolerances tolerance)
	{
		this.tolerance = tolerance;
		return (J) this;
	}
}
