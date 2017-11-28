package com.vicensvives.digital.javahiringtest.services.bookstructure;

import static java.util.stream.Collectors.toSet;

import com.google.common.collect.ImmutableMap;

import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class StubBookStructureService implements BookStructureService {

    public static final UnitId UNIT_ID_1 = new UnitId("9f50d492-03fe-4e42-8717-c3ce87650dd2");
    public static final SectionId SECTION_ID_A = new SectionId("9e1b818d-7b9d-43ef-b5da-0771de057e81");
    public static final SectionId SECTION_ID_B = new SectionId("31011407-974f-4aaf-a153-c00991c2e6a7");
    public static final ActivityId ACTIVITY_ID_A_1 = new ActivityId("4e405905-91b4-49a9-8fe7-1574cea01580");
    public static final ActivityId ACTIVITY_ID_A_2 = new ActivityId("3cafb913-cf92-4aa9-8a83-6be5c3f05c43");
    public static final ActivityId ACTIVITY_ID_B_1 = new ActivityId("9a1b3747-af98-481c-ac24-33544200f8b0");
    public static final ActivityId ACTIVITY_ID_B_2 = new ActivityId("9838997b-5e07-43e1-9cce-0a75dd27fcd5");

    private final Map<ActivityId, SectionId> activityToSection = ImmutableMap.<ActivityId, SectionId>builder()
        .put(ACTIVITY_ID_A_1, SECTION_ID_A)
        .put(ACTIVITY_ID_A_2, SECTION_ID_A)
        .put(ACTIVITY_ID_B_1, SECTION_ID_B)
        .put(ACTIVITY_ID_B_2, SECTION_ID_B)
        .build();

    private final Map<SectionId, UnitId> sectionToUnit = ImmutableMap.<SectionId, UnitId>builder()
        .put(SECTION_ID_A, UNIT_ID_1)
        .put(SECTION_ID_B, UNIT_ID_1)
        .build();


    @Override
    public Optional<SectionId> getSectionOfActivity(ActivityId activityId) {
        return Optional.ofNullable(activityToSection.get(activityId));
    }

    @Override
    public Optional<UnitId> getUnitOfSection(SectionId sectionId) {
        return Optional.ofNullable(sectionToUnit.get(sectionId));
    }

    @Override
    public Set<SectionId> getSectionsOfUnit(UnitId unitId) {
        return sectionToUnit.entrySet()
            .stream()
            .filter(entry -> entry.getValue().equals(unitId))
            .map(Map.Entry::getKey)
            .collect(toSet());
    }

    @Override
    public Set<ActivityId> getActivitiesOfSection(SectionId sectionId) {
        return activityToSection.entrySet()
            .stream()
            .filter(entry -> entry.getValue().equals(sectionId))
            .map(Map.Entry::getKey)
            .collect(toSet());
    }


}
