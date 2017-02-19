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
package za.co.mmagon.jwebswing.plugins.jqueryui.sortable;

import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.base.html.List;
import za.co.mmagon.jwebswing.base.html.attributes.NoAttributes;

/**
 *
 * @author GedMarc
 * @since 20150807
 */
public class JQUISortable extends Div<JQUISortableChildren, NoAttributes, JQUISortableFeatures, JQUISortableEvents, JQUISortable>
{

    private static final long serialVersionUID = 1L;
    /**
     * The actual list
     */
    private List list;
    /**
     * The sortable feature
     */
    private JQUISortableFeature feature;

    /**
     * Constructs a new Selectable Ordered List
     */
    public JQUISortable()
    {
        list = new List(true);
        add(list);
        list.addFeature(getFeature());
    }

    /**
     * Returns the feature associated with the sortable feature
     *
     * @return
     */
    public final JQUISortableFeature getFeature()
    {
        if (feature == null)
        {
            feature = new JQUISortableFeature(list);
        }
        return feature;
    }

    /**
     * Returns the sortable options
     *
     * @return
     */
    @Override
    public JQUISortableOptions getOptions()
    {
        return getFeature().getOptions();
    }

    /**
     * Returns the list associated with this sortable
     *
     * @return
     */
    public List getList()
    {
        if (list == null)
        {
            list = new List();
        }
        return list;
    }

}
