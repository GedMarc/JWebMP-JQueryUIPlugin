/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.mmagon.jwebswing.plugins.jqueryui.events;

import za.co.mmagon.jwebswing.Component;
import za.co.mmagon.jwebswing.events.drag.DragAdapter;
import za.co.mmagon.jwebswing.plugins.jqueryui.dialog.JQUIDialogEvents;
import za.co.mmagon.jwebswing.plugins.jqueryui.draggable.JQUIDraggableEvents;

/**
 *
 * @author GedMarc
 * @since 27 Feb 2017
 *
 */
public abstract class DragEvent extends DragAdapter
        implements JQUIDraggableEvents, JQUIDialogEvents
{

    private static final long serialVersionUID = 1L;

    public DragEvent(Component component)
    {
        super(component);
    }
}
