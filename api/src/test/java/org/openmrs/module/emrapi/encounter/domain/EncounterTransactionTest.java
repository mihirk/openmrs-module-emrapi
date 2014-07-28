/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.emrapi.encounter.domain;

import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class EncounterTransactionTest {

    @Test
    public void dateConversion() {
        EncounterTransaction encounterTransaction = new EncounterTransaction();
        encounterTransaction.setEncounterDateTime(new Date(2013, 10, 30, 0, 0, 0));
        assertEquals(new Date(2013, 10, 30, 0, 0, 0), encounterTransaction.getEncounterDateTime());
    }

    @Test
    public void shouldSetCurrentDateIfDispositionDateIsNull() throws Exception {
        EncounterTransaction.Disposition disposition = new EncounterTransaction.Disposition();
        disposition.setDispositionDateTime(null);
        assertEquals(new Date(), disposition.getDispositionDateTime());
    }
    @Test
    public void shouldSetCurrentDateIfObservationDateIsNull() throws Exception {
        EncounterTransaction.Observation observation = new EncounterTransaction.Observation();
        observation.setObservationDateTime(null);
        assertEquals(new Date(), observation.getObservationDateTime());
    }
    @Test
    public void shouldSetCurrentDateIfDiagnosisDateIsNull() throws Exception {
        EncounterTransaction.Diagnosis diagnosis = new EncounterTransaction.Diagnosis();
        diagnosis.setDiagnosisDateTime(null);
        assertEquals(new Date(), diagnosis.getDiagnosisDateTime());
    }

}
