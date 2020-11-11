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
package com.jwebmp.plugins.jqueryui.progressbar.options;

import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

import jakarta.validation.constraints.NotNull;

/**
 * @author GedMarc
 * @version 1.0
 * 		<p>
 * @since Mar 8, 2015
 */
public class JQUIProgressBarOptions<J extends JQUIProgressBarOptions<J>>
		extends JavaScriptPart<J>
{


	/**
	 * if is disabled
	 */
	private Boolean disabled;
	/**
	 * the max value
	 */
	private Integer max;
	/**
	 * The actual value
	 */
	private Integer value;

	/**
	 *
	 */
	public JQUIProgressBarOptions()
	{
		//Nothing needed here
	}

	/**
	 * Returns if the progress bar is disabled or not
	 * <p>
	 *
	 * @return
	 */
	public Boolean getDisabled()
	{
		return disabled;
	}

	/**
	 * Returns if the progress bar is disabled or not
	 * <p>
	 *
	 * @param disabled
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setDisabled(Boolean disabled)
	{
		this.disabled = disabled;
		return (J) this;
	}

	/**
	 * Gets the max
	 * <p>
	 *
	 * @return
	 */
	public Integer getMax()
	{
		return max;
	}

	/**
	 * Sets the maximum value
	 * <p>
	 *
	 * @param max
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setMax(Integer max)
	{
		this.max = max;
		return (J) this;
	}

	/**
	 * Gets the current value
	 * <p>
	 *
	 * @return
	 */
	public Integer getValue()
	{
		return value;
	}

	/**
	 * Sets the current value
	 * <p>
	 *
	 * @param value
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	public J setValue(Integer value)
	{
		this.value = value;
		return (J) this;
	}

}
