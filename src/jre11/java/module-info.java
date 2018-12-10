import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;
import com.jwebmp.plugins.jqueryui.JQUIPageConfigurator;

module com.jwebmp.plugins.jqueryui {

	exports com.jwebmp.plugins.jqueryui;
	exports com.jwebmp.plugins.jqueryui.events;
	exports com.jwebmp.plugins.jqueryui.accordion;
	exports com.jwebmp.plugins.jqueryui.accordion.enumerations;
	exports com.jwebmp.plugins.jqueryui.accordion.interfaces;
	exports com.jwebmp.plugins.jqueryui.accordion.options;
	exports com.jwebmp.plugins.jqueryui.autocomplete;
	exports com.jwebmp.plugins.jqueryui.autocomplete.enumerations;
	exports com.jwebmp.plugins.jqueryui.autocomplete.interfaces;
	exports com.jwebmp.plugins.jqueryui.autocomplete.options;
	exports com.jwebmp.plugins.jqueryui.button;
	exports com.jwebmp.plugins.jqueryui.button.enumerations;
	exports com.jwebmp.plugins.jqueryui.button.interfaces;
	exports com.jwebmp.plugins.jqueryui.button.options;
	exports com.jwebmp.plugins.jqueryui.checkboxradio.interfaces;
	exports com.jwebmp.plugins.jqueryui.checkboxradio.options;
	exports com.jwebmp.plugins.jqueryui.controlgroup;
	exports com.jwebmp.plugins.jqueryui.controlgroup.options;
	exports com.jwebmp.plugins.jqueryui.datepicker;
	exports com.jwebmp.plugins.jqueryui.datepicker.interfaces;
	exports com.jwebmp.plugins.jqueryui.datepicker.options;
	exports com.jwebmp.plugins.jqueryui.dialog;
	exports com.jwebmp.plugins.jqueryui.dialog.interfaces;
	exports com.jwebmp.plugins.jqueryui.dialog.options;
	exports com.jwebmp.plugins.jqueryui.draggable;
	exports com.jwebmp.plugins.jqueryui.draggable.enumerations;
	exports com.jwebmp.plugins.jqueryui.draggable.interfaces;
	exports com.jwebmp.plugins.jqueryui.draggable.options;
	exports com.jwebmp.plugins.jqueryui.droppable;
	exports com.jwebmp.plugins.jqueryui.droppable.enumerations;
	exports com.jwebmp.plugins.jqueryui.droppable.interfaces;
	exports com.jwebmp.plugins.jqueryui.droppable.options;
	exports com.jwebmp.plugins.jqueryui.menu;
	exports com.jwebmp.plugins.jqueryui.menu.interfaces;
	exports com.jwebmp.plugins.jqueryui.menu.options;
	exports com.jwebmp.plugins.jqueryui.position;
	exports com.jwebmp.plugins.jqueryui.position.enumerations;
	exports com.jwebmp.plugins.jqueryui.position.options;
	exports com.jwebmp.plugins.jqueryui.progressbar;
	exports com.jwebmp.plugins.jqueryui.progressbar.interfaces;
	exports com.jwebmp.plugins.jqueryui.progressbar.options;
	exports com.jwebmp.plugins.jqueryui.resizable;
	exports com.jwebmp.plugins.jqueryui.resizable.interfaces;
	exports com.jwebmp.plugins.jqueryui.resizable.options;
	exports com.jwebmp.plugins.jqueryui.selectable;
	exports com.jwebmp.plugins.jqueryui.selectable.interfaces;
	exports com.jwebmp.plugins.jqueryui.selectable.options;
	exports com.jwebmp.plugins.jqueryui.selectmenu;
	exports com.jwebmp.plugins.jqueryui.selectmenu.interfaces;
	exports com.jwebmp.plugins.jqueryui.selectmenu.options;
	exports com.jwebmp.plugins.jqueryui.slider;
	exports com.jwebmp.plugins.jqueryui.slider.enumerations;
	exports com.jwebmp.plugins.jqueryui.slider.interfaces;
	exports com.jwebmp.plugins.jqueryui.slider.options;
	exports com.jwebmp.plugins.jqueryui.sortable;
	exports com.jwebmp.plugins.jqueryui.sortable.enumerations;
	exports com.jwebmp.plugins.jqueryui.sortable.interfaces;
	exports com.jwebmp.plugins.jqueryui.sortable.options;
	exports com.jwebmp.plugins.jqueryui.spinner;
	exports com.jwebmp.plugins.jqueryui.spinner.interfaces;
	exports com.jwebmp.plugins.jqueryui.spinner.options;
	exports com.jwebmp.plugins.jqueryui.tabs;
	exports com.jwebmp.plugins.jqueryui.tabs.interfaces;
	exports com.jwebmp.plugins.jqueryui.tabs.options;
	exports com.jwebmp.plugins.jqueryui.basethemes;
	exports com.jwebmp.plugins.jqueryui.tooltips;
	exports com.jwebmp.plugins.jqueryui.tooltips.interfaces;
	exports com.jwebmp.plugins.jqueryui.tooltips.options;

