/**
 * =============================================================================
 *
 * ORCID (R) Open Source
 * http://orcid.org
 *
 * Copyright (c) 2012-2014 ORCID, Inc.
 * Licensed under an MIT-Style License (MIT)
 * http://orcid.org/open-source-license
 *
 * This copyright and license information (including a link to the full license)
 * shall be included in its entirety in all copies or substantial portion of
 * the software.
 *
 * =============================================================================
 */
package org.orcid.core.adapter.v3.impl;

import java.util.Collection;
import java.util.List;

import ma.glasnost.orika.MapperFacade;

import org.orcid.jaxb.model.v3.dev1.record.summary.ServiceSummary;
import org.orcid.core.adapter.v3.JpaJaxbServiceAdapter;
import org.orcid.jaxb.model.v3.dev1.record.Service;
import org.orcid.persistence.jpa.entities.OrgAffiliationRelationEntity;

/**
 * 
 * @author Angel Montenegro
 * 
 */
public class JpaJaxbServiceAdapterImpl implements JpaJaxbServiceAdapter {

    private MapperFacade mapperFacade;

    public void setMapperFacade(MapperFacade mapperFacade) {
        this.mapperFacade = mapperFacade;
    }

    @Override
    public OrgAffiliationRelationEntity toOrgAffiliationRelationEntity(Service service) {
        if(service == null)
            return null;
        return mapperFacade.map(service, OrgAffiliationRelationEntity.class);
    }

    @Override
    public Service toService(OrgAffiliationRelationEntity entity) {
        if(entity == null)
            return null;
        return mapperFacade.map(entity, Service.class);
    }

    public ServiceSummary toServiceSummary(OrgAffiliationRelationEntity entity) {
        if(entity == null)
            return null;
        return mapperFacade.map(entity, ServiceSummary.class);
    }
    
    @Override
    public List<Service> toService(Collection<OrgAffiliationRelationEntity> entities) {
        if(entities == null)
            return null;
        return mapperFacade.mapAsList(entities, Service.class);
    }

    @Override
    public List<ServiceSummary> toServiceSummary(Collection<OrgAffiliationRelationEntity> entities) {
        if(entities == null)
            return null;
        return mapperFacade.mapAsList(entities, ServiceSummary.class);
    }
    
    @Override
    public OrgAffiliationRelationEntity toOrgAffiliationRelationEntity(Service service, OrgAffiliationRelationEntity existing) {
        if (service == null) {
            return null;
        }
        mapperFacade.map(service, existing);
        return existing;
    }
}