package com.vicensvives.digital.javahiringtest.services.bookstructure;

import java.util.Optional;
import java.util.Set;

public interface BookStructureService {

    Optional<SectionId> getSectionOfActivity(ActivityId activityId);

    Optional<UnitId> getUnitOfSection(SectionId sectionId);

    Set<ActivityId> getActivitiesOfSection(SectionId sectionId);

    Set<SectionId> getSectionsOfUnit(UnitId unitId);

}