	exports com.jwebmp.plugins.jqueryui.pools;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;
	requires com.jwebmp.plugins.easingeffects;
	requires com.jwebmp.plugins.globalize.cultures;
	requires com.jwebmp.guicedservlets;
	requires com.jwebmp.guicedinjection;

	provides IPageConfigurator with JQUIPageConfigurator;
	provides IGuiceScanModuleExclusions with com.jwebmp.plugins.jqueryui.implementations.JQueryUIExclusionsModule;
	provides IGuiceScanJarExclusions with com.jwebmp.plugins.jqueryui.implementations.JQueryUIExclusionsModule;

	opens com.jwebmp.plugins.jqueryui to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqueryui.events to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqueryui.accordion to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqueryui.accordion.enumerations to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqueryui.accordion.interfaces to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqueryui.accordion.options to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqueryui.autocomplete to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqueryui.autocomplete.enumerations to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqueryui.autocomplete.interfaces to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqueryui.autocomplete.options to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqueryui.button to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqueryui.button.enumerations to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqueryui.button.interfaces to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqueryui.button.options to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqueryui.checkboxradio.interfaces to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqueryui.checkboxradio.options to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqueryui.controlgroup to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqueryui.controlgroup.options to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqueryui.datepicker to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqueryui.datepicker.interfaces to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqueryui.datepicker.options to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqueryui.dialog to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqueryui.dialog.interfaces to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqueryui.dialog.options to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqueryui.draggable to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqueryui.draggable.enumerations to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqueryui.draggable.interfaces to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqueryui.draggable.options to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqueryui.droppable to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqueryui.droppable.enumerations to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqueryui.droppable.interfaces to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqueryui.droppable.options to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqueryui.menu to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqueryui.menu.interfaces to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqueryui.menu.options to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqueryui.position to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqueryui.position.enumerations to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqueryui.position.options to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqueryui.progressbar to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqueryui.progressbar.interfaces to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqueryui.progressbar.options to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqueryui.resizable to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqueryui.resizable.interfaces to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqueryui.resizable.options to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqueryui.selectable to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqueryui.selectable.interfaces to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqueryui.selectable.options to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqueryui.selectmenu to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqueryui.selectmenu.interfaces to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqueryui.selectmenu.options to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqueryui.slider to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqueryui.slider.enumerations to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqueryui.slider.interfaces to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqueryui.slider.options to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqueryui.sortable to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqueryui.sortable.enumerations to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqueryui.sortable.interfaces to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqueryui.sortable.options to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqueryui.spinner to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqueryui.spinner.interfaces to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqueryui.spinner.options to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqueryui.tabs to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqueryui.tabs.interfaces to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqueryui.tabs.options to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqueryui.basethemes to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqueryui.tooltips to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqueryui.tooltips.interfaces to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.jqueryui.tooltips.options to com.fasterxml.jackson.databind, com.jwebmp.core;
}
