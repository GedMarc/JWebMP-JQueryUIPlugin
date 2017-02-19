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
package za.co.mmagon.jwebswing.plugins.jqueryui.menu;

import za.co.mmagon.jwebswing.base.html.List;
import za.co.mmagon.jwebswing.base.html.attributes.NoAttributes;
import za.co.mmagon.jwebswing.base.servlets.enumarations.Orientation;

/**
 * A menu with the default configuration, disabled items and nested menus.
 * <p>
 * A list is transformed, adding theming, mouse and keyboard navigation support.
 * <p>
 * Try to tab to the menu then use the cursor keys to navigate.
 * <p>
 * @author GedMarc
 * @since Mar 8, 2015
 * @version 1.0
 * <p>
 * <p>
 */
public class JQUIMenu extends List<JQUIMenuChildren, NoAttributes, JQUIMenuEvents, JQUIMenu>
{

    private static final long serialVersionUID = 1L;
    private JQUIMenuFeature feature;

    /**
     * Creates an ordered list
     *
     * @param orientation
     */
    public JQUIMenu(Orientation orientation)
    {
        addFeature(getFeature());

    }

    /**
     * Returns an instance of this feature
     * <p>
     * @return
     */
    public final JQUIMenuFeature getFeature()
    {
        if (feature == null)
        {
            feature = new JQUIMenuFeature(this);
        }
        return feature;
    }

    /**
     * Gets the options of the menu
     *
     * @return
     */
    @Override
    public JQUIMenuOptions getOptions()
    {
        return getFeature().getOptions();
    }
}
