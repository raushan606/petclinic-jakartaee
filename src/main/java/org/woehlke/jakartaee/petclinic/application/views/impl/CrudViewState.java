package org.woehlke.jakartaee.petclinic.application.views.impl;

import java.io.Serializable;

/**
 *
 */
public enum CrudViewState implements Serializable {
    LIST,
    DETAILS,
    NEW,
    EDIT,
    DELETE,
    LIST_SEARCH_RESULT
}
