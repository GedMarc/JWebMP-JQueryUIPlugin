# JWebMP-JQueryUI

Allows you to use all the capabilitiies of JQuery UI directly from JWebMP.


Example Accordion
```
JQUIAccordion accordion = new JQUIAccordion();

accordion.addAccordianTab(tab1);
accordion.addAccordianTab(tab2);

accordion.getOptions().setCollapsible(true);
accordion.getOptions().setHeader(HeaderTypes.H3);

accordion.getOptions().getAnimate().setDuration(200);
accordion.getOptions().getAnimate().setDirection(Direction.Vertical);
accordion.getOptions().getAnimate().setEasing(JQEasingEffects.easeInBack);
```

Example Auto Complete with Server Side Data Ajax Calls

```
JQUIAutoComplete ac = new JQUIAutoComplete("autocomplete");
ac.setID("id");
ac.getLabel().setID("label");
ac.getInput().setID("input");
ac.getOptions().addOption("option 1");

ac.getOptions().setAjax(true, ac);
```

Visit the Wiki for complete documentation

# JQuery UI

JQuery UI Link
https://jqueryui.com/

JQuery UI Component Demo's Link
http://jqueryui.com/demos/
