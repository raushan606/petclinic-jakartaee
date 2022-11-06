package org.woehlke.jakartaee.petclinic.visit.db;

import jakarta.validation.constraints.NotNull;
import org.netbeans.lib.cvsclient.commandLine.command.log;
import org.woehlke.jakartaee.petclinic.application.framework.db.CrudDao;
import org.woehlke.jakartaee.petclinic.owner.Owner;
import org.woehlke.jakartaee.petclinic.pet.Pet;
import org.woehlke.jakartaee.petclinic.visit.Visit;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: tw
 * Date: 07.01.14
 * Time: 12:43
 * To change this template use File | Settings | File Templates.
 */
public interface VisitDao extends CrudDao<Visit> {
    long serialVersionUID = -2002874805548729384L;

    List<Visit> getVisits(@NotNull Pet pet);
    void delete(Visit visit);
}
