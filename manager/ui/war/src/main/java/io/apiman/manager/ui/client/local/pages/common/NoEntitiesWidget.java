/*
 * Copyright 2014 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.apiman.manager.ui.client.local.pages.common;

import org.overlord.commons.gwt.client.local.widgets.ParagraphLabel;

import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

/**
 * A widget that can be used when no entities are found.  For example
 * this widget is displayed when the user is viewing the list of 
 * applications in an organization but none are found.  In that case
 * we display this widget rather than an empty list.
 *
 * @author eric.wittmann@redhat.com
 */
public class NoEntitiesWidget extends FlowPanel {
    
    /**
     * Constructor.
     */
    /**
     * Constructor.
     * @param message
     * @param showArrow
     */
    public NoEntitiesWidget(String message, boolean showArrow) {
        this(new ParagraphLabel(message), showArrow);
    }

    /**
     * Constructor.
     * @param message
     * @param showArrow
     */
    public NoEntitiesWidget(Widget message, boolean showArrow) {
        getElement().setClassName("apiman-no-content"); //$NON-NLS-1$
        getElement().addClassName("container-fluid"); //$NON-NLS-1$
        
        FlowPanel row = new FlowPanel();
        add(row);
        row.getElement().setClassName("row"); //$NON-NLS-1$
        
        FlowPanel leftCol = new FlowPanel();
        row.add(leftCol);
        leftCol.getElement().setClassName("col-md-9"); //$NON-NLS-1$
        leftCol.add(message);
        message.getElement().setClassName("apiman-no-entities-description"); //$NON-NLS-1$
        
        FlowPanel rightCol = new FlowPanel();
        row.add(rightCol);
        rightCol.getElement().setClassName("col-md-3"); //$NON-NLS-1$
        if (showArrow) {
            Label arrow = new Label(" "); //$NON-NLS-1$
            rightCol.add(arrow);
            arrow.getElement().setClassName("apiman-no-entities-arrow"); //$NON-NLS-1$
        }
    }
}
