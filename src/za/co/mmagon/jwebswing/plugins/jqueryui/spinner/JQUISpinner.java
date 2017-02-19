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
package za.co.mmagon.jwebswing.plugins.jqueryui.spinner;

import za.co.mmagon.jwebswing.base.html.*;
import za.co.mmagon.jwebswing.base.html.attributes.NoAttributes;
import za.co.mmagon.jwebswing.components.globalize.cultures.GlobalizeCultures;

/**
 *
 * @author GedMarc
 * @since Mar 9, 2015
 * @version 1.0
 * <p>
 *
 */
public final class JQUISpinner extends Div<JQUISpinnerChildren, NoAttributes, JQUISpinnerFeatures, JQUISpinnerEvents, JQUISpinner>
{

    private static final long serialVersionUID = 1L;
    /**
     * The header text for the spinner
     */
    private String headerText = "JQuery UI Spinner Demo";
    /**
     * The actual input
     */
    private Input input;

    /**
     * The pre-child labour
     */
    private Label entryLabel;
    /**
     * The spinner feature
     */
    private JQUISpinnerFeature feature;

    /**
     * Constructs a new spinner paragraph object
     * <p>
     */
    public JQUISpinner()
    {
        this(null);
    }

    /**
     * Constructs a new spinner paragraph object
     * <p>
     * @param labelText THe label of the Spinner
     */
    public JQUISpinner(String labelText)
    {

        if (labelText != null)
        {
            entryLabel = new Label(labelText);
            input = new Input();
            add(entryLabel);
            add(input);
            input.addFeature(getFeature());
            input.setID(getID() + "_spinnerInput");
            entryLabel.setForInputComponent(input);
        }
    }

    /**
     * Returns the label object with this spinner
     * <p>
     * @return
     */
    public Label getEntryLabel()
    {
        return entryLabel;
    }

    /**
     * Sets the entry label with this spinner
     * <p>
     * @param entryLabel
     */
    public void setEntryLabel(Label entryLabel)
    {
        this.entryLabel = entryLabel;
    }

    /**
     * Returns the options associated with this spinner
     * <p>
     * @return
     */
    @Override
    public JQUISpinnerOptions getOptions()
    {
        return feature.getOptions();
    }

    public JQUISpinnerFeature getFeature()
    {
        if (feature == null)
        {
            feature = new JQUISpinnerFeature(input);
        }
        return feature;
    }

    /**
     * Adds the specific culture to the options
     *
     * @param culture
     */
    public void addGlobalization(GlobalizeCultures culture)
    {
        getFeature().getJavascriptReferences().add(culture.getJavascriptCoreReference());
        getJavascriptReferences().add(culture.getJavascriptReference());
        getOptions().setCulture(culture.toString());
    }

    /**
     * Sets the header text
     *
     * @return
     */
    public String getHeaderText()
    {
        return headerText;
    }

    /**
     * Gets the header text
     *
     * @param headerText
     */
    public void setHeaderText(String headerText)
    {
        this.headerText = headerText;
    }

    /**
     * Returns the input option
     *
     * @return
     */
    public Input getInput()
    {
        return input;
    }

    /**
     * Sets the Input Object
     *
     * @param input
     */
    public void setInput(Input input)
    {
        this.input = input;
    }

}
